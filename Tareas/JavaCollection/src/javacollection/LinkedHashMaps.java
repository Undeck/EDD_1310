/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacollection;

import java.util.LinkedHashMap;

/**
 *
 * @author OmarA
 */
public class LinkedHashMaps {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> LHM = new LinkedHashMap();

        System.out.println("LinkedHashMap:\n");
        //Put nos sirve para añadir elementos al Linked Hash Map, estos deben venir en pares  
        LHM.put(1, "Hola");
        LHM.put(2, "Soy");
        LHM.put(3, "La");
        LHM.put(4, "EDD");
        LHM.put(5, "LinkedHashMap");
        System.out.println(LHM);
        //Metodos mas Importantes:
        System.out.println("Metodos:");
        System.out.println("Tamaño de la LinkedHashMap:");
        System.out.println(LHM.size());     //Este metodo nos sirve para saber el tamaño de la LinkedHashMaps
        System.out.println("El valor asociado a la llave 5 es:" + LHM.get(5));  //Este metodo nos sirve para saber cual es el valor asociado a la respectiva llave en este caso es Linked Hash Map
        System.out.println("El elemento eliminado fue" + LHM.remove(1));             //Remove nos sirve para eliminar un elemento asociado a la respectiva llave, ene ste caso es HOLA
        System.out.println(LHM.containsValue("EDD"));        //El metodo Contains value verifica si existe un valor en especifico
        System.out.println(LHM.containsValue("Adios"));      //Debido a que adios no existe nos soltara un False
        System.out.println(LHM.containsKey(4));          //El metodo ContainsKey verifica si existe alguna llave en especifico
        System.out.println(LHM.containsKey(6));          //Debido a que no existe la llave 6 nos arrojara un false
        System.out.println(LHM.isEmpty()); //isEmpty nos sirve para saber si la hash map esta vacia//
        LHM.clear();// clear nos sirve para limpiar todo el Hash Map
        System.out.println(LHM);
        System.out.println(LHM.isEmpty()); //Ahora nos aparecera true ya que previamente fue aplicado un clear
    }
}
