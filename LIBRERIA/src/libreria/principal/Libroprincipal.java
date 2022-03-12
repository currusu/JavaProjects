/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import static libreria.entidades.Libro_.isbn;
import libreria.servicios.Autorservicio;
import libreria.servicios.Libroservicio;

/**
 *
 * @author Nati
 */
public class Libroprincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    
     
     Autorservicio autorservicio = new Autorservicio();
     Libroservicio libroservicio = new Libroservicio();
    
     try {
            
          //autorservicio.crear("1", "Aramis", true);
          //autorservicio.buscarPorNombre("Aramis");
          
          Autor a = autorservicio.crear("5", "Antoine", true);
          Editorial e = new Editorial();
          libroservicio.crear("1","El Principito",1980,4,3,1,true,a,e);
          libroservicio.buscarPorIsbn("12");
          libroservicio.buscarPorTitulo("El Principito");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }   
}  
        
    


    

