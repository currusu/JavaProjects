
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nati
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        
        String frase;//declaracion de variables
        
        Scanner leer = new Scanner (System.in);
        
        frase = "Hola como estás?";
        
        System.out.println(toLowerCase(frase));
        System.out.println(toUpperCase(frase));
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
