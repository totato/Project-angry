/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gui.MainGUI;
import gui.Screen;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Toast
 */
public class Game implements Runnable {
    
    MainGUI m;
    Data data;
    Screen scr;
    
    public Game(MainGUI m){
        this.m = m;
    }
    
    public void loadLevel(int i) throws IOException{
        scr = m.getGamePanel1().getScreen();
        try{
        scr.setBG(ImageIO.read(getClass().getClassLoader().getResourceAsStream("proj_1/ScreenLaun/TestBG.png")));
        } catch (FileNotFoundException e) {
            System.out.println("fail");
        }
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
