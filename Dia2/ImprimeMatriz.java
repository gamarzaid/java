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
public class ImprimeMatriz {
    public static void main(String[] args) {
        int[][] matriz= new int[3][3];		
        matriz[0][0] = 2;
        matriz[0][1] = 4;
        matriz[0][2] = 4;
        matriz[1][0] = 6;
        matriz[1][1] = 6;
        matriz[1][2] = 9;
        matriz[2][0] = 8;
        matriz[2][1] = 10;
        matriz[2][2] = 1;
        
        for(int r = 0; r < 3; r++){
            for(int c = 0; c < 3; c++){
                System.out.print(matriz[r][c]);
                if(c != matriz[r].length-1) 
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
