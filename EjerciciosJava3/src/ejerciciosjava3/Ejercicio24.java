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
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float peso = 0;
        System.out.println("ingrese el peso en kilos");
        peso = Float.valueOf(sc.next());
        
        System.out.println("el peso en gramos es de:."+(peso*1000));
        System.out.println("el peso en libras es de:."+(peso*2.20462));
        System.out.println("el peso en toneladas es de:."+(peso*0.001));
        
    }
    
}
