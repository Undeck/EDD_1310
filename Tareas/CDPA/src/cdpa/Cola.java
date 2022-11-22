/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cdpa;
import java.util.ArrayList;

/**
 *
 * @author OmarA
 */
public class Cola<T> {

    private ArrayList<T> datos;

    public Cola() {
        datos = new ArrayList<>();
    }

    public boolean is_Empty() {
        return datos.isEmpty();
    }

    public int lenght() {
        return datos.size();
    }

    public void enqueue(T elemento) {
        datos.add(elemento);
    }

    public T dequeue() {
        if (!is_Empty()) {
            return datos.remove(0);
        } else {
            throw new ArrayIndexOutOfBoundsException("La cola esta vacia");
        }
    }

    @Override
    public String toString() {
        String estado = "";
        for (T item : datos) {
            estado += "|" + item + "|  ";
        }
        estado += "Prioridad:" + lenght();
        return estado;
    }
}
