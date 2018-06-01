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
public class Escuela {
    public static void main(String[] args) {
        Profesor profe = new Profesor();
        System.out.println("El promedio es: "+ profe.calificar(5,4,6));

        Alumno alumno = new Alumno("Juanito", 6);

        System.out.println(alumno.toString());
        profe.calificarAlumno(alumno);
    }
}
