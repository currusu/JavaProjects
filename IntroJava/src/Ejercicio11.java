
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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        String palabra; //Declaracion de variables
      
        System.out.println("Ingrese una frase");
        
        palabra=leer.next();
        
        if ((palabra.substring(0, 1)).equals("A")) {
            
            System.out.println("CORRECTO"); 
           
        } else
            System.out.println("INCORRECTO");
        
        
        
       
    
        
   
            
   


         // TODO code application logic here
       }      
    }        