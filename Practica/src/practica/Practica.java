/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;
/**
 *
 * @author root
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner (System.in);
        
        float quetzales = 0;
        float dolar = 0;
        float resultado = 0;
        
        System.out.println("ingrese una cantidad en quetzales:.");
        quetzales = entrada.nextFloat();
        
        System.out.println("Ingrese el valor del dolar:.");
        dolar = entrada.nextFloat();
        
        resultado = (float)(quetzales/dolar);
        
        System.out.println("El resultado de la convercion es de"+resultado);
    }
    
}
