
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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        //Definicion de variables
        
        int numero,suma,num;
        
        System.out.println("Ingrese un valor");
        
        numero= leer.nextInt();
        
        //Inicializacion de variables
       
        suma=0;
        num=0;
        
      do{
          System.out.println("Ingrese un valor");
          
          num=leer.nextInt();
          
          suma=suma+num;
          
          
      }while(suma<=numero);
        
        
        
        
        // TODO code application logic here
    }
    
}
