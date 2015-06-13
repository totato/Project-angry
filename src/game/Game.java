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

    private MainGUI m;
    private Data data;
    private Screen scr;

    //Informationen, die sich aus data ergeben
    private int respawnRate;
    private Waffe[] waffen;

    public Game() {

        m = MainGUI.getAktMainGUI();
        scr = m.getGamePanel1().getScreen();
        waffen = new Waffe[WAFFEN_ANZAHL];

    }

    public void loadGame() throws IOException {
        data = new Data();
        loadLevel(1, true);
        loadGame(data);
    }

    public void loadGame(Data data) throws IOException {
        this.data = data;
        loadLevel(data.getAktLevel(), false);

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

        int githubistscheise = 666;
    }

    public void changeWeapon(int waffennummer) {

        if (data.getWaffenStufe(waffennummer) > 0) {
            data.setAktWaffe(waffennummer);
        }

        m.addTextToTextAria(GamePanel.getjTextAreaGame(), "Zur Waffe " + waffennummer + " gewechselt");

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
                data.setLebendeStreber(data.getLebendeStreber() + respawnRate);
            }

            m.setLebendeStreber(data.getLebendeStreber());
            m.setToteStreber(data.getGetoeteteStreber());
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

    public static void setAktGame(Game aktGame) {
        Game.aktGame = aktGame;
    }

}
