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
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float lb = 0;
        float Kg = (float) 2.2046;
        
        System.out.println("ingrese cantidad en cm para convertilos a pulgadas");
        lb = Float.valueOf(sc.next());
        
        System.out.println("la cantida en kilogramos es de :."+(lb*Kg));
        
    
    }
    
}
