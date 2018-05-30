/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dia3;
import java.util.ArrayList;
/**
 *
 * @author gamar
 */
public class ArrayL {
    public static void main(String[] args) {
        // Declaración de un ArrayL de "String". Puede ser de cualquier otro Elemento u Objeto (float, Boolean, Object, ...)
        ArrayList<String> nombreArrayList = new ArrayList<String>();
        // Añade el elemento al ArrayL
        nombreArrayList.add("Elemento");
        // Añade el elemento al ArrayL en la posición 'n'
        //nombreArrayList.add(n, "Elemento 2");
        // Devuelve el numero de elementos del ArrayL
        nombreArrayList.size();
        // Devuelve el elemento que esta en la posición '2' del ArrayL
        nombreArrayList.get(2);
        // Comprueba se existe del elemento ('Elemento') que se le pasa como parametro
        nombreArrayList.contains("Elemento");
        // Devuelve la posición de la primera ocurrencia ('Elemento') en el ArrayL  
        nombreArrayList.indexOf("Elemento");
        // Devuelve la posición de la última ocurrencia ('Elemento') en el ArrayL   
        nombreArrayList.lastIndexOf("Elemento");
        // Borra el elemento de la posición '5' del ArrayL   
        nombreArrayList.remove(5); 
        // Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.  
        nombreArrayList.remove("Elemento");
        //Borra todos los elementos de ArrayL   
        nombreArrayList.clear();
        // Devuelve True si el ArrayL esta vacio. Sino Devuelve False   
        nombreArrayList.isEmpty();  
        // Copiar un ArrayL 
        ArrayList arrayListCopia = (ArrayList) nombreArrayList.clone();  
        // Pasa el ArrayL a un Array 
        Object[] array = nombreArrayList.toArray();   
            }

}
