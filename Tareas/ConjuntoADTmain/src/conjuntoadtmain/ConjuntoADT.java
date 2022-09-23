/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjuntoadtmain;

import java.util.ArrayList;

/**
 *
 * @author OmarA
 */
public class ConjuntoADT<T> implements Iterable<T> {

    ArrayList<T> conjunto;

    public ConjuntoADT() {
        this.conjunto = new ArrayList<>();
    }

    public int longitud() {  
        return this.conjunto.size();
    }

    public boolean contiene(T elemento) {
        return this.conjunto.indexOf(elemento) != -1;

    }

    public void agregar(T elemento) {
        if (!contiene(elemento)) {
            this.conjunto.add(elemento);
        }
    }

    public void quitar(T elemento) {
        this.conjunto.remove(elemento);
    }

    public boolean equals(ConjuntoADT<T> otroConjunto) {
        if (this.longitud() != otroConjunto.longitud()) {
            return false;
        }
        for (T elemento : this.conjunto) {
            if (!otroConjunto.contiene(elemento)) {
                return false;
            }
        }
        return true;
    }

    public boolean subConjunto(ConjuntoADT<T> otroConjunto) {
        if (longitud() > otroConjunto.longitud()) {
            return false;
        }
        for (int i = 0; i < this.conjunto.size(); i++) {
            T elemento = null;
            if (!otroConjunto.contiene(elemento)) {
                return false;
            }
        }

        return true;
    }

    public void union(ConjuntoADT<T> Conjunto2) {
        for (T elemento : Conjunto2.conjunto) {
            this.agregar(elemento);
        }
    }

    public ConjuntoADT<T> interseccion(ConjuntoADT<T> Conjunto2) {
        ConjuntoADT<T> result = new ConjuntoADT<>();
        for (T elemento : this.conjunto) {
            if (Conjunto2.contiene(elemento)) {
                result.agregar(elemento);
            }
        }
        return result;
    }

    public ConjuntoADT<T> diferencia(ConjuntoADT<T> Conjunto2) {
        ConjuntoADT<T> resultado = new ConjuntoADT<>();
        for (T elemento : this.conjunto) {
            if (!Conjunto2.contiene(elemento)) {
                resultado.agregar(elemento);
            }
        }
        for (T elemento : Conjunto2.conjunto) {
            if (!contiene(elemento)) {
                resultado.agregar(elemento);
            }
        }
        return resultado;
    }
    @Override
    public String toString() {
        return conjunto.toString();
    }
    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < conjunto.size();
            }
            @Override
            public T next() {
                return conjunto.get(index++);
            }
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
