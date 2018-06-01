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
public class MainCoordenadas {
    public static void main(String[] args) {
        Punto2D punto1 = new Punto2D();//Estamos haciendo referencia al constructor que no recibe parametros
        Punto2D punto2 = new Punto2D(1.2,6);//Estamos haciendo referencia al constructor que sí recibe parametros
        System.out.println(punto2);
        punto1.setX(7);
        System.out.println(punto1);
        
        Punto3D punto3 = new Punto3D();
        Punto3D punto4 = new Punto3D(1,2,3);
        Punto3D punto5 = new Punto3D(punto2,5);
        System.out.println(punto3);
        System.out.println(punto4);
        System.out.println(punto5);
        
    }
}
