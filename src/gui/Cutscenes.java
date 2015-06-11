package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Gott, durch mich, seinen Propheten!
 */
public class Cutscenes extends WindowProperties {

    private Timer cutsceneTimer;

    /*
     Spielt (Im Idealfall. Falls es irgendwann funktioniert) eine Cutscene ab.
     Dabei wird die Nummer der Cutscene (1. Parameter) angegeben. Die Cutscene 
     kann modular, im angegebenen JPanel(2. Parameter) im angegebenen JLabel
     (3. Parameter)angezeigt werden. 
     */
    public void playCutscene(int cutsceneNumber, JPanel cutsceneFrame,
            JLabel cutsceneLabel) {
        stopBgMusic();

        if (cutsceneNumber == 1) {
            backgroundMusic("rewind.wav");
            setBackgrPicture(cutsceneLabel, "ScreenLaun/ButtonIcon1.png");

            cutsceneFrame.add(cutsceneLabel, BorderLayout.CENTER);
            cutsceneTimer = new Timer(20000, new AbstractAction() {
                public void actionPerformed(ActionEvent e) {
                }
            });

            cutsceneTimer.start();
        } else if (cutsceneNumber == 2) {
            cutsceneTimer = new Timer(1900, new AbstractAction() {
                public void actionPerformed(ActionEvent e) {
                }
            });

            backgroundMusic("titleSong.wav");
            setCutscenePicture(cutsceneLabel, "Testvid01.gif");
            cutsceneFrame.add(cutsceneLabel, BorderLayout.CENTER);
            cutsceneTimer.start();

        } else if (cutsceneNumber == 3) {
            cutsceneTimer = new Timer(1900, new AbstractAction() {
                public void actionPerformed(ActionEvent e) {
                }
            });
            backgroundMusic("titleSong.wav");
            setCutscenePicture(cutsceneLabel, "Testvid01.gif");
            cutsceneFrame.add(cutsceneLabel, BorderLayout.CENTER);
            cutsceneTimer.start();
        } else if (cutsceneNumber == 4) {
            cutsceneTimer = new Timer(1900, new AbstractAction() {
                public void actionPerformed(ActionEvent e) {
                }
            });
            backgroundMusic("titleSong.wav");
            setCutscenePicture(cutsceneLabel, "Testvid01.gif");
            cutsceneFrame.add(cutsceneLabel, BorderLayout.CENTER);
            cutsceneTimer.start();
        } else if (cutsceneNumber == 5) {
            cutsceneTimer = new Timer(1900, new AbstractAction() {
                public void actionPerformed(ActionEvent e) {
                }
            });
            backgroundMusic("titleSong.wav");
            setCutscenePicture(cutsceneLabel, "Testvid01.gif");
            cutsceneFrame.add(cutsceneLabel, BorderLayout.CENTER);
            cutsceneTimer.start();
        } else {
            System.out.println("Something failed, this should not happen."
                    + "Please report the bug.");
        }
    }

    /*
     Fügt einem JLabel ein Hintergrundbild zu. Da die Methode getCutsceneIcon 
     aufruft muss das Hintergrundbild unter dem Pfad "proj_1/cutscenefolder/"
     gespeichert sein.
     */
    public void setCutscenePicture(JLabel label, String dateiname) {
        ImageIcon cscPicture = getCutsceneIcon(dateiname);
        label.setIcon(cscPicture);
        System.out.println("Cutscene-hintergrund gesetzt");
    }

    /*
     Vergleichar mit getImageIcon, sucht das ImageIcon aber unter dem Pfad
     "proj_1/cutscenefolder/". Das ImageIcon wird also an einem anderen
     Ort gespeichert.
     */
    public ImageIcon getCutsceneIcon(String name) {
        String pfad = "proj_1/cutscenefolder/" + name;
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource(pfad));
        return icon;
    }

}
