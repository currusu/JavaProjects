
package colecciones.Ejercicio4.Servicios;
 

import colecciones.Ejercicio4.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;




//Un cine necesita implementar un sistema en el que se puedan cargar peliculas. 
//Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
//película (en horas). Implemente las clases y métodos necesarios para esta 
//situación, teniendo en cuenta lo que se pide a continuación: 
//18
//En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
//usuario todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no.
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

    public class PeliculaServicios {
    
        //Declaración de Scanner, ArrayList y Comparator
        
           Scanner leer ;
    
           public ArrayList<Pelicula>peliculas;
           
          
           
    public PeliculaServicios() {
         
        //Creacion de Scanner, ArrayList y  a traves de objeto películas
        //y objeto leer
        
         leer = new Scanner(System.in).useDelimiter("\n");
         
         peliculas = new ArrayList();
    }
               
         //Método crearPelicula 
    
          public Pelicula crearPelicula(){
        
        //Creación de objeto pelicula vinculado con clase Pelicula
        
            Pelicula pelicula = new Pelicula();
            
            System.out.println("Por favor ingrese el título de la película");
           
            pelicula.setTitulo(leer.next());
            
            System.out.println("Por favor ingrese el director de la película");
            
            pelicula.setDirector(leer.next());
            
            System.out.println("Por favor ingrese la duración de la película");
            
            pelicula.setDuracion(leer.nextDouble());
            
           
             
            return pelicula;
              
        
    }
          //Método AgregarPeliculas. Se le pasaron por parámetros la clase
          //Pelicula y el objeto banana. Este objeto va a hacer que el método
          //AgregarPeliculas se guarde en el ArrayList peliculas. peliculas,
          //es el objeto creado para poder usar el Arraylist
          
          public void AgregarPeliculas(Pelicula banana){
          
          peliculas.add(banana);
          }
          
          public void MostrarPeliculas(){
          
              for (Pelicula pelicula : peliculas) {
                  
                  System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
                  
                  System.out.println("El título de la película es " + pelicula.getTitulo());
                  
                  System.out.println("El director de la película es " + pelicula.getDirector());
                  
                  System.out.println("La duración de la película es " + pelicula.getDuracion()+ " horas ");
                  
                  
              }
          }
          
           public static Comparator<Pelicula> ordenarDeMayorAmenor = new Comparator<Pelicula>(){
              
               @Override
               
               public int compare(Pelicula o1, Pelicula o2) {
                   
                  return o2.getDuracion().compareTo(o1.getDuracion());
                  
                   
               }
            
           
           };
                   
           public static Comparator<Pelicula> ordenarDeMenorAmayor = new Comparator<Pelicula>(){
               @Override
               
               public int compare(Pelicula o1, Pelicula o2) {
                   
                  return o1.getDuracion().compareTo(o2.getDuracion());
               }
           };
           
           
           public static Comparator<Pelicula> ordenarAlfabeticamenteDirector = new Comparator<Pelicula>(){
               @Override
               public int compare(Pelicula o1, Pelicula o2) {
                   
                   return o1.getDirector().compareTo(o2.getDirector());
                   
               }
           
           
           };
           
           public static Comparator<Pelicula> ordenarAlfabeticamenteTitulo = new Comparator<Pelicula>(){
               @Override
               public int compare(Pelicula o1, Pelicula o2) {
                  return o1.getTitulo().compareTo(o2.getTitulo());
               }
           
           
           };
    } 
           
          
          
          
          
          
              
          
          
          
              

    
        
        
        
            
            
        
        
    
                
                
    
    
    
    
    
    

