/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package balanceoporparentesis;
import java.io.FileReader;
import java.util.Stack;
import java.util.Scanner;

/**
 *
 * @author OmarA
 */
public class BalanceoPorParentesis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String Text1= "C:\\Users\\OmarA\\Desktop\\EDD_3010\\EDD_1310\\Tareas\\BalanceoPorParentesis\\texto1.txt";
        String txt1 = Leer(Text1);
        String Text2= "C:\\Users\\OmarA\\Desktop\\EDD_3010\\EDD_1310\\Tareas\\BalanceoPorParentesis\\texto2.txt";
        String txt2 = Leer(Text2);
        
        Scanner x = new Scanner(System.in);
        String entrada = x.next();
        Stack<Character> p = new <Character>Stack();
        int i = 0;
        int tam = entrada.length();
        while (i < tam) {

            if (entrada.charAt(i) == '(') {
                p.push('(');
            } else {
                if (p.isEmpty()) {
                    break;
                } else {
                    p.pop();
                }
            }

            i++;
        }
        if (p.isEmpty() & i==tam) 
            System.out.print("Correcto");
            else
            System.out.print("Incorrecta");
        }
    }



