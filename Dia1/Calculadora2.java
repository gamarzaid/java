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
public class Calculadora2 {
    public static void main(String args[]){
        int a = 1;
        int b = 1;
        char op = 'p';
        System.out.print("El resultado es : ");
        switch ( op ) {
        case '+':
             System.out.println( a + b );
             break;
        case '-':
             System.out.println( a - b );
             break;
        case '*':
             System.out.println( a * b );
             break;
        case '/':
             System.out.println( a / b );
             break;
        default:
             System.out.println("error" );
             break;
        }
   }

}
