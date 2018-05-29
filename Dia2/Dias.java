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
public class Dias {
    public static void main(String[] args) {
        String dias[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un dia de la semana (número): ");
        int v = leer.nextInt();
        if( v <= dias.length )
        {
           // recordemos que los arrays se numeran desde cero
           System.out.println( dias[v-1] );
        }
        else
        {
           System.out.println("Dia incorrecto...");
        }
    }
}
