/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import game.Game;
import gui.WindowProperties;
import static gui.WindowProperties.language;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.Timer;

/**
 *
 * @author Vika. Nein, tschuldigung. WIRka. WIRka.
 */
public class MainGUI extends WindowProperties {

    private static MainGUI aktMainGUI;

    private JFrame gamescreen;
    // private JPanel cutsceneCard;
    private JPanel gamecards;
    private CardLayout clgame;
    private Timer timer;

    private Game game;

    private gui.GamePanel gamePanel1;
    private gui.ShopPanel shopPanel1;
    private gui.SkillPanel skillPanel1;

    public GamePanel getGamePanel1() {
        return gamePanel1;
    }

    public ShopPanel getShopPanel1() {
        return shopPanel1;
    }

    public SkillPanel getSkillPanel1() {
        return skillPanel1;
    }

    public void setLebendeStreber(int ls) {
        gamePanel1.setLebendeStreber(ls);
    }

    public void setToteStreber(int ts) {
        gamePanel1.setToteStreber(ts);
    }

    public static MainGUI getAktMainGUI() {
        return aktMainGUI;
    }

    public static void setAktMainGUI(MainGUI aktMainGUI) {
        MainGUI.aktMainGUI = aktMainGUI;
    }

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

        setIconPicture(gamescreen, "ScreenLaun/GameIcon.png");     //TODO: Muss gemacht 
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
        //l.Launcher();
        //TODO: Musik vom Spiel beenden.
        gamescreen.setVisible(false);

        System.out.println("gamescreen wird unsichtbar und anschließend zerstört"
                + "(dispose)");
        gamescreen.dispose();
    }

    /*
     Wechselt die gezeigte Karte. Die neue Karte ist die, deren
     Namen angegeben wurde
     */
    public void changeCard(String name) {
        //Cutscenes.playcutscene(1, pfad);
        clgame.show(getGamecards(), name);
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

    public void addTextToTextArier(JTextArea ta, String text) {
        int maxSigns = 30;
        int lastSpace = 0;
        while (text.length() > maxSigns) {
            System.out.println("Text Lenght"+text.length());

            for (int i = 0; i < maxSigns; i++) {
                if (text.charAt(i) == 32) {
                    lastSpace = i;
                }
            }


                ta.setText(GamePanel.getjTextAreaGame().getText() +"  "+ text.substring(0, lastSpace) + "\n");
                
                text = text.substring(lastSpace + 1);
        }
        ta.setText(GamePanel.getjTextAreaGame().getText()+"  " + text + "\n");
    }

    public JPanel getGamecards() {
        return gamecards;
    }

    public JFrame getGamescreen() {
        return gamescreen;
    }
    
    public void initialisieren(){
        gamePanel1.initialisieren();
        shopPanel1.initialisieren();
        skillPanel1.initialisieren();
    }

}
