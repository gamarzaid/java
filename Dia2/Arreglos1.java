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
public class Arreglos1 {
    public static void main(String[] args) {
        int[] arreglo = new int[5];
        arreglo[0] = 17;
        arreglo[1] = 20;
        arreglo[2] = 18;
        arreglo[3] = 33;
        arreglo[4] = 24;

        for(int i = 0; i < 5; i++){
            System.out.println("Indice " + i + " con edad de: " + arreglo[i]);
        }
        
    }
}
