
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
public class Ejercicio20 {
 //Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
//número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//5 *****
//3 ***
//11 ***********
//2 *
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
       
        //Definicion de variables
        
        int n,n2,n3,n4,i;
        
        //Inicialización de variables
        
        n=0;
        n2=0;
        n3=0;
        n4=0;
                
        
       System.out.println("Ingrese un número por favor");
       
       n = leer.nextInt();
        
        System.out.println("Ingrese el segundo número");
        
       n2= leer.nextInt();
       
        System.out.println("Ingrese el tercer número");
        
       n3= leer.nextInt();
       
        System.out.println("Ingrese el cuarto número");
        
       n4= leer.nextInt();
       
        if(n>=0 && n<=20);{
    
       for(i = 0; i < n; i++){
         
        System.out.print("*");

    }  
        System.out.println("");
        
        for(i = 0; i< n2; i++){
            
            System.out.print("*");
        
        }
        System.out.println("");
        
        for(i = 0; i < n3; i++){
         
        System.out.print("*");

    }  
        System.out.println("");
        
         for(i = 0; i < n4; i++){
         
        System.out.print("*");

    }  
        System.out.println("");
        
        
        
        
        }
        
        
        // TODO code application logic here
    }
    
}
