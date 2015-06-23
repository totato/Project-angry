
package gui;

import game.Game;
import gui.WindowProperties;
import static gui.WindowProperties.clipGame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.KeyStroke;

/**
 *
 * @author Vika
 */
public class GamePanel extends Panel {
// Bilder werden geladen
    private ImageIcon grAttack0B = new ImageIcon(getClass().getResource("/Grafiken/weapon0B.png"));
    private ImageIcon grAttack0 = new ImageIcon(getClass().getResource("/Grafiken/weapon0.png"));
    private ImageIcon grAttack1B = new ImageIcon(getClass().getResource("/Grafiken/weapon1B.png"));
    private ImageIcon grAttack1 = new ImageIcon(getClass().getResource("/Grafiken/weapon1.png"));
    private ImageIcon grAttack2B = new ImageIcon(getClass().getResource("/Grafiken/weapon2B.png"));
    private ImageIcon grAttack2 = new ImageIcon(getClass().getResource("/Grafiken/weapon2.png"));
    private ImageIcon grAttack3B = new ImageIcon(getClass().getResource("/Grafiken/weapon3B.png"));
    private ImageIcon grAttack3 = new ImageIcon(getClass().getResource("/Grafiken/weapon3.png"));
    private ImageIcon grAttack4B = new ImageIcon(getClass().getResource("/Grafiken/weapon4B.png"));
    private ImageIcon grAttack4 = new ImageIcon(getClass().getResource("/Grafiken/weapon4.png"));
    private ImageIcon grAttack5B = new ImageIcon(getClass().getResource("/Grafiken/weapon5B.png"));
    private ImageIcon grAttack5 = new ImageIcon(getClass().getResource("/Grafiken/weapon5.png"));

    /**
     * Creates new form gamePanel
     */
    public GamePanel() {
        initComponents();
        shortKeys();
        tbAttack0.setSelected(true);
        changeTBPicture(tbAttack0);
        super.setBgMusic(clipGame);

    }

    private void shortKeys() {

        WindowProperties.setShortKeys(jLabelToShopGame,null, "shop card", KeyEvent.VK_2);
        WindowProperties.setShortKeys(jLabelToSkill,null, "skill card", KeyEvent.VK_3);
    }

    public static JTextArea getjTextAreaGame() {
        return jTextAreaGame;
    }

    private void changeTBPicture(JToggleButton aW) {
        if (aW == tbAttack0) {
            tbAttack0.setIcon(grAttack0B);
        } else {
            tbAttack0.setIcon(grAttack0);
        }
        if (aW == tbAttack1) {
            tbAttack1.setIcon(grAttack1B);
        }  else  {
            tbAttack1.setIcon(grAttack1);
        }
        if (aW == tbAttack2) {
            tbAttack2.setIcon(grAttack2B);
        }  else {
            tbAttack2.setIcon(grAttack2);
        }
        if (aW == tbAttack3) {
            tbAttack3.setIcon(grAttack3B);
        }  else  {
            tbAttack3.setIcon(grAttack3);
        }
        if (aW == tbAttack4) {
            tbAttack4.setIcon(grAttack4B);
        }  else  {
            tbAttack4.setIcon(grAttack4);
        }
        if (aW == tbAttack5) {
            tbAttack5.setIcon(grAttack5B);
        } else {
            tbAttack5.setIcon(grAttack5);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbAttackGroup = new javax.swing.ButtonGroup();
        jSeparator = new javax.swing.JSeparator();
        jLabelToShopGame = new javax.swing.JLabel();
        jLabelToSkill = new javax.swing.JLabel();
        tbAttack2 = new javax.swing.JToggleButton();
        tbAttack3 = new javax.swing.JToggleButton();
        tbAttack4 = new javax.swing.JToggleButton();
        tbAttack5 = new javax.swing.JToggleButton();
        tbAttack0 = new javax.swing.JToggleButton();
        tbAttack1 = new javax.swing.JToggleButton();
        lebendeStreberAnzeiger = new javax.swing.JLabel();
        toteStreberAnzeiger = new javax.swing.JLabel();
        jProgressBar = new javax.swing.JProgressBar();
        jLabelEXPGame = new javax.swing.JLabel();
        jLabelGlassesGame = new javax.swing.JLabel();
        jLabelLVL = new javax.swing.JLabel();
        jScrollPaneGame = new javax.swing.JScrollPane();
        jTextAreaGame = new javax.swing.JTextArea();
        bEvent = new javax.swing.JButton();
        bAttack7 = new javax.swing.JButton();
        mainScreen = new gui.Screen();
        jLabelBackgroundGame = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(650, 750));
        setMinimumSize(new java.awt.Dimension(650, 750));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(650, 750));
        setLayout(null);
        add(jSeparator);
        jSeparator.setBounds(440, 90, 200, 10);

