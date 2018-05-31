/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dia4;

/**
 *
 * @author gamar
 */
public class Coordenadas {
    private double x;
    private double y;    

    public Coordenadas() {
        x = 0.0;
        y = 0.0;
    }
    
    public Coordenadas(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordenadas{" + "x=" + x + ", y=" + y + '}';
    }
    
}
