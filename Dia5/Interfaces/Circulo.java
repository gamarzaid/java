/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dia5.Interfaces;
import java.lang.Math;
/**
 *
 * @author gamar
 */
public class Circulo implements Figura{
    
    private double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }

    public double area(){
        return Math.PI*radio*radio;
    }
    
    
}
