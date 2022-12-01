/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablashash;

/**
 *
 * @author OmarA
 */
public class TablasHAsh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ADT Hash= new ADT(70);
       Hash.Add(2, "Rojo");       
       Hash.Add(9, "Azul");
       Hash.Add(5, "Morado");
       Hash.Add(7, "Verde");
       Hash.Add(1, "Dorado");
       Hash.Add(71, 3);
       System.out.println(Hash.valueOf(5));
       Hash.Remove(5);
       System.out.println(Hash.valueOf(7));
       System.out.println(Hash.valueOf(1));
       System.out.println(Hash.valueOf(71));
    }   
}
