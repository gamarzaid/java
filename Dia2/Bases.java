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
public class Bases {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese un valor entero: ");
        int v = leer.nextInt();

        System.out.println("Valor Ingresado: "+v);
        System.out.println("binario = "+Integer.toBinaryString(v));
        System.out.println("octal = "+Integer.toOctalString(v));
        System.out.println("hexadecimal = "+Integer.toHexString(v));
    }
}
