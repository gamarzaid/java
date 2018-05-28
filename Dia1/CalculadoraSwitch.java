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
public class CalculadoraSwitch {
    public static void main(String[] args) {

    	char operador;
    	Double numero1, numero2, resultado;
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Ingresa el operador (+, -, *, /): ");
    	operador = scanner.next().charAt(0);
    	System.out.println("Ingresa los dos valores: ");
    	numero1 = scanner.nextDouble();
    	numero2 = scanner.nextDouble();
    	
    	switch (operador) {
         case '+':
           resultado = numero1 + numero2;
    	   System.out.print(numero1 + "+" + numero2 + " = " + resultado);
           break;

         case '-':
           resultado = numero1 - numero2;
           System.out.print(numero1 + "-" + numero2 + " = " + resultado);
           break;

         case '*':
           resultado = numero1 * numero2;
           System.out.print(numero1 + "*" + numero2 + " = " + resultado);
           break;

         case '/':
           resultado = numero1 / numero2;
           System.out.print(numero1 + "/" + numero2 + " = " + resultado);
           break;

         default: 
           System.out.println("Operador inválido!");
           break;
        }       
    }

}
