/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelCanvas;

import java.awt.Color;

/**
 *
 * @author basisa02
 */
public class Bola {

    private int posisiX;
    private int posisiY;
    private int diameter;
    private Color color;

    public Bola(int posisiX, int posisiY, int diameter, Color color) {
        this.posisiX = posisiX;
        this.posisiY = posisiY;
        this.diameter = diameter;
        this.color = color;
    }

    public Bola() {
    }

    public Bola(int posisiX, int posisiY, int diameter) {
        this.posisiX = posisiX;
        this.posisiY = posisiY;
        this.diameter = diameter;
    }

    /**
     * @return the posisiX
     */
    public int getPosisiX() {
        return posisiX;
    }

    /**
     * @param posisiX the posisiX to set
     */
    public void setPosisiX(int posisiX) {
        this.posisiX = posisiX;
    }

    /**
     * @return the posisiY
     */
    public int getPosisiY() {
        return posisiY;
    }

    /**
     * @param posisiY the posisiY to set
     */
    public void setPosisiY(int posisiY) {
        this.posisiY = posisiY;
    }

    /**
     * @return the diameter
     */
    public int getDiameter() {
        return diameter;
    }

    /**
     * @param diameter the diameter to set
     */
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }
}
