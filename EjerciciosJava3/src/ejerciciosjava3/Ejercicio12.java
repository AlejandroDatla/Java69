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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        float descuento = 0;
        float salario = 0;
        
        System.out.print("Ingrese el salario del empleado:. ");
        salario = entrada.nextFloat();
        
        descuento = (float) (salario*0.20);
        
        System.out.print("Con el descuento del 20%, el resultado es:. "+(salario-descuento));
    }
    
}
