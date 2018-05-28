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
public class MenuWhile {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        int opcion=0;
        do{
            System.out.println("MENU DE OPCIONES\n1.-Suma\n2.-Resta\n3.-Multiplicación\n4.-División\n5.-Salir");
            System.out.println("¿Qué opción eliges?: ");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Estás sumando...");
                    break;
                case 2:
                    System.out.println("Estás restando...");
                    break;
                case 3:
                    System.out.println("Estás multiplicando...");
                    break;
                case 4:
                    System.out.println("Estás dividiendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }while(opcion!=5);
    }
}
