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
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int act = 0;
        int nac = 0;
        
        System.out.println("ingrese fecha actual");
        act = Integer.valueOf(sc.next());
        System.out.println("ingrese fecha nacimiento");
        nac = Integer.valueOf(sc.next());
        
        int edad = (act-nac);
        if(edad > 0 && nac > 0 && act > nac )
        {
            System.out.println("su edad es de "+(act-nac));
        }
        else{
            System.out.println("la fecha nacimiento es negativa");
        }
        
    }
    
}
