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
public class Cuadrado extends Figura {
    private double lado;
    
    public Cuadrado(double x, double y, double lado){
        super(x,y);
        this.lado = lado;
    }
    
    public double area(){
        return lado*lado;
    }
}
