/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cdpa;

/**
 *
 * @author OmarA
 */
public class CDPADT<T> {

    private Cola[] cola;
    private int Prioridad, Elementos;

    public CDPADT(int Prioridad) {
        this.Elementos = 0;
        this.Prioridad = Prioridad;
        this.cola = new Cola[Prioridad];
        for (int i = 0; i < Prioridad; i++) {
            cola[i] = new Cola<>();
        }
    }

    public int Elementos() {
        return Elementos;
    }

    public boolean vacio() {
        return Elementos == 0;
    }

    public T sacarElemen() {
        boolean aux = true;
        T elemento = null;;

        for (int i = 0; aux && Elementos > 0; i++) {
            if (!cola[i].is_Empty()) {
                elemento = (T) cola[i].dequeue();
                aux = false;
            }
        }
        Elementos--;
        return elemento;
    }

    public T agregarElemen(int prioridad, T elemento) {
        if (prioridad < Prioridad) {
            cola[prioridad].enqueue(elemento);
            Elementos++;
        } else {
            System.out.println("No hay datos para este nivel de prioridad");
        }
        return elemento;
    }

    private String elementos() {
        String string = "";
        for (int i = 1; i < Prioridad; i++) {
            string += cola[i];
        }
        return string;
    }

    public String toString() {
        return "" + elementos() + " Hay " + (Prioridad - 1) + " niveles de prioridad.";
    }
}
