
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
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //Definicion de variables
        int i, numero,contador;
        
        //Inicializacion de variables
        
        numero=0;
        
        contador=0;
                
        
        for (i = 0; i <= 20; i++){
        
            System.out.println("Ingrese un número");
            
                    numero = leer.nextInt();

            
            if (numero>0) 
            {
            if(numero!=0)
                
               contador=(contador+numero);
                
            } else {
               
                System.out.println("Se capturó el número cero");
                
                break;
            
            }

        }
        
        System.out.println(contador);
        
        
        

        // TODO code application logic here
    }

}
