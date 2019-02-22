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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner (System.in);
        float prec_producto = 0;
        float descuento = 0;
        
        System.out.print("Ingrese el precio del preducto:.");
        prec_producto = entrada.nextFloat();
        
        descuento = (float) (prec_producto*0.35);
        descuento = prec_producto-descuento;
        
        System.out.println("Costo del producto:."+prec_producto);
        System.out.println("Descuento del producto:. 35%");
        System.out.println("Monto a pagar:."+descuento);
        
        
    }
    
}
