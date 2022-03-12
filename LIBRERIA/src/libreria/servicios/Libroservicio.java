/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

/**
 *
 * @author Nati
 */
public class Libroservicio {
    private final LibroDAO dao;

    public  Libroservicio() {
        dao = new LibroDAO();
    }
    
     public void crear (String isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Boolean alta, Autor autor, Editorial editorial) {
  
  Libro libro = new Libro();
  
  
  libro.setIsbn(isbn);
  libro.setTitulo(titulo);
  libro.setAlta(alta);
  libro.setAnio(anio);
  libro.setAutor(autor);
  libro.setEditorial(editorial);
  libro.setEjemplares(ejemplares);
  libro.setEjemplaresPrestados(ejemplaresPrestados);
  libro.setEjemplaresRestantes(ejemplaresRestantes);
  
  dao.guardar(libro);
  
  }
    public Libro buscarPorIsbn (String isbn) {
       return dao.buscarPorIsbn(isbn);
    }
     
    
    public Libro buscarPorTitulo (String titulo) {
       return dao.buscarPorTitulo(titulo);
    }
    
    
}
