/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dia5.Abstactas;
import java.lang.Math;
/**
 *
 * @author gamar
 */
public class Circulo extends Figura{
    private double radio;
    
    public Circulo(double x, double y, double radio){
        super(x,y);
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double area(){
        return Math.PI*radio*radio;
    }
    
    
}
