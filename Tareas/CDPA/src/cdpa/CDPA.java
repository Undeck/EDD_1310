/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cdpa;

/**
 *
 * @author OmarA
 */
public class CDPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CDPADT prioridad = new CDPADT<>(6);
        prioridad.agregarElemen(4, "Maestre");
        prioridad.agregarElemen(2, "Ninos");
        prioridad.agregarElemen(4, "Mecanico");
        prioridad.agregarElemen(3, "Hombres");
        prioridad.agregarElemen(4, "Vigia");
        prioridad.agregarElemen(5, "Capitan");
        prioridad.agregarElemen(4, "Timonel");
        prioridad.agregarElemen(3, "Mujeres");
        prioridad.agregarElemen(2, "3ra Edad");
        prioridad.agregarElemen(1, "Ninas");
        
        System.out.println(prioridad);
    }
}
    
