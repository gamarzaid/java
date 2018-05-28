/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dia1;
import java.util.Scanner;
/**
 *
 * @author gamar
 */
public class Promedio {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        double calificacion, promedio, suma=0;
        int contador=0;
        while(contador<3){
            System.out.print("Ingresa la calificación: ");
            calificacion = leer.nextDouble();
            suma = suma + calificacion;
            contador = contador + 1;
        }
        promedio = suma/contador;
        System.out.println("El promedio es: " + promedio);
   }

}
