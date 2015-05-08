/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Zwei Leute die nichts besseres zu tun haben
 */
public abstract class WindowProperties {

    public Clip clip;
    public String[] words;
    public String[] saveData;
    public static String language = "EN";

    /*
     Fügt Hintergrundmusik ein. Das abgespielte Lied muss unter dem Pfad 
     "proj_1/ScreenLaun/" zu finden sin. Der Name des Lieds wird, mit 
     Dateianhang, in die Methode mit eingegeben.
    
   
     */
    public void backgroundMusic(String dateiname) {
        System.out.println("*Musik spielt*");
        String pfadsoundlaun = "proj_1/ScreenLaun/" + dateiname;

        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(this.getClass().getClassLoader().getResource(pfadsoundlaun));
            clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
            clip.loop(50);
        } catch (UnsupportedAudioFileException uae) {
            System.out.println(uae);
        } catch (IOException ioe) {
            System.out.println(ioe);
        } catch (LineUnavailableException lua) {
            System.out.println(lua);
        }
    }

    /*
     Beendet die gerade spielende Hintergrundmusik.
     */
    public void stopBgMusic() {
        clip.stop();
    }

    /*
     Gibt als return ein ImageIcon heraus. Dieses wird primär in den Methoden 
     genutzt die ImageIcons brauchen und ist dazu da, nicht jedes mal manuell 
     das Icon bekommen zu müssen. Das ImageIcon muss unter dem Pfad 
     "proj_1/ScreenLaun/" gespeichert sein.
     */
    public ImageIcon getImageIcon(String name) {
        String pfad = "proj_1/ScreenLaun/" + name;
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource(pfad));
        return icon;
    }

    /*
     Fügt einem JLabel ein Hintergrundbild zu. Da die Methode getImageIcon 
     aufruft muss das Hintergrundbild unter dem Pfad "proj_1/ScreenLaun/"
     gespeichert sein.
     */
    public void setBackgrPicture(JLabel label, String dateiname) {
        ImageIcon bgPicture = getImageIcon(dateiname);
        label.setIcon(bgPicture);
        System.out.println("Hintergrund gesetzt");
    }

    /*
     Fügt einem JFrame ein Icon zu. Da die Methode getImageIcon 
     aufruft muss das Icon unter dem Pfad "proj_1/ScreenLaun/"
     gespeichert sein.
     */
    public void setIconPicture(JFrame frame, String pfad) {
        ImageIcon icon = getImageIcon(pfad);
        frame.setIconImage(icon.getImage());
        System.out.println("Icon gesetzt");
    }

    /*
     Fügt einem JButton ein Hintergrundbild zu. Da die Methode getImageIcon 
     aufruft muss das Hintergrundbild unter dem Pfad "proj_1/ScreenLaun/"
     gespeichert sein.
     */
    public void setButtonBackground(JButton button, String pfad) {
        ImageIcon background = getImageIcon(pfad);
        button.setContentAreaFilled(true);
        button.setIcon(background);
        System.out.println("Button hat Hintergrund");
    }

    /*
     Klärt, aus welchem Dokument die getWords Methode Zeilen entnimmt.
     Wird ganz am Anfang, vor öffnen des Launchers, aufgerufen.
     */
    public void setLanguage(String lg) {
        words = new String[50]; // TODO: die Zahl ist zu Ändern 
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("language_" + lg + ".txt"));
            int i = 0;
            String zeile = "";
            while ((zeile = reader.readLine()) != null && i < words.length) {
                String[] values = zeile.split("\\;");
                words[i] = values[0];
                i++;
            }
        } catch (IOException ioex) {
            System.err.println("Datei nicht Gefunden");
        }
    }
    /*
     Sucht die String aus der angegebenen Zeile heraus und gibt sie zurück.
     */

    public String getWords(int line) {
        return words[line];
    }

    public void ladeSpiel() {
        try {
            FileReader fr = new FileReader("Save.txt");
            BufferedReader textReader = new BufferedReader(fr);
            saveData = new String[10];
            int i;
            for (i = 0; i < 5; i++) {
                saveData[i] = textReader.readLine();
            }
        textReader.close( );
        } catch (IOException ioex) {
            System.err.println("Datei nicht Gefunden");
        }

    }

    public String getSave(int line) {
        return saveData[line];
    }

    /*Schreibt alles mitgegebene in eine .txt-datei, die man im projektordner 
     findet. TODO: Der Pfad muss angepasst werden, so dass die Datei 
     mitkompiliert.
    
     TODO: Das muss schöner gehen. e.v. getter/setter oder was ähnliches?
    
     TODO: Fähigkeiten und Waffen hinzufügen
     */
    public void speichereSpiel(int levelnr, int brillen, int lebStre,
            int totStre) {
        try {
            FileWriter saveFinder = new FileWriter("Save.txt");
            PrintWriter saveWriter = new PrintWriter(saveFinder);
            saveWriter.println("This is your save file. Stop cheating, "
                                     + "start playing!");
            saveWriter.println(levelnr);//Levelnummer
            saveWriter.println(brillen);
            saveWriter.println(lebStre);
            saveWriter.println(totStre);
            saveWriter.close();
        } catch (IOException ioex) {
            System.err.println("Datei nicht Gefunden");
        }
    }
}
