package gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JLabel;

/**
 *
 * @author tseidelm
 */
public class Screen extends JLabel{
    
    private static final int XSIZE = 410;
    private static final int YSIZE = 580;
    
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
        g.drawImage(background, 0, 0, null);
        g.drawImage(aktStreber, XSIZE/2-aktStreber.getWidth()/2, YSIZE/2 - aktStreber.getHeight()/2, null);
    }
}
