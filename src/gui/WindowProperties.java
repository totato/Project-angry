package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

/**
 *
 * @author Drei Leute die nichts besseres zu tun haben
 */
public abstract class WindowProperties {

    private static Clip clip;

    
    public String[] words;
    public String[] saveData;
    public static String language = "EN";

    /*
     Fügt Hintergrundmusik ein. Das abgespielte Lied muss unter dem Pfad 
     "proj_1/ScreenLaun/" zu finden sin. Der Name des Lieds wird, mit 
     Dateianhang, in die Methode mit eingegeben.   
     */
    public static void backgroundMusic(String dateipfad) throws LineUnavailableException {
        //TODO: Catch wenn Soundausgabe fehlt
        System.out.println("*Musik spielt*");
        String pfadsoundlaun = dateipfad;

        clip = AudioSystem.getClip();

        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(WindowProperties.class.getClassLoader().getResource(pfadsoundlaun));
            clip.open(audio);
            clip.start();
            clip.loop(50);
        } catch (UnsupportedAudioFileException uae) {
            System.out.println(uae);
        } catch (IOException ioe) {
            System.out.println(ioe);
        } catch (LineUnavailableException lua) {
            System.out.println(lua);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae);
        }
    }

    /*
     Beendet die gerade spielende Hintergrundmusik.
     */
    public static void stopBgMusic() throws LineUnavailableException {
        try {
            clip.stop();
        } catch (NullPointerException npe) {
            System.out.println(npe);
        }
    }
    
    public static List<BufferedImage> ladeBildliste(String pfad) throws IOException {
       List<String> bilderTXT = WindowProperties.ladeTXT(pfad);
       List<BufferedImage> bilder = new ArrayList();
       for(String bildPfad: bilderTXT){
           bilder.add(WindowProperties.ladeBild(bildPfad));
       }
       
       return bilder;
    }

    /*
     Gibt als return ein ImageIcon heraus. Dieses wird primär in den Methoden 
     genutzt die ImageIcons brauchen und ist dazu da, nicht jedes mal manuell 
     das Icon bekommen zu müssen. Das ImageIcon muss unter dem Pfad 
     "proj_1/[ordner]/" gespeichert sein, wobei "ordner" der zweite mitgegebene Parameter ist.
     */
    public ImageIcon getImageIcon(String ordnerUName) {
        //String pfad = "Proj_1/"+ ordnerUName;
        String pfad = ordnerUName;
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource(pfad));
        //ImageIcon icon = new ImageIcon(WindowProperties.class.getResource(pfad));
        return icon;
    }

    /*
     Fügt einem JLabel ein Hintergrundbild zu. Der Dateiname und der Ordner
     in dem die Datei gespeichert wurde werden zusammen mitgegeben.
     */
    public void setBackgrPicture(JLabel label, String pfad) {
        //getImageIcon(pfad);
        label.setIcon(getImageIcon(pfad));
        System.out.println("Hintergrund gesetzt");
    }

    /*
     Fügt einem JFrame ein Icon zu. Der Dateiname und der Ordner
     in dem die Datei gespeichert wurde werden zusammen mitgegeben.
     */
    public void setIconPicture(JFrame frame, String pfad) {
        ImageIcon icon = getImageIcon(pfad);
        frame.setIconImage(icon.getImage());
        System.out.println("Icon gesetzt");
    }

    /*
     Fügt einem JButton ein Hintergrundbild zu. Der Dateiname und der Ordner
     in dem die Datei gespeichert wurde werden zusammen mitgegeben.
     */
    /*public void setButtonBackground(JButton button, String pfad) {
     ImageIcon background = getImageIcon(pfad);
     button.setContentAreaFilled(true);
     button.setIcon(background);
     System.out.println("Button hat Hintergrund");
     }*/

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
            textReader.close();
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

    public static void setShortKeys(JLabel label, final String card, int sign) {
        label.getInputMap(label.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(sign, 0), "x");
        label.getActionMap().put("x", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                try {
                    MainGUI.getAktMainGUI().changeCard(card);
                } catch (IOException ex) {
                    Logger.getLogger(WindowProperties.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(WindowProperties.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public static BufferedImage ladeBild(String quelle) {
        try {
            return ImageIO.read(WindowProperties.class.getClassLoader().getResourceAsStream(quelle));
        } catch (IOException ex) {
            System.out.print("Bild nicht gefunden");
        }
        return null;
    }

    public static ArrayList<String> ladeTXT(String quelle) throws IOException {

        BufferedReader stdin;
        try {
            stdin = new BufferedReader(new FileReader(WindowProperties.class.getClassLoader().getResource(quelle).toString().substring(6)));
            ArrayList<String> dokument = new ArrayList();
            while (stdin.ready()) {
                dokument.add(stdin.readLine());
            }
            return dokument;

        } catch (FileNotFoundException ex) {
            System.err.print("Textdatei nicht gefunden");
        } catch (NullPointerException ex) {
            System.err.print("Textdatei nicht gefunden");
        }
        return null;

    }

}
