
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
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        //Declaracion de variables
        
        float numero1,numero2;
        
        int ambos;
        
        
        
        System.out.println("Ingrese un número");
        
        numero1=leer.nextInt();
        
        System.out.println("Ingrese otro número");
        
        numero2=leer.nextInt();
     
       
        do{
           
            System.out.println("Menu");
            
            System.out.println("Opción 1 Sumar");
            
            System.out.println("Opción 2 Restar");
            
            System.out.println("Opcion 3 Multiplicar");
            
            System.out.println("Opción 4 Dividir");
            
            System.out.println("Opción 5 Salir");
            
            System.out.println("Ingrese una opción");
            
            ambos=leer.nextInt();
            
          switch(ambos) {
          
              case 1:
             
          System.out.println("Sumar");
             
          break;
          
              case 2:
              
              System.out.println("Restar"); 
              
          break;
          
              case 3:
              
              System.out.println("Multiplicar");
              
          break;  
          
              case 4:
              
              System.out.println("Dividir");
              
          break; 
          
          
          
          }
          
            
        }while (ambos!=5);
        
        System.out.println("Si desea salir presione S, si no presione N");
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
