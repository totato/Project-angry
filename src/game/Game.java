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
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javax.imageio.ImageIO;

/**
 *
 * @author Toast
 */
public class Game implements Runnable {

    private static final long frameTime = 10;
    private static final int WAFFEN_ANZAHL = 6;

    private static Game aktGame;

    private Data data;
    private Screen scr;

    //Informationen, die sich aus data ergeben
    private int respawnRate;
    private Waffe[] waffen;
    private Waffe[] waffenUpgrades;

    //Shop-Informationen
    int selectedWeapon;
    boolean upgradebar;

    public Game() {
        
        Game.setAktGame(this);

        scr = MainGUI.getAktMainGUI().getGamePanel1().getScreen();
        waffen = new Waffe[WAFFEN_ANZAHL];

    }

    public void setShopInfo(int waffennummer, boolean upgradebar) {
        this.selectedWeapon = waffennummer;
        this.upgradebar = upgradebar;
    }

    public void loadGame() throws IOException {
        data = new Data();
        loadLevel(1, true);
        loadGame(data);
    }

    public void loadGame(Data data) throws IOException {
        this.data = data;
        loadLevel(data.getAktLevel(), false);
        waffen = Game.loadWeapons(data.getWaffenStufen());
        waffenUpgrades = Game.loadWeapons(data.getUpgradeStufen());

    }

    public void loadLevel(int levelnr, boolean neu) throws IOException {

        //System.out.println(getClass().getClassLoader().getResource("Levels/Level_" + Integer.toString(levelnr) + ".txt").toString().substring(6));
        List<String> zeilen = WindowProperties.ladeTXT("Levels/Level_" + Integer.toString(levelnr) + ".txt");
        int startPos = zeilen.indexOf("-START-");
        if (neu) {
            data.setAktLevel(levelnr);
            data.setLebendeStreber(Integer.parseInt(zeilen.get(startPos + 1)));
        }
        respawnRate = Integer.parseInt(zeilen.get(startPos + 2));
        scr.setBG(WindowProperties.ladeBild(zeilen.get(startPos + 3)));
        scr.setAktStreber(WindowProperties.ladeBild(zeilen.get(startPos + 4)));

    }
    
    //Rückgabewert entspricht dem im Shop angezeigten Text
    public String buyUpgrade(int waffennummer) throws IOException{
        if(data.getBrillen() < waffenUpgrades[waffennummer].getKosten()){
            return "Nicht genug Brillen";
        }
        if(waffenUpgrades[waffennummer].getName().equals("MAX")){
            return "(Bisheriges) Maximallevel erreicht";
        }
        
        String ausgabe = "";
        ausgabe += "Waffe " + waffen[waffennummer] + " zu Waffe " + waffenUpgrades[waffennummer] + " geupgradet.";
        
        data.setWaffenStufe(waffennummer, data.getWaffenStufe(waffennummer) + 1);
        waffen[waffennummer] = waffenUpgrades[waffennummer];
        waffenUpgrades[waffennummer] = Game.loadWeapon(waffennummer, data.getWaffenStufe(waffennummer) + 1);
        
        return ausgabe;
    }

    public static Waffe[] loadWeapons(int[] waffenstufen) throws IOException {

        Waffe[] waffen = new Waffe[WAFFEN_ANZAHL];

        for (int i = 0; i < WAFFEN_ANZAHL; i++) {

            waffen[i] = Game.loadWeapon(i, waffenstufen[i]);

        }

        return waffen;
    }

    public static Waffe loadWeapon(int waffennummer, int waffenstufe) throws IOException {

        List<String> waffenTXT;
        int startPos;

        Waffe waffe = null;

        if (waffenstufe > 0) {
            waffenTXT = WindowProperties.ladeTXT("Weapons/Waffe_" + waffennummer + ".txt");
            if (!waffenTXT.isEmpty()) {
                startPos = waffenTXT.indexOf("-START" + waffenstufe + "-");
                if (startPos > -1) {
                    waffe = new Waffe(waffenTXT.get(startPos + 1), Integer.parseInt(waffenTXT.get(startPos + 2)), Integer.parseInt(waffenTXT.get(startPos + 3)), Integer.parseInt(waffenTXT.get(startPos + 4)));
                } else {
                    waffe = new Waffe("MAX", 0, 0, 0);
                }
            }
        } else {
            waffe = new Waffe("MIN", 0, 0, 0);
        }

        return waffe;
    }

    public void changeWeapon(int waffennummer) {

        if (data.getWaffenStufe(waffennummer) > 0) {
            data.setAktWaffe(waffennummer);
        }

        MainGUI.getAktMainGUI().addTextToTextArea(GamePanel.getjTextAreaGame(), "Zur Waffe " + waffennummer + " gewechselt");

    }

    public void useAktWeapon() {
        data.killStreber(waffen[data.getAktWaffe()].getDamage());
    }

    @Override
    public void run() {

        int i = 0;
        long startTime;

        while (true) {

            startTime = System.currentTimeMillis();

            i++;
            if (i >= 1000 / frameTime) {
                i = 0;
                data.setVorherLebendeStreber(data.getLebendeStreber());
                data.setLebendeStreber(data.getLebendeStreber() + respawnRate);
            }

            MainGUI.getAktMainGUI().getGamePanel1().setAnzeiger(data.getLebendeStreber(),data.getVorherLebendeStreber() ,data.getGetoeteteStreber(), data.getBrillen(), data.getExp());
            MainGUI.getAktMainGUI().getShopPanel1().setGlasses(data.getBrillen());
            MainGUI.getAktMainGUI().getSkillPanel1().setLabels(data.getBrillen(), data.getExp());
            
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

    public boolean isUpgradebar() {
        return upgradebar;
    }

}
