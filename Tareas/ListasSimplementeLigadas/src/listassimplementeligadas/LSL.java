/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listassimplementeligadas;

/**
 *
 * @author OmarA
 */
public class LSL<T> {

    Nodo<T> head;
    int tamanio;

    public LSL() {

    }

    public boolean estaVacio() {
        return this.head == null;
    }

    public int getTamanio() {
        return this.tamanio;
    }

    public void agregarAlFinal(T valor) {
        if (this.head == null) {
            head = new Nodo<>(valor);
        } else {
            Nodo<T> nuevo = new Nodo(valor);
            Nodo<T> aux = this.head;

            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            tamanio++;
        }
    }

    public void agregarAlInicio(T valor) {
        if (this.head == null) {
            head = new Nodo<>(valor);
        } else {
            Nodo<T> nuevo = new Nodo(valor);

            nuevo.setSiguiente(head);

            head = nuevo;
            tamanio++;
        }
    }

    public void agregarDespuesDe(T referencia, T valor) {
        if (this.head == null) {
            head = new Nodo<>(valor);
        } else {
            Nodo<T> nuevo = new Nodo(valor);

            Nodo<T> aux = this.head;
            Nodo<T> aux2 = this.head.getSiguiente();

            while (aux.getDato() != referencia) {
                aux = aux.getSiguiente();
                aux2 = aux2.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            aux.getSiguiente().setSiguiente(aux2);
        }
    }

    public void eliminar(int posicion) {
        int lugar = 0;
        if (head == null) {
        } else {
            Nodo<T> aux_anterior = this.head;
            Nodo<T> aux = this.head.getSiguiente();

            while (lugar != posicion) {
                lugar++;
                aux = aux.getSiguiente();
                aux_anterior = aux_anterior.getSiguiente();
            }
            aux_anterior.setDato(aux.getDato());
            aux_anterior.setSiguiente(aux.getSiguiente());
        }
    }

    public void eliminarElPrimero() {
        Nodo<T> aux = this.head;
        aux.setDato(head.getSiguiente().getDato());
        aux.setSiguiente(head.getSiguiente().getSiguiente());
    }

    public void eliminarElFinal() {
        Nodo<T> nuevo = this.head.getSiguiente();
        Nodo<T> aux = this.head;

        while (nuevo.getSiguiente() != null) {
            aux = aux.getSiguiente();
            nuevo = nuevo.getSiguiente();
        }
        aux.setSiguiente(null);
    }

    public void buscar(T numero) {
        Nodo<T> aux = this.head;
        int posicion = 0;

        try {
            while (aux.getDato() != numero && aux.getDato() != null) {
                aux = aux.getSiguiente();
                posicion++;
            }
            System.out.println(aux.getDato() + "Se encuentra en:" + posicion);
        } catch (Exception e) {
            System.out.println(numero + "No Existe");
        }
    }

    public void actualizar(T valor, T dato) {
        Nodo<T> aux = this.head;
        try {
            while (aux.getDato() != dato) {
                aux = aux.getSiguiente();
            }
            aux.setDato(valor);
        } catch (Exception e) {
            System.out.println(dato + " no existe");
        }
    }

    public void transversal() {
        Nodo<T> aux = this.head;
        while (aux != null) {
            System.out.print(aux);
            aux = aux.getSiguiente();
        }
    }
}
