
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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int num1, num2; //Declaración de variables

        System.out.println("Ingrese el primer número");

        num1 = leer.nextInt();

        System.out.println("Ingrese el segundo número");

        num2 = leer.nextInt();

        if (num1 > num2) {

            System.out.println("El primer número es mayor ");

        } else {
            
            System.out.println("El segundo numero es mayor");
        }

        
        
            
        
    }
    // TODO code application logic here


}
