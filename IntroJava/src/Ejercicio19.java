
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
public class Ejercicio19 {
    
    //Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, 
//si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 //* * * * 
 //*     *
 //*     *
 //* * * *
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        //Declaracion de variables
        
        int i,j,n;
        
        System.out.println("Por favor ingrese el tamaño del cuadrado");
        
        n = leer.nextInt();
        
        if(n>=0 && n<=20);{
        
            ///Linea superior
            
        for( i=0 ; i < n; i++){
            
          System.out.print("*");
          
        }
            System.out.println();
            
            //Centro de la forma. El n-2 es porque el centro
            //representa el dibujo sin la línea superior e inferior
            
            for( i = 0; i < n-2; i++){
            
                System.out.print("*");
                
                for( j = 0; j < n-2 ; j++){
                
                    System.out.print(" ");
                }
                System.out.println("*");  
            }
           //Linea inferior
        for( i=0 ; i < n; i++){
            System.out.print("*");
        }
        
    }
            System.out.println("Error. El valor ingresado debe ser máximo hasta 20");
            }
    
    }
