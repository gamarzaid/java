/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dia3;

/**
 *
 * @author gamar
 */
public class Calculadora {
    public static void main(String[] args) {
        Operaciones o = new Operaciones();
        o.setNumero1(4.0);
        o.setNumero2(5.0);
        double num1 = o.getNumero1();
        double num2 = o.getNumero2();
        System.out.println("La suma es"+ o.Suma(num1,num2));
        System.out.println("La resta es: "+ o.Resta(num1,num2));
        System.out.println("La multiplicacion es: "+ o.Multiplicacion(num1,num2));
        System.out.println("La division es: "+ o.Division(num1,num2));
    }
}
