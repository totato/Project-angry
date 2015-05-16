/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj_1;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;

/**
 *
 * @author Vika
 *
 * Jajaaa. Natürlich. Nur du. Ich schreib Wir hin, aber du.... WIE DU WILLST!
 */
public class Game extends GameGUI {//Hier ev. noh private einfügen. binzu müde dafür.

    private JFrame gamescreen;      //TODO: Modifizieren sobald GUI fertig ist!
    private JPanel gameCard;
    private JLabel backgroundGame;
    private JPanel cutsceneCard;
    private JLabel backgroundMenu;
    private JLabel cutscenePicture;
    private JPanel gamecards;
    private CardLayout clgame;
    private JButton buttonToMenu;
    private JButton buttonToGame;
    private JButton buttonBackToGame;
    private JButton buttonAbortGame;
    private Timer timer;
    private JLabel main;
    private int beendeteLevel;//Level die schon beendet wurden.

    private JButton attack1;//Button für permanente Angriffe
    private JButton attack2;
    //...
    private JButton buy1;//Button für einmal benututzbare kills
    //...

    private int brillenFaktor;
    private int killFaktor;

    private int brillen;//Eine Brille entspricht einem toten Streber entsrpicht einem Kill
    private int lebendeStreber;//Noch lebende Streber, wenn da 0 erreicht nächstes level!
    private int getoeteteStreber;//getötete Streber. Steigt immer weiter, wird aber niemals abgezogen.
    private JLabel brillenZeiger;//JLabel was anzahl der Brillen anzeigt
    private JLabel lebendeZeiger;//JLabel was die Anzahl der noch lebenden Streber anzeigt
    //Oder auch nicht.
    private JLabel toteZeiger;//Zeigt die gemachten Kills an. Wird immer größer.
    private int streberTyp;//TODO: String oder Int zum angeben des Streber
    //typs?
    /*
     Erstellt das Spiel-fenster.
     */

    public void Game() {
        setLanguage(language);
        System.out.println("Öffnet das Game Fenster");
        gamescreen = new JFrame(getWords(18));
        // Erzeugt die Karten für das Fenster
        createCards(gamescreen.getContentPane());

        gamescreen.setSize(1000, 600);
        gamescreen.setResizable(false);
        gamescreen.setDefaultCloseOperation(3);
        gamescreen.setLocationRelativeTo(null);

        setIconPicture(gamescreen, "GameIcon.png");     //TODO: Muss gemacht 
        //und eingefügt werden
        //backgroundMusic("rewind.wav");TODO: Muss gemacht und eingefügt werden
        gamescreen.pack();
        gamescreen.setVisible(true);

        levelPruefer();//TODO: An bessere position verlegen und 
        //a. jeweils nach cutscenes
        //b. nach beendigung eines levels
        //feuern lassen.
        loadGame();
    }

    /*
     Erzeugt die Karten
     Jede Karte ist als JPanel definiert, da sie im grunde nur die enthaltenen 
     Objekte wie z.B Textfenster zusammenfasst.
    
     TODO: Wird, sobald GameGUI fertig ist, wahrscheinlich redundant.
     */
    private void createCards(Container pane) {

        JPanel gameCard = new JPanel();
        gameCard.addKeyListener(null);
        gameCard.setLayout(new BorderLayout());

        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        main = new JLabel();
        p1.add(main, BorderLayout.CENTER);
        p1.setPreferredSize(new java.awt.Dimension(300, 100));//FUNKTIONIERT NICHT

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        buttonToMenu = new JButton(getWords(19));
        buttonToMenu.getInputMap(buttonToMenu.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_M, 0), "menu");

