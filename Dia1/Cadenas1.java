/**
 * Programa que compara el contenido de dos cadenas
 * Con == y con equals()
 */

package Dia1;
import java.util.Scanner;
/**
 *
 * @author gamar
 */
public class Cadenas1 {
    public static void main(String[] args) {
        String cadena1, cadena2;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa la primera palabra: ");
        cadena1 = leer.next();
        System.out.print("Ingresa la segunda palabra: ");
        cadena2 = leer.next();
        
        //Usando equals()
        if(cadena1.equals(cadena2)){
            System.out.println("Las palabras son iguales usando equals()");
        }else{
            System.out.println("Las palabras son diferentes usando equals()");
        }
        
        //Usando ==
        if(cadena1  == cadena2){
            System.out.println("Las palabras son iguales usando ==");
        }else{
            System.out.println("Las palabras son diferentes usando ==");
        }   
    }
}
