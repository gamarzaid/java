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
public class Tigre extends Animal {
    private String color;

    public Tigre(){
        this.nombre = "Sin nombre";
        this.numPatas = 0;
        this.especie = "Felinos";
        this.color = "Sin color";
    }

    public Tigre(String nombre, int numPatas, String color){
        this.nombre = nombre;
        this.numPatas = numPatas;
        this.especie = "Tigre";
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    

}
