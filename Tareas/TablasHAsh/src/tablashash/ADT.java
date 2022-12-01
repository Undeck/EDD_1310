/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablashash;

import java.util.ArrayList;

/**
 *
 * @author OmarA
 */
public class ADT<T> {

    private ArrayList<ArrayList<T>> hash;
    private int tamanio;

    public ADT(int tamanio) {
        if (tamanio % 2 != 0) {
            this.tamanio = tamanio;
        } else {
            tamanio = tamanio + 1;
            this.tamanio = tamanio;
        }

        hash = new ArrayList<>(this.tamanio);
        for (int i = 0; i <= this.tamanio - 1; i++) {
            ArrayList<T> dato2 = new ArrayList<>();
            hash.add(i, dato2);
        }

    }

    public void Add(int key, T value) {
        int dato = key % tamanio;
        T llave = (T) ("" + key);

        this.hash.get(dato).add(llave);
        this.hash.get(dato).add(value);

    }

    public T valueOf(int key) {
        int dato = key % tamanio;
        String llave = "" + key;
        T resultado = (T) "Error. este dato no existe";

        for (int i = 0; i <= hash.get(dato).size() - 1; i++) {
            String comp = (String) hash.get(dato).get(i);
            if (comp.equals(llave)) {
                resultado = this.hash.get(dato).get(i + 1);
                break;
            }

        }

        return resultado;
    }

    public void Remove(int key) {
        int dato = key % tamanio;
        String llave = "" + key;

        for (int i = 0; i <= hash.get(dato).size() - 1; i++) {
            String comp = (String) hash.get(dato).get(i);
            if (comp.equals(llave)) {
                hash.get(dato).remove(i + 1);
                hash.get(dato).remove(i);
            }
        }
    }
}

