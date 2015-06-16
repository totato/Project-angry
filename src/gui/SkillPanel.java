/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import game.Game;
import java.awt.event.KeyEvent;

/**
 *
 * @author Vika
 */
public class SkillPanel extends javax.swing.JPanel implements Panel {

    /**
     * Creates new form SkillPanel
     */
    public SkillPanel() {
        initComponents();
        shortKeys();
    }

    private void shortKeys() {

        WindowProperties.setShortKeys(bToShopSkill, "shop card", KeyEvent.VK_N);
        WindowProperties.setShortKeys(bToGameSkill, "game card", KeyEvent.VK_B);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSkill = new javax.swing.JTextArea();
        jLabelSensei = new javax.swing.JLabel();
        jLabelEXPSkill = new javax.swing.JLabel();
        jLabelGlassesSkill = new javax.swing.JLabel();
        bBuyGlassesSkill = new javax.swing.JButton();
        jLabelSkilltree = new javax.swing.JLabel();
        tbSkill26 = new javax.swing.JToggleButton();
        tbSkill4 = new javax.swing.JToggleButton();
        tbSkill3 = new javax.swing.JToggleButton();
        tbSkill2 = new javax.swing.JToggleButton();
        tbSkill5 = new javax.swing.JToggleButton();
        tbSkill8 = new javax.swing.JToggleButton();
        tbSkill6 = new javax.swing.JToggleButton();
        tbSkillB9 = new javax.swing.JToggleButton();
        tbSkill7 = new javax.swing.JToggleButton();
        tbSkillB10 = new javax.swing.JToggleButton();
        tbSkillB12 = new javax.swing.JToggleButton();
        tbSkill11 = new javax.swing.JToggleButton();
        tbSkill14 = new javax.swing.JToggleButton();
        tbSkill13 = new javax.swing.JToggleButton();
        tbSkill18 = new javax.swing.JToggleButton();
        tbSkill17 = new javax.swing.JToggleButton();
        tbSkill22 = new javax.swing.JToggleButton();
        tbSkil21 = new javax.swing.JToggleButton();
        tbSkillC16 = new javax.swing.JToggleButton();
        tbSkill15 = new javax.swing.JToggleButton();
        tbSkill20 = new javax.swing.JToggleButton();
        tbSkill19 = new javax.swing.JToggleButton();
        tbSkill24 = new javax.swing.JToggleButton();
        tbSkill23 = new javax.swing.JToggleButton();
        tbSkill35 = new javax.swing.JToggleButton();
        tbSkill25 = new javax.swing.JToggleButton();
        tbSkill27 = new javax.swing.JToggleButton();
        tbSkill29 = new javax.swing.JToggleButton();
        tbSkill31 = new javax.swing.JToggleButton();
        tbSkill33 = new javax.swing.JToggleButton();
        tbSkill28 = new javax.swing.JToggleButton();
        tbSkill30 = new javax.swing.JToggleButton();
        tbSkill32 = new javax.swing.JToggleButton();
        tbSkill34 = new javax.swing.JToggleButton();
        tbSkill1 = new javax.swing.JToggleButton();
        bToShopSkill = new javax.swing.JButton();
        bToGameSkill = new javax.swing.JButton();
        bBuyEXPSkill = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(650, 750));
        setMinimumSize(new java.awt.Dimension(650, 750));
        setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextAreaSkill.setEditable(false);
        jTextAreaSkill.setColumns(20);
        jTextAreaSkill.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSkill);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 400, 220, 340);

        jLabelSensei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/sensei01.png"))); // NOI18N
        jLabelSensei.setText("jLabel1");
        add(jLabelSensei);
        jLabelSensei.setBounds(10, 10, 220, 300);

        jLabelEXPSkill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEXPSkill.setText("Erfahrung: 0");
        add(jLabelEXPSkill);
        jLabelEXPSkill.setBounds(10, 314, 100, 20);

        jLabelGlassesSkill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelGlassesSkill.setText("Brillen: 0");
        add(jLabelGlassesSkill);
        jLabelGlassesSkill.setBounds(130, 314, 100, 20);

        bBuyGlassesSkill.setBackground(new java.awt.Color(0, 0, 0));
        bBuyGlassesSkill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bBuyGlassesSkill.setForeground(new java.awt.Color(255, 255, 255));
        bBuyGlassesSkill.setText("Kaufen");
        add(bBuyGlassesSkill);
        bBuyGlassesSkill.setBounds(130, 340, 100, 50);

        jLabelSkilltree.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelSkilltree.setText("             Skillbaum");
        add(jLabelSkilltree);
        jLabelSkilltree.setBounds(290, 10, 300, 40);

        buttonGroup1.add(tbSkill26);
        tbSkill26.setText("jToggleButton1");
        add(tbSkill26);
        tbSkill26.setBounds(490, 390, 120, 40);

        buttonGroup1.add(tbSkill4);
        tbSkill4.setText("jToggleButton2");
        add(tbSkill4);
        tbSkill4.setBounds(510, 110, 80, 30);

        buttonGroup1.add(tbSkill3);
        tbSkill3.setText("jToggleButton2");
        add(tbSkill3);
        tbSkill3.setBounds(400, 110, 80, 30);

        buttonGroup1.add(tbSkill2);
        tbSkill2.setText("jToggleButton2");
        add(tbSkill2);
        tbSkill2.setBounds(290, 110, 80, 30);

        buttonGroup1.add(tbSkill5);
        tbSkill5.setText("jToggleButton2");
        add(tbSkill5);
        tbSkill5.setBounds(290, 150, 80, 30);

        buttonGroup1.add(tbSkill8);
        tbSkill8.setText("jToggleButton2");
        add(tbSkill8);
        tbSkill8.setBounds(290, 190, 80, 30);

        buttonGroup1.add(tbSkill6);
        tbSkill6.setText("jToggleButton2");
        add(tbSkill6);
        tbSkill6.setBounds(400, 150, 80, 30);

        buttonGroup1.add(tbSkillB9);
        tbSkillB9.setText("jToggleButton2");
        add(tbSkillB9);
        tbSkillB9.setBounds(400, 190, 80, 30);

        buttonGroup1.add(tbSkill7);
        tbSkill7.setText("jToggleButton2");
        add(tbSkill7);
        tbSkill7.setBounds(510, 150, 80, 30);

        buttonGroup1.add(tbSkillB10);
        tbSkillB10.setText("jToggleButton2");
        add(tbSkillB10);
        tbSkillB10.setBounds(510, 190, 80, 30);

        buttonGroup1.add(tbSkillB12);
        tbSkillB12.setText("jToggleButton2");
        add(tbSkillB12);
        tbSkillB12.setBounds(510, 230, 80, 30);

        buttonGroup1.add(tbSkill11);
        tbSkill11.setText("jToggleButton2");
        add(tbSkill11);
        tbSkill11.setBounds(290, 230, 80, 30);

        buttonGroup1.add(tbSkill14);
        tbSkill14.setText("jToggleButton2");
        add(tbSkill14);
        tbSkill14.setBounds(340, 280, 60, 23);

        buttonGroup1.add(tbSkill13);
        tbSkill13.setText("jToggleButton2");
        add(tbSkill13);
        tbSkill13.setBounds(260, 280, 60, 23);

        buttonGroup1.add(tbSkill18);
        tbSkill18.setText("jToggleButton2");
        add(tbSkill18);
        tbSkill18.setBounds(340, 310, 60, 23);

        buttonGroup1.add(tbSkill17);
        tbSkill17.setText("jToggleButton2");
        add(tbSkill17);
        tbSkill17.setBounds(260, 310, 60, 23);

        buttonGroup1.add(tbSkill22);
        tbSkill22.setText("jToggleButton2");
        add(tbSkill22);
        tbSkill22.setBounds(340, 340, 60, 23);

        buttonGroup1.add(tbSkil21);
        tbSkil21.setText("jToggleButton2");
        add(tbSkil21);
        tbSkil21.setBounds(260, 340, 60, 23);

        buttonGroup1.add(tbSkillC16);
        tbSkillC16.setText("jToggleButton2");
        add(tbSkillC16);
        tbSkillC16.setBounds(560, 280, 60, 23);

        buttonGroup1.add(tbSkill15);
        tbSkill15.setText("jToggleButton2");
        add(tbSkill15);
        tbSkill15.setBounds(480, 280, 60, 23);

        buttonGroup1.add(tbSkill20);
        tbSkill20.setText("jToggleButton2");
        add(tbSkill20);
        tbSkill20.setBounds(560, 310, 60, 23);

        buttonGroup1.add(tbSkill19);
        tbSkill19.setText("jToggleButton2");
        add(tbSkill19);
        tbSkill19.setBounds(480, 310, 60, 23);

        buttonGroup1.add(tbSkill24);
        tbSkill24.setText("jToggleButton2");
        add(tbSkill24);
        tbSkill24.setBounds(560, 340, 60, 23);

        buttonGroup1.add(tbSkill23);
        tbSkill23.setText("jToggleButton2");
        add(tbSkill23);
        tbSkill23.setBounds(480, 340, 60, 23);

        buttonGroup1.add(tbSkill35);
        tbSkill35.setText("jToggleButton1");
        add(tbSkill35);
        tbSkill35.setBounds(370, 620, 140, 50);

        buttonGroup1.add(tbSkill25);
        tbSkill25.setText("jToggleButton1");
        add(tbSkill25);
        tbSkill25.setBounds(270, 390, 120, 40);

        buttonGroup1.add(tbSkill27);
        tbSkill27.setText("jToggleButton2");
        add(tbSkill27);
        tbSkill27.setBounds(290, 450, 80, 30);

        buttonGroup1.add(tbSkill29);
        tbSkill29.setText("jToggleButton2");
        add(tbSkill29);
        tbSkill29.setBounds(290, 490, 80, 30);

        buttonGroup1.add(tbSkill31);
        tbSkill31.setText("jToggleButton2");
        add(tbSkill31);
        tbSkill31.setBounds(290, 530, 80, 30);

        buttonGroup1.add(tbSkill33);
        tbSkill33.setText("jToggleButton2");
        add(tbSkill33);
        tbSkill33.setBounds(290, 570, 80, 30);

        buttonGroup1.add(tbSkill28);
        tbSkill28.setText("jToggleButton2");
        add(tbSkill28);
        tbSkill28.setBounds(510, 450, 80, 30);

        buttonGroup1.add(tbSkill30);
        tbSkill30.setText("jToggleButton2");
        add(tbSkill30);
        tbSkill30.setBounds(510, 490, 80, 30);

        buttonGroup1.add(tbSkill32);
        tbSkill32.setText("jToggleButton2");
        add(tbSkill32);
        tbSkill32.setBounds(510, 530, 80, 30);

        buttonGroup1.add(tbSkill34);
        tbSkill34.setText("jToggleButton2");
        add(tbSkill34);
        tbSkill34.setBounds(510, 570, 80, 30);

        buttonGroup1.add(tbSkill1);
        tbSkill1.setText("jToggleButton1");
        add(tbSkill1);
        tbSkill1.setBounds(380, 60, 120, 40);

        bToShopSkill.setBackground(new java.awt.Color(0, 0, 0));
        bToShopSkill.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bToShopSkill.setForeground(new java.awt.Color(255, 255, 255));
        bToShopSkill.setText("Shop");
        bToShopSkill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bToShopSkillActionPerformed(evt);
            }
        });
        add(bToShopSkill);
        bToShopSkill.setBounds(240, 690, 120, 50);

        bToGameSkill.setBackground(new java.awt.Color(0, 0, 0));
        bToGameSkill.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bToGameSkill.setForeground(new java.awt.Color(255, 255, 255));
        bToGameSkill.setText("Zurück");
        bToGameSkill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bToGameSkillActionPerformed(evt);
            }
        });
        add(bToGameSkill);
        bToGameSkill.setBounds(520, 690, 120, 50);

        bBuyEXPSkill.setBackground(new java.awt.Color(0, 0, 0));
        bBuyEXPSkill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bBuyEXPSkill.setForeground(new java.awt.Color(255, 255, 255));
        bBuyEXPSkill.setText("Kaufen");
        add(bBuyEXPSkill);
        bBuyEXPSkill.setBounds(10, 340, 100, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void bToGameSkillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bToGameSkillActionPerformed
        MainGUI.getAktMainGUI().changeCard("game card");
    }//GEN-LAST:event_bToGameSkillActionPerformed

    private void bToShopSkillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bToShopSkillActionPerformed
        MainGUI.getAktMainGUI().changeCard("shop card");
    }//GEN-LAST:event_bToShopSkillActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuyEXPSkill;
    private javax.swing.JButton bBuyGlassesSkill;
    private javax.swing.JButton bToGameSkill;
    private javax.swing.JButton bToShopSkill;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabelEXPSkill;
    private javax.swing.JLabel jLabelGlassesSkill;
    private javax.swing.JLabel jLabelSensei;
    private javax.swing.JLabel jLabelSkilltree;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaSkill;
    private javax.swing.JToggleButton tbSkil21;
    private javax.swing.JToggleButton tbSkill1;
    private javax.swing.JToggleButton tbSkill11;
    private javax.swing.JToggleButton tbSkill13;
    private javax.swing.JToggleButton tbSkill14;
    private javax.swing.JToggleButton tbSkill15;
    private javax.swing.JToggleButton tbSkill17;
    private javax.swing.JToggleButton tbSkill18;
    private javax.swing.JToggleButton tbSkill19;
    private javax.swing.JToggleButton tbSkill2;
    private javax.swing.JToggleButton tbSkill20;
    private javax.swing.JToggleButton tbSkill22;
    private javax.swing.JToggleButton tbSkill23;
    private javax.swing.JToggleButton tbSkill24;
    private javax.swing.JToggleButton tbSkill25;
    private javax.swing.JToggleButton tbSkill26;
    private javax.swing.JToggleButton tbSkill27;
    private javax.swing.JToggleButton tbSkill28;
    private javax.swing.JToggleButton tbSkill29;
    private javax.swing.JToggleButton tbSkill3;
    private javax.swing.JToggleButton tbSkill30;
    private javax.swing.JToggleButton tbSkill31;
    private javax.swing.JToggleButton tbSkill32;
    private javax.swing.JToggleButton tbSkill33;
    private javax.swing.JToggleButton tbSkill34;
    private javax.swing.JToggleButton tbSkill35;
    private javax.swing.JToggleButton tbSkill4;
    private javax.swing.JToggleButton tbSkill5;
    private javax.swing.JToggleButton tbSkill6;
    private javax.swing.JToggleButton tbSkill7;
    private javax.swing.JToggleButton tbSkill8;
    private javax.swing.JToggleButton tbSkillB10;
    private javax.swing.JToggleButton tbSkillB12;
    private javax.swing.JToggleButton tbSkillB9;
    private javax.swing.JToggleButton tbSkillC16;
    // End of variables declaration//GEN-END:variables

    public void setGlasses(int br) {
        jLabelGlassesSkill.setText("Brillen: " + br);
    }

    public void setEXP(int exp) {
        jLabelEXPSkill.setText("Brillen: " + exp);
    }

    public void setLabels(int br, int exp) {
        setGlasses(br);
        setEXP(exp);
    }

    @Override
    public void disableButtons() {
        
    }

    @Override
    public void switchTo() {
       MainGUI.getAktMainGUI().getSkillPanel1().setLabels(Game.getAktGame().getData().getBrillen(), Game.getAktGame().getData().getExp());
    }

    @Override
    public void switchFrom() {
        
    }
}
