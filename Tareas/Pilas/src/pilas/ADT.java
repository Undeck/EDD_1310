/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

import java.util.ArrayList;

/**
 *
 * @author OmarA
 */
public class ADT<T> {

    int tamanio;
    int tope = 0;
    ArrayList<T> datos;

    public ADT() {
    }

    public boolean isEmpty() {
        return datos == null;
    }

    public int getLength() {
        return this.tamanio;
    }

    public T pop() {
        T out = (T) datos.remove(tamanio);
        tamanio--;
        return out;
    }

    public T peek() {
        T consulta = null;
        if (isEmpty() == true) {
            System.out.println("Error, la pila esta vacia");
        } else {
            consulta = datos.get(tope - 1);
        }
        return consulta;
    }

    public void push(T dato) {
        datos.add(tope, dato);
        this.tope++;
        this.tamanio++;
    }

    @Override
    public String toString() {
        return "ADT{" + datos + "}";
    }

}
