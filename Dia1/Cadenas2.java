/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dia1;

/**
 *
 * @author gamar
 */
public class Cadenas2 {
    public static void main(String[] args) {
        
        String cadena = "Ricky Riquin Canallin";
        
        System.out.println(cadena.charAt(0)); // Nos devolvera R

        System.out.println(cadena.charAt(11)); //Nos devolvera n

        System.out.println(cadena.endsWith("n")); //Nos devuelve true

        System.out.println(cadena.startsWith("e")); //Nos devuelve false, Java distingue entre mayusculas y minusculas

        System.out.println(cadena.equals("Ricky Riquin Canallin")); //Nos devuelve true

        byte[] array_bytes=cadena.getBytes(); //Creamos un array de bytes e insertamos la devolucion del método

        System.out.println("Codigo ASCII de cada caracter");

        for (int i=0;i<array_bytes.length;i++){
            System.out.print(array_bytes[i]+" "); //Muestra los codigos
        }
        System.out.println("");
        
        System.out.println(cadena.indexOf("Riquin")); //localiza la posicion en donde empieza "Riquin"

        System.out.println(cadena.length()); // Nos devuelve la longitud: 77

        System.out.println(cadena.replace('i', 'o')); // Cambia todas las i por o

        System.out.println(cadena.toLowerCase()); //Transforma el String a minusculas

        System.out.println(cadena.toUpperCase()); //Transforma el String a mayusculas
		
    }

}
