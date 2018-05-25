/**
 * Programa con uso de la sentencia if
 * El programa solicita la edad, si mayor o igual de 60 años indica que es de la tercera edad
 * Si es mayor o igual a 18 indica que es mayor de edad
 * En caso contratio indica que es menor de edad
 */

package Dia1;
import java.util.Scanner;
/**
 *
 * @author gamar
 */
public class if1 {
    public static void main(String[] args) {
        System.out.print("Ingresa tu edad: ");
            int edad;
            Scanner leer = new Scanner(System.in);
            edad = leer.nextInt();

            if (edad >=60){
                System.out.println("Eres de la tercera de edad");
            }else if (edad >=18){
                System.out.println("Eres mayor de edad");
            }else{
                System.out.println("Aún eres menor de edad");
            }
    }
}
