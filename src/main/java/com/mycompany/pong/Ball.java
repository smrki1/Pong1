/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pong;

/**
 *
 * @author sashamrkailo
 */

import java.awt.Color;

public class Ball extends Sprite {
    private final static Color BALL_COLOUR = Color.WHITE;
    private final static int BALL_WIDTH = 25;
    private final static int BALL_HEIGHT= 25;
    
    
    public Ball(int panelWidth, int panelHeight) {
        setWidth(BALL_WIDTH);  // THES ET METHODS ALLOW use ofthe BALL_COLOUR BALL_WIDTH and BALL_HEIGHT while keeping them private final
        setHeight(BALL_HEIGHT);
        setColour(BALL_COLOUR);
        setInitialPosition(panelWidth / 2 - (getWidth() / 2), panelHeight / 2 - (getHeight() / 2));
        resetToInitialPosition();
    }
    
    
    
    
}
