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
public class Pato extends Animal {

    public Pato(){
        this.nombre = "";
        this.numPatas = 0;
        this.especie = "Ave";
    }

    public Pato(String nombre, int numPatas){
        this.nombre = nombre;
        this.numPatas = numPatas;
        this.especie = "Aves";
    }
}
