/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dia1;

/**
 *
 * @author gamar
 */
public class Calculadora1 {
    public static void main(String args[]){
        int a = 1;
        int b = 0;
        char op = '/';
        System.out.print("El resultado es : ");
        if ( op == '+' ) {
            System.out.println( a + b);
        } else if ( op == '-') {
            System.out.println( a - b);
        } else if ( op == '*') {
            System.out.println( a * b);
        } else if ( op == '/') {
            System.out.println( a / b);
        }
   }

}
