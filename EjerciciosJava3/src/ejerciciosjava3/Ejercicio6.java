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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner (System.in);
        
        float salario = 0;
        float aumento = 0;
        float descuento = 0;
        
        System.out.println("Ingrese el salario actual:.");
        salario = entrada.nextFloat();
        
        aumento = (float) (salario*0.08);
        aumento = aumento + salario;
        descuento = (float) (aumento *0.025);
        
        System.out.println("Salario actual:."+salario);
        System.out.println("Aumento del salario:."+(salario*0.08));
        System.out.println("Descuento por servicios:."+descuento);
        System.out.println("Salario Final:."+(aumento - descuento));
    }
    
}
