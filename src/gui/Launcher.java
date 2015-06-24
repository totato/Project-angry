package gui;

import game.Game;
import static gui.WindowProperties.language;
import static gui.WindowProperties.stopBgMusic;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author Wir
 */
public class Launcher extends WindowProperties {

    private static Launcher aktLauncher;
    private JFrame launcher;
    private JTextField savefilezeile;
    private JLabel background;
    private JLabel bild;
    private JButton backButton;
    private CardLayout cl;
    private JPanel cards;
    private JPanel cutsceneCard;
    private JPanel launcherCard;
    private JPanel tutorialPanel;
    private JMenuBar menuezeile;

    /**
     * Erzeugt den Launcher
     */
    //Ein Konstruktor gibt kein void zurück
    //Habe das geändert und auch an anderen Stellen im Programm das angepasst, allerdings das alte immer nur auskommentiert
    public Launcher() throws LineUnavailableException {
        Launcher.setAktLauncher(this);
        launcher = new JFrame("This game will make you Angry!");
        MenueLeiste();

        // Erzeugt die Karten für das Fenster
        createCards(launcher.getContentPane());

        launcher.setSize(1000, 600);
        launcher.setResizable(false);
        launcher.setDefaultCloseOperation(3);
        launcher.setLocationRelativeTo(null);

        setIconPicture(launcher, "ScreenLaun/GameIcon.png");
        loadMusic();
        backgroundMusic(clipLaun);

        launcher.pack();
        launcher.setVisible(true);
    }

    private void beginnen() throws IOException, LineUnavailableException, Exception {
        if (savefilezeile.getText().equals("") || savefilezeile.getText().isEmpty()) {
            JOptionPane.showMessageDialog(launcher, "Deine Speicherdatei hat keinen Namen!\n"
                    + "Du könntest nichts laden!", "Freundlicher Hinweis", 3);
        } else {
            launcher.setVisible(false);
            System.out.println("Launcher wird unsichtbar und anschließend zerstört"
                    + "(dispose)");
            launcher.dispose();

            MainGUI mainGUI = new MainGUI();

            Game game = new Game(savefilezeile.getText());

            game.loadGame();
            mainGUI.disableButtons();
        }
    }

    /**
     * Erzeugt die MenueLeiste mit einträgen.
     */
    public void MenueLeiste() {

        menuezeile = new JMenuBar();
        launcher.setJMenuBar(menuezeile);

        // Das Datei-Menü erzeugen
        JMenu spielstart = new JMenu("Weiter");
        menuezeile.add(spielstart);

        JMenuItem spielOeffnen = new JMenuItem("Get angry!");
        spielOeffnen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("beginne Spiel");
                try {
                    beginnen();
                } catch (IOException ex) {
                    Logger.getLogger(Launcher.class.getName()).log(Level.SEVERE, null, ex);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(Launcher.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(Launcher.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        spielstart.add(spielOeffnen);

        JMenuItem beendenEintrag = new JMenuItem("Don't get angry!");
        beendenEintrag.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                beenden();
            }
        });
        spielstart.add(beendenEintrag);

        JMenu hilfeMenue = new JMenu("Hilfe");
        menuezeile.add(hilfeMenue);

        JMenuItem infoEintrag = new JMenuItem("Informationen");
        infoEintrag.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                zeigeInfo();
            }
        });
        hilfeMenue.add(infoEintrag);

        JMenuItem Spielhilfe = new JMenuItem("Tutorial");
        Spielhilfe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                zeigeHilfe();
            }
        });
        hilfeMenue.add(Spielhilfe);


    }
    /*
     Erzeugt die Karten
     Jede Karte ist als JPanel definiert, da sie im grunde nur die enthaltenen 
     Objekte wie z.B Textfenster zusammenfasst.
     */

    private void createCards(Container pane) {
        // Die Launcher Karte wird erzeugt
        launcherCard = new JPanel();
        // Es soll schließlich schön aussehen, also bekommt 
        //es ein Layout zugewiesen
        launcherCard.setLayout(new BorderLayout());
        //die Objekte
        background = new JLabel();
        savefilezeile = new JTextField("Name deiner Datei");

        //Die Objekte werden der launcherCard hinzugefügt
        launcherCard.add(background, BorderLayout.CENTER);
        launcherCard.add(savefilezeile, BorderLayout.SOUTH);
        setBackgrPicture(background, "ExLauncher/BackScreen.png");

        

        tutorialPanel = new gui.TutorialPanel();
        // Alle Karten werden zusammengefasst in einer art Kartenstapel
        cards = new JPanel(new CardLayout());
        cards.add(launcherCard, "L card");  //Die Karten bekommen einen Namen
        cards.add(tutorialPanel, "Tut card");

        //Pane wird der Methode übergeben (oben in den Klammern)
        // in unserem Fall werden die Karten zum ContentPane des Launchers
        // hinzu gefügt
        pane.add(cards);

        // Hier wird gesagt es es sich nun um ein Cardlayout handelt
        cl = (CardLayout) (cards.getLayout());
    }

    private void toLauncher(ActionEvent e) throws LineUnavailableException {
        if (e.getSource() == backButton) {
            resetClip(clipLaun);
            System.out.println("Zurück zum Launcher");
            cl.show(cards, "L card");
        }
    }

    public void toMainLauncher() throws LineUnavailableException {
        cl.show(cards, "L card");

    }
    /*
     Öffnet ein Fenster von "Launcher" aus, das Standartinformationen über das 
     Spiel zeigt
     */

    private void zeigeInfo() {
        JOptionPane.showMessageDialog(launcher, "Eine 'Positive Energy Theorem Interactive' Produktion.\n"
                + "Version 1.0",
                "Informationen",
                JOptionPane.INFORMATION_MESSAGE);
    }

    /*
     Öffnet ein Fenster von "Launcher" aus, das Standarthilfenn über das 
     Spiel zeigt
     */
    private void zeigeHilfe() {

        cl.show(cards, "Tut card");
    }

    /*
     Wählt die Sprache aus und startet dann den Launcher neu. Die mitgegebene 
     String ist der Name der Sprache.
     */

    /*
     Beendet das Programm
     */
    private void beenden() {
        System.exit(0);
    }

    public static Launcher getAktLauncher() {
        return aktLauncher;
    }

    public static void setAktLauncher(Launcher aktLauncher) {
        Launcher.aktLauncher = aktLauncher;
    }

}
