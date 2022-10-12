/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listassimplementeligadas;
/**
 *
 * @author OmarA
 */
public class ListasSimplementeLigadas<T> {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LSL<Integer> L = new LSL<>();
        System.out.println("Metodo EstaVacio:");
        L.estaVacio();

        System.out.println("Metodo Get Tamaño:");
        L.getTamanio();

        System.out.println("Metodo Agregar al Final");
        L.agregarAlFinal(1);
        L.transversal();

        System.out.println("Método Agregar Al Inicio:");
        L.agregarAlInicio(2);
        L.transversal();

        System.out.println("Metodo Agregar Despues:");
        L.agregarDespuesDe(1, 2);
        L.transversal();

        L.agregarAlInicio(6);
        L.agregarAlFinal(7);
        L.agregarAlFinal(8);
        L.agregarAlFinal(9);
        L.agregarAlFinal(10);
        L.agregarDespuesDe(10, 12);
        System.out.println("Agregamos más Elemntos:");
        L.transversal();

        System.out.println("Metodo eliminar:");
        L.eliminar(7);
        L.transversal();

        System.out.println("Metodo Eliminar al Principio");
        L.eliminarElPrimero();
        L.transversal();

        System.out.println("Metodo Eliminar al Final:");
        L.eliminarElFinal();
        L.transversal();

        System.out.println("Metodo Buscar:");
        L.buscar(10);

        System.out.println("Metodo Actualizar:");
        L.actualizar(5, 50);
        L.transversal();

        System.out.println("Metodo Get Tamaño:");
        L.getTamanio();

        System.out.println("Metodo Transversal:");
        L.transversal();

        System.out.println("Metodo Esta Vacio");
        L.estaVacio();

    }

}
