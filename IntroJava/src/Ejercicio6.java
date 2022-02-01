
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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        int num1 = 0,doble = 0,triple = 0,cuadrada = 0; //Declaracion de variables
        
        System.out.println("Ingrese un número");
        
        num1=leer.nextInt();
        
        doble=num1*2;
        
        triple=num1*3;
        
        cuadrada=(int) Math.sqrt(num1);
        
        System.out.println("El doble del número ingresado es :" + doble);
        
        System.out.println("El triple del número ingresado es :" + triple);
        
        System.out.println("La raíz cuadrada del número ingresado es :" + cuadrada);
        
        
              
                
                
        
        //TODO code application logic here
    }
    
}
