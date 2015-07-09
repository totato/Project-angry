package gui;

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

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

/**
 *
 * @author Drei Leute die nichts besseres zu tun haben
 */
public abstract class WindowProperties {

    private static Clip clip;
    public static Clip clipLaun;
    public static Clip clipGame;
    public static Clip clipSkill;
    public static Clip clipShop;

    public String[] words;
    public String[] saveData;
    public static String language = "EN";

    /*
     Fügt Hintergrundmusik ein. Das abgespielte Lied muss unter dem Pfad 
     "proj_1/exSound/" zu finden sin. Der Name des Lieds wird, mit 
     Dateianhang, in die Methode mit eingegeben.   
     */
    public static void loadMusic() throws LineUnavailableException {
        clipLaun = AudioSystem.getClip();
        clipGame = AudioSystem.getClip();
        clipSkill = AudioSystem.getClip();
        clipShop = AudioSystem.getClip();
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(WindowProperties.class.getClassLoader().getResource("exSound/titleSong.wav"));
            System.out.println("*Musik-Laun geladen*");
            clipLaun.open(audio);

            audio = AudioSystem.getAudioInputStream(WindowProperties.class.getClassLoader().getResource("exSound/Mars.wav"));
            System.out.println("*Musik-Skill geladen*");
            clipSkill.open(audio);

            audio = AudioSystem.getAudioInputStream(WindowProperties.class.getClassLoader().getResource("exSound/Desertroad.wav")); //TODO: Richtige Datei einsetzen
            System.out.println("*Musik-Shop geladen*");
            clipShop.open(audio);

            audio = AudioSystem.getAudioInputStream(WindowProperties.class.getClassLoader().getResource("exSound/dont_look_back.wav")); //TODO: Richtige Datei einsetzen
            System.out.println("*Musik-Spiel geladen*");
            clipGame.open(audio);
        } catch (UnsupportedAudioFileException uae) {
            System.out.println(uae);
        } catch (IOException ioe) {
            System.out.println(ioe);
        } catch (LineUnavailableException lua) {
            System.out.println(lua);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae);
        }
        System.out.println("Alle Musikdateien geladen.");
    }

    public static void backgroundMusic(Clip clipActual) throws LineUnavailableException {
        clip = clipActual;
        System.out.println("*Musik spielt*");
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
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
    
    public static void resetClip(Clip clipRes) throws LineUnavailableException {
    try {
        
    clip.setMicrosecondPosition(0);
    clipRes.setMicrosecondPosition(0);
    } catch(NullPointerException npe) {
            System.out.println(npe);
        }
}

    public static List<BufferedImage> ladeBildliste(String pfad) throws IOException {
        List<String> bilderTXT = WindowProperties.ladeTXT(pfad);
        List<BufferedImage> bilder = new ArrayList();
        for (String bildPfad : bilderTXT) {
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

    
  

    public static void setShortKeys(JLabel label, JButton button, final String card, int sign) {
        if (button == null) {
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
        } else if (label == null) {
            button.getInputMap(button.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(sign, 0), "x");
            button.getActionMap().put("x", new AbstractAction() {
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
            System.err.print("Textdatei nicht gefunden "+ ex.getLocalizedMessage());
            stdin = new BufferedReader(new FileReader("\\"+WindowProperties.class.getClassLoader().getResource(quelle).toString().substring(6)));
            ArrayList<String> dokument = new ArrayList();
            while (stdin.ready()) {
                dokument.add(stdin.readLine());
            }
            return dokument;
        } catch (NullPointerException ex) {
            System.err.print("Textdatei nicht gefunden " + ex.getLocalizedMessage());
        }
        return null;

    }

}
