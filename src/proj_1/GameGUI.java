/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj_1;

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
 * @author Wir.
 */
public class GameGUI extends WindowProperties {

    private JFrame gamescreen;
    private JPanel gameCard;
    private JPanel cutsceneCard;
    private JPanel gamecards;
    private CardLayout clgame;
    private Timer timer;

    private java.awt.TextArea InfoMenu;
     javax.swing.JLabel aliveEnemy;
    private javax.swing.JButton attackB1;
    private javax.swing.JButton attackB2;
    private javax.swing.JButton attackB3;
    private javax.swing.JButton attackB4;
    private javax.swing.JButton attackB5;
    private javax.swing.JButton attackB6;
    private javax.swing.JButton buyB;
    private javax.swing.JButton buySkillB;
     javax.swing.JLabel deadEnemy;
    private javax.swing.JPanel gamePanel;
     javax.swing.JLabel glasses;
     javax.swing.JLabel glassesM;
    private java.awt.TextArea infoGame;
    private javax.swing.JLabel inventarLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    javax.swing.JLabel lvlLabel;
    private javax.swing.JLabel mainScreen;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton resetB;
    private javax.swing.JButton saveB;
    private javax.swing.JLabel shopLabel;
    private javax.swing.JLabel shopkeeper;
    private javax.swing.JLabel skillP;
    private javax.swing.JPanel skillPanel;
    private javax.swing.JLabel skillTrainer;
    private javax.swing.JLabel skillpoints;
    private javax.swing.JButton toGameB;
    private javax.swing.JButton toGameB2;
    private javax.swing.JButton toLauncherB;
    private javax.swing.JButton toMenuB;
    private javax.swing.JButton toMenuB2;
    private javax.swing.JButton toSkilltree;
    private javax.swing.JButton toSkilltreeB;
    // End of variables declaration       

