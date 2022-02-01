
import static java.lang.Math.E;
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
public class Ejercicio18 {

    /**Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números 
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya 
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String. 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        
        //Declaracion de variables
        
        int i,j,k;
                
        String I,J,K,s;
        
        i=0;
        j=0;
        k=0;
        s="3";
        
        for (i=0 ; i<=9 ;i++){
            
            
            for(j=0 ; j<=9 ; j++){
                
               
            }}
                for(k=0 ; k<=9 ; k++){
                    
                    
                 I = String.valueOf(i);  
                 J = String.valueOf(j);
                 K = String.valueOf(k);   
                 
                 if(I.equals("3")){
                    
                     I="E";  
                 }
                  if(J.equals("3")){
                  
                      J="E";
                      
                  }
                  if(K.equals("3")){
                  
                      K="E";
                  }
                    System.out.println((I + ("-") + J + ("-") + K + ("-") ));
                }
              
             
             
             
             
        }                
                    
             
            
        
        
        // TODO code application logic here
    
    
}
