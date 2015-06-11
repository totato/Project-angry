/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

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
    
    private static final long frameTime = 100;
    
    private static Game aktGame;
    
    private MainGUI m;
    private Data data;
    private Screen scr;

    //Levelinformationen
    private int respawnRate;
    
    public Game() {
        
        m = MainGUI.getAktMainGUI();
        scr = m.getGamePanel1().getScreen();
        
    }
    
    public void loadGame() throws IOException {
        data = new Data();
        loadLevel(1);
    }
    
    public void loadLevel(int levelnr) throws IOException {

        //System.out.println(getClass().getClassLoader().getResource("Levels/Level_" + Integer.toString(levelnr) + ".txt").toString().substring(6));
        List<String> zeilen = WindowProperties.ladeTXT("Levels/Level_" + Integer.toString(levelnr) + ".txt");
        int startPos = zeilen.indexOf("-START-");
        data.setAktLevel(levelnr);
        data.setLebendeStreber(Integer.parseInt(zeilen.get(startPos + 1)));
        respawnRate = Integer.parseInt(zeilen.get(startPos + 2));
        scr.setBG(WindowProperties.ladeBild(zeilen.get(startPos + 3)));
        scr.setAktStreber(WindowProperties.ladeBild(zeilen.get(startPos + 4)));
        
    }
    
    public void useAktWeapon(){
        data.killStreber(5);
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
            if (frameTime - (System.currentTimeMillis() - startTime)>0) {
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
