package gui;

import java.awt.event.KeyEvent;
import game.Game;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.CodeSource;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;

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
        super.setBgMusic("exSound/rewind.wav");

    }

    private void shortKeys() {

        WindowProperties.setShortKeys(bToGameShop, "game card", KeyEvent.VK_B);
        WindowProperties.setShortKeys(bToSkillShop, "skill card", KeyEvent.VK_M);
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
        hierWarPlatzÜbrig = new javax.swing.JLabel();
        tbShopA3 = new javax.swing.JToggleButton();
        tbShopB1 = new javax.swing.JToggleButton();

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
        jTextAreaShop.setColumns(20);
        jTextAreaShop.setRows(5);
        jScrollPane1.setViewportView(jTextAreaShop);

        add(jScrollPane1);
        jScrollPane1.setBounds(170, 490, 310, 160);

        bBuyShop.setBackground(new java.awt.Color(51, 51, 51));
        bBuyShop.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bBuyShop.setForeground(new java.awt.Color(255, 255, 255));
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

        tbShopA1.setBackground(new java.awt.Color(0, 0, 0));
        tbShopGroup.add(tbShopA1);
        tbShopA1.setForeground(new java.awt.Color(255, 255, 255));
        tbShopA1.setText("Helm");
        tbShopA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbShopA1ActionPerformed(evt);
            }
        });
        add(tbShopA1);
        tbShopA1.setBounds(10, 90, 140, 30);

        tbShopA2.setBackground(new java.awt.Color(0, 0, 0));
        tbShopGroup.add(tbShopA2);
        tbShopA2.setForeground(new java.awt.Color(255, 255, 255));
        tbShopA2.setText("Weste");
        add(tbShopA2);
        tbShopA2.setBounds(10, 130, 140, 30);

        tbShopB0.setBackground(new java.awt.Color(0, 0, 0));
        tbShopGroup.add(tbShopB0);
        tbShopB0.setForeground(new java.awt.Color(255, 255, 255));
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

        tbShopB2.setBackground(new java.awt.Color(0, 0, 0));
        tbShopGroup.add(tbShopB2);
        tbShopB2.setForeground(new java.awt.Color(255, 255, 255));
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

        tbShopB3.setBackground(new java.awt.Color(0, 0, 0));
        tbShopGroup.add(tbShopB3);
        tbShopB3.setForeground(new java.awt.Color(255, 255, 255));
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

        tbShopB4.setBackground(new java.awt.Color(0, 0, 0));
        tbShopGroup.add(tbShopB4);
        tbShopB4.setForeground(new java.awt.Color(255, 255, 255));
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

        tbShopC1.setBackground(new java.awt.Color(0, 0, 0));
        tbShopGroup.add(tbShopC1);
        tbShopC1.setForeground(new java.awt.Color(255, 255, 255));
        tbShopC1.setText("Granate");
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

        tbShopC2.setBackground(new java.awt.Color(0, 0, 0));
        tbShopGroup.add(tbShopC2);
        tbShopC2.setForeground(new java.awt.Color(255, 255, 255));
        tbShopC2.setText("Munition");
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

        tbShopD1.setBackground(new java.awt.Color(0, 0, 0));
        tbShopGroup.add(tbShopD1);
        tbShopD1.setForeground(new java.awt.Color(255, 255, 255));
        tbShopD1.setText("Kung Fury");
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

        bToSkillShop.setBackground(new java.awt.Color(0, 0, 0));
        bToSkillShop.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bToSkillShop.setForeground(new java.awt.Color(255, 255, 255));
        bToSkillShop.setText("Skillbaum");
        bToSkillShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bToSkillShopActionPerformed(evt);
            }
        });
        add(bToSkillShop);
        bToSkillShop.setBounds(500, 700, 140, 40);

        bToGameShop.setBackground(new java.awt.Color(0, 0, 0));
        bToGameShop.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bToGameShop.setForeground(new java.awt.Color(255, 255, 255));
        bToGameShop.setText("Zurück");
        bToGameShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bToGameShopActionPerformed(evt);
            }
        });
        add(bToGameShop);
        bToGameShop.setBounds(500, 650, 140, 40);

        bSave.setBackground(new java.awt.Color(0, 0, 0));
        bSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bSave.setForeground(new java.awt.Color(255, 255, 255));
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

        tbInventoryA1.setBackground(new java.awt.Color(0, 0, 0));
        tbShopGroup.add(tbInventoryA1);
        tbInventoryA1.setForeground(new java.awt.Color(255, 255, 255));
        tbInventoryA1.setText("Helm");
        add(tbInventoryA1);
        tbInventoryA1.setBounds(500, 90, 140, 30);

        tbInventoryA2.setBackground(new java.awt.Color(0, 0, 0));
        tbShopGroup.add(tbInventoryA2);
        tbInventoryA2.setForeground(new java.awt.Color(255, 255, 255));
        tbInventoryA2.setText("Weste");
        add(tbInventoryA2);
        tbInventoryA2.setBounds(500, 130, 140, 30);

        tbInventoryA3.setBackground(new java.awt.Color(0, 0, 0));
        tbShopGroup.add(tbInventoryA3);
        tbInventoryA3.setForeground(new java.awt.Color(255, 255, 255));
        tbInventoryA3.setText("Schuhe");
        add(tbInventoryA3);
        tbInventoryA3.setBounds(500, 170, 140, 30);

        tbInventoryB0.setBackground(new java.awt.Color(0, 0, 0));
        tbShopGroup.add(tbInventoryB0);
        tbInventoryB0.setForeground(new java.awt.Color(255, 255, 255));
        tbInventoryB0.setText("Auge");
        tbInventoryB0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbInventoryB0ActionPerformed(evt);
            }
        });
        add(tbInventoryB0);
        tbInventoryB0.setBounds(500, 250, 140, 30);

        tbInventoryB1.setBackground(new java.awt.Color(0, 0, 0));
        tbShopGroup.add(tbInventoryB1);
        tbInventoryB1.setForeground(new java.awt.Color(255, 255, 255));
        tbInventoryB1.setText("Schrei");
        tbInventoryB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbInventoryB1ActionPerformed(evt);
            }
        });
        add(tbInventoryB1);
        tbInventoryB1.setBounds(500, 290, 140, 30);

        tbInventoryB2.setBackground(new java.awt.Color(0, 0, 0));
        tbShopGroup.add(tbInventoryB2);
        tbInventoryB2.setForeground(new java.awt.Color(255, 255, 255));
        tbInventoryB2.setText("Nahkampfwaffe");
        tbInventoryB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbInventoryB2ActionPerformed(evt);
            }
        });
        add(tbInventoryB2);
        tbInventoryB2.setBounds(500, 330, 140, 30);

        tbInventoryB3.setBackground(new java.awt.Color(0, 0, 0));
        tbShopGroup.add(tbInventoryB3);
        tbInventoryB3.setForeground(new java.awt.Color(255, 255, 255));
        tbInventoryB3.setText("Fernkampf");
        tbInventoryB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbInventoryB3ActionPerformed(evt);
            }
        });
        add(tbInventoryB3);
        tbInventoryB3.setBounds(500, 370, 140, 30);

        tbInventoryB4.setBackground(new java.awt.Color(0, 0, 0));
        tbShopGroup.add(tbInventoryB4);
        tbInventoryB4.setForeground(new java.awt.Color(255, 255, 255));
        tbInventoryB4.setText("Taschenmonster");
        tbInventoryB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbInventoryB4ActionPerformed(evt);
            }
        });
        add(tbInventoryB4);
        tbInventoryB4.setBounds(500, 410, 140, 30);

        tbInventoryC1.setBackground(new java.awt.Color(0, 0, 0));
        tbShopGroup.add(tbInventoryC1);
        tbInventoryC1.setForeground(new java.awt.Color(255, 255, 255));
        tbInventoryC1.setText("Granate");
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
        jLabel11.setText("Waffen");
        add(jLabel11);
        jLabel11.setBounds(500, 230, 120, 17);

        hierWarPlatzÜbrig.setText("jLabel5");
        add(hierWarPlatzÜbrig);
        hierWarPlatzÜbrig.setBounds(500, 550, 150, 90);

        tbShopA3.setBackground(new java.awt.Color(0, 0, 0));
        tbShopGroup.add(tbShopA3);
        tbShopA3.setForeground(new java.awt.Color(255, 255, 255));
        tbShopA3.setText("Schuhe");
        add(tbShopA3);
        tbShopA3.setBounds(10, 170, 140, 30);

        tbShopB1.setBackground(new java.awt.Color(0, 0, 0));
        tbShopGroup.add(tbShopB1);
        tbShopB1.setForeground(new java.awt.Color(255, 255, 255));
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
            try {
                jTextAreaShop.setText(Game.getAktGame().buyUpgrade(Game.getAktGame().getSelectedWeapon()));
            } catch (IOException ex) {
                Logger.getLogger(ShopPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            //jTextAreaShop.setText("Hinweis: Zum Upgraden die entsprechende Waffe auf der linken Seite auswählen");
            MainGUI.getAktMainGUI().addTextToTextArea(jTextAreaShop, 50, "Hinweis: Zum Upgraden die entsprechende Waffe auf der linken Seite auswählen");
        }

        disableButtons();
        MainGUI.getAktMainGUI().getGamePanel1().disableButtons();
        aktualisierBrillen();
    }//GEN-LAST:event_bBuyShopActionPerformed

    private void tbShopC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbShopC2ActionPerformed
        // TODO add your handling code here:
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuyShop;
    private javax.swing.JButton bSave;
    private javax.swing.JButton bToGameShop;
    private javax.swing.JButton bToLauncher;
    private javax.swing.JButton bToSkillShop;
    private javax.swing.JLabel hierWarPlatzÜbrig;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelGlassesShop;
    private javax.swing.JLabel jLabelInventory;
    private javax.swing.JLabel jLabelShop;
    private javax.swing.JLabel jLabelShopkeeper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaShop;
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
        this.disableButtons();
    }

    public void setGlasses(int br) {
        jLabelGlassesShop.setText("Brillen: " + br);
    }

    @Override
    public void disableButtons() {
        bBuyShop.setEnabled(Game.getAktGame().upgradeSelected());
        tbInventoryA1.setEnabled(false); //vorläufig
        tbInventoryA2.setEnabled(false);
        tbInventoryA3.setEnabled(false);
        tbShopA1.setEnabled(false);
        tbShopA2.setEnabled(false);
        tbShopA3.setEnabled(false);

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
        tbShopGroup.clearSelection();
    }

    public void aktualisierBrillen() {
        MainGUI.getAktMainGUI().getShopPanel1().setGlasses(Game.getAktGame().getData().getBrillen());
    }

    @Override
    public void switchTo() throws Exception {
        super.switchTo();
        aktualisierBrillen();
    }

    @Override
    public void switchFrom() throws Exception {
        super.switchFrom();

    }
}
