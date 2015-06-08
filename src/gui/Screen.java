package gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JLabel;

/**
 *
 * @author tseidelm
 */
public class Screen extends JLabel{
    
    private BufferedImage background;
    private BufferedImage aktStreber;
    private String aktStreberAnzahl;
    
    public Screen(){
        
    }
    
    public void setBG(BufferedImage bg){
        this.background = bg;
    }

    public void setAktStreber(BufferedImage aktStreber) {
        this.aktStreber = aktStreber;
    }

    public void setAktStreberAnzahl(String aktStreberAnzahl) {
        this.aktStreberAnzahl = aktStreberAnzahl;
    }
    
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(background, TOP, TOP, null);
        g.drawImage(aktStreber, CENTER, CENTER, null);
    }
}
