/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;

/**
 *
 * @author Wir
 */
public class Launcher extends Cutscenes {

    private JFrame launcher;
    private JTextField cutscenekey;
    private JLabel background;
    private JLabel bild;
    private JButton backButton;
    private CardLayout cl;
    private JPanel cards;
    private JPanel cutsceneCard;
    private JMenuBar menuezeile;

    /**
     * Erzeugt den Launcher
     */
    public void Launcher() {
        setLanguage(language);
        launcher = new JFrame(getWords(1));
        MenueLeiste();

        // Erzeugt die Karten für das Fenster
        createCards(launcher.getContentPane());

        launcher.setSize(1000, 600);
        launcher.setResizable(false);
        launcher.setDefaultCloseOperation(3);
        launcher.setLocationRelativeTo(null);

        setIconPicture(launcher, "20941.png");
        backgroundMusic("titleSong.wav");

        launcher.pack();
        launcher.setVisible(true);
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
                beginnen();
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

        JMenuItem infoEintrag = new JMenuItem(getWords(7));
        infoEintrag.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                zeigeInfo();
            }
        });
        hilfeMenue.add(infoEintrag);

        JMenuItem Spielhilfe = new JMenuItem(getWords(6));
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
                sprachReset("DE");
            }
        });
        sprachenMenu.add(languageGer);

        JMenuItem languageEng = new JMenuItem("Englisch");//TODO: Sprache einfügen
        languageEng.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sprachReset("EN");
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
        cutscenekey = new JTextField(getWords(8));
        cutscenekey.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cutsceneZeigen();
            }
        });
        //Die Objekte werden der launcherCard hinzugefügt
        launcherCard.add(background, BorderLayout.CENTER);
        launcherCard.add(cutscenekey, BorderLayout.SOUTH);
        setBackgrPicture(background, "BackScreen.png");

        //Das gleiche nun mit den Cutscenes
        cutsceneCard = new JPanel();
        cutsceneCard.setLayout(new BorderLayout());
        bild = new JLabel();
        cutsceneCard.add(bild, BorderLayout.NORTH);
        backButton = new JButton(getWords(9));
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                toLauncher(e);
            }
        });
        cutsceneCard.add(backButton, BorderLayout.SOUTH);

        // Alle Karten werden zusammengefasst in einer art Kartenstapel
        cards = new JPanel(new CardLayout());
        cards.add(launcherCard, "L card");  //Die Karten bekommen einen Namen
        cards.add(cutsceneCard, "Cs card1");// den Braucht man später zum aufrufen

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
    private void cutsceneZeigen() {
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

    }

    private void toLauncher(ActionEvent e) {
        if (e.getSource() == backButton) {
            System.out.println("Zurück zum Launcher");
            cl.show(cards, "L card");
        }
    }
    /*
     Öffnet ein Fenster von "Launcher" aus, das Standartinformationen über das 
     Spiel zeigt
     */

    private void zeigeInfo() {
        JOptionPane.showMessageDialog(launcher, getWords(12),
                getWords(13),
                JOptionPane.INFORMATION_MESSAGE);
    }

    /*
     Öffnet ein Fenster von "Launcher" aus, das Standarthilfenn über das 
     Spiel zeigt
     */
    private void zeigeHilfe() {
        JOptionPane.showMessageDialog(launcher, getWords(10),
                getWords(11),
                JOptionPane.INFORMATION_MESSAGE);
    }

    /*
     Wählt die Sprache aus und startet dann den Launcher neu. Die mitgegebene 
     String ist der Name der Sprache.
     */
    private void sprachReset(String sprache) {
        language = sprache;
        launcher.setVisible(false);
        stopBgMusic();
        System.out.println("Launcher wird unsichtbar und anschließend zerstört"
                + "(dispose). Neuer Launcher wird gestartet.");
        launcher.dispose();
        Launcher l = new Launcher();
        l.Launcher();

    }

    /*
     Beendet das Programm
     */
    private void beenden() {
        System.exit(0);
    }

    /*
     Versteckt den Launcher. Soll Später das Spiel beginnen.
     */
    private void beginnen() {
        
         java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
    new GameGUI();
          }
      });
                
      //Game g = new Game();
        //g.Game();
        stopBgMusic();
        launcher.setVisible(false);
        System.out.println("Launcher wird unsichtbar und anschließend zerstört"
                + "(dispose)");
        launcher.dispose();

    }

}
