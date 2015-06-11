/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.WindowProperties;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.KeyStroke;

/**
 *
 * @author Vika
 */
public class GamePanel extends javax.swing.JPanel {

    /**
     * Creates new form gamePanel
     */
    public GamePanel() {
        initComponents();
        shortKeys();
       
    }
private void shortKeys(){
    
    WindowProperties.setShortKeys(bToShopGame,"shop card", KeyEvent.VK_N );
    WindowProperties.setShortKeys(bToSkillGame,"skill card", KeyEvent.VK_M );
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
        tbAttack3 = new javax.swing.JToggleButton();
        tbAttack4 = new javax.swing.JToggleButton();
        tbAttack5 = new javax.swing.JToggleButton();
        tbAttack6 = new javax.swing.JToggleButton();
        tbAttack1 = new javax.swing.JToggleButton();
        tbAttack2 = new javax.swing.JToggleButton();
        lebendeStreberAnzeiger = new javax.swing.JLabel();
        toteStreberAnzeiger = new javax.swing.JLabel();
        jProgressBar = new javax.swing.JProgressBar();
        jLabelEXPGame = new javax.swing.JLabel();
        jLabelGlassesGame = new javax.swing.JLabel();
        jLabelLVL = new javax.swing.JLabel();
        jScrollPaneGame = new javax.swing.JScrollPane();
        jTextAreaGame = new javax.swing.JTextArea();
        bToSkillGame = new javax.swing.JButton();
        bToShopGame = new javax.swing.JButton();
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

        tbAttackGroup.add(tbAttack3);
        tbAttack3.setText("jToggleButton1");
        add(tbAttack3);
        tbAttack3.setBounds(160, 630, 60, 100);

        tbAttackGroup.add(tbAttack4);
        tbAttack4.setText("jToggleButton1");
        add(tbAttack4);
        tbAttack4.setBounds(230, 630, 60, 100);

        tbAttackGroup.add(tbAttack5);
        tbAttack5.setText("jToggleButton1");
        add(tbAttack5);
        tbAttack5.setBounds(300, 630, 60, 100);

        tbAttackGroup.add(tbAttack6);
        tbAttack6.setText("jToggleButton1");
        add(tbAttack6);
        tbAttack6.setBounds(370, 630, 60, 100);

        tbAttackGroup.add(tbAttack1);
        tbAttack1.setText("jToggleButton1");
        add(tbAttack1);
        tbAttack1.setBounds(20, 630, 60, 100);

        tbAttackGroup.add(tbAttack2);
        tbAttack2.setText("jToggleButton1");
        add(tbAttack2);
        tbAttack2.setBounds(90, 630, 60, 100);

        lebendeStreberAnzeiger.setText("Lebende Streber : 0");
        add(lebendeStreberAnzeiger);
        lebendeStreberAnzeiger.setBounds(440, 20, 200, 14);
        lebendeStreberAnzeiger.getAccessibleContext().setAccessibleName("lebendeStreberAnzeiger");
        lebendeStreberAnzeiger.getAccessibleContext().setAccessibleDescription("");

        toteStreberAnzeiger.setText("Getötete Streber : 0");
        add(toteStreberAnzeiger);
        toteStreberAnzeiger.setBounds(440, 40, 200, 14);
        toteStreberAnzeiger.getAccessibleContext().setAccessibleName("toteStreberAnzeiger");

        add(jProgressBar);
        jProgressBar.setBounds(440, 70, 200, 14);

        jLabelEXPGame.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEXPGame.setText("Erfahrung: 0");
        add(jLabelEXPGame);
        jLabelEXPGame.setBounds(440, 580, 200, 20);

        jLabelGlassesGame.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGlassesGame.setText("Brillen: 0");
        add(jLabelGlassesGame);
        jLabelGlassesGame.setBounds(440, 560, 200, 20);

        jLabelLVL.setBackground(new java.awt.Color(51, 51, 51));
        jLabelLVL.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLVL.setText("LVL");
        add(jLabelLVL);
        jLabelLVL.setBounds(440, 110, 200, 50);

        jTextAreaGame.setEditable(false);
        jTextAreaGame.setColumns(20);
        jTextAreaGame.setRows(5);
        jScrollPaneGame.setViewportView(jTextAreaGame);

        add(jScrollPaneGame);
        jScrollPaneGame.setBounds(440, 170, 200, 380);

        bToSkillGame.setText("Skillbaum");
        bToSkillGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bToSkillGameActionPerformed(evt);
            }
        });
        add(bToSkillGame);
        bToSkillGame.setBounds(510, 680, 130, 60);

        bToShopGame.setText("Shop");
        bToShopGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bToShopGameActionPerformed(evt);
            }
        });
        add(bToShopGame);
        bToShopGame.setBounds(510, 620, 130, 60);

        bEvent.setText("jButton7");
        add(bEvent);
        bEvent.setBounds(440, 680, 60, 60);

        bAttack7.setText("jButton7");
        add(bAttack7);
        bAttack7.setBounds(440, 620, 60, 60);

        mainScreen.setText("mainScreen");
        add(mainScreen);
        mainScreen.setBounds(20, 20, 410, 580);

        jLabelBackgroundGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScreenLaun/gamePanelBG.jpg"))); // NOI18N
        jLabelBackgroundGame.setText("jLabel2");
        jLabelBackgroundGame.setMaximumSize(new java.awt.Dimension(650, 750));
        jLabelBackgroundGame.setMinimumSize(new java.awt.Dimension(650, 750));
        jLabelBackgroundGame.setPreferredSize(new java.awt.Dimension(650, 750));
        add(jLabelBackgroundGame);
        jLabelBackgroundGame.setBounds(0, 0, 650, 750);
    }// </editor-fold>//GEN-END:initComponents

    private void bToShopGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bToShopGameActionPerformed

                MainGUI.getAktMainGUI().changeCard("shop card");
       // TODO add your handling code here:
    }//GEN-LAST:event_bToShopGameActionPerformed

    private void bToSkillGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bToSkillGameActionPerformed
 MainGUI.getAktMainGUI().changeCard("skill card");        // TODO add your handling code here:
    }//GEN-LAST:event_bToSkillGameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAttack7;
    private javax.swing.JButton bEvent;
    private javax.swing.JButton bToShopGame;
    private javax.swing.JButton bToSkillGame;
    private javax.swing.JLabel jLabelBackgroundGame;
    private javax.swing.JLabel jLabelEXPGame;
    private javax.swing.JLabel jLabelGlassesGame;
    private javax.swing.JLabel jLabelLVL;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPaneGame;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JTextArea jTextAreaGame;
    private javax.swing.JLabel lebendeStreberAnzeiger;
    private gui.Screen mainScreen;
    private javax.swing.JToggleButton tbAttack1;
    private javax.swing.JToggleButton tbAttack2;
    private javax.swing.JToggleButton tbAttack3;
    private javax.swing.JToggleButton tbAttack4;
    private javax.swing.JToggleButton tbAttack5;
    private javax.swing.JToggleButton tbAttack6;
    private javax.swing.ButtonGroup tbAttackGroup;
    private javax.swing.JLabel toteStreberAnzeiger;
    // End of variables declaration//GEN-END:variables

    public Screen getScreen(){
        return mainScreen;
    }
    
    public void setLebendeStreber(int ls){
        lebendeStreberAnzeiger.setText("Lebende Streber: " + ls);
    }
    
    public void setToteStreber(int ts){
        toteStreberAnzeiger.setText("Getötete Streber: " + ts);
    }


}
