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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner (System.in);
        int cant = 0;
        int numero = 0;
        //System.out.println("El numero "+ (694) + " Tiene" + Integer.toString(694).length() + "Digitos");
        
        System.out.println("Ingrese un numero:.");
        numero = entrada.nextInt();
        if (numero <0)
        {
            numero = numero * -1;
        } // If si es negativo de lo contrario no 
        cant = Integer.toString(numero).length();
        
        System.out.println("La cantidad de digitos es de:."+ cant);
    }
    
}
