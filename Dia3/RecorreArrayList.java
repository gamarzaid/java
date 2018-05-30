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
public class RecorreArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Victor");
        al.add("Luis");
        al.add("Elena");
        //al.add(1, "Juan");
        // Copiar un ArrayL 
        for(int i=0; i < al.size(); i++){
            System.out.println(al.get(i));
        }
    }
}
