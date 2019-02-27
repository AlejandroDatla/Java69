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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner (System.in);
        
        float sueldoH = 0;
        float horaEx = 0;
        float horas = 0;
        float sueldo = 0;
        
        System.out.print("Sueldo por hora:.");
        sueldoH = entrada.nextFloat();
        
        System.out.print("Horas trabajadas:.");
        horas = entrada.nextFloat();
        
        System.out.print("Horas extra:.");
        horaEx = entrada.nextFloat();
        
        sueldo = sueldoH*horas;
        horaEx = (sueldoH*2*horaEx);
        
        System.out.println("El sueldo total es :."+(sueldo+horaEx));
    }
    
}
