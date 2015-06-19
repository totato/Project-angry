/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import game.Game;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Vika
 */
public class StoryPanel extends javax.swing.JPanel implements Panel {

    /**
     * Creates new form StoryPanel
     */
    public StoryPanel() throws IOException {
        initComponents();
        jTextAreaStory.setLineWrap(true);
        jTextAreaStory.setWrapStyleWord(true);
        setScene(0, 0);

    }

    public String loadStoryText(int storynr, int storypart) throws IOException {
        String text = "";
        List<String> zeilen = WindowProperties.ladeTXT("Story/Story_" + storynr + ".txt");
        int startPos = zeilen.indexOf("-START" + storypart + "-");
        if (startPos > -1) {
            text = zeilen.get(startPos + 1);
        }
        return text;
    }

    public ImageIcon loadStoryPicture(int storynr, int storypart) throws IOException {

        List<String> zeilen = WindowProperties.ladeTXT("Story/Story_" + storynr + ".txt");
        int startPos = zeilen.indexOf("-START" + storypart + "-");
        if (startPos > -1) {
            System.out.println((zeilen.get(startPos + 2)));
            ImageIcon icon = new ImageIcon(getClass().getResource((zeilen.get(startPos + 2))));

            return icon;
        }
        return null;
    }

    private void setScene(int storynr, int storypart) throws IOException {
        jTextAreaStory.setText(loadStoryText(storynr, storypart));
        jLabelStory.setIcon(loadStoryPicture(storynr, storypart));
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaStory = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabelStory = new javax.swing.JLabel();
        jLabelLvlStory = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(650, 750));
        setMinimumSize(new java.awt.Dimension(650, 750));
        setPreferredSize(new java.awt.Dimension(650, 750));

        jTextAreaStory.setColumns(20);
        jTextAreaStory.setRows(5);
        jScrollPane1.setViewportView(jTextAreaStory);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Weiter");

        jLabelStory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/StoryBG_00.png"))); // NOI18N
        jLabelStory.setText("jLabel1");

        jLabelLvlStory.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelLvlStory.setText("Kapitel: 1");

        jButton2.setText("Skip");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabelLvlStory))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(130, 130, 130)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelStory, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLvlStory, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelStory, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            MainGUI.getAktMainGUI().changeCard("game card");
        } catch (IOException ex) {
            Logger.getLogger(StoryPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(StoryPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabelLvlStory;
    private javax.swing.JLabel jLabelStory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaStory;
    // End of variables declaration//GEN-END:variables

    @Override
    public void disableButtons() {
       
    }

    @Override
    public void switchTo() {
       
    }

    @Override
    public void switchFrom() {
       
    }
}
