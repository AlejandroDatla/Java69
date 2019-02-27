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
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        float n = 0;
        
        System.out.println("ingrese numero para elevarlo al cubo");
        n = Float.valueOf(sc.next());
        
        System.out.println("el numero elevado al cubo es "+(n*n*n));
        
    }
    
}
