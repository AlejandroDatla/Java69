/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;
import java.util.Scanner;
import static javax.management.Query.or;
/**
 *
 * @author root
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String producto = "";
        float total = 0;
        float cantidad = 0;
        float descuento = 0;
        float pago = 0;
        
        while (cantidad >= -1)
        {
            System.out.println("Ingrese el nombre del producto");
            producto = entrada.next();
            
            System.out.println("Ingrese la cantidad del producto");
            cantidad = entrada.nextFloat();
            
            if (cantidad >=1)
            {
                total = (float)(total+cantidad);
            }
            
            
            
        }
        System.out.println("La cantidad de total de las ventas es de"+total);
        
        if (total > 500)
        {
            descuento = (float)(total*0.05);
            System.out.println("La cantidad de descuento es de "+descuento);
            pago = (float)(total-descuento);
            System.out.println("La cantidad de pago es de "+pago);
        }
        
        else if (total > 1500)
        {
            descuento = (float)(total*0.1);
            System.out.println("La cantidad de descuento es de "+descuento);
            pago = (float)(total-descuento);
            System.out.println("La cantidad de pago es de "+pago);
            
        }
    }
    
}
