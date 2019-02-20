/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaclase;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author root
 */
public class Ejercicio3{

    /**
     * @param args the command line arguments
     */
         
    public static void main(String[] args) 
    {
        List<String> lista1 = new ArrayList<String>();
        List<String> lista2 = new ArrayList<String>();
        Scanner entrada = new Scanner (System.in);
        String numero = "";
        int cant = 0;
        char letras;
        
        int r1 = 0;
        int r2 = 0;
        
        String numero1 = "";
        String numero2 = "";
        
        System.out.println("Ingresa un numero:.");
        numero = entrada.next();
        
        String let_c = "";
        String let_a = "";
        cant = numero.length();
        int contador = 0;
        int otro = 0;
        
        while (contador < cant)
        {
            otro = (int)(contador-cant);
            otro = (otro*-1)-1;
            
            letras = numero.charAt(contador);
            let_c =  Character.toString(letras);
            lista1.add(let_c);
            
            numero1 = numero1+lista1.get(contador);
            //System.out.print("Lista1"+lista1);
         
            contador++;
        }
        
        contador = 0;
        int i= 0;
        
        while (contador < cant)
        {
            otro = (int)(contador-cant);
            otro = (otro*-1)-1;
            
            letras = numero.charAt(otro);
            let_a =  Character.toString(letras);
            lista2.add(let_a);
            
            
            numero2 = numero2+lista2.get(i);
            //System.out.print("Lista 2"+lista2);
            i++;
            contador++;
        }
        
        r1 = Integer.valueOf(numero1);
        r2 = Integer.valueOf(numero2);
        
        System.out.println("Lista1 "+r1);
        System.out.println("Lista2 "+r2);
        
        if (r1==r2)
        {
            System.out.println("Los numero son palindromos");
        }
        else
        {
            System.out.println("Los numero son no palindromos");
        }
    }

    
    
}
