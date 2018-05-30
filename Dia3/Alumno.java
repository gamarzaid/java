/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dia3;

/**
 *
 * @author gamar
 */
public class Alumno {
    private int numeroTareas;
    private String nombre;
    private double calificacion = 10.0;
    
    public Alumno(String nombre, int numeroTareas){
    	this.nombre = nombre;
    	this.numeroTareas = numeroTareas;
    }
    
    public int getNumeroTareas(){
    	return numeroTareas;
    }
    
    public String getNombre(){
    	return nombre;
    }
    
    public double getCalificacion(){
    	return calificacion;
    }
    
    public void setCalificacion(double nuevaCalificacion){
    	calificacion = nuevaCalificacion;
    }
    
    @Override
    public String toString(){
    	return "Nombre: "+nombre+"\nTareas entregadas: "+numeroTareas+"\nCalificacion: "+calificacion;
    }
}
