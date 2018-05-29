/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dia2;

/**
 *
 * @author gamar
 */
public class Cadenas3 {
    public static void main(String []args){
        //Formas de declarar una cadena
        String cad1 = "Perro";
        String cad2 = new String("Chilaquil");
        String cad3 = "Gato";

        //Si a = b regresa 0
        //Si a < b regresa negativo
        //Si a > b regresa positivo

        int resultado = cad1.compareTo(cad3);
        System.out.println(resultado);

    }

}
