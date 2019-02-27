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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        int valor1 = 0;
        int valor2 = 0;
        int ope1 = 0;
        int ope2 = 0;
        
        System.out.println("Ingresa el primer valor:");
        valor1 = entrada.nextInt();
        
        System.out.println("Ingresa el primer valor:");
        valor2 = entrada.nextInt();
        ope1 = (valor1 * 2) + (valor2 *valor2);
        ope2 = ((valor1 * valor1 * valor1)+(valor2 * valor2 * valor2))/3;
        
        System.out.println("La primera operacion es: " + ope1);
        System.out.println("La segunda operacion es: " + ope2);
    
    }
    
}
