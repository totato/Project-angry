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

    private JFrame launcher;
    private JTextField savefilezeile;
    private JLabel background;
    private JLabel bild;
    private JButton backButton;
    private CardLayout cl;
    private JPanel cards;
    private JPanel cutsceneCard;
    private JPanel tutorialPanel;
    private JMenuBar menuezeile;

    /**
     * Erzeugt den Launcher
     */
    //Ein Konstruktor gibt kein void zurück
    //Habe das geändert und auch an anderen Stellen im Programm das angepasst, allerdings das alte immer nur auskommentiert
    public Launcher() throws LineUnavailableException {
        setLanguage(language);
        launcher = new JFrame(getWords(1));
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
            /*java.awt.EventQueue.invokeLater(new Runnable() {
             MainGUI mainGUI;
             public void run() {
             mainGUI = new MainGUI();
             }
             });*/
            //WindowProperties.stopBgMusic();
            launcher.setVisible(false);
            System.out.println("Launcher wird unsichtbar und anschließend zerstört"
                    + "(dispose)");
            launcher.dispose();

            MainGUI mainGUI = new MainGUI();

            Game game = new Game(savefilezeile.getText());

            game.loadGame();
            mainGUI.disableButtons();
        }
        //Thread gameThread = new Thread(game);
        //gameThread.start();
        //MainGUI.getAktMainGUI().changeCard("story card");
    }

    /**
     * Erzeugt die MenueLeiste mit einträgen.
     */
    public void MenueLeiste() {

        menuezeile = new JMenuBar();
        launcher.setJMenuBar(menuezeile);

        // Das Datei-Menü erzeugen
        JMenu spielstart = new JMenu(getWords(2));
        menuezeile.add(spielstart);

        JMenuItem spielOeffnen = new JMenuItem(getWords(3));
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

        JMenuItem beendenEintrag = new JMenuItem(getWords(4));
        beendenEintrag.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                beenden();
            }
        });
        spielstart.add(beendenEintrag);

        JMenu hilfeMenue = new JMenu(getWords(5));
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

        JMenu sprachenMenu = new JMenu("Sprachen");//TODO: Sprache einfügen

        menuezeile.add(sprachenMenu);

        JMenuItem languageGer = new JMenuItem("Deutsch");//TODO: Sprache einfügen
        languageGer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    sprachReset("DE");
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(Launcher.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        sprachenMenu.add(languageGer);

        JMenuItem languageEng = new JMenuItem("Englisch");//TODO: Sprache einfügen
        languageEng.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    sprachReset("EN");
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(Launcher.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        sprachenMenu.add(languageEng);

    }
    /*
     Erzeugt die Karten
     Jede Karte ist als JPanel definiert, da sie im grunde nur die enthaltenen 
     Objekte wie z.B Textfenster zusammenfasst.
     */

    private void createCards(Container pane) {
        // Die Launcher Karte wird erzeugt
        JPanel launcherCard = new JPanel();
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

        //Das gleiche nun mit den Cutscenes
        cutsceneCard = new JPanel();
        cutsceneCard.setLayout(new BorderLayout());
        bild = new JLabel();
        cutsceneCard.add(bild, BorderLayout.NORTH);
        backButton = new JButton(getWords(9));
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    toLauncher(e);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(Launcher.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        cutsceneCard.add(backButton, BorderLayout.SOUTH);

        
        tutorialPanel = new gui.TutorialPanel();
        // Alle Karten werden zusammengefasst in einer art Kartenstapel
        cards = new JPanel(new CardLayout());
        cards.add(launcherCard, "L card");  //Die Karten bekommen einen Namen
        cards.add(cutsceneCard, "Cs card1");// den Braucht man später zum aufrufen
        cards.add(tutorialPanel, "Tut card");

        //Pane wird der Methode übergeben (oben in den Klammern)
        // in unserem Fall werden die Karten zum ContentPane des Launchers
        // hinzu gefügt
        pane.add(cards);

        // Hier wird gesagt es es sich nun um ein Cardlayout handelt
        cl = (CardLayout) (cards.getLayout());
    }

    /**
     * Findet heraus welcher Code im Feld "cutscenekey" eingegeben wurde und
     * beginnt die passende Cutscene.
     *
     */
    /*private void cutsceneZeigen() throws LineUnavailableException {
     String pfad = "" + (getClass().getClassLoader());
     if (cutscenekey.getText().equals("Cutscene1")) {
     System.out.println("Spiele Cutscene 1 ab");
     cl.show(cards, "Cs card1");//Erstes Bild der Cutscene
     playCutscene(1, cutsceneCard, bild);
     stopBgMusic();
     backgroundMusic("titleSong.wav");

     } else if (cutscenekey.getText().equals("Cutscene2")) {
     System.out.println("Spiele Cutscene 2 ab");
     cl.show(cards, "Cs card1");
     playCutscene(2, cutsceneCard, bild);
     } else if (cutscenekey.getText().equals("Cutscene3")) {
     System.out.println("Spiele Cutscene 3 ab");
     cl.show(cards, "Cs card1");
     playCutscene(3, cutsceneCard, bild);
     } else {
     System.out.println("Spiele keine Cutscene ab.");
     cutscenekey.setText("Kein Cutsceneschlüssel!");

     }

     }*/
    private void toLauncher(ActionEvent e) throws LineUnavailableException {
        if (e.getSource() == backButton) {
            resetClip(clipLaun);
            System.out.println("Zurück zum Launcher");
            cl.show(cards, "L card");
        }
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
        
        JOptionPane.showMessageDialog(launcher, getWords(10),
                getWords(11),
                JOptionPane.INFORMATION_MESSAGE);
    }

    /*
     Wählt die Sprache aus und startet dann den Launcher neu. Die mitgegebene 
     String ist der Name der Sprache.
     */
    private void sprachReset(String sprache) throws LineUnavailableException {
        language = sprache;
        launcher.setVisible(false);
        stopBgMusic();
        System.out.println("Launcher wird unsichtbar und anschließend zerstört"
                + "(dispose). Neuer Launcher wird gestartet.");
        launcher.dispose();
        Launcher l = new Launcher();
        //l.Launcher();
    }
    
    public void launcherReset() throws LineUnavailableException{
            launcher.setVisible(false);
    stopBgMusic();
        System.out.println("Launcher wird unsichtbar und anschließend zerstört"
                + "(dispose). Neuer Launcher wird gestartet.");
        launcher.dispose();
        Launcher l = new Launcher();
    }
    /*
     Beendet das Programm
     */
    private void beenden() {
        System.exit(0);
    }

}
