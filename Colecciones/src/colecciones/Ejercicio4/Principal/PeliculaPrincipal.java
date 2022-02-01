
package colecciones.Ejercicio4.Principal;

import colecciones.Ejercicio4.Servicios.PeliculaServicios;
import colecciones.Ejercicio4.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.T;


public class PeliculaPrincipal {
//Un cine necesita implementar un sistema en el que se puedan cargar peliculas. 
//Para esto, tendremos una clase Pelicula con el titulo, director y duración de la 
//película (en horas). Implemente las clases y métodos necesarios para esta 
//situación, teniendo en cuenta lo que se pide a continuación: 
//18
//En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
//usuario todos sus datos y guardándolos en el objeto Pelicula.
///Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no.
//Después de ese bucle realizaremos las siguientes acciones:
//• Mostrar en pantalla todas las películas.
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
//en pantalla.
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
//en pantalla.
//• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
//Nota: recordar el uso del Comparator para ordenar colecciones con objetos

    public static void  main(String[] args) {
        
        //Importación de objeto Scanner
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
       
       
       
        
        //Importación de objeto pelicula1 que me va a vincular mis
        //dos clases con el main
        
        PeliculaServicios pelicula1 = new PeliculaServicios();
        
        //Este objeto de tipo String va a ser lo que ingresa el usuario
        //cuando el programa pregunte si quiere o no ingresar otra pelicula
        String b;
        
        do{
         
        //Este objeto p va a vincular mi método crear película con el 
        //método agregar película
         
       Pelicula p = pelicula1.crearPelicula();
        
       pelicula1.AgregarPeliculas(p);
       
            System.out.println("Desea ingresar otra película?");
            
             b = leer.next();
        //La condición while hace que se ejecute el bucle siempre y cuando
        //este sea verdadero. Caso contrario no se ejecuta.
        
        }while(b.toUpperCase().equals("SI"));
        
       
        System.out.println("Películas alfabéticamente por director");
        
     Collections.sort(pelicula1.peliculas, PeliculaServicios.ordenarAlfabeticamenteDirector);
     
       pelicula1.MostrarPeliculas();
       
        System.out.println("Películas alfabéticamente por título ");
        
     Collections.sort(pelicula1.peliculas, PeliculaServicios.ordenarAlfabeticamenteTitulo);
     
        pelicula1.MostrarPeliculas();
        
         System.out.println("Películas de mayor a menor");
         
     Collections.sort(pelicula1.peliculas, PeliculaServicios.ordenarDeMayorAmenor);
     
        pelicula1.MostrarPeliculas();
        
        System.out.println("Películas de menor a mayor");
        
     Collections.sort(pelicula1.peliculas, PeliculaServicios.ordenarDeMenorAmayor);
     
        pelicula1.MostrarPeliculas();
 
     
        
    }
        
        
    }
    

