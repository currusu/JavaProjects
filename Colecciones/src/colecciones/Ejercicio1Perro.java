
package colecciones;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio1Perro {

     //Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
//String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
//en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
//quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        //Collections
        
        ArrayList<String> razaArrayList = new ArrayList();
       
        String opcion1;
        
        do{
            
            
         System.out.println("Por favor introduzca una raza de perro");
         
         String razaArraylist = leer.next();
         
         razaArrayList.add(razaArraylist);
         
            System.out.println("Desea seguir agregando razas?");
            
         opcion1 = leer.next();
        
            
        }while(!opcion1.equals("NO"));
         
              for (String aux : razaArrayList) {
            
                  System.out.println(aux);
        }
  
                
        
         
        
        
        
        
        
       
        
            
        
        
       
    }

    private static int ArrayList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