    // Eigenschaften des Fensters
    public GameGUI() {
        setLanguage(language);
        System.out.println("Öffnet das Game Fenster");
        gamescreen = new JFrame(getWords(18));
        // Erzeugt die Karten für das Fenster
        createCards(gamescreen.getContentPane());

        //gamescreen.setPreferredSize(new java.awt.Dimension(720, 723));
        gamescreen.setResizable(false);
        gamescreen.setDefaultCloseOperation(3);
        gamescreen.setLocationRelativeTo(null);
        // gamescreen.setBounds(new java.awt.Rectangle(0, 0, 200, 450));

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

    // der Rest
    private void createCards(Container pane) {
        //--------------------------gamePanel------------------
        gamePanel = new javax.swing.JPanel();
        attackB1 = new javax.swing.JButton();
        mainScreen = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        deadEnemy = new javax.swing.JLabel();
        aliveEnemy = new javax.swing.JLabel();
        attackB4 = new javax.swing.JButton();
        attackB6 = new javax.swing.JButton();
        toMenuB = new javax.swing.JButton();
        glasses = new javax.swing.JLabel();
        lvlLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        skillP = new javax.swing.JLabel();
        attackB2 = new javax.swing.JButton();
        attackB3 = new javax.swing.JButton();
        attackB5 = new javax.swing.JButton();
        infoGame = new java.awt.TextArea();
        toSkilltreeB = new javax.swing.JButton();
        //----------------------------menuPanel------------------------------
        menuPanel = new javax.swing.JPanel();
        toGameB = new javax.swing.JButton();
        shopkeeper = new javax.swing.JLabel();
        inventarLabel = new javax.swing.JLabel();
        shopLabel = new javax.swing.JLabel();
        toLauncherB = new javax.swing.JButton();
        glassesM = new javax.swing.JLabel();
        resetB = new javax.swing.JButton();
        saveB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buyB = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        toSkilltree = new javax.swing.JButton();
        InfoMenu = new java.awt.TextArea();
        //------------------------------ skillPanel--------------------------
        skillPanel = new javax.swing.JPanel();
        buySkillB = new javax.swing.JButton();
        skillTrainer = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        toMenuB2 = new javax.swing.JButton();
        toGameB2 = new javax.swing.JButton();
        skillpoints = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        gamePanel.setPreferredSize(new java.awt.Dimension(620, 700));

        attackB1.setText("1B attack");
        attackB1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               // kill(1);  TODO:!
            }
        });
        

        mainScreen.setBackground(new java.awt.Color(204, 204, 255));
        mainScreen.setText("gegner");

        deadEnemy.setText("getötete Streber: 0");

        aliveEnemy.setText("Gesamtstreber: 0");

        attackB4.setText("4b attack");


        attackB6.setText("6b attack");

        toMenuB.setBackground(new java.awt.Color(0, 0, 0));
        toMenuB.setForeground(new java.awt.Color(255, 255, 255));
        toMenuB.setText("Menu");
        toMenuB.getInputMap(toMenuB.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_M, 0), "menu");

        toMenuB.getActionMap().put("menu", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                changeCard("m card");
            }
        });

        toMenuB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                changeCard("m card");
            }
        });

        glasses.setText("Brillen : 0");

        lvlLabel.setText("LVL ");

        skillP.setText("Skill Punkte :0");

        attackB2.setText("2b attack");

        attackB3.setText("3b attack");

        attackB5.setText("5b attack");

        toSkilltreeB.setBackground(new java.awt.Color(0, 0, 0));
        toSkilltreeB.setForeground(new java.awt.Color(255, 255, 255));
        toSkilltreeB.setText("Skillbaum");

        toSkilltreeB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                changeCard("s card");
            }
        });

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
                gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gamePanelLayout.createSequentialGroup()
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(gamePanelLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(attackB1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(attackB2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(attackB3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(attackB4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(attackB5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(attackB6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(gamePanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(mainScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(gamePanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                                                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(glasses, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(toMenuB, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(skillP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(toSkilltreeB, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(20, 20, 20))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                                                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(deadEnemy, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(aliveEnemy, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(52, 52, 52))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addContainerGap())
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                                                        .addComponent(lvlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addContainerGap())
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                                                        .addComponent(infoGame, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addContainerGap())))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))
        );
        gamePanelLayout.setVerticalGroup(
                gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gamePanelLayout.createSequentialGroup()
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(gamePanelLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(aliveEnemy)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(deadEnemy)
                                        .addGap(18, 18, 18)
                                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lvlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(infoGame, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(glasses)
                                        .addGap(18, 18, 18)
                                        .addComponent(skillP)
                                        .addGap(26, 26, 26)
                                        .addComponent(toMenuB, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(toSkilltreeB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(mainScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(attackB6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(attackB4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(attackB1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(attackB2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(attackB3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(attackB5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
        );

        //getContentPane().add(gamePanel, "card2");
        toGameB.setBackground(new java.awt.Color(0, 0, 0));
        toGameB.setForeground(new java.awt.Color(255, 255, 255));
        toGameB.setText("Zurück");
        toGameB.setToolTipText("");
        toGameB.getInputMap(toGameB.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_M, 0), "game");

        toGameB.getActionMap().put("game", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                changeCard("g card");
            }
        });

        toGameB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                changeCard("g card");
            }
        });

        shopkeeper.setText("bild shop besitzer");

        inventarLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        inventarLabel.setText("Inventar");

        shopLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        shopLabel.setText("Shop");

        toLauncherB.setText("Zum Launcher");

        glassesM.setText("Brillen :");

        resetB.setText("Reset");

        saveB.setText("Speichern");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Zu verkaufen");

        jLabel2.setText("Ausrüstung");

        jLabel3.setText("Waffen");

        buyB.setText("Kaufen");

        jCheckBox1.setText("jCheckBox1");

        jCheckBox2.setText("jCheckBox1");

        jCheckBox3.setText("jCheckBox1");

        jCheckBox4.setText("jCheckBox1");


        jCheckBox5.setText("jCheckBox1");

        jCheckBox6.setText("jCheckBox1");

        jLabel4.setText("Ausrüstung");

        jLabel5.setText("Waffen");

        jCheckBox7.setText("jCheckBox7");

        jCheckBox8.setText("jCheckBox8");

        jCheckBox9.setText("jCheckBox9");

        jCheckBox10.setText("jCheckBox10");

        jLabel6.setText("Events");

        jCheckBox11.setText("jCheckBox11");

        jCheckBox12.setText("jCheckBox12");

        jCheckBox13.setText("jCheckBox13");

        jCheckBox14.setText("jCheckBox14");

        jCheckBox15.setText("jCheckBox15");

        jCheckBox16.setText("jCheckBox16");

        jCheckBox17.setText("jCheckBox17");

        jCheckBox18.setText("jCheckBox18");

        jCheckBox19.setText("jCheckBox19");

        jCheckBox20.setText("jCheckBox20");

        jCheckBox21.setText("jCheckBox21");

        jCheckBox22.setText("jCheckBox22");

        toSkilltree.setText("Skillbaum");
        toSkilltree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                changeCard("s card");
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuPanelLayout.createSequentialGroup()
                                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(menuPanelLayout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(InfoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuPanelLayout.createSequentialGroup()
                                                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(menuPanelLayout.createSequentialGroup()
                                                                        .addGap(21, 21, 21)
                                                                        .addComponent(resetB, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(menuPanelLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jCheckBox2)
                                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jCheckBox3)
                                                                                .addComponent(jCheckBox4)))
                                                                .addGroup(menuPanelLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(menuPanelLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jCheckBox11)
                                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jCheckBox12)))
                                                                .addGroup(menuPanelLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jCheckBox1)
                                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jCheckBox5)
                                                                                .addComponent(jCheckBox6)
                                                                                .addComponent(jCheckBox7)
                                                                                .addComponent(jCheckBox8)
                                                                                .addComponent(jCheckBox9)
                                                                                .addComponent(jCheckBox10)))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(saveB, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(37, 37, 37)
                                                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(glassesM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(toLauncherB, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                                                .addComponent(shopkeeper, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(buyB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                        .addComponent(toSkilltree, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(menuPanelLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(shopLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(menuPanelLayout.createSequentialGroup()
                                                        .addGap(1, 1, 1)
                                                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(inventarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addComponent(jCheckBox17)
                                                                .addComponent(jCheckBox18)
                                                                .addComponent(jCheckBox19)
                                                                .addComponent(jCheckBox20)
                                                                .addComponent(jCheckBox21)
                                                                .addComponent(jCheckBox22)))
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(menuPanelLayout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(toGameB, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(menuPanelLayout.createSequentialGroup()
                                                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jCheckBox14)
                                                                .addComponent(jCheckBox13)
                                                                .addComponent(jCheckBox15)
                                                                .addComponent(jCheckBox16))
                                                        .addGap(38, 38, 38)))))
                        .addGap(22, 22, 22))
        );
        menuPanelLayout.setVerticalGroup(
                menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(menuPanelLayout.createSequentialGroup()
                                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(toLauncherB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(inventarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(shopkeeper, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(InfoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(glassesM, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buyB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(31, Short.MAX_VALUE))
                                .addGroup(menuPanelLayout.createSequentialGroup()
                                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(menuPanelLayout.createSequentialGroup()
                                                        .addComponent(shopLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(menuPanelLayout.createSequentialGroup()
                                                                        .addGap(55, 55, 55)
                                                                        .addComponent(jLabel2)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jCheckBox13)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jCheckBox14)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jCheckBox15)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jCheckBox16))
                                                                .addGroup(menuPanelLayout.createSequentialGroup()
                                                                        .addGap(16, 16, 16)
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(27, 27, 27)
                                                                        .addComponent(jLabel4)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jCheckBox2)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jCheckBox3)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jCheckBox4)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jCheckBox1)))
                                                        .addGap(35, 35, 35)
                                                        .addComponent(jLabel5))
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(menuPanelLayout.createSequentialGroup()
                                                        .addComponent(jCheckBox6)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jCheckBox5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jCheckBox7)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jCheckBox8)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jCheckBox9)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jCheckBox10))
                                                .addGroup(menuPanelLayout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jCheckBox21)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jCheckBox22)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jCheckBox20)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jCheckBox19)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jCheckBox18)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jCheckBox17)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox12)
                                        .addGap(12, 12, 12)
                                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(saveB, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(toSkilltree, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(resetB, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(toGameB, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(16, 16, 16))))
        );
        // getContentPane().add(menuPanel, "card3");
        buySkillB.setText("Freischalten");

        skillTrainer.setText("Bild vom Lehrer ?");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Skillbaum");

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        jButton5.setText("jButton5");

        jButton6.setText("jButton6");

        jButton7.setText("jButton7");

        jButton8.setText("jButton8");

        jButton9.setText("jButton9");

        jButton10.setText("jButton10");

        jButton11.setText("jButton11");

        jButton12.setText("jButton12");

        jButton13.setText("jButton13");

        jButton14.setText("jButton14");

        jButton15.setText("jButton15");

        jButton16.setText("jButton16");

        jButton17.setText("jButton14");

        jButton18.setText("jButton14");

        jButton19.setText("jButton14");

        jButton20.setText("jButton14");

        jButton21.setText("jButton14");

        jButton22.setText("jButton14");

        jButton23.setText("jButton14");

        jButton24.setText("jButton14");

        jButton25.setText("jButton14");

        jButton26.setText("jButton14");

        jButton27.setText("jButton27");

        jButton28.setText("jButton28");

        jButton29.setText("jButton29");

        jButton30.setText("jButton30");

        jButton31.setText("jButton31");

        jButton32.setText("jButton32");

        jButton33.setText("jButton33");

        toMenuB2.setBackground(new java.awt.Color(0, 0, 0));
        toMenuB2.setForeground(new java.awt.Color(255, 255, 255));
        toMenuB2.setText("Menu");
        toMenuB2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                changeCard("m card");
            }
        });

        toGameB2.setBackground(new java.awt.Color(0, 0, 0));
        toGameB2.setForeground(new java.awt.Color(255, 255, 255));
        toGameB2.setText("Zurück");
        toGameB2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                changeCard("m card");
            }
        });

        skillpoints.setText("Skillpunkte: 0");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout skillPanelLayout = new javax.swing.GroupLayout(skillPanel);
        skillPanel.setLayout(skillPanelLayout);
        skillPanelLayout.setHorizontalGroup(
                skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(skillPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(skillTrainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buySkillB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skillpoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(skillPanelLayout.createSequentialGroup()
                                        .addGap(167, 167, 167)
                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                                        .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, skillPanelLayout.createSequentialGroup()
                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(skillPanelLayout.createSequentialGroup()
                                                        .addGap(54, 54, 54)
                                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(skillPanelLayout.createSequentialGroup()
                                                                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(skillPanelLayout.createSequentialGroup()
                                                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(skillPanelLayout.createSequentialGroup()
                                                                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(skillPanelLayout.createSequentialGroup()
                                                        .addGap(83, 83, 83)
                                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jButton27)
                                                                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton28)
                                                                .addComponent(jButton32))
                                                        .addGap(0, 17, Short.MAX_VALUE)))
                                        .addGap(71, 71, 71)
                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(skillPanelLayout.createSequentialGroup()
                                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(49, 49, 49)
                                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(skillPanelLayout.createSequentialGroup()
                                                        .addGap(23, 23, 23)
                                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jButton29)
                                                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton30)
                                                                .addComponent(jButton31))))
                                        .addGap(21, 21, 21))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, skillPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, skillPanelLayout.createSequentialGroup()
                                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                                .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                                        .addGap(34, 34, 34)
                                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(skillPanelLayout.createSequentialGroup()
                                                                                .addComponent(jButton8)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jButton9))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, skillPanelLayout.createSequentialGroup()
                                                                                .addComponent(jButton2)
                                                                                .addGap(39, 39, 39)
                                                                                .addComponent(jButton4))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, skillPanelLayout.createSequentialGroup()
                                                                                .addComponent(jButton6)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jButton3)))
                                                                .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(60, 60, 60))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, skillPanelLayout.createSequentialGroup()
                                                        .addComponent(jButton33)
                                                        .addGap(167, 167, 167))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, skillPanelLayout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(toGameB2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(toMenuB2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))
        );
        skillPanelLayout.setVerticalGroup(
                skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, skillPanelLayout.createSequentialGroup()
                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(skillPanelLayout.createSequentialGroup()
                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(skillPanelLayout.createSequentialGroup()
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton2)
                                                                .addComponent(jButton4)
                                                                .addComponent(jButton5))
                                                        .addGap(16, 16, 16)
                                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton3)
                                                                .addComponent(jButton6)
                                                                .addComponent(jButton7))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton8)
                                                                .addComponent(jButton9)
                                                                .addComponent(jButton10))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton11)
                                                                .addComponent(jButton12)))
                                                .addGroup(skillPanelLayout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(skillTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(skillpoints))
                                .addGroup(skillPanelLayout.createSequentialGroup()
                                        .addGap(286, 286, 286)
                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton13)
                                                .addComponent(jButton14)
                                                .addComponent(jButton15)
                                                .addComponent(jButton16))
                                        .addGap(4, 4, 4)
                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton18)
                                                .addComponent(jButton19)
                                                .addComponent(jButton22)
                                                .addComponent(jButton23)
                                                .addComponent(buySkillB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton17)
                                .addComponent(jButton20)
                                .addComponent(jButton24)
                                .addComponent(jButton25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(skillPanelLayout.createSequentialGroup()
                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton27)
                                                .addComponent(jButton29))
                                        .addGap(25, 25, 25)
                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton28)
                                                .addComponent(jButton30))
                                        .addGap(18, 18, 18)
                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton31)
                                                .addComponent(jButton32))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                        .addGroup(skillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(toMenuB2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(toGameB2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane1))
                        .addContainerGap())
        );

        //getContentPane().add(skillPanel, "card4");
        gamecards = new JPanel(new CardLayout());

        gamecards.add(gamePanel, "g card");
        gamecards.add(menuPanel, "m card");
        gamecards.add(skillPanel, "s card");
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

    private void changeCard(String name) {

        //Cutscenes.playcutscene(1, pfad);
        clgame.show(gamecards, name);
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
