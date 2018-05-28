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
public class ComparaTres {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int a,b,c;
       System.out.println("Dame el valor de tres números enteros: ");
       a = leer.nextInt();
       b = leer.nextInt();
       c = leer.nextInt();
       
       if(a >= b && a >= c)
       {
           System.out.println("El mayor es " + a);
       }
    }

}
