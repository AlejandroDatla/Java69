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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        float cost_hora = (float) 1.5;
        int horas = 0;
        int descuento = 0;
        float total = 0;

        
        System.out.println("Cuantas horas?... ");
        horas = entrada.nextInt();
        
        if (horas >= 5)
        {
            descuento = (horas/5);
            total = (horas-descuento)*cost_hora;
            //descuento = (horas-descuento);
            
            System.out.println("Las horas consumidas fueron "+horas);
            System.out.println("El descuento de horas es de "+descuento);
            System.out.println("Las horas totales a pagar es de "+(horas-descuento));
            System.out.println("El monto a pagar es de "+(total));
        } 
        
        else
        {
            System.out.println("El monto a pagar es de "+(horas*cost_hora));
        }
        
    }
    
}
