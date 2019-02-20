/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaclase;
import java.util.Scanner;
/**
 *
 * @author root
 */
public class Ejercicio2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner (System.in);
        String numero = "";
        int cant = 0;
        //String numero = "";
        System.out.println("Ingresa un numero:.");
        numero = entrada.next();
        
        
        
        //char charAt = numero.charAt(2);
        
        //System.out.println(cant);
        //System.out.println(charAt);
        cant = numero.length();
        int contador = 0;
        int otro = 0;
        
        while (contador < cant)
        {
            otro = (int)(contador-cant);
            otro = (otro*-1)-1;
            //System.out.println(otro);
            //System.out.println(cant);
            //System.out.print(contador);
            
            
            
            System.out.print(numero.charAt(otro));
         
            contador++;
        }
        
    }

    
    
}
