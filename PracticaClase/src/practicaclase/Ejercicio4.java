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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float dia = 0;
        float mes = 0;
        float amos = 0;
        
        System.out.print("Dia:.");
        dia = entrada.nextFloat();
        
        System.out.print("Mes:.");
        mes = entrada.nextFloat();
        
        System.out.print("Amo:.");
        amos = entrada.nextFloat();
        
        if (dia >0 && dia<31)
        {
            if (mes > 0 && mes <13)
            {
                if (amos >0)
                {
                    System.out.println("La fecha es correcta");
                }
                else
                {
                    System.out.println("La fecha es errone");
                }
            }
        }
        else
        {
            System.out.println("La fecha es erronea");
        }
        
    }
    
}
