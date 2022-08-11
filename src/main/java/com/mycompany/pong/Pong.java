/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pong;

/**
 *
 * @author smrki
 */

import javax.swing.JFrame;

public class Pong extends JFrame{
    
        private final static String WINDOW_TITLE = "Pong";
        private final static int  WINDOW_WIDTH = 800;
        private final static int WINDOW_HEIGHT = 600;
    public Pong() {
        setTitle("Game of Pong");
        setSize(800,600);
        setResizable(false);
        add(new PongPanel());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Pong();
            }
        });
        
        //System.out.println("Hello World!");
        // TEST TEST TEST
        
        
        
    }
}
