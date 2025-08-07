/**
 * Dastekin created on 07.08.2025 the SwingObserver-Class inside the package - com.zelkulon.entwurfsmuster.observer.swing
 */
package com.zelkulon.entwurfsmuster.observer.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserver {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserver beispiel = new SwingObserver();
        beispiel.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Soll ich es tun?");
        button.addActionListener(new EngelListener());
        button.addActionListener(new TeufelListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);

        // Frame-Properties setzen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    class EngelListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println("Tu es nicht, du knntest es bereuen!");
        }
    }

    class TeufelListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println("Los, mach es!");
        }
    }

}
