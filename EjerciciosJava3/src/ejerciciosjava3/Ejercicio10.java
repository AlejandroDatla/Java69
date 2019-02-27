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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner (System.in);
        
        float largo = 0;
        float alto = 0;
        float cant_arena = 0;
        System.out.print("Ingrese el largo de la pared (metros):.");
        largo = entrada.nextFloat();
        
        System.out.print("Ingrese el alto de la pared (metros):.");
        alto = entrada.nextFloat();
        
        float area = largo*alto;
        
        cant_arena = (float) (area*0.5);
        
        System.out.println("La cantidad de arena que se necesita es de "+cant_arena+"Metros");
    }
    
}
