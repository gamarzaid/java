/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dia2;

/**
 *
 * @author gamar
 */
public class Substring {
    public static void main(String[] args) {
        String s = "Esto Es Una Cadena de caracteres";
        String s1 = s.substring(0,7);
        String s2 = s.substring(8,11);
        // toma desde el caracter 8 hasta el ﬁnal
        String s3 = s.substring(8);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
