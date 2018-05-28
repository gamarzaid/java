/**
 * Programa con uso de la sentencia if
 * El programa solicita el peso y la estatura, si pesa más de 50 kilos y mide más 1.50 o si tiene pase VIP puede pasar
 * En caso contratio indica que no puede pasar
 */

package Dia1;
import java.util.Scanner;
/**
 *
 * @author gamar
 */
public class if2 {
    public static void main(String[] args) {
        int peso;
        float altura;
        String vip = "";

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa tu estatura: ");
        altura = leer.nextFloat();

        System.out.print("Ingresa también tu peso: ");
        peso = leer.nextInt();

        System.out.print("¿Tienes pase VIP (s/n)?: ");
        vip = leer.next();

        if((altura > 1.50 && peso > 50) || vip.equals("s")){
            System.out.println("Adelante, diviértete!!!!");
        }else{
            System.out.println("Lo siento, no puedes entrar!!!!");
        }
    }
}
