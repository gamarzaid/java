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
public class Tablas {
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        int numero,i,j;
 
        System.out.print("Hasta qué tabla quieres ver?: ");
        numero = leer.nextInt();
 
        for(i = 1; i<=numero; i++)
        {
            for(j = 1; j <= 10; j++)
            {
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }
    }

}
