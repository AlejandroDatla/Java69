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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner (System.in);
        
        float presupuesto = 0;
        
        System.out.print("Ingrese el monto del presupuesto:.");
        presupuesto = entrada.nextFloat();
        
        System.out.println("El presupuesto de Urgencias es de:."+(presupuesto*0.37));
        System.out.println("El presupuesto de Pediatria es de:."+(presupuesto*0.42));
        System.out.println("El presupuesto de Traumatologia es de:."+(presupuesto*0.21));
    }
    
}
