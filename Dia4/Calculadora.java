/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dia4;
import java.util.Scanner;
/**
 *
 * @author gamar
 */

public class Calculadora{
	public static void main(String []args){
            Scanner leer = new Scanner(System.in);
            double num1, num2;
            Operaciones o = new Operaciones();

            try{
                System.out.print("Ingresa el primer valor: ");
                num1 = leer.nextDouble();
                System.out.print("Ingresa el segundo valor: ");
                num2 = leer.nextDouble();
                o.setNumero1(num1);
                o.setNumero2(num2);
                
                num1 = o.getNumero1();
                num2 = o.getNumero2();

                System.out.println("La suma es: "+ o.Suma(num1,num2));
                System.out.println("La resta es: "+ o.Resta(num1,num2));
                System.out.println("La multiplicacion es: "+ o.Multiplicacion(num1,num2));
                System.out.println("La division es: "+ o.Division(num1,num2));
                
            }catch(Exception e){
                System.out.print("Ingresa valores numericos!!!");
            }           
	}
}
