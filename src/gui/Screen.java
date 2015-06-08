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
    
    public Screen(){
        
    }
    
    public void setBG(BufferedImage bg){
        this.background = bg;
    }
    
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(background, TOP, TOP, null);
    }
}
