/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dia5.Abstactas;

/**
 *
 * @author gamar
 */
public abstract class Figura {
    //Posición en el plano
    protected double x;
    protected double y;
    
    public Figura(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public abstract double area();
    
}
