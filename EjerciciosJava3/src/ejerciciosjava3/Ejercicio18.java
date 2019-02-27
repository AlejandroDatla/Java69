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
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner dato = new Scanner(System.in);
        float TASA = (float) 0.15;
        float valor_compra = 0;
        float descuento = 0;
        
        System.out.println("Ingrese valor de la compra:");
        valor_compra = Float.valueOf(dato.next());
        
        descuento = valor_compra * TASA;
        System.out.println("Tu descuento es:"+ descuento);
        
        System.out.println("Tu total a pagar es:" + (valor_compra - descuento));
        
    }
    
}
