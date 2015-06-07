/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static gui.WindowProperties.language;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;

/**
 *
 * @author Vika
 */
public class MainGUI extends WindowProperties {

    static JFrame gamescreen;
   // private JPanel cutsceneCard;
    static JPanel gamecards;
    static CardLayout clgame;
    private Timer timer;

    private gui.GamePanel gamePanel1;
    private gui.ShopPanel shopPanel1;
    private gui.SkillPanel skillPanel1;

    public MainGUI() {
        setLanguage(language);
        System.out.println("Öffnet das Game Fenster");
        gamescreen = new JFrame(getWords(18));
        gamescreen.setMaximumSize(new java.awt.Dimension(655, 778));
        gamescreen.setMinimumSize(new java.awt.Dimension(655, 778));
        gamescreen.setPreferredSize(new java.awt.Dimension(655, 778));
        //gamescreen.getContentPane().setLayout(new java.awt.CardLayout());
        createCards(gamescreen.getContentPane());

        gamescreen.setResizable(false);
        gamescreen.setDefaultCloseOperation(3);
        gamescreen.setLocationRelativeTo(null);

        setIconPicture(gamescreen, "GameIcon.png");     //TODO: Muss gemacht 
        //und eingefügt werden
        //backgroundMusic("rewind.wav");TODO: Muss gemacht und eingefügt werden
        gamescreen.pack();
        gamescreen.setVisible(true);
        //levelPruefer();//TODO: An bessere position verlegen und 
        //a. jeweils nach cutscenes
        //b. nach beendigung eines levels
        //feuern lassen.
    }

    private void createCards(Container pane) {
        gamePanel1 = new gui.GamePanel();
        shopPanel1 = new gui.ShopPanel();
        skillPanel1 = new gui.SkillPanel();

        gamecards = new JPanel(new CardLayout());

        gamecards.add(gamePanel1, "game card");
        gamecards.add(shopPanel1, "shop card");
        gamecards.add(skillPanel1, "skill card");
        //gamecards.add(cutsceneCard, "c card");

        //Pane wird der Methode übergeben (oben in den Klammern)
        // in unserem Fall werden die Karten zum ContentPane des Launchers
        // hinzu gefügt
        pane.add(gamecards);

        // Hier wird gesagt es es sich nun um ein Cardlayout handelt
        clgame = (CardLayout) (gamecards.getLayout());
        
               
    }

    
    private void backToLauncher() {
        Launcher l = new Launcher();
        l.Launcher();
        //TODO: Musik vom Spiel beenden.
        gamescreen.setVisible(false);

        System.out.println("gamescreen wird unsichtbar und anschließend zerstört"
                + "(dispose)");
        gamescreen.dispose();
    }

    
    /*Wechselt die gezeigte Karte. Die neue Karte ist die, deren
     Namen angegeben wurde
     */
        static void changeCard(String name,CardLayout cl, JPanel cards ) {

        //Cutscenes.playcutscene(1, pfad);
        cl.show(cards, name);
        /*buttonToMenu.setEnabled(false);
         buttonToGame.setEnabled(false);
         timer = new Timer(1900, new AbstractAction() {
         public void actionPerformed(ActionEvent e) {
         buttonToMenu.setEnabled(true);
         buttonToGame.setEnabled(true);
         }
         });
         timer.start();*/
        System.out.println("zu  " + name + "  gewechselt");
    }
}
