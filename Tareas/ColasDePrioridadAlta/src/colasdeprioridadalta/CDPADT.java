/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colasdeprioridadalta;

/**
 *
 * @author OmarA
 */
public class CDPADT <T> {
     private ColaSimple[] cola;
    private int length, levels;
    
    public ColaPrioridadAcot(int niveles){
        cola = new ColaSimple[niveles];
        for(int i = 0; i < niveles; i++){
            cola[i] = new ColaSimple();
        }
        levels = niveles;
        length = 0;
    }
    
    public boolean isEmpty(){
        return length == 0;
    }
    
    public int length(){
        return length;
    }
    
    public void enqueue(int prioridad, T dato) throws PrioridadFueraDeRango{
        if (prioridad < 0)
        {
            prioridad = 0;
        }
        if (prioridad < levels){
            cola[prioridad].enqueue(dato);
            length++;
        }else{
            throw new PrioridadFueraDeRango();
        }
    }
    
    public T dequeue(){
        
        boolean centinela = true;
        T dato = null;
        
        for( int i = 0; centinela && length > 0 ; i++){
            if(!cola[i].isEmpty()){
                dato = (T) cola[i].dequeue();
                centinela = false;
            }
        }
        
        length--;
        return dato;
    }

    @Override
    public String toString() {
        return "ColaPrioridadAcot{" + "cola=" + getElementos() + ", length=" + length + ", levels=" + levels + '}';
    }

    private String getElementos() {
       String cadena="";
       
       for(int i = 0; i < levels; i++){
            cadena = cadena + cola[i];
        }
       
       return cadena;
    }
    
    
}
    

