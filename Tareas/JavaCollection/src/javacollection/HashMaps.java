/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacollection;

import java.util.HashMap;

/**
 *
 * @author OmarA
 */
    public class HashMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer, String> HashMap = new HashMap<Integer, String>();
        System.out.println("HashMap:\n");
        // Put sirve para añadir elementos al hash map (Estos tienen que estar en paress)//
        HashMap.put(1, "Hola");
        HashMap.put(2, "Soy");
        HashMap.put(3, "La");
        HashMap.put(4, "EDD");
        HashMap.put(5, "HashMap");
        System.out.println(HashMap);  //Gracias al orden de las llaves obtendremos Hola Soy La EDD Hashmap//
        //Metodos mas Importantes:  
        System.out.println("Metodos:");
        System.out.println("Tamaño de la HashMap:");
        System.out.println(HashMap.size()); //Este metodo nos da el tamaño de la hash map
        System.out.println("El valor de la LLave 5 es:" + HashMap.get(5));  //get nos sirve para obtener el valor asociado a la llave que seleccionemos, en este caso 5//
        System.out.println("El dato eliminado es:" + HashMap.remove(1)); //Remove sirve para eliminar el valor asociado a la llave seleccionada, en este caso 1 (Hola)//
        System.out.println(HashMap.containsValue("EDD"));  //ContainsValue nos sirve para saber si existe algun valor deseado
        System.out.println(HashMap.containsValue("Adios")); //Lo mismo que arriba solo que aqui el valor es inexistente por lo que nos debe salir "False"        
        System.out.println(HashMap.isEmpty()); //isEmpty nos sirve para saber si la hash map esta vacia//
        HashMap.clear();// clear nos sirve para limpiar todo el Hash Map
        System.out.println(HashMap);
        System.out.println(HashMap.isEmpty()); //Ahora nos aparecera true ya que previamente fue aplicado un clear

    }
}
