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
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner entrar = new Scanner(System.in);
        float PI = (float) 3.1416;
        float radio = 0;
        float area = 0;
        
        System.out.println("bienvenido al prgrama de calcular area de un circulo");
        System.out.println("ingrese radio de un circulo");
        radio = Float.valueOf(entrar.next());
        
        area = (PI*(radio*radio));
        
        System.out.println("el area del circulo es de:."+area);
    }
    
}
