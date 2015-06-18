package gui;

import game.Game;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.JLabel;

/**
 *
 * @author Informatiker ohne Hobbies.
 */
public class Screen extends JLabel{
    
    private static final int XSIZE = 410;
    private static final int YSIZE = 580;
    
    private BufferedImage background = new BufferedImage(1,2,3);
    private BufferedImage aktStreber = new BufferedImage(1,2,3);
    private String aktStreberAnzahl;
    
    private boolean inScreen;
    
    public Screen(){
        
        inScreen = false;
        
        this.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                Game.getAktGame().useWeapon(Game.getAktGame().getData().getAktWaffe());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                inScreen = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
               inScreen = false;
            }
            
        });
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
        super.repaint();
        g.drawImage(background, 0, 0, null);
        g.drawImage(aktStreber, XSIZE/2-aktStreber.getWidth()/2, YSIZE/2 - aktStreber.getHeight()/2, null);
    }
}
