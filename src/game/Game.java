/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gui.MainGUI;
import gui.Screen;
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

    MainGUI m;
    Data data;
    Screen scr;

    //Levelinformationen
    int respawnRate;

    public Game(MainGUI m) {
        this.m = m;
        scr = m.getGamePanel1().getScreen();
    }

    public void loadGame() throws IOException {
        data = new Data();
        loadLevel(1);
    }

    public void loadLevel(int levelnr) throws IOException {

        //System.out.println(getClass().getClassLoader().getResource("Levels/Level_" + Integer.toString(levelnr) + ".txt").toString().substring(6));
        List<String> zeilen = ladeTXT("Levels/Level_" + Integer.toString(levelnr) + ".txt");
        int startPos = zeilen.indexOf("-START-");
        data.setAktLevel(levelnr);
        data.setLebendeStreber(Integer.parseInt(zeilen.get(startPos + 1)));
        respawnRate = Integer.parseInt(zeilen.get(startPos + 2));
        scr.setBG(ladeBild(zeilen.get(startPos + 3)));
        scr.setAktStreber(ladeBild(zeilen.get(startPos + 4)));

    }
    
    

    @Override
    public void run() {
        while(true){
            
            //Thread.sleep(10);
        }
    }

    private BufferedImage ladeBild(String quelle) {
        try {
            return ImageIO.read(getClass().getClassLoader().getResourceAsStream(quelle));
        } catch (IOException ex) {
            System.out.print("Bild nicht gefunden");
        }
        return null;
    }

    private ArrayList<String> ladeTXT(String quelle) throws FileNotFoundException {

        BufferedReader stdin;
        try {
            stdin = new BufferedReader(new FileReader(getClass().getClassLoader().getResource(quelle).toString().substring(6)));
            ArrayList<String> dokument = new ArrayList();
            while (stdin.ready()) {
                dokument.add(stdin.readLine());
            }
            return dokument;

        } catch (IOException ex) {
            System.err.print("Textdatei nicht gefunden");
        }
        return null;

    }

}