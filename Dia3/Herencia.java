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
public class Herencia {
    public static void main(String[] args) {
        Animal[] jaula = new Animal[5];
        Tigre tigre1 = new Tigre("Tono", 4, "Blanco");
        Pato pato1 = new Pato("Donald", 2);
        
        tigre1.setColor("Naranja");

        jaula[0] = tigre1;
        jaula[1] = pato1;

        System.out.println(jaula[0].nombre);
        System.out.println(jaula[1].nombre);
        System.out.println(tigre1.toString() + tigre1.getColor());
        System.out.println(pato1.toString());
    }
}
