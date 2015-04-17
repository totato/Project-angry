/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Vika & Antonio
 */
public class SetLanguage extends Cutscenes {

    private JFrame frame;
    public static String language;

    public void SetLanguage() {
        frame = new JFrame("");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());

        frame.setResizable(false);
        frame.setDefaultCloseOperation(3);
        frame.setLocationRelativeTo(null);

        setIconPicture(frame, "20941.png");

        JButton deutschButton = new JButton("Deutsch");
        deutschButton.setBackground(Color.BLACK);
        deutschButton.setForeground(Color.WHITE);
        deutschButton.setPreferredSize(new java.awt.Dimension(90, 50));
        deutschButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                language = "DE";
                Launcher l = new Launcher();
                l.Launcher();
                frame.setVisible(false);
                System.out.println("Sprachfenster wird unsichtbar");
            }
        });
        contentPane.add(deutschButton, BorderLayout.EAST);

        JButton englishButton = new JButton("English");
        englishButton.setBackground(Color.BLACK);
        englishButton.setForeground(Color.WHITE);
        englishButton.setPreferredSize(new java.awt.Dimension(90, 50));
        //setButtonBackground(englishButton, "buttonEN.jpg");
        englishButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                language = "EN";
                Launcher l = new Launcher();
                l.Launcher();
                frame.setVisible(false);
                System.out.println("Sprachfenster wird unsichtbar");
            }
        });
        contentPane.add(englishButton, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

}