        jLabelToShopGame.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelToShopGame.setForeground(new java.awt.Color(255, 255, 255));
        jLabelToShopGame.setText("    Shop");
        jLabelToShopGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelToShopGameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelToShopGameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelToShopGameMouseExited(evt);
            }
        });
        add(jLabelToShopGame);
        jLabelToShopGame.setBounds(510, 620, 120, 50);

        jLabelToSkill.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelToSkill.setForeground(new java.awt.Color(255, 255, 255));
        jLabelToSkill.setText("    Skills");
        jLabelToSkill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelToSkillMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelToSkillMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelToSkillMouseExited(evt);
            }
        });
        add(jLabelToSkill);
        jLabelToSkill.setBounds(510, 680, 120, 50);

        tbAttackGroup.add(tbAttack2);
        tbAttack2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/weapon2.png"))); // NOI18N
        tbAttack2.setText("jToggleButton1");
        tbAttack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbAttack2ActionPerformed(evt);
            }
        });
        add(tbAttack2);
        tbAttack2.setBounds(160, 630, 60, 100);

        tbAttackGroup.add(tbAttack3);
        tbAttack3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/weapon3.png"))); // NOI18N
        tbAttack3.setText("jToggleButton1");
        tbAttack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbAttack3ActionPerformed(evt);
            }
        });
        add(tbAttack3);
        tbAttack3.setBounds(230, 630, 60, 100);

        tbAttackGroup.add(tbAttack4);
        tbAttack4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/weapon4.png"))); // NOI18N
        tbAttack4.setText("jToggleButton1");
        tbAttack4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbAttack4ActionPerformed(evt);
            }
        });
        add(tbAttack4);
        tbAttack4.setBounds(300, 630, 60, 100);

        tbAttackGroup.add(tbAttack5);
        tbAttack5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/weapon5.png"))); // NOI18N
        tbAttack5.setText("jToggleButton1");
        tbAttack5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbAttack5ActionPerformed(evt);
            }
        });
        add(tbAttack5);
        tbAttack5.setBounds(370, 630, 60, 100);

        tbAttack0.setBackground(new java.awt.Color(0, 0, 0));
        tbAttackGroup.add(tbAttack0);
        tbAttack0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/weapon0.png"))); // NOI18N
        tbAttack0.setText("jToggleButton1");
        tbAttack0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbAttack0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbAttack0ActionPerformed(evt);
            }
        });
        add(tbAttack0);
        tbAttack0.setBounds(20, 630, 60, 100);

        tbAttackGroup.add(tbAttack1);
        tbAttack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/weapon1.png"))); // NOI18N
        tbAttack1.setText("jToggleButton1");
        tbAttack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbAttack1ActionPerformed(evt);
            }
        });
        add(tbAttack1);
        tbAttack1.setBounds(90, 630, 60, 100);

        lebendeStreberAnzeiger.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lebendeStreberAnzeiger.setForeground(new java.awt.Color(255, 255, 255));
        lebendeStreberAnzeiger.setText("Lebende Streber : 0");
        add(lebendeStreberAnzeiger);
        lebendeStreberAnzeiger.setBounds(440, 20, 200, 17);
        lebendeStreberAnzeiger.getAccessibleContext().setAccessibleName("lebendeStreberAnzeiger");
        lebendeStreberAnzeiger.getAccessibleContext().setAccessibleDescription("");

        toteStreberAnzeiger.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        toteStreberAnzeiger.setForeground(new java.awt.Color(255, 255, 255));
        toteStreberAnzeiger.setText("Getötete Streber : 0");
        add(toteStreberAnzeiger);
        toteStreberAnzeiger.setBounds(440, 40, 200, 17);
        toteStreberAnzeiger.getAccessibleContext().setAccessibleName("toteStreberAnzeiger");

        jProgressBar.setFocusable(false);
        add(jProgressBar);
        jProgressBar.setBounds(440, 70, 200, 14);

        jLabelEXPGame.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEXPGame.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEXPGame.setText("Erfahrung: 0");
        add(jLabelEXPGame);
        jLabelEXPGame.setBounds(440, 580, 200, 20);

        jLabelGlassesGame.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelGlassesGame.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGlassesGame.setText("Brillen: 0");
        add(jLabelGlassesGame);
        jLabelGlassesGame.setBounds(440, 560, 200, 20);

        jLabelLVL.setBackground(new java.awt.Color(51, 51, 51));
        jLabelLVL.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLVL.setText("LVL");
        add(jLabelLVL);
        jLabelLVL.setBounds(440, 110, 200, 50);

        jScrollPaneGame.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextAreaGame.setEditable(false);
        jTextAreaGame.setColumns(20);
        jTextAreaGame.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextAreaGame.setLineWrap(true);
        jTextAreaGame.setRows(5);
        jTextAreaGame.setWrapStyleWord(true);
        jTextAreaGame.setFocusable(false);
        jScrollPaneGame.setViewportView(jTextAreaGame);

        add(jScrollPaneGame);
        jScrollPaneGame.setBounds(440, 170, 200, 380);

        bEvent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/weapon7.png"))); // NOI18N
        bEvent.setText("jButton7");
        bEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEventActionPerformed(evt);
            }
        });
        add(bEvent);
        bEvent.setBounds(440, 680, 60, 60);

        bAttack7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/weapon6.png"))); // NOI18N
        bAttack7.setText("jButton7");
        bAttack7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAttack7ActionPerformed(evt);
            }
        });
        add(bAttack7);
        bAttack7.setBounds(440, 620, 60, 60);

        mainScreen.setText("mainScreen");
        add(mainScreen);
        mainScreen.setBounds(20, 20, 410, 580);

        jLabelBackgroundGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/game_BG.png"))); // NOI18N
        jLabelBackgroundGame.setText("jLabel2");
        jLabelBackgroundGame.setMaximumSize(new java.awt.Dimension(650, 750));
        jLabelBackgroundGame.setMinimumSize(new java.awt.Dimension(650, 750));
        jLabelBackgroundGame.setPreferredSize(new java.awt.Dimension(650, 750));
        add(jLabelBackgroundGame);
        jLabelBackgroundGame.setBounds(0, 0, 650, 750);
    }// </editor-fold>//GEN-END:initComponents

    private void tbAttack0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbAttack0ActionPerformed
        Game.getAktGame().changeWeapon(0);
        changeTBPicture(tbAttack0);
    }//GEN-LAST:event_tbAttack0ActionPerformed

    private void tbAttack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbAttack1ActionPerformed
        Game.getAktGame().changeWeapon(1);
        changeTBPicture(tbAttack1);

    }//GEN-LAST:event_tbAttack1ActionPerformed

    private void tbAttack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbAttack2ActionPerformed
        Game.getAktGame().changeWeapon(2);
        changeTBPicture(tbAttack2);
    }//GEN-LAST:event_tbAttack2ActionPerformed

    private void tbAttack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbAttack3ActionPerformed
        Game.getAktGame().changeWeapon(3);
        changeTBPicture(tbAttack3);
    }//GEN-LAST:event_tbAttack3ActionPerformed

    private void tbAttack4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbAttack4ActionPerformed
        Game.getAktGame().changeWeapon(4);
        changeTBPicture(tbAttack4);
    }//GEN-LAST:event_tbAttack4ActionPerformed

    private void tbAttack5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbAttack5ActionPerformed
        Game.getAktGame().changeWeapon(5);
        changeTBPicture(tbAttack5);
    }//GEN-LAST:event_tbAttack5ActionPerformed

    private void bAttack7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAttack7ActionPerformed
        Game.getAktGame().useGrenade();
        disableGrenButton();
    }//GEN-LAST:event_bAttack7ActionPerformed

    private void bEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bEventActionPerformed

    private void jLabelToShopGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelToShopGameMouseClicked
                try {
            MainGUI.getAktMainGUI().changeCard("shop card");
            // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelToShopGameMouseClicked

    private void jLabelToSkillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelToSkillMouseClicked
              try {
            MainGUI.getAktMainGUI().changeCard("skill card");        // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelToSkillMouseClicked

    private void jLabelToShopGameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelToShopGameMouseEntered
        jLabelToShopGame.setForeground(Color.GRAY);
    }//GEN-LAST:event_jLabelToShopGameMouseEntered

    private void jLabelToShopGameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelToShopGameMouseExited
        jLabelToShopGame.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabelToShopGameMouseExited

    private void jLabelToSkillMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelToSkillMouseEntered
        jLabelToSkill.setForeground(Color.GRAY);
    }//GEN-LAST:event_jLabelToSkillMouseEntered

    private void jLabelToSkillMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelToSkillMouseExited
        jLabelToSkill.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabelToSkillMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAttack7;
    private javax.swing.JButton bEvent;
    private javax.swing.JLabel jLabelBackgroundGame;
    private javax.swing.JLabel jLabelEXPGame;
    private javax.swing.JLabel jLabelGlassesGame;
    private javax.swing.JLabel jLabelLVL;
    private javax.swing.JLabel jLabelToShopGame;
    private javax.swing.JLabel jLabelToSkill;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPaneGame;
    private javax.swing.JSeparator jSeparator;
    private static javax.swing.JTextArea jTextAreaGame;
    private javax.swing.JLabel lebendeStreberAnzeiger;
    private gui.Screen mainScreen;
    private javax.swing.JToggleButton tbAttack0;
    private javax.swing.JToggleButton tbAttack1;
    private javax.swing.JToggleButton tbAttack2;
    private javax.swing.JToggleButton tbAttack3;
    private javax.swing.JToggleButton tbAttack4;
    private javax.swing.JToggleButton tbAttack5;
    private javax.swing.ButtonGroup tbAttackGroup;
    private javax.swing.JLabel toteStreberAnzeiger;
    // End of variables declaration//GEN-END:variables

    public Screen getScreen() {
        return mainScreen;
    }

    //Diese Reihenfolge: Lebende Streber,vorherLebendeStreber, Tote Streber, Brillen Erfahrung
    public void setAnzeiger(int ls, int vls, int ts, int br, int exp) {
        setLebendeStreber(ls, vls);
        setToteStreber(ts);
        setBrillen(br);
        setErfahrung(exp);
    }

    public void setLebendeStreber(int ls, int vls) {
        lebendeStreberAnzeiger.setText("Lebende Streber: " + ls);
        if (vls > ls) {
            lebendeStreberAnzeiger.setForeground(Color.green);
        }
        if (vls < ls) {
            lebendeStreberAnzeiger.setForeground(Color.red);
        }

    }

    public void setToteStreber(int ts) {
        toteStreberAnzeiger.setText("Getötete Streber: " + ts);
    }

    public void setBrillen(int br) {
        jLabelGlassesGame.setText("Brillen: " + br);
    }

    public void setErfahrung(int exp) {
        jLabelEXPGame.setText("Erfahrung: " + exp);
    }

    @Override
    public void disableButtons() {
        
        bEvent.setEnabled(false); //vorläufig
        
        tbAttack0.setEnabled(Game.getAktGame().getData().getWaffenStufe(0) > 0);
        tbAttack1.setEnabled(Game.getAktGame().getData().getWaffenStufe(1) > 0);
        tbAttack2.setEnabled(Game.getAktGame().getData().getWaffenStufe(2) > 0);
        tbAttack3.setEnabled(Game.getAktGame().getData().getWaffenStufe(3) > 0);
        tbAttack4.setEnabled(Game.getAktGame().getData().getWaffenStufe(4) > 0);
        tbAttack5.setEnabled(Game.getAktGame().getData().getWaffenStufe(5) > 0);
        System.out.println("Waffenbuttons überpfüft");
        disableGrenButton();
    }

    public void disableGrenButton() {
        //TODO: Granaten im Array abrufen. Momentan: Platzhalter
        if (Game.getAktGame().getData().getWaffenStufe(6) <= 0
                || Game.getAktGame().getData().getGranaten() <= 0) {
            bAttack7.setEnabled(false);
        } else {
            bAttack7.setEnabled(true);
        }
    }

    @Override
    public void switchTo() throws LineUnavailableException, Exception {
        super.switchTo();
        Game.getAktGame().resume();
    }

    @Override
    public void switchFrom() throws LineUnavailableException, Exception {
        jTextAreaGame.setText("");
        super.switchFrom();
        Game.getAktGame().pause();
    }

}
