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

public class Sprite {
    private int xPosition, yPosition;
    private int xVelocity, yVelocity;
    private int width, height;
    private Color colour;
    
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
    
}
