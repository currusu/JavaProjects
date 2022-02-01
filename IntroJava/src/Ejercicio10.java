
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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        //Declaracion de variables
        
        String frase;
        
        int longitud;
          
        //Inicializacion de variables
        
        frase=leer.next();
        
        longitud=frase.length();
        
        if (8!=(longitud)){
        
            System.out.println("ES INCORRECTO");
            
        }else
            System.out.println("ES CORRECTO");
        
        
        
            
        
        
        
        
                
                
        
        
        
                
        
        
        
        // TODO code application logic here
    }
    
}
