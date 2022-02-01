
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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        int num1; //Declaracion de variables
        
        System.out.println("Ingrese un número");
        
        num1=leer.nextInt();
        
        if(num1%2==0){
            
            System.out.println("El número ingresado es par");
               
        }else
            System.out.println("El número ingresado es impar");
        
        
        // TODO code application logic here
    }
    
}
