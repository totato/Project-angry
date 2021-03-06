package gui;

import java.awt.event.KeyEvent;
import game.Game;
import static gui.WindowProperties.clipShop;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

/**
 *
 * @author Vika
 */
public class ShopPanel extends Panel {

    /**
     * Creates new form ShopPanel
     */
    public ShopPanel() {
        initComponents();
        jTextAreaShop.setLineWrap(true);
        jTextAreaShop.setWrapStyleWord(true);
        shortKeys();
        super.setBgMusic(clipShop);
        jTextField1.setVisible(false);
    }

    private void shortKeys() {

        WindowProperties.setShortKeys(null, bToGameShop, "game card", KeyEvent.VK_1);
        WindowProperties.setShortKeys(null, bToSkillShop, "skill card", KeyEvent.VK_3);

        jTextField1.getInputMap(jTextField1.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "x");
        jTextField1.getActionMap().put("x", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                try {
                    cheaten();
                } catch (Exception ex) {
                    Logger.getLogger(WindowProperties.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbShopGroup = new javax.swing.ButtonGroup();
        jLabelShopkeeper = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaShop = new javax.swing.JTextArea();
        bBuyShop = new javax.swing.JButton();
        jLabelInventory = new javax.swing.JLabel();
        jLabelShop = new javax.swing.JLabel();
        tbShopA1 = new javax.swing.JToggleButton();
        tbShopA2 = new javax.swing.JToggleButton();
        tbShopB0 = new javax.swing.JToggleButton();
        tbShopB2 = new javax.swing.JToggleButton();
        tbShopB3 = new javax.swing.JToggleButton();
        tbShopB4 = new javax.swing.JToggleButton();
        tbShopC1 = new javax.swing.JToggleButton();
        tbShopC2 = new javax.swing.JToggleButton();
        tbShopD1 = new javax.swing.JToggleButton();
        bToLauncher = new javax.swing.JButton();
        jLabelGlassesShop = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bToSkillShop = new javax.swing.JButton();
        bToGameShop = new javax.swing.JButton();
        bSave = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelCHEATER = new javax.swing.JLabel();
        tbInventoryA1 = new javax.swing.JToggleButton();
        tbInventoryA2 = new javax.swing.JToggleButton();
        tbInventoryA3 = new javax.swing.JToggleButton();
        tbInventoryB0 = new javax.swing.JToggleButton();
        tbInventoryB1 = new javax.swing.JToggleButton();
        tbInventoryB2 = new javax.swing.JToggleButton();
        tbInventoryB3 = new javax.swing.JToggleButton();
        tbInventoryB4 = new javax.swing.JToggleButton();
        tbInventoryC1 = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tbShopA3 = new javax.swing.JToggleButton();
        tbShopB1 = new javax.swing.JToggleButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(650, 750));
        setMinimumSize(new java.awt.Dimension(650, 750));
        setPreferredSize(new java.awt.Dimension(650, 750));
        setLayout(null);

        jLabelShopkeeper.setBackground(new java.awt.Color(204, 255, 204));
        jLabelShopkeeper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/shopKeeper01.png"))); // NOI18N
        jLabelShopkeeper.setText("jLabel1");
        add(jLabelShopkeeper);
        jLabelShopkeeper.setBounds(170, 70, 310, 370);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextAreaShop.setEditable(false);
        jTextAreaShop.setBackground(new java.awt.Color(240, 240, 240));
        jTextAreaShop.setColumns(20);
        jTextAreaShop.setRows(5);
        jTextAreaShop.setFocusable(false);
        jScrollPane1.setViewportView(jTextAreaShop);

        add(jScrollPane1);
        jScrollPane1.setBounds(170, 490, 310, 160);

        bBuyShop.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bBuyShop.setText("Kaufen");
        bBuyShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuyShopActionPerformed(evt);
            }
        });
        add(bBuyShop);
        bBuyShop.setBounds(170, 660, 310, 80);

        jLabelInventory.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelInventory.setText("    Inventar");
        add(jLabelInventory);
        jLabelInventory.setBounds(480, 10, 150, 40);

        jLabelShop.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelShop.setText("    Shop");
        add(jLabelShop);
        jLabelShop.setBounds(10, 10, 150, 40);

