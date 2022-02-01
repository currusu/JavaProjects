
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
public class Ejercicio22 {
//Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
//los muestre por pantalla en orden descendente
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        int[]vector = new int[100];
        
          // Definicion de variables
          
          int i;
        
        for (i = 99; i >-1; i--){
            
            //Vector[i] es una posicion. En cambio i, es un valor
            
            vector[i]=i;
            
            System.out.println(vector[i]);
            
            
            
        }
        
        
        
        
        // TODO code application logic here
    }
    
}
