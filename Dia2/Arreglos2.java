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
public class Arreglos2 {
    public static void main(String[] args) {
        int mayor = 0;
        int menor = 0;
        int suma = 0;
        double promedio = 0.0;
        int[] arreglo1 = new int[5];
        arreglo1[0] = 2;
        arreglo1[1] = 4;
        arreglo1[2] = 6;
        arreglo1[3] = 8;
        arreglo1[4] = 10;
        int[] arreglo2 = {0,1,2,3,4};
        
        System.out.println(arreglo1.length);
        System.out.println(arreglo2.length);
        
        
        //Recorremos el arreglo1
        for (int i = 0; i < arreglo1.length; i++) {
            int j = arreglo1[i];
            System.out.print(j);
        }
        System.out.println("");
        //Recorremos el arreglo2
        for (int i = 0; i < arreglo2.length; i++) {
            int j = arreglo2[i];
            System.out.print(j);
        }
        System.out.println("");
        
        //Buscando el mayor del arreglo1
        for (int i = 0; i < arreglo1.length; i++) {
            if(arreglo1[i] > mayor){
                mayor = arreglo1[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);
        
        //Buscando el menor del arreglo2
        for (int i = 0; i < arreglo2.length; i++) {
            if(arreglo2[i] < menor){
                menor = arreglo2[i];
            }
        }
        System.out.println("El número menor es: " + menor);
       
        //Obteniendo el promedio del arreglo1
        for (int i = 0; i < arreglo1.length; i++) {
            suma += arreglo1[i]; 
        }
        promedio = suma/arreglo1.length;
        System.out.println("El promedio de los elementos del arreglo 1 es: " + promedio);
    }

}
