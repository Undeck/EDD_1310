/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.acme;

import adts.Arreglo;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Cabrera
 */
public class NominaADT {
    String nombreEmpresa;
    Arreglo<Empleado> nomina;
    String rutaArchivo;

    public NominaADT() {
    }
    
    public NominaADT(String ruta) {
      
        this.rutaArchivo=ruta;
    }
    public void leerArchivo(){
         int cont = 1;
        Empleado x;
        
        int max= 0;
        int min = 299999;
        int trabMax = 0;
        int trabMin = 0;
        String nombreCo = null;
        String nombreC = null;
        try {
            FileReader fr = new FileReader("C:\\Users\\OmarA\\Desktop\\EDD_3010\\EDD_1310\\Tareas\\junio.dat");
            BufferedReader br = new BufferedReader(fr);
            String linea, a[];
            
            while((linea=br.readLine()) != null){
                a=linea.split(",");   
                if(cont !=1){
                
                x = new Empleado(Integer.parseInt(a[0]), a[1], a[2], a[3],Double.parseDouble(a[5]), Integer.parseInt(a[4]), Integer.parseInt(a[6]));
                System.out.println("Sueldo total"+x.calcularSueldo());  
                System.out.println(x.toString());
                if(Integer.parseInt(a[6])>max){
                    max = Integer.parseInt(a[6]);
                    nombreCo =a[1]+ " " + a[2]+ " " + a[3];
                } if (Integer.parseInt(a[6])<min){
                    min =Integer.parseInt(a[6]);
                    nombreC = a[1]+ " " + a[2]+ " " + a[3];
                }
                }
            cont ++;
            }
            System.out.println("El empleado menos antiguo es"+ nombreCo + " " +max);
            
            System.out.println("El empleado mas antiguo es"+ nombreC + " " + min );
        } catch (Exception ex) {
                System.out.println(ex);
        }
            
    }
    
    
}

