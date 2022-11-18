/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas;
import java.util.Stack;
import pilas.ADT;

/**
 *
 * @author OmarA
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ADT adt = new ADT();
        
        adt.push("Angela");
        adt.push("Diego");
        adt.push("Juan");
        System.out.println(adt);
        adt.push("Diana");
        System.out.println("\nEl tamaño de la pila " + adt.getLength());
        System.out.println("\n El elemnto eliminado de la pila " + adt.pop());
        System.out.println("\n ¿La Pila esta vacia?" + adt.isEmpty());
        System.out.println("\n El elemento del tope " + adt.peek());
    }

}
