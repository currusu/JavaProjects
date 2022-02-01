
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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        //Definir variables
        
        int motor;
        //Inicialización de variables
        
        motor=0;
       
 
        System.out.println("Ingrese un tipo de motor");
        
            motor=leer.nextInt();
            
           switch(motor) {
               
               case(1):
           
               System.out.println("La bomba es una bomba de agua");
               
               break;
               
               case(2):
                   
               System.out.println("La bomba es una bomba de gasolina");
               
               break;
               
               case(3):
                   
               System.out.println("La bomba es una bomba de hormigón");
               
               break;
               
               case(4):
                   
               System.out.println("La bomba es una bomba alimenticia");
               
               case(5):
               
               default:
                   
               System.out.println("No existe valor válido para tipo de bomba");
                       
               
               
       
               
           
           
           
           }
            
            
            
    }
}

       
    

    

      
    
  