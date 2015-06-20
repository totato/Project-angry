/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;
import javax.swing.JPanel;

/**
 *
 * @author Toast
 */
public abstract class Panel extends JPanel{
    
    private String bgMusic;
    
    public abstract void disableButtons();
    public void switchTo() throws Exception{
        WindowProperties.backgroundMusic(bgMusic);
    };
    public void switchFrom() throws Exception{
        WindowProperties.stopBgMusic();
    };

    public String getBgMusic() {
        return bgMusic;
    }

    public void setBgMusic(String bgMusic) {
        this.bgMusic = bgMusic;
    }
}
