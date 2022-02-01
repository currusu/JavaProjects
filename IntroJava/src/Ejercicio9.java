

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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        String frase1,frase2;
        
        frase1 = "eureka";
        
        frase2 = "eureka";
        
                
        System.out.println("Ingrese una frase");
        
        frase1=leer.next();
        frase2=leer.next();
      
        if (frase1.equals(frase2)){
        
        System.out.println("CORRECTO");
        
        }else
            
            System.out.println("INCORRECTO");
                
          
        
        // TODO code application logic here
    }
    
}
