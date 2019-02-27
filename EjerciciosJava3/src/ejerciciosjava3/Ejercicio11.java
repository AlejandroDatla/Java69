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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner (System.in);
        
        float horas = 0;
        float minutos = 0;
        float segundos = 0;
        float costo = 0;
        
        System.out.print("Ingrese el total de horas:.");
        horas = entrada.nextFloat();
        
        System.out.print("Ingrese el total de minutos:.");
        minutos = entrada.nextFloat();
        
        System.out.print("Ingrese el total de segundos:.");
        segundos = entrada.nextFloat();
        
        segundos = segundos + (minutos*60)+(horas*3600);
        
        costo = (float) (segundos*0.25);
        
        System.out.println("El costo total es de:."+costo+"Bs");
    }
    
}
