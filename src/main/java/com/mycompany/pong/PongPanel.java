/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pong;

/**
 *
 * @author smrki
 */

import java.awt.Color;
   import java.awt.event.ActionEvent;
   import java.awt.event.ActionListener;
   import java.awt.event.KeyEvent;
   import java.awt.event.KeyListener;
   import javax.swing.JPanel;
   import javax.swing.Timer;
public class PongPanel extends JPanel implements ActionListener, KeyListener {
    //test test
   
    private final static Color BACKGROUND_COLOR = Color.BLACK;
    private final static int TIMER_DELAY = 5;
    public PongPanel() {
       
          setBackground(BACKGROUND_COLOR);
          Timer timer = new Timer(TIMER_DELAY,this);
            timer.start();
          
          
      }
  
      @Override
      public void keyPressed(KeyEvent event) {
      }
  
      @Override
      public void keyReleased(KeyEvent event) {
      }
  
      @Override
      public void keyTyped(KeyEvent event) {
      }
  
      @Override
      public void actionPerformed(ActionEvent event) {
      } 
    
    
    
    
    
    
}
