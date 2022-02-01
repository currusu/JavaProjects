
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nati
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner (System.in);
       
        //Declaracion de variables
        
        int num1,num2,resultado;
        
        num1=num2=resultado=0; //inicializacion de variables
        
        
        System.out.println("Ingrese un numero");
         
        num1=leer.nextInt();
        
        System.out.println("Ingrese otro número");
        
        num2=leer.nextInt();
       
        resultado=num1+num2;
        
        System.out.println("La suma de los números es: " + resultado);    
        
                
        
        
        
        
                
        
        
                
                // TODO code application logic here
    }
    
}
