/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjuntoadtmain;

/**
 *
 * @author OmarA
 */
public class ConjuntoADTmain {

    public static void main(String[] args) {

        ConjuntoADT<Integer> C1 = new ConjuntoADT();
        ConjuntoADT<Integer> c2 = new ConjuntoADT();

        C1.agregar(92);
        C1.agregar(5);
        C1.agregar(15);
        c2.agregar(25);
        c2.agregar(55);
        c2.agregar(15);

        System.out.println("longitud C1: " + C1.longitud());
        System.out.println("longitud c2: " + c2.longitud());

        System.out.println("C1 contiene 5: " + C1.contiene(5));
        System.out.println("c2 contiene 25: " + c2.contiene(25));

        System.out.println("\nQuita 5 de C1");
        C1.quitar(5);
        System.out.println(C1);

        System.out.println("\nIgualdad:");
        System.out.println("C1 == c2: " + C1.equals(c2));

        System.out.println("\n¿c2 es un subconjunto?");
        System.out.println("C1 subconjunto c2: " + C1.subConjunto(c2));

        System.out.println("\nUnion");
        C1.union(c2);
        System.out.println(C1);

        ConjuntoADT<Integer> conjuntoIntersecta = C1.interseccion(c2);
        System.out.println("interseccion C1 con otroConjunto: " + conjuntoIntersecta);

        System.out.println("\nDiferencia");
        ConjuntoADT<Integer> conjuntoDiferencia = C1.diferencia(c2);
        System.out.println("diferencia de c1 y c2 " + conjuntoDiferencia);

        System.out.println("\nIterador");
        for (Integer elemento : C1) {
            System.out.println("elemento: " + elemento);
        }

    }

}
