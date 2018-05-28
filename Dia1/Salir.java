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
public class Salir {
     public static void main(String[] args){
        String salida;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("¿quieres salir del programa? (Si/No): ");
            salida = leer.next();
        }while(!salida.equalsIgnoreCase("Si"));
    }
}
