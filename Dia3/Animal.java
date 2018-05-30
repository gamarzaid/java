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
public class Animal {
    public int numPatas;
    public String especie, nombre;

    public Animal() {
        this.numPatas = 0;
        this.especie = "Sin especie";
        this.nombre = "Sin nombre";
    }

    @Override
    public String toString() {
        return "Animal{" + "numPatas=" + numPatas + ", especie=" + especie + ", nombre=" + nombre + '}';
    }
    
}
