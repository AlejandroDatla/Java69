/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abecedario;

import java.util.Scanner;

/**
 *
 * @author AtlAntiA
 */
public class Abecedario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        char abcdario[] = new char[26];
        for (int i = 65, j = 0; i <= 90; i++, j++)
        {
            abcdario[j] = (char) i;
        }   
        
        String cadena = "";
        int eleccion = -1;
        
        do
        {
            System.out.println("Elija un indice entre 0 y"+(abcdario.length -1));
            eleccion = Integer.valueOf(entrada.next());
            
            if (!(eleccion >= 0 && eleccion <= abcdario.length -1))
            {
                System.out.println("Error, ingrese otro numero");
            }
            else
            {
                if (eleccion != -1)
                {
                    cadena += abcdario[eleccion];
                }
            }
        } while (eleccion != -1);
        System.out.println(cadena);
    }
    
}
