/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dia4;

/**
 *
 * @author gamar
 */
public class TryCatch {
    public static void main(String[] args) {
        try{
            int numero1, numero2;
            numero1 = 10;
            numero2 = 0;
            numero1 = numero1/numero2;
            int[] array = new int[10];
            array[20] = 6;
        }
        catch(ArithmeticException e){
            //e.printStackTrace();
            System.out.println("No se permite división entre cero.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Estás fuera del índice del arreglo.");
        }
        finally{
            System.out.println("Este bloque siempre se ejecuta.");
        }
    }

}
