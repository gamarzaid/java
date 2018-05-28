package Dia1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author gamar
 */
public class PideDatos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad = 0;
        System.out.print("Ingresa tu nombre: ");
        nombre = leer.nextLine();
        System.out.print("Ingresa tu edad: ");
        edad = leer.nextInt();
        System.out.println("Hola " + nombre + " tu edad es de " + edad + " años.");
    }
}