        tbShopGroup.add(tbShopA1);
        tbShopA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/DLC .gif"))); // NOI18N
        tbShopA1.setText("Helm");
        tbShopA1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/DLC .gif"))); // NOI18N
        tbShopA1.setFocusable(false);
        tbShopA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbShopA1ActionPerformed(evt);
            }
        });
        add(tbShopA1);
        tbShopA1.setBounds(10, 90, 140, 30);

        tbShopGroup.add(tbShopA2);
        tbShopA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/DLC .gif"))); // NOI18N
        tbShopA2.setText("Weste");
        tbShopA2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/DLC .gif"))); // NOI18N
        tbShopA2.setFocusable(false);
        add(tbShopA2);
        tbShopA2.setBounds(10, 130, 140, 30);

        tbShopGroup.add(tbShopB0);
        tbShopB0.setText("Auge");
        tbShopB0.setMaximumSize(new java.awt.Dimension(105, 23));
        tbShopB0.setMinimumSize(new java.awt.Dimension(105, 23));
        tbShopB0.setPreferredSize(new java.awt.Dimension(105, 23));
        tbShopB0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbShopB0ActionPerformed(evt);
            }
        });
        add(tbShopB0);
        tbShopB0.setBounds(10, 250, 140, 30);

        tbShopGroup.add(tbShopB2);
        tbShopB2.setText("Nahkampfwaffe");
        tbShopB2.setMaximumSize(new java.awt.Dimension(105, 23));
        tbShopB2.setMinimumSize(new java.awt.Dimension(105, 23));
        tbShopB2.setPreferredSize(new java.awt.Dimension(105, 23));
        tbShopB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbShopB2ActionPerformed(evt);
            }
        });
        add(tbShopB2);
        tbShopB2.setBounds(10, 330, 140, 30);

        tbShopGroup.add(tbShopB3);
        tbShopB3.setText("Fernkampf");
        tbShopB3.setMaximumSize(new java.awt.Dimension(105, 23));
        tbShopB3.setMinimumSize(new java.awt.Dimension(105, 23));
        tbShopB3.setPreferredSize(new java.awt.Dimension(105, 23));
        tbShopB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbShopB3ActionPerformed(evt);
            }
        });
        add(tbShopB3);
        tbShopB3.setBounds(10, 370, 140, 30);

        tbShopGroup.add(tbShopB4);
        tbShopB4.setText("Taschenmonster");
        tbShopB4.setMaximumSize(new java.awt.Dimension(105, 23));
        tbShopB4.setMinimumSize(new java.awt.Dimension(105, 23));
        tbShopB4.setPreferredSize(new java.awt.Dimension(105, 23));
        tbShopB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbShopB4ActionPerformed(evt);
            }
        });
        add(tbShopB4);
        tbShopB4.setBounds(10, 410, 140, 30);

        tbShopGroup.add(tbShopC1);
        tbShopC1.setText("Granatenstufe");
        tbShopC1.setMaximumSize(new java.awt.Dimension(105, 23));
        tbShopC1.setMinimumSize(new java.awt.Dimension(105, 23));
        tbShopC1.setPreferredSize(new java.awt.Dimension(105, 23));
        tbShopC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbShopC1ActionPerformed(evt);
            }
        });
        add(tbShopC1);
        tbShopC1.setBounds(10, 460, 140, 30);

        tbShopGroup.add(tbShopC2);
        tbShopC2.setText("Granaten");
        tbShopC2.setMaximumSize(new java.awt.Dimension(105, 23));
        tbShopC2.setMinimumSize(new java.awt.Dimension(105, 23));
        tbShopC2.setPreferredSize(new java.awt.Dimension(105, 23));
        tbShopC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbShopC2ActionPerformed(evt);
            }
        });
        add(tbShopC2);
        tbShopC2.setBounds(10, 500, 140, 30);

        tbShopGroup.add(tbShopD1);
        tbShopD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/DLC .gif"))); // NOI18N
        tbShopD1.setText("Kung Fury");
        tbShopD1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/DLC .gif"))); // NOI18N
        add(tbShopD1);
        tbShopD1.setBounds(10, 580, 140, 30);

        bToLauncher.setBackground(new java.awt.Color(0, 0, 0));
        bToLauncher.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bToLauncher.setForeground(new java.awt.Color(255, 255, 255));
        bToLauncher.setText("Launcher");
        bToLauncher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bToLauncherActionPerformed(evt);
            }
        });
        add(bToLauncher);
        bToLauncher.setBounds(170, 20, 310, 40);

        jLabelGlassesShop.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelGlassesShop.setText("Brillen: 0");
        add(jLabelGlassesShop);
        jLabelGlassesShop.setBounds(170, 450, 310, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Events");
        add(jLabel7);
        jLabel7.setBounds(10, 560, 120, 17);

        bToSkillShop.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bToSkillShop.setText("Skillbaum");
        bToSkillShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bToSkillShopActionPerformed(evt);
            }
        });
        add(bToSkillShop);
        bToSkillShop.setBounds(500, 700, 140, 40);

        bToGameShop.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bToGameShop.setText("Zurück");
        bToGameShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bToGameShopActionPerformed(evt);
            }
        });
        add(bToGameShop);
        bToGameShop.setBounds(500, 650, 140, 40);

        bSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bSave.setText("Speichern");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });
        add(bSave);
        bSave.setBounds(10, 660, 140, 80);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Ausrüstung");
        add(jLabel8);
        jLabel8.setBounds(10, 70, 120, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Waffen");
        add(jLabel9);
        jLabel9.setBounds(10, 230, 120, 17);

        jLabelCHEATER.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabelCHEATER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCHEATERMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCHEATERMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCHEATERMouseExited(evt);
            }
        });
        add(jLabelCHEATER);
        jLabelCHEATER.setBounds(590, 540, 50, 20);

        tbShopGroup.add(tbInventoryA1);
        tbInventoryA1.setText("Helm");
        add(tbInventoryA1);
        tbInventoryA1.setBounds(500, 90, 140, 30);

        tbShopGroup.add(tbInventoryA2);
        tbInventoryA2.setText("Weste");
        add(tbInventoryA2);
        tbInventoryA2.setBounds(500, 130, 140, 30);

        tbShopGroup.add(tbInventoryA3);
        tbInventoryA3.setText("Schuhe");
        add(tbInventoryA3);
        tbInventoryA3.setBounds(500, 170, 140, 30);

        tbShopGroup.add(tbInventoryB0);
        tbInventoryB0.setText("Auge");
        tbInventoryB0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbInventoryB0ActionPerformed(evt);
            }
        });
        add(tbInventoryB0);
        tbInventoryB0.setBounds(500, 250, 140, 30);

        tbShopGroup.add(tbInventoryB1);
        tbInventoryB1.setText("Schrei");
        tbInventoryB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbInventoryB1ActionPerformed(evt);
            }
        });
        add(tbInventoryB1);
        tbInventoryB1.setBounds(500, 290, 140, 30);

        tbShopGroup.add(tbInventoryB2);
        tbInventoryB2.setText("Nahkampfwaffe");
        tbInventoryB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbInventoryB2ActionPerformed(evt);
            }
        });
        add(tbInventoryB2);
        tbInventoryB2.setBounds(500, 330, 140, 30);

        tbShopGroup.add(tbInventoryB3);
        tbInventoryB3.setText("Fernkampf");
        tbInventoryB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbInventoryB3ActionPerformed(evt);
            }
        });
        add(tbInventoryB3);
        tbInventoryB3.setBounds(500, 370, 140, 30);

        tbShopGroup.add(tbInventoryB4);
        tbInventoryB4.setText("Taschenmonster");
        tbInventoryB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbInventoryB4ActionPerformed(evt);
            }
        });
        add(tbInventoryB4);
        tbInventoryB4.setBounds(500, 410, 140, 30);

        tbShopGroup.add(tbInventoryC1);
        tbInventoryC1.setText("Granatenstufe");
        tbInventoryC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbInventoryC1ActionPerformed(evt);
            }
        });
        add(tbInventoryC1);
        tbInventoryC1.setBounds(500, 460, 140, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Ausrüstung");
        add(jLabel10);
        jLabel10.setBounds(500, 70, 120, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Waffen");
        add(jLabel11);
        jLabel11.setBounds(500, 230, 120, 17);

        tbShopGroup.add(tbShopA3);
        tbShopA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/DLC .gif"))); // NOI18N
        tbShopA3.setText("Schuhe");
        tbShopA3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/DLC .gif"))); // NOI18N
        tbShopA3.setFocusable(false);
        add(tbShopA3);
        tbShopA3.setBounds(10, 170, 140, 30);

        tbShopGroup.add(tbShopB1);
        tbShopB1.setText("Schrei");
        tbShopB1.setMaximumSize(new java.awt.Dimension(105, 23));
        tbShopB1.setMinimumSize(new java.awt.Dimension(105, 23));
        tbShopB1.setPreferredSize(new java.awt.Dimension(105, 23));
        tbShopB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbShopB1ActionPerformed(evt);
            }
        });
        add(tbShopB1);
        tbShopB1.setBounds(10, 290, 140, 30);
        add(jTextField1);
        jTextField1.setBounds(500, 570, 140, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/shop_BG.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, -10, 680, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void bToGameShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bToGameShopActionPerformed
        try {
            MainGUI.getAktMainGUI().changeCard("game card");
        } catch (IOException ex) {
            Logger.getLogger(ShopPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ShopPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bToGameShopActionPerformed

    private void bToSkillShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bToSkillShopActionPerformed
        try {
            MainGUI.getAktMainGUI().changeCard("skill card");
        } catch (IOException ex) {
            Logger.getLogger(ShopPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ShopPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bToSkillShopActionPerformed

    private void bToLauncherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bToLauncherActionPerformed
        try {
            //speichereSpiel(beendeteLevel, brillen, lebendeStreber, getoeteteStreber);
            WindowProperties.stopBgMusic();
            Launcher l = new Launcher();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(ShopPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        //l.Launcher();
        //TODO: Musik vom Spiel beenden.
        MainGUI.getAktMainGUI().getGamescreen().setVisible(false);

        System.out.println("gamescreen wird unsichtbar und anschließend zerstört"
                + "(dispose)");
        MainGUI.getAktMainGUI().getGamescreen().dispose();
    }//GEN-LAST:event_bToLauncherActionPerformed

    private void tbShopA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbShopA1ActionPerformed

    }//GEN-LAST:event_tbShopA1ActionPerformed

    private void tbShopB0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbShopB0ActionPerformed
        this.selectWaffe(1, true);
    }//GEN-LAST:event_tbShopB0ActionPerformed

    private void tbShopB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbShopB1ActionPerformed
        this.selectWaffe(2, true);
    }//GEN-LAST:event_tbShopB1ActionPerformed

    private void tbShopB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbShopB2ActionPerformed
        this.selectWaffe(3, true);
    }//GEN-LAST:event_tbShopB2ActionPerformed

    private void tbShopB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbShopB3ActionPerformed
        this.selectWaffe(4, true);
    }//GEN-LAST:event_tbShopB3ActionPerformed

    private void tbShopB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbShopB4ActionPerformed
        this.selectWaffe(5, true);
    }//GEN-LAST:event_tbShopB4ActionPerformed

    private void tbShopC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbShopC1ActionPerformed
        this.selectWaffe(6, true);
    }//GEN-LAST:event_tbShopC1ActionPerformed

    private void tbInventoryB0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbInventoryB0ActionPerformed
        this.selectWaffe(1, false);
    }//GEN-LAST:event_tbInventoryB0ActionPerformed

    private void tbInventoryB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbInventoryB1ActionPerformed
        this.selectWaffe(2, false);
    }//GEN-LAST:event_tbInventoryB1ActionPerformed

    private void tbInventoryB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbInventoryB2ActionPerformed
        this.selectWaffe(3, false);
    }//GEN-LAST:event_tbInventoryB2ActionPerformed

    private void tbInventoryB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbInventoryB3ActionPerformed
        this.selectWaffe(4, false);
    }//GEN-LAST:event_tbInventoryB3ActionPerformed

    private void tbInventoryB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbInventoryB4ActionPerformed
        this.selectWaffe(5, false);
    }//GEN-LAST:event_tbInventoryB4ActionPerformed

    private void tbInventoryC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbInventoryC1ActionPerformed
        this.selectWaffe(6, false);
    }//GEN-LAST:event_tbInventoryC1ActionPerformed

    private void bBuyShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuyShopActionPerformed
        if (Game.getAktGame().upgradeSelected()) {

            if (Game.getAktGame().getSelectedWeapon() == Integer.MAX_VALUE) {
                jTextAreaShop.setText(Game.getAktGame().buyGrenade(10));
            } else {

                try {
                    jTextAreaShop.setText(Game.getAktGame().buyUpgrade(Game.getAktGame().getSelectedWeapon()));
                } catch (IOException ex) {
                    Logger.getLogger(ShopPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else {
            jTextAreaShop.append("Hinweis: Zum Upgraden die entsprechende Waffe auf der linken Seite auswählen");
        }

        Game.getAktGame().setShopInfo(-1, false);

        disableButtons();

        aktualisierBrillen();

    }//GEN-LAST:event_bBuyShopActionPerformed

    private void tbShopC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbShopC2ActionPerformed
        jTextAreaShop.setText("Aktuelle Granaten: " + Game.getAktGame().getData().getGranaten());
        Game.getAktGame().setShopInfo(Integer.MAX_VALUE, true);
        this.disableBuyButton();
    }//GEN-LAST:event_tbShopC2ActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        try {
            Game.getAktGame().saveData(Game.getAktGame().getSavedatei());
        } catch (IOException ex) {
            Logger.getLogger(ShopPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(ShopPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        jTextAreaShop.setText("Speichern erfolgreich");
    }//GEN-LAST:event_bSaveActionPerformed

    private void jLabelCHEATERMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCHEATERMouseEntered
        jLabelCHEATER.setText("Cheats");
    }//GEN-LAST:event_jLabelCHEATERMouseEntered

    private void jLabelCHEATERMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCHEATERMouseExited
        jLabelCHEATER.setText("");
    }//GEN-LAST:event_jLabelCHEATERMouseExited

    private void jLabelCHEATERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCHEATERMouseClicked
        if (jTextField1.isVisible()) {
            jTextField1.setVisible(false);
        } else {
            jTextField1.setVisible(true);
        }

    }//GEN-LAST:event_jLabelCHEATERMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuyShop;
    private javax.swing.JButton bSave;
    private javax.swing.JButton bToGameShop;
    private javax.swing.JButton bToLauncher;
    private javax.swing.JButton bToSkillShop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCHEATER;
    private javax.swing.JLabel jLabelGlassesShop;
    private javax.swing.JLabel jLabelInventory;
    private javax.swing.JLabel jLabelShop;
    private javax.swing.JLabel jLabelShopkeeper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaShop;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton tbInventoryA1;
    private javax.swing.JToggleButton tbInventoryA2;
    private javax.swing.JToggleButton tbInventoryA3;
    private javax.swing.JToggleButton tbInventoryB0;
    private javax.swing.JToggleButton tbInventoryB1;
    private javax.swing.JToggleButton tbInventoryB2;
    private javax.swing.JToggleButton tbInventoryB3;
    private javax.swing.JToggleButton tbInventoryB4;
    private javax.swing.JToggleButton tbInventoryC1;
    private javax.swing.JToggleButton tbShopA1;
    private javax.swing.JToggleButton tbShopA2;
    private javax.swing.JToggleButton tbShopA3;
    private javax.swing.JToggleButton tbShopB0;
    private javax.swing.JToggleButton tbShopB1;
    private javax.swing.JToggleButton tbShopB2;
    private javax.swing.JToggleButton tbShopB3;
    private javax.swing.JToggleButton tbShopB4;
    private javax.swing.JToggleButton tbShopC1;
    private javax.swing.JToggleButton tbShopC2;
    private javax.swing.JToggleButton tbShopD1;
    private javax.swing.ButtonGroup tbShopGroup;
    // End of variables declaration//GEN-END:variables

    public void selectWaffe(int i, boolean upgrade) {
        Game.getAktGame().setShopInfo(i, upgrade);
        //MainGUI.getAktMainGUI().setTextToTextArea(jTextAreaShop, 50,Game.getAktGame().getWaffe(i, upgrade).getDescription());
        jTextAreaShop.setText(Game.getAktGame().getWaffe(i, upgrade).getDescription());
        this.disableBuyButton();
    }

    private void cheaten() throws Exception {

        if (jTextField1.getText().equals("Thorsten")) {
            Game.getAktGame().getData().setExp(0);
            Game.getAktGame().getData().setBrillen(0);
            jTextAreaShop.setText("Hat wieder mal alles falsch gemacht.");
        }
        if (jTextField1.getText().equals("Antonio") && Game.getAktGame().getData().getBrillen() < Integer.MAX_VALUE) {
            Game.getAktGame().getData().setBrillen((5 + Game.getAktGame().getData().getBrillen()) * 2);
            jTextAreaShop.setText("Du siehst ein paar Brillen im Sand");
            if (Game.getAktGame().getData().getBrillen() < 0) {
                Game.getAktGame().getData().setBrillen(Integer.MAX_VALUE);
                jTextAreaShop.setText("Die Götter scheinen dich nicht erhört zu haben...");
            }
        }
        if (jTextField1.getText().equals("Viktoria") && Game.getAktGame().getData().getExp() < Integer.MAX_VALUE) {
            Game.getAktGame().getData().setExp((5 + Game.getAktGame().getData().getExp()) * 2);
            jTextAreaShop.setText("Du spürst... Erleuchtung");
            if (Game.getAktGame().getData().getExp() < 0) {
                Game.getAktGame().getData().setExp(Integer.MAX_VALUE);
                jTextAreaShop.setText("Die Götter scheinen dich nicht erhört zu haben...");
            }
        }
        if (jTextField1.getText().equals("Plume")) {
            Game.getAktGame().loadLevel(211, true);
        }

        aktualisierBrillen();
        disableButtons();
    }

    private void setButtonColor() {
        int brillen = Game.getAktGame().getData().getBrillen();
        Color schöneresBlau = Color.decode("0xaed9dd");

        if (brillen >= Game.getAktGame().getWaffe(1, true).getKosten()) {
            tbShopB0.setBackground(schöneresBlau);
        } else {
            tbShopB0.setBackground(Color.BLACK);
        }
        if (brillen >= Game.getAktGame().getWaffe(2, true).getKosten()) {
            tbShopB1.setBackground(schöneresBlau);
        } else {
            tbShopB1.setBackground(Color.BLACK);
        }
        if (brillen >= Game.getAktGame().getWaffe(3, true).getKosten()) {
            tbShopB2.setBackground(schöneresBlau);
        } else {
            tbShopB2.setBackground(Color.BLACK);
        }
        if (brillen >= Game.getAktGame().getWaffe(4, true).getKosten()) {
            tbShopB3.setBackground(schöneresBlau);
        } else {
            tbShopB3.setBackground(Color.BLACK);
        }
        if (brillen >= Game.getAktGame().getWaffe(5, true).getKosten()) {
            tbShopB4.setBackground(schöneresBlau);
        } else {
            tbShopB4.setBackground(Color.BLACK);
        }
        if (brillen >= Game.getAktGame().getWaffe(6, true).getKosten()) {
            tbShopC1.setBackground(schöneresBlau);
        } else {
            tbShopC1.setBackground(Color.BLACK);
        }
    }

    public void setGlasses(int br) {
        jLabelGlassesShop.setText("Brillen: " + br);
    }

    public void disableBuyButton() {
        bBuyShop.setEnabled(Game.getAktGame().upgradeSelected());
    }

    @Override
    public void disableButtons() {
        disableBuyButton();
        tbInventoryA1.setEnabled(false); //vorläufig
        tbInventoryA2.setEnabled(false);
        tbInventoryA3.setEnabled(false);
        tbShopA1.setEnabled(false);
        tbShopA2.setEnabled(false);
        tbShopA3.setEnabled(false);
        tbShopD1.setEnabled(false);

        tbInventoryB0.setEnabled(Game.getAktGame().getData().getWaffenStufe(1) > 0);
        tbInventoryB1.setEnabled(Game.getAktGame().getData().getWaffenStufe(2) > 0);
        tbInventoryB2.setEnabled(Game.getAktGame().getData().getWaffenStufe(3) > 0);
        tbInventoryB3.setEnabled(Game.getAktGame().getData().getWaffenStufe(4) > 0);
        tbInventoryB4.setEnabled(Game.getAktGame().getData().getWaffenStufe(5) > 0);
        tbInventoryC1.setEnabled(Game.getAktGame().getData().getWaffenStufe(6) > 0);

        tbShopB0.setEnabled(!Game.getAktGame().getWaffe(1, true).getName().equals("MAX"));
        tbShopB1.setEnabled(!Game.getAktGame().getWaffe(2, true).getName().equals("MAX"));
        tbShopB2.setEnabled(!Game.getAktGame().getWaffe(3, true).getName().equals("MAX"));
        tbShopB3.setEnabled(!Game.getAktGame().getWaffe(4, true).getName().equals("MAX"));
        tbShopB4.setEnabled(!Game.getAktGame().getWaffe(5, true).getName().equals("MAX"));
        tbShopC1.setEnabled(!Game.getAktGame().getWaffe(6, true).getName().equals("MAX"));

        tbShopC2.setEnabled(Game.getAktGame().getData().getWaffenStufe(6) > 0);

        tbShopGroup.clearSelection();
        setButtonColor();
    }

    public void aktualisierBrillen() {
        MainGUI.getAktMainGUI().getShopPanel1().setGlasses(Game.getAktGame().getData().getBrillen());
    }

    @Override
    public void switchTo() throws Exception {
        Random b = new Random();
        super.switchTo();
        aktualisierBrillen();
        setButtonColor();
        jTextAreaShop.setText(Game.getAktGame().getShopkeeperSpruche().get(b.nextInt(Game.getAktGame().getShopkeeperSpruche().size())));
    }

    @Override
    public void switchFrom() throws Exception {
        super.switchFrom();
        MainGUI.getAktMainGUI().getGamePanel1().disableButtons();
    }
}
