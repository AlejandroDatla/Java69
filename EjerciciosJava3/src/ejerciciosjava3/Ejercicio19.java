/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava3;
import java.util.Scanner;
/**
 *
 * @author AtlAntiA
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner dato = new Scanner(System.in);
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int n_final = 0;
        
        System.out.println("Ingresa primera nota:.");
        nota1 = Integer.valueOf(dato.next());
        System.out.println("Ingresa segunda nota:.");
        nota2 = Integer.valueOf(dato.next());
        System.out.println("Ingresa tercera nota:.");
        nota3 = Integer.valueOf(dato.next());
        n_final = (nota1 + nota2 + nota3);
        System.out.println("Tu nota final es:"+n_final);
    
    }
    
}
