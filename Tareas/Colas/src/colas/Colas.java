/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colas;

/**
 *
 * @author OmarA
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColaADT<String> Cola = new ColaADT<>();
        Cola.enqueue("Esto se borrara");
        Cola.enqueue("Hola");
        Cola.enqueue("esta");
        Cola.enqueue("es");
        Cola.enqueue("la");
        Cola.enqueue("tarea");
        Cola.enqueue("de");
        Cola.enqueue("colas");
        Cola.dequeue();
        System.out.println(Cola);
        System.out.println("Esta vacia? "+Cola.is_Empty());
    }

}
