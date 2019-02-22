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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        float quetzales = 0;
        float Dolares = (float) 7.50;
        float Euros = (float) 8.50;
        
        System.out.print("¿Cuantos quetzales ingresara?:.");
        quetzales = entrada.nextFloat();
        
        System.out.println("El cambio en Dolares es de $="+(quetzales/Dolares));
        System.out.println("El cambio en Euros es de €="+(quetzales/Euros));
    }
    
}
