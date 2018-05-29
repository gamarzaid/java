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
public class ArregloCadenas {
    public static void main(String[] args) {
        int [] arreglo = new int[5];
        arreglo[0] = 17;
        arreglo[1] = 20;
        arreglo[2] = 18;
        arreglo[3] = 33;
        arreglo[4] = 24;

        String [] arreglo2 = new String[5];
        arreglo2[0] = "Gamar";
        arreglo2[1] = "Zaid";
        arreglo2[2] = "Joseph";
        arreglo2[3] = "Juan";
        arreglo2[4] = "Pedro";

        for(int i = 0; i < arreglo.length; i++){
            System.out.println(arreglo2[i] + " tienes una edad de " + arreglo[i] + " años.");
        }
    }

}
