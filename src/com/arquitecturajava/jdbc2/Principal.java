package com.arquitecturajava.jdbc2;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Principal {
    
    public static void main(String[] args) {
        


        JFrame frame = new JFrame("Hello World Java Swing");

        // set frame site
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b = new JButton("pulsame");
       
        b.addActionListener(new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                OrdenadorAR o= new OrdenadorAR(100, "nuevo", 200);
                o.insertar();
                JOptionPane.showMessageDialog(null, "hemos insertado");
            }
        });

        // add JLabel to JFrame
        frame.getContentPane().add(b);

        // display it
        frame.pack();
        frame.setVisible(true);

    }
}
