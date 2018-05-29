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
public class ArregloBidimensional {
    public static void main(String[] args) {
        int [][] arreglo = new int[4][5];
        for(int r = 0; r < 4; r++){
            for(int c = 0; c < 5; c++){
                arreglo[r][c]=1;
            }
        }
        for(int r = 0; r < 4; r++){
            for(int c = 0; c < 5; c++){
                System.out.print(arreglo[r][c]);
            }
            System.out.println();
        }
    }
}
