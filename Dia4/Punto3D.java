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
public class Punto3D extends Punto2D{
    private double z;
    
    public Punto3D(){
        super();
        this.z = 0.0;
    }
    
    public Punto3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }
    
    public Punto3D(Punto2D punto2D, double z){
        super(punto2D.getX(), punto2D.getY());
        this.z = z;
    }

    @Override
    public String toString() {
        //Coordenadas punto2D = new Punto2D();
        return "Punto3D { x= " + Punto3D.super.getX() + " y= " + Punto3D.super.getY() + " z= "+ this.z + "}";
    }
    
    
    
    

}
