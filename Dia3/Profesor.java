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
public class Profesor {
    String nombre;
    String asignatura;
    String grupo;
    
    //Mètodo constructor
    public Profesor(){
        nombre = "";
        asignatura = "";
        grupo = "";
    }
    
    public Profesor(String nombre, String asignatura, String grupo){
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.grupo = grupo;
    }
    
    public double calificar(double a, double b, double c){
        double promedio=(a+b+c)/3;
        return promedio;
    }
    
    public void calificarAlumno(Alumno alumno){
        if (alumno.getNumeroTareas() <= 5){
            System.out.println("El alumno " + alumno.getNombre() + " va a reprobar");
            alumno.setCalificacion(5.0);
            System.out.println("El alumno " + alumno.getNombre() + " esta reprobado");
        }else{
            alumno.setCalificacion(10.0);
            System.out.println("¡Felicidades! El alumno "+alumno.getNombre()+" ha aprobado");
        }
    }
}
