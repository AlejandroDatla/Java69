/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;
import java.util.Scanner;
/**
 *
 * @author AtlAntiA
 */
public class Ejercicios5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int numeros[];
        numeros = new int[5];
        
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Ingrese un numero ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println("Los valores son ");
        for (int i = 0; i < 5; i++) 
        {
            System.out.println(numeros[i]);
        }
    }
    
}
