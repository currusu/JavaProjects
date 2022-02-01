/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Nati
 */
public class IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1,num2,resultado;//declaracion de variables
        
         Scanner leer = new Scanner(System.in);
         
        num1=num2=resultado=0;//inicializacion de variables
        
        System.out.println("Ingrese un número");
        
        num1=leer.nextInt();
        
        System.out.println("Ingrese el siguiente número");
        
        num2=leer.nextInt();
        
        resultado=(num1+num2);
        
        System.out.println("El resultado de la suma es: " + resultado);
                
                
        
        
        // TODO code application logic here
    }
    
}
