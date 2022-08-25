
package arreglo;

/**
 *
 * @author OmarA
 */
public class Arreglo {
    private int tamano;
    private int longitud;
    private int elemento;

    public Arreglo() {
    }

    public Arreglo(int tamano, int longitud, int elemento) {
        this.tamano = tamano;
        this.longitud = longitud;
        this.elemento = elemento;
    }

    public static void main(String[] args) {

    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getLongitud() {
        return tamano;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }
    
    @Override
    public String toString() {
        return "Arreglo{" + "tamano=" + tamano + ", longitud=" + longitud + ", elemento=" + elemento + '}';
    }       
}

