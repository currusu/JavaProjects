
package poo.egg.ejercicio1.principal;

import java.util.Scanner;
import poo.egg.ejercicio1.entidades.Libro;


public class LibroPrincipal {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
       
        System.out.println("Por favor ingrese los siguientes datos ISBN,Autor,Título y Número de Páginas");
        
        
        Libro lib1;
        
        lib1 = new Libro( leer.nextLine(), leer.nextLine(), leer.nextLine(),leer.nextInt() );
        
        System.out.println(lib1.getISBN() + " " + lib1.getAutor()+ " " + lib1.getTítulo()+ " " + lib1.getNumpag());
        
    }
    
}
