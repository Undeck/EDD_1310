/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacollection;

import java.util.TreeMap;

/**
 *
 * @author OmarA
 */
public class TreeMaps {

    public static void main(String[] args) {
        TreeMap<Integer, String> TreeMp = new TreeMap();

        System.out.println("TreeMap:\n");
        //Put nos sirve para añadir elementos al tree map, estos deben venir en pares
        TreeMp.put(1, "Hola");
        TreeMp.put(2, "Soy");
        TreeMp.put(3, "La");
        TreeMp.put(4, "EDD");
        TreeMp.put(5, "TreeMap");
        System.out.println(TreeMp);
        //Metodos mas Importantes:  
        System.out.println("Metodos:");
        System.out.println("Tamaño de la TreeMap:");
        System.out.println(TreeMp.size());      //size nos sirve para saber el tamaño de la tree map en este caso 5
        System.out.println("El vaslor asociado a la llave 5 es " + TreeMp.get(5));      //Get nos sirve para obtener el valor asociado de la llave deseada en este casp la llave 5 contiene el valor TreeMap
        System.out.println("El elemento eliminado fue" + TreeMp.remove(1));             //Remove nos sirve para eliminar un elemento
        System.out.println(TreeMp.containsValue("EDD"));        //El metodo Contains value verifica si existe un valor en especifico
        System.out.println(TreeMp.containsValue("Adios"));      //Debido a que adios no existe nos soltara un False
        System.out.println(TreeMp.containsKey(4));          //El metodo ContainsKey verifica si existe alguna llave en especifico
        System.out.println(TreeMp.containsKey(6));          //Debido a que no existe la llave 6 nos arrojara un false
        System.out.println("Primer Nodo: " + TreeMp.firstEntry()); //metodo para saber la llave y valor del primer Nodo
        System.out.println(TreeMp.isEmpty());   //Metodo para saber si el arbol estra vacio, en este caso es false
        TreeMp.clear(); //Metodo que nos sirve para vaciar el arbol
        System.out.println(TreeMp);
        System.out.println(TreeMp.isEmpty()); //Metodo que nos sirve para saber si el arbol esta vacio, como previamente se aplico un clear ahora el valor sera true
    }
}
