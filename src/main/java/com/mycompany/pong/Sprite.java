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
import java.awt.Rectangle;

public class Sprite {
    private int xPosition, yPosition;
    private int xVelocity, yVelocity;
    private int width, height;
    private Color colour;
    
    private int initialxPosition;
    private int initialyPosition;
    
    public int getxPosition() {
        return xPosition;
    }
    public int getyPosition() {
        return yPosition;
    }
    
    public int getxVelocity() {
        return xVelocity;
    }
    public int getyVelocity() {
        return yVelocity;
    }
    
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    
    public Color getColour() {
        return colour;
    }
    
    
    
    
    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }
    
    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }
    
    
    public void setxVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }
    
    public void setyVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }
    
    
    public void setWidth(int Width) {
        this.width = Width;
    }
    public void setHeight(int Height) {
        this.height = Height;
    }
    
    public void setColour(Color colour) {
        this.colour = colour; 
    }
    
    
    public void setInitialPosition(int initialxPosition, int initialyPosition) {
        initialxPosition = initialX;
        initialyPosition = initialY;
    
    }
    
    public void setxPosition(int newX, int panelWidth) {
     xPosition = newX;
     if(xPosition < 0) {
         xPosition = 0;
     }
     else if (xPosition + width > panelWidth) {
         xPosition = panelWidth - width;
     }
       
     }
    public void setyPosition(int newY, int panelHeight) {
     yPosition = newY;
     if(yPosition < 0) {
         yPosition = 0;
     }
     else if (yPosition + height > panelHeight) {
         yPosition = panelHeight - height;
     }
    }
    
     public void resetToInitialPosition() {
      setxPosition(initialxPosition);
       setyPosition(initialyPosition);
     }
    
    public Rectangle getRectangle() {
         return new Rectangle(getxPosition(), getyPosition(), getWidth(), getHeight());
     }
}
