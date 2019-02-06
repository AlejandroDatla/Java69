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
public class practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner (System.in);
        
        float quetzales = 0;
        float dolar = 0;
        float resultado = 0;
        int opcion = 0;
        
        System.out.println("Seleccione alguna opcion.");
        System.out.println("<1=Quetzales a Dolares  2=Dolar a Quetzales>");
        opcion = entrada.nextInt();
        
        if (opcion == 1)
        {
            System.out.println("ingrese una cantidad en quetzales:.");
            quetzales = entrada.nextFloat();
        
            System.out.println("Ingrese el valor del dolar:.");
            dolar = entrada.nextFloat();
        
            resultado = (float)(quetzales/dolar);
        
            System.out.println("El resultado de la convercion es de"+resultado);
        }
        
        else if (opcion == 2)
        {
            
            System.out.println("Ingrese la cantidad de dolares:.");
            dolar = entrada.nextFloat();
        
            System.out.println("A cuantos quetzales esta el dolar:.");
            quetzales = entrada.nextFloat();
        
            resultado = (float)(dolar*quetzales);
        
            System.out.println("El resultado de la convercion es de"+resultado);
            
        }
        
        else
        {
            System.out.println("la opcion es invalida");
        }
                
    }
    
}