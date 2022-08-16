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
   import java.awt.Graphics;
   import java.awt.Graphics2D;
   import java.awt.Stroke;
   import java.awt.BasicStroke; 






public class PongPanel extends JPanel implements ActionListener, KeyListener {
    //test test
   
    private final static Color BACKGROUND_COLOUR = Color.BLACK;
    private final static int TIMER_DELAY = 5;
    
    
    
    Ball ball; //ads a Ball variable to the Pong class
    
    boolean gameInitialised = false;  // a bollean which will be set to truewhen the game "starts"
    
    
    private void paintDottedLine(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
        g2d.setStroke(dashed);
        g2d.setPaint(Color.WHITE);
        g2d.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
        g2d.dispose();
        
        }
        // paints dotted line
    
    public PongPanel() {
       
          setBackground(BACKGROUND_COLOUR);
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
      
      
      private void update() {
          if(!gameInitialised) {
              createObjects();   // SOMETHING IS WRONG HERE!!! No such method exists yet!
              gameInitialised = true;
          }
          
      }
      
      
      @Override
      public void actionPerformed(ActionEvent event) {
          update();
          repaint();   //method to update the graphics, comes from java.awt package
      }
      
      @Override
      public void paintComponent(Graphics g) {
          super.paintComponent(g);
          paintDottedLine(g);
          
          //g.setColor(Color.WHITE);  nepotrebno jer samo testira da li crta
          //g.fillRect(20,20,100,100);
      }
      
      private void paintSprite(Graphics g, Sprite sprite) {
                g.setColor(sprite.getColour());
                g.fillRect(sprite.getxPosition(), sprite.getyPosition(), sprite.getWidth(), sprite.getHeight());
      }
    
    
}
