package com.libreria.servicios;

import com.libreria.Errores.ErrorServicio;
import com.libreria.entidades.Libro;
import com.libreria.repositorios.LibroRepositorios;
import java.util.Date;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServicios {

    @Autowired
    private LibroRepositorios libroRepositorios;

    public void crear(String isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Boolean alta) throws ErrorServicio {

       

        Libro libro = new Libro();

        
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresPrestados(ejemplaresPrestados);
        libro.setEjemplaresRestantes(ejemplaresRestantes);
        libro.setAlta(alta);

        libroRepositorios.save(libro);

    }

    public void modificar(String id, String isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Boolean alta) throws ErrorServicio, Exception {

        validar(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta);

        Optional<Libro> respuesta = libroRepositorios.findById(id);
        if (respuesta.isPresent()) {
            Libro libro = libroRepositorios.findById(id).get();

            libro.setAlta(alta);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setIsbn(isbn);
            libro.setTitulo(titulo);

            libroRepositorios.save(libro);
        } else {
            throw new ErrorServicio("No se encontró el libro solicitado");
        }
    }

    private void validar( String isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Boolean alta) throws ErrorServicio {
        

        if (isbn == null || isbn.isEmpty()) {
            throw new ErrorServicio("El isbn del libro no puede ser nulo.");
        }

        if (titulo == null || titulo.isEmpty()) {
            throw new ErrorServicio("El titulo del libro no puede ser nulo.");
        }

        if (anio == null) {
            throw new ErrorServicio("El año del libro no puede ser nulo");
        }

        if (ejemplares == null) {
            throw new ErrorServicio("El número de ejemnplares de los libros no puede ser nulo.");
        }

        if (ejemplaresPrestados == null) {
            throw new ErrorServicio("El número de ejemplares prestados de los libros no puede ser nulo. ");
        }

        if (ejemplaresRestantes == null) {
            throw new ErrorServicio("El número de ejemplares restantes de los libros no puede ser nulo.");

        }

        if (alta == null) {
            throw new ErrorServicio("La fecha de alta de los libros no puede ser nula");
        }
    }

    public void remover(String id, String isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Boolean alta) throws ErrorServicio {
        Optional<Libro> respuesta = libroRepositorios.findById(id);
        if (respuesta.isPresent()) {

            Libro libro = libroRepositorios.findById(id).get();
            libro.setBaja(new Date());

            libroRepositorios.save(libro);
        } else {
            throw new ErrorServicio("No se encontró el libro solicitado");
        }
     
     
    }
    public void habilitar(String id, String isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Boolean alta) throws ErrorServicio {
        Optional<Libro> respuesta = libroRepositorios.findById(id);
        if (respuesta.isPresent()) {

            Libro libro = libroRepositorios.findById(id).get();
            libro.setBaja(null);
    
    libroRepositorios.save(libro);
        } else {
            throw new ErrorServicio("No se encontró el libro solicitado");

        }

    }

   
}
