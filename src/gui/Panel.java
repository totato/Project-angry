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