        buttonToMenu.getActionMap().put("menu", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                changeCard("m card");
            }
        });

        buttonToMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                changeCard("m card");
            }
        });

        //Alles hier drunter ist das Spiel an sich, und kann daher u.a. 
        //von levelReset angerührt werden.
        p2.add(new JLabel(getWords(20)));

        attack1 = new JButton(getWords(21));
        attack1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                kill(1);
            }
        });

        attack2 = new JButton(getWords(22));
        attack2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                kill(10);
            }
        });

        buy1 = new JButton(getWords(23));//TODO: Lesen aus Sprachdatei
        buy1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                specialKill(200, 100, 0);
            }
        });

        p2.add(attack1);//Jeder Button ist oben definiert!
        p2.add(attack2);
        p2.add(new JButton("H"));
        p2.add(new JButton("I"));
        p2.add(new JButton("J"));
        p2.add(buy1);//TODO: Muss woander hingelegt werden.
        p2.add(new JLabel("                "));
        p2.add(buttonToMenu);

        JPanel p3 = new JPanel();

        lebendeZeiger = new JLabel(getWords(24) + lebendeStreber);
        toteZeiger = new JLabel(getWords(25) + getoeteteStreber);
        brillenZeiger = new JLabel(getWords(26) + brillen);
        //TODO: Variablen nach Sprache einfügen.
        p3.setLayout(new GridLayout(5, 1));
        p3.add(lebendeZeiger);
        p3.add(toteZeiger);
        p3.add(brillenZeiger);//Habe "Getötete Streber" mit Brillen ersetzt.
        p3.add(new JLabel("1"));
        p3.add(new JLabel("2"));
        p3.add(new JLabel("3"));
        p3.add(new JLabel("4"));
        p3.add(new JLabel("5"));

        gameCard.setLayout(new BorderLayout());
        gameCard.add(p1, BorderLayout.CENTER);
        gameCard.add(p2, BorderLayout.SOUTH);
        gameCard.add(p3, BorderLayout.EAST);

        /* buttonToMenu = new JButton(getWords(19));
         buttonToMenu.getInputMap(buttonToMenu.WHEN_IN_FOCUSED_WINDOW).put
         (KeyStroke.getKeyStroke(KeyEvent.VK_M, 0), "menu");

         buttonToMenu.getActionMap().put("menu", new AbstractAction() {
         public void actionPerformed(ActionEvent e) {
         changeCard("m card");
         }
         });

         buttonToMenu.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         changeCard("m card");
         }
         });
         gameCard.add(buttonToMenu, BorderLayout.SOUTH);*/
        JPanel menuCard = new JPanel();
        backgroundMenu = new JLabel();
        menuCard.setLayout(new BorderLayout());
        menuCard.add(backgroundMenu, BorderLayout.CENTER);
        setBackgrPicture(backgroundMenu, "MenuBG.jpg");
        buttonToGame = new JButton("");
        setButtonBackground(buttonToGame, "ButtonIcon1.png");

        buttonToGame.getInputMap(buttonToGame.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_M, 0), "game");

        buttonToGame.getActionMap().put("game", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                changeCard("g card");
            }
        });

        buttonToGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                changeCard("g card");
            }
        });

        buttonAbortGame = new JButton("");
        setButtonBackground(buttonAbortGame, "GameIcon.png");//TODO: einfügen

        buttonAbortGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                backToLauncher();
            }
        });
        menuCard.add(buttonToGame, BorderLayout.SOUTH);
        menuCard.add(buttonAbortGame, BorderLayout.EAST);

        cutsceneCard = new JPanel();//Wird später für Cutscenes genutzt.

        cutsceneCard.setLayout(new BorderLayout());
        cutscenePicture = new JLabel();
        cutsceneCard.add(cutscenePicture, BorderLayout.NORTH);

        buttonBackToGame = new JButton(getWords(9));
        buttonBackToGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                changeCard("g card");
            }
        });
        cutsceneCard.add(buttonBackToGame, BorderLayout.SOUTH);

        cutsceneCard.add(buttonBackToGame, BorderLayout.SOUTH);

        gamecards = new JPanel(new CardLayout());

        gamecards.add(gameCard, "g card");
        gamecards.add(menuCard, "m card");
        gamecards.add(cutsceneCard, "c card");

        //Pane wird der Methode übergeben (oben in den Klammern)
        // in unserem Fall werden die Karten zum ContentPane des Launchers
        // hinzu gefügt
        pane.add(gamecards);

        // Hier wird gesagt es es sich nun um ein Cardlayout handelt
        clgame = (CardLayout) (gamecards.getLayout());

    }

    /*Wechselt die gezeigte Karte. Die neue Karte ist die, deren
     Namen angegeben wurde
     */
    private void changeCard(String name) {

        //Cutscenes.playcutscene(1, pfad);
        clgame.show(gamecards, name);
        buttonToMenu.setEnabled(false);
        buttonToGame.setEnabled(false);
        timer = new Timer(1900, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                buttonToMenu.setEnabled(true);
                buttonToGame.setEnabled(true);
            }
        });
        timer.start();
        System.out.println("Menu gewechselt");
    }

    /*
     Wird aufgerufen um Upgrades zu kaufen.
     Der erste eingegebene Int-Wert ist der faktor (das Upgrade), der zweite der
     Preis, der dritte die Veränderung er Faktors.
     Soll vom shop benutzt werden.
    
     TODO: Funktioniert das so oder braucht jeder Faktor eine eigene Methode?
     Oder mit return-value?
     */
    private void buySkill(int upgrade, int cost, int effekt) {
        if (upgrade != -1) {
            if (brillen - cost >= 0) {
                brillen = brillen - cost;
                upgrade = upgrade + effekt;
            }
        }
    }

    /*
     Massives TODO:!
     Manche Angriffe sind gegen manche Strebertypen ineffektiv. Nötig vor der 
     Implementierung ist es, alle Angriffe und Strebertypen zu definieren.
     */
    private boolean streberPruefung(int usedAttack) {

        if (usedAttack > streberTyp) {
            return true;

        }
        return false;

    }

    /*
     TODO:!
     Wechselt nach jedem Kill, mit halb zufälliger Wahrscheinlichkeit, den
     aktuellen Strebertypen.
     Alternative: Wechselt alle x-Streber (also, jedes Battallion, beispielsweise,)
     den Strebertypen.
     */
    private void streberWechsel(int killTotal) {

    }

    /*
     Wird aufgerufen wenn es einen (oder mehrere) Kills gibt (durch Waffen). 
     Zieht die Anzahl toter Streber von der Gesamtzahl ab und fügt die gleiche 
     Anzahl an Brillen Hinzu. Fügt auch die angegebene Zahl den Gesamtkills zu.
     Stärkere Angriffe geben einem also mehr Brillen.
     */
    private void kill(int killed) {
        //TODO: e.v. Strebertyp implementierung überarbeiten
        if (streberPruefung(10)) {
            brillen = brillen + ((killed * killFaktor) * brillenFaktor);
            lebendeStreber = lebendeStreber - (killed * killFaktor);
            getoeteteStreber = getoeteteStreber + (killed * killFaktor);
            buttonUpdate();
            System.out.println("kill wird ausgeführt." + brillen + ";"
                    + getoeteteStreber + ";" + lebendeStreber);
            levelPruefer();
        } else {
            System.out.println("Nicht sehr effetktiv...");
            //TODO: Output an Spieler
        }
    }

    /* 
     Wird aufgerufen wenn Tode nicht durch Angriffe sondern durch (einmal Kaufbare)
     Spezialevents ausgelöst wurden. . Zieht die Anzahl toter Streber von der 
     Gesamtzahl ab, fügt aber keine Kronen hinzu. Fügt auch die erste angegebene 
     Zahl den Gesamtkills zu.Der zweite Intwertist der Angriff, der ausgeführt
     wurde. Der dritte int Wert wird von den Brillen abgezogen.
     Entstehen durch den ANgriff keine Kosten zusätzlich zum Kauf wird hier 
     einfach "0" mitgegeben.
    
     TODO: EIne Methode pro Specialkill schreiben?
     TODO: Je nach Spielsystemen überarbeiten
     */
    private void specialKill(int killed, int item1, int brillenabzug) {
        if (brillenabzug <= brillen) {
            lebendeStreber = lebendeStreber - killed;
            getoeteteStreber = getoeteteStreber + killed;
            brillen = brillen - brillenabzug;
            item1--;
            buttonUpdate();
            System.out.println("specialKill wird ausgeführt.");
            levelPruefer();
        } else {
            System.out.println("Zu wenig Brillen.");
            //TODO: Errornachricht an Spieler ausgeben
        }

    }

    /* 
     Setzt alle Parameter auf null, mit Ausnahme von den zu tötenden Strebern.
     Wird benutzt um ein neues Level zu beginnen (auch um das erste Level 
     zu beginnen). Der mitgegebene Parameter ist 
     die Anzahl der zu tötenden Streber.
    
     Hier können eventuell noch mehr resets eingefügt werden, beispielsweise wenn
     man jedes Level Waffen neu kaufen muss.
     */
    private void levelReset(int levelStreber) {
        lebendeStreber = levelStreber;
        getoeteteStreber = 0;
        brillen = 0;
        buttonUpdate();
        System.out.println("levelReset wird ausgeführt.");
    }

    /*
     Sorgt dafür, dass neue Werte angezeigt werden. Darf nicht im letzten Level
     (Endlosspiel) benutzt werden, da es die Zahl der noch lebenden Streber 
     anzeigt. Sollte überall dort verwendet werden, wo 
     a. die Zahl der Brillen
     b. die Zahl der toten Streber
     c. die Zahl der lebendigen Streber
     verändert wird.
     */
    private void buttonUpdate() {
        aliveEnemy.setText(getWords(24) + lebendeStreber);
        deadEnemy.setText(getWords(25) + getoeteteStreber);
        glasses.setText(getWords(26) + brillen);
        glassesM.setText(getWords(26) + brillen);

        brillenZeiger.repaint();
        lebendeZeiger.repaint();
        toteZeiger.repaint();
        glassesM.repaint();
    }

    /*
     Repainted alles, as nicht nach jedem Kill, sondern nach jedem Levelwechsel
     repainted werden soll.
     TODO:!*/
    private void buttonLevelUpdate() {
        lvlLabel.setText("LVL: " + beendeteLevel);//TODO: Übersetzungsdokument aufrufen

        lvlLabel.repaint();
    }
    /*
     Sorgt dafür, dass neue Werte angezeigt werden. 
     Sollte überall dort verwendet werden, wo 
     a. die Zahl der Brillen
     b. die Zahl der toten Streber
     c. die Zahl der lebendigen Streber
     verändert wird, die Zahl der noch lebendigen Streber 
     aber nicht angezeigt wird.
     TODO: Neue Werte einfügen
     */

    private void buttonEndlessUpdate() {
        lebendeZeiger.setText("?");
        toteZeiger.setText(getWords(25) + getoeteteStreber);
        brillenZeiger.setText(getWords(26) + brillen);

        brillenZeiger.repaint();
        lebendeZeiger.repaint();
        toteZeiger.repaint();

    }
    /*
     Überprüft ob das level beendet wurde. Leitet dann die Cutscene ein und
     beginnt anschließend as nächste level.
     */

    private void levelPruefer() {
        if (lebendeStreber <= 0) {
            if (beendeteLevel == 0) {
                //TODO: Erste cutscene wird abgespielt
                changeCard("c card");
                //TODO: Level wird auf x gesetzt
                levelReset(100);
            } else if (beendeteLevel == 1) {
                //TODO: Zweite cutscene wird abgespielt
                changeCard("c card");
                //TODO: Level wird auf x gesetzt
                levelReset(1000);
            } else if (beendeteLevel == 2) {
                //TODO: Zweite cutscene wird abgespielt
                changeCard("c card");
                //TODO: Level wird auf x gesetzt
                levelReset(10000);
            } else //Beginnt Cutscene und schiebt sie ins Fenster
            if (lebendeStreber <= 0) {//Keine Level mehr verfügbar!
                System.out.println("Error: this should not happen!");
                changeCard("c card");
            }
            beendeteLevel++;
        }
    }

    /*
     Lädt das Spiel und ändert die Parameter entsprechend.
    
     TODO: verschieben?
     */
    private void loadGame() {
        ladeSpiel();
        beendeteLevel = Integer.parseInt(getSave(1));
        brillen = Integer.parseInt(getSave(2));
        lebendeStreber = Integer.parseInt(getSave(3));
        getoeteteStreber = Integer.parseInt(getSave(4));
        //TODO: Weitere zu ladende Werte einfügen, auch bei ladeSpiel
        if (beendeteLevel <= 10) {//Prueft ob wir im Endlosspiel sind TODO!
            buttonUpdate();
            buttonLevelUpdate();
        } else {
            buttonEndlessUpdate();
            buttonLevelUpdate();

        }
    }
    /*
     Schließt das Spielefenster. (Versteckt es nicht nur!) Öffnet den Launcher 
     neu.    
     */

    private void backToLauncher() {
        speichereSpiel(beendeteLevel, brillen, lebendeStreber, getoeteteStreber);
        Launcher l = new Launcher();
        l.Launcher();
        //TODO: Musik vom Spiel beenden.
        gamescreen.setVisible(false);

        System.out.println("gamescreen wird unsichtbar und anschließend zerstört"
                + "(dispose)");
        gamescreen.dispose();
    }

}
