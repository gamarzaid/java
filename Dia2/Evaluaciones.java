/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dia2;
import java.util.Scanner;

/**
 *
 * @author gamar
 */
public class Evaluaciones {
    public static void main(String[] args) {
        String nombre;
        double[] calif;
        double suma = 0.0;
        double promedio = 0.0;
        int num_calif = 0;
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Nombre del alumno: ");
        nombre = leer.nextLine();
        System.out.print("Número de calificaciones: ");
        num_calif = leer.nextInt();
        calif = new double[num_calif];
        
        for (int i = 0; i < calif.length; i++) {
            System.out.print("Ingresa la calificación " + (i+1) + ": ");
            calif[i] = leer.nextDouble();
        }
        System.out.print("Las calificaciones de " + nombre + " son: ");
        for (int i = 0; i < calif.length; i++) {
            double j = calif[i];
            suma += calif[i];
            System.out.print(j + "  ");
        }
        System.out.println("");
        promedio = suma/calif.length;
        System.out.println("El promedio final de " + nombre + " es: "+promedio);
    }

}
