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
public class Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float n = 0;
        System.out.println("ingrese un numero");
        n = Float.valueOf(sc.next());
        
        System.out.println("la  raiz cuadrada es "+Math.sqrt(n));
        
    }
    
}
