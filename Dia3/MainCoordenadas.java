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
public class MainCoordenadas {
    public static void main(String[] args) {
        Coordenadas punto1 = new Coordenadas();//Estamos haciendo referencia al constructor que no recibe parametros
        Coordenadas punto2 = new Coordenadas(1.2,6);//Estamos haciendo referencia al constructor que sí recibe parametros
        System.out.println(punto2);
        punto1.setX(7);
        System.out.println(punto1);
        
    }
}
