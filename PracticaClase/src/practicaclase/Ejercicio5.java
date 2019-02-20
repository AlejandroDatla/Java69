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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner (System.in);
        
        float dia = 0;
        float mes = 0;
        float amos = 0;
        
        System.out.print("Dia:.");
        dia = entrada.nextFloat();
        
        System.out.print("Mes:.");
        mes = entrada.nextFloat();
        
        System.out.print("Amo:.");
        amos = entrada.nextFloat();
        
        if (dia >0 && dia<32)
        {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 )
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
            
            else if(mes == 4 || mes == 6 || mes == 9 || mes == 11)
            {
                if ( dia<31)
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
            
            else if (mes==2)
            {
                if ( dia<29)
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
                System.out.println("La fecha es errone");
            }
            
            
            
        }
        else
        {
            System.out.println("La fecha es erronea");
        }
    }
    
}
