package gui;

import game.Game;
import game.StoryHandler;
import static gui.WindowProperties.clipLaun;
import java.awt.Color;
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
public class StoryPanel extends Panel {

    /**
     * Creates new form StoryPanel
     */
    public StoryPanel() throws IOException {
        initComponents();
        jTextAreaStory.setLineWrap(true);
        jTextAreaStory.setWrapStyleWord(true);
        super.setBgMusic(clipLaun);

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

    public void setScene(int storynr, int storypart) throws IOException {
        jTextAreaStory.setText(loadStoryText(storynr, storypart));
        jLabelStory.setIcon(loadStoryPicture(storynr, storypart));
    }

    public void setChapterNumber(int storynr) {
        jLabelLvlStory.setText("Kapitel: " + storynr);
    }

    private void skipStory() {
        try {
            MainGUI.getAktMainGUI().changeCard("game card");
        } catch (IOException ex) {
            Logger.getLogger(StoryPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(StoryPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaStory = new javax.swing.JTextArea();
        jLabelStory = new javax.swing.JLabel();
        jLabelLvlStory = new javax.swing.JLabel();
        jLabelWeiter = new javax.swing.JLabel();
        jLabelSkip = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(650, 750));
        setMinimumSize(new java.awt.Dimension(650, 750));
        setPreferredSize(new java.awt.Dimension(650, 750));
        setLayout(null);

        jTextAreaStory.setEditable(false);
        jTextAreaStory.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaStory.setColumns(20);
        jTextAreaStory.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextAreaStory.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaStory.setRows(5);
        jTextAreaStory.setFocusable(false);
        jScrollPane1.setViewportView(jTextAreaStory);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 470, 596, 203);

        jLabelStory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafiken/StoryBG_00.png"))); // NOI18N
        jLabelStory.setText("jLabel1");
        add(jLabelStory);
        jLabelStory.setBounds(30, 50, 596, 403);

        jLabelLvlStory.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelLvlStory.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLvlStory.setText("Kapitel: 1");
        add(jLabelLvlStory);
        jLabelLvlStory.setBounds(280, 10, 200, 30);

        jLabelWeiter.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelWeiter.setForeground(new java.awt.Color(153, 153, 153));
        jLabelWeiter.setText("Weiter");
        jLabelWeiter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelWeiterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelWeiterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelWeiterMouseExited(evt);
            }
        });
        add(jLabelWeiter);
        jLabelWeiter.setBounds(290, 680, 90, 42);

        jLabelSkip.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSkip.setForeground(new java.awt.Color(153, 153, 153));
        jLabelSkip.setText("Skip");
        jLabelSkip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSkipMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSkipMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSkipMouseExited(evt);
            }
        });
        add(jLabelSkip);
        jLabelSkip.setBounds(590, 670, 40, 28);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelWeiterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelWeiterMouseClicked
        try {
            if (Game.getAktGame().getStory().getAktStorypart()   == StoryHandler.getMaxStoryPart(Game.getAktGame().getStory().getAktStory())) {
                skipStory();
            }
            else{
                try {
                    Game.getAktGame().getStory().nextPart();
                } catch (IOException ex) {
                    Logger.getLogger(StoryPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(StoryPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelWeiterMouseClicked

    private void jLabelSkipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSkipMouseClicked
        skipStory();
    }//GEN-LAST:event_jLabelSkipMouseClicked

    private void jLabelWeiterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelWeiterMouseEntered
        jLabelWeiter.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabelWeiterMouseEntered

    private void jLabelWeiterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelWeiterMouseExited
        jLabelWeiter.setForeground(Color.GRAY);
    }//GEN-LAST:event_jLabelWeiterMouseExited

    private void jLabelSkipMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSkipMouseEntered
        jLabelSkip.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabelSkipMouseEntered

    private void jLabelSkipMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSkipMouseExited
        jLabelSkip.setForeground(Color.GRAY);
    }//GEN-LAST:event_jLabelSkipMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelLvlStory;
    private javax.swing.JLabel jLabelSkip;
    private javax.swing.JLabel jLabelStory;
    private javax.swing.JLabel jLabelWeiter;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaStory;
    // End of variables declaration//GEN-END:variables

    @Override
    public void disableButtons() {

    }

    @Override
    public void switchTo() throws Exception {
        super.switchTo();
    }

    @Override
    public void switchFrom() throws Exception {
        super.switchFrom();
    }
}
