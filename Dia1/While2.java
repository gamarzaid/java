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
public class While2 {
    public static void main(String[] args){
        int numero = 1;
        //Con un while imprimimos mientras numero sea menor que 11
        while (numero < 11)
        {
             System.out.println("Número: " + numero);
             numero++;
        }
        //Con un do...while imprimimos mientras numero sea mayor que 1
        do {
             System.out.println("Número: " + --numero);;
        } while(numero > 1);
    }

}
