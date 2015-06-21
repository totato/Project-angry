/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gui.GamePanel;
import gui.MainGUI;
import gui.Screen;
import gui.WindowProperties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toast
 */
public class Game implements Runnable {

    private static final long frameTime = 10;

    private static final int GRENADE_KOSTEN = 100;

    private static Game aktGame;

    private Data data;
    private Screen scr;
    private boolean active;

    //Informationen, die sich aus data ergeben
    private int respawnRate;
    private Waffe[] waffen;
    private Waffe[] waffenUpgrades;

    private boolean weiter;

    //Shop-Informationen
    private int selectedWeapon;
    private boolean upgradeSelected;

    private SkillHandler skills;
    private StoryHandler story;

    private long startTime;
    private long aktDelay;

    private String savedatei;

    public Game(String savedatei) throws IOException {

        Game.setAktGame(this);

        this.savedatei = savedatei;

        scr = MainGUI.getAktMainGUI().getGamePanel1().getScreen();
        waffen = new Waffe[Data.ANZAHL_WAFFEN];
        active = true;
        skills = new SkillHandler();
        story = new StoryHandler();

    }

    public void setShopInfo(int waffennummer, boolean upgradeSelected) {
        this.selectedWeapon = waffennummer;
        this.upgradeSelected = upgradeSelected;
    }

    public void loadGame() throws IOException, Exception {
        if (!this.loadData(savedatei)) {
            data = new Data();
            loadLevel(1, true);
        }
        loadGame(data);
    }

    public void loadGame(Data data) throws IOException, Exception {
        this.data = data;
        loadLevel(data.getAktLevel(), false);
        waffen = Game.loadWeapons(data.getWaffenStufen());
        waffenUpgrades = Game.loadWeapons(data.getUpgradeStufen());

        weiter = data.getAktLevel() < maxLevel();

    }

    //Rückgabewert gibt Erfolg an
    public boolean loadLevel(int levelnr, boolean neu) throws IOException, Exception {

        //System.out.println(getClass().getClassLoader().getResource("Levels/Level_" + Integer.toString(levelnr) + ".txt").toString().substring(6));
        List<String> zeilen = WindowProperties.ladeTXT("Levels/Levels.txt");
        int startPos = zeilen.indexOf("-START" + levelnr + "-");

        if (startPos > -1) {

            story.setStory(Integer.parseInt(zeilen.get(startPos + 5)));
            story.nextPart();
            MainGUI.getAktMainGUI().changeCard("story card");

            if (neu) {
                data.setAktLevel(levelnr);
                data.setLebendeStreber(Integer.parseInt(zeilen.get(startPos + 1)));
            }
            respawnRate = Integer.parseInt(zeilen.get(startPos + 2));
            scr.setBG(WindowProperties.ladeBild(zeilen.get(startPos + 3)));
            scr.setAktStreber(WindowProperties.ladeBild(zeilen.get(startPos + 4)));

            return true;
        }

        return false;

    }

