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
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner (System.in);
        int number = 0;
        int n1 = 0;
        int cuadrado = 0;
        int cubo = 0;
        
        while(number != 5 )
        {
            System.out.println("Ingrese un numero");
            n1 = entrada.nextInt();
            cuadrado = (int)(n1*n1);
            cubo = (int)(n1*n1*n1);
            
            System.out.println("Cuadrado:"+cuadrado);
            System.out.println("cubo:"+cubo);
            
            number++;
            
        }
            
        
    }
    
}
