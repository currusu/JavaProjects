package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2Perro {
    //Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
//String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
//en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
//quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList
    //Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
//pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. 
//Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
//la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
//y se mostrará la lista ordenada.

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //Collections
        ArrayList<String> razaArrayList = new ArrayList();
        
        String opcion1;
        
        do {
            
            System.out.println("Por favor introduzca una raza de perro");
            
            String razaArraylist = leer.next();
            
            razaArrayList.add(razaArraylist);
            
            System.out.println("Desea seguir agregando razas?");
            
            opcion1 = leer.next();
            
            Iterator<String> iterador = razaArrayList.iterator();
            
            while (iterador.hasNext()) {
                
                String aux = iterador.next();
                
                if (aux.equals("Caniche")) {
                    
                    iterador.remove();
                }
             
            }
            
        } while (!opcion1.toUpperCase().equals("NO"));
        
        for (String aux : razaArrayList) {
            
            System.out.println(aux);
        }
        if(!razaArrayList.equals("Caniche")){
            
                
                    System.out.println("La nueva raza no se encuentra en la lista");
                    
                   
                }
        
    }
    
}