    public void saveData(String dateiname) throws IOException, URISyntaxException {

        String pfad = System.getenv("HOMEPATH") + "\\" + dateiname;
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pfad));
        oos.writeObject(data);
        oos.close();
    }

    public boolean loadData(String dateiname) throws IOException, ClassNotFoundException {
        String pfad = System.getenv("HOMEPATH") + "\\" + dateiname;
        File f = new File(pfad);
        if (f.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pfad));
            data = (Data) ois.readObject();
            return true;
        }

        return false;
    }

    //Rückgabewert entspricht dem im Shop angezeigten Text
    public String buyUpgrade(int waffennummer) throws IOException {

        if (waffennummer < 0) {
            return "Keine Waffe ausgewählt!";
        }

        if (data.getBrillen() < waffenUpgrades[waffennummer].getKosten()) {
            return "Nicht genug Brillen";
        }
        if (waffenUpgrades[waffennummer].getName().equals("MAX")) {
            return "(Bisheriges) Maximallevel erreicht";
        }

        data.setBrillen(data.getBrillen() - waffenUpgrades[waffennummer].getKosten());
        return upgradeWeapon(waffennummer);

    }

    public void buyGrenade(int anzahl) {
        data.setGranaten(data.getGranaten() + anzahl);
        data.setBrillen(data.getBrillen() - getGrenadeCost());
    }

    public int getGrenadeCost() {
        return waffen[6].getDamage() * 50;
    }

    public String upgradeWeapon(int waffennummer) throws IOException {

        if (waffennummer < 0) {
            return "Keine Waffe ausgewählt!";
        }

        String ausgabe = "";

        if (data.getWaffenStufe(waffennummer) > 0) {
            ausgabe += "Waffe " + waffen[waffennummer].getName() + " zu Waffe " + waffenUpgrades[waffennummer].getName() + " geupgradet.";
        } else {
            ausgabe += "Waffe " + waffenUpgrades[waffennummer].getName() + " gekauft.";
        }

        data.setWaffenStufe(waffennummer, data.getWaffenStufe(waffennummer) + 1);
        waffen[waffennummer] = waffenUpgrades[waffennummer];
        waffenUpgrades[waffennummer] = Game.loadWeapon(waffennummer, data.getWaffenStufe(waffennummer) + 1);

        return ausgabe;
    }

    public static Waffe[] loadWeapons(int[] waffenstufen) throws IOException {

        Waffe[] waffen = new Waffe[Data.ANZAHL_WAFFEN];

        for (int i = 0; i < Data.ANZAHL_WAFFEN; i++) {

            waffen[i] = Game.loadWeapon(i, waffenstufen[i]);

        }

        return waffen;
    }

    public static Waffe loadWeapon(int waffennummer, int waffenstufe) throws IOException {

        List<String> waffenTXT;
        List<String> sprüche;
        int startPos;
        int endPos;
        sprüche = new ArrayList();

        Waffe waffe = null;

        if (waffenstufe > 0) {
            waffenTXT = WindowProperties.ladeTXT("Weapons/Waffe_" + waffennummer + ".txt");
            if (!waffenTXT.isEmpty()) {
                startPos = waffenTXT.indexOf("-START" + waffenstufe + "-");
                endPos = waffenTXT.indexOf("-END" + waffenstufe + "-");
                if (startPos > -1 && endPos > -1) {

                    for (int i = startPos + 7; i < endPos; i++) {
                        sprüche.add(waffenTXT.get(startPos + i));
                    }
                    waffe = new Waffe(waffenTXT.get(startPos + 1), waffenTXT.get(startPos + 2), Integer.parseInt(waffenTXT.get(startPos + 3)), Integer.parseInt(waffenTXT.get(startPos + 4)), Integer.parseInt(waffenTXT.get(startPos + 5)), sprüche, Double.parseDouble(waffenTXT.get(startPos + 6)));
                } else {
                    waffe = new Waffe("MAX", "Wie hast du es geschafft an diese Waffe zu kommen", 0, 0, 0, null, 0);
                }
            }
        } else {
            waffe = new Waffe("MIN", "Diese Waffe gibt es nicht", 0, 0, 0, null, 0);
        }

        return waffe;
    }

    public void changeWeapon(int waffennummer) {

        if (data.getWaffenStufe(waffennummer) > 0) {
            data.setAktWaffe(waffennummer);
        }

        MainGUI.getAktMainGUI().addTextToTextArea(GamePanel.getjTextAreaGame(), 30, "Zur Waffe " + waffennummer + " gewechselt");

    }

    public void useWeapon(int nummer) {
        if (aktDelay <= 0) {
            if (Math.random() + skills.getKritChance() >= 1.0) {
                data.killStreber(waffen[nummer].getDamage() * 3);
            } else {
                data.killStreber(waffen[nummer].getDamage());
            }
            aktDelay = waffen[nummer].getReloadTime();
            if (Math.random() + waffen[nummer].getSpruchWk() >= 1.0 && !(waffen[nummer].getSpruch().isEmpty())) {
                GamePanel.getjTextAreaGame().append(waffen[nummer].getSpruch().get(new Random().nextInt(waffen[nummer].getSpruch().size())) + "\n");
            }

        }
    }

    public void useGrenade() {
        if (data.getGranaten() > 0) {
            useWeapon(6);
        }
        data.setGranaten((data.getGranaten() - 1));
    }

    @Override
    public void run() {

        int i = 0;
        int j = -500;

        while (active) {

            startTime = System.currentTimeMillis();

            if (data.getLebendeStreber() == 0 && weiter) {
                try {
                    this.loadLevel(data.getAktLevel() + 1, true);
                    weiter = data.getAktLevel() == maxLevel();
                } catch (IOException ex) {
                    Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (aktDelay > 0) {
                if (aktDelay - frameTime < 0) {
                    aktDelay = 0;
                } else {
                    aktDelay -= frameTime;
                }
            }

            i++;
            j++;

            if (j >= 500 / frameTime) {
                data.killStreber(skills.getAutoDamage());
                j = -500;
            }

            if (i >= 1000 / frameTime) {
                i = 0;
                data.setVorherLebendeStreber(data.getLebendeStreber());
                data.setLebendeStreber((int) (data.getLebendeStreber() + Math.round((double) respawnRate * (1.0 - skills.getSpawnrateReduktion()))));
            }

            MainGUI.getAktMainGUI().getGamePanel1().setAnzeiger(data.getLebendeStreber(), data.getVorherLebendeStreber(), data.getGetoeteteStreber(), data.getBrillen(), data.getExp());

            if (frameTime - (System.currentTimeMillis() - startTime) > 0) {
                try {
                    Thread.sleep(frameTime - (System.currentTimeMillis() - startTime));
                } catch (InterruptedException ex) {
                    Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static Game getAktGame() {
        return aktGame;
    }

    public Data getData() {
        return data;
    }

    public static void setAktGame(Game aktGame) {
        Game.aktGame = aktGame;
    }

    public Waffe getWaffe(int nummer, boolean upgrade) {
        if (upgrade) {
            return waffenUpgrades[nummer];
        } else {
            return waffen[nummer];
        }
    }

    public int getSelectedWeapon() {
        return selectedWeapon;
    }

    public boolean upgradeSelected() {
        return upgradeSelected;
    }

    private int maxLevel() throws IOException {
        List<String> waffenTXT = WindowProperties.ladeTXT("Levels/Levels.txt");

        for (int i = 1; true; i++) {
            if (waffenTXT.indexOf("-START" + i + "-") == -1) {
                return i - 1;
            }
        }

    }

    public void pause() {
        active = false;
    }

    public void resume() {
        active = true;
        Thread gameThread = new Thread(this);
        gameThread.start();
    }

    public SkillHandler getSkills() {
        return skills;
    }

    public StoryHandler getStory() {
        return story;
    }

    public String getSavedatei() {
        return savedatei;
    }

}
