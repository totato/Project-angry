package gui;

import static gui.WindowProperties.clipLaun;
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
        if(bgMusic.equals(clipLaun)){   //Main theme soll immer vom Anfang an 
            //spielen, für Cutscenes und den Launcher!
            WindowProperties.resetClip(clipLaun);
        }
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
