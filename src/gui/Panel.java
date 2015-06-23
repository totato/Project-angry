package gui;

import java.io.IOException;
import javax.sound.sampled.Clip;
import javax.swing.JPanel;

/**
 *
 * @author Toast
 */
public abstract class Panel extends JPanel{
    
    private Clip bgMusic;
    
    public abstract void disableButtons();
    public void switchTo() throws Exception{
        
        WindowProperties.backgroundMusic(bgMusic);
    };
    public void switchFrom() throws Exception{
        WindowProperties.stopBgMusic();
    };

    public Clip getBgMusic() {
        return bgMusic;
    }

    public void setBgMusic(Clip bgMusic) {
        this.bgMusic = bgMusic;
    }
}
