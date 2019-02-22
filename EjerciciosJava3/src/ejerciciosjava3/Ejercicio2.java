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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner (System.in);
        float kilometros = 0;
        
        System.out.println("Cuantos kilometros recorrera:.");
        kilometros = entrada.nextFloat();
        
        System.out.println("El precio a pagar sera de "+(kilometros*10.50 )+"Bs");
    }
    
}
