package com.libreria.servicios;

import com.libreria.Errores.ErrorServicio;
import com.libreria.entidades.Autor;
import com.libreria.repositorios.AutorRepositorios;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AutorServicios {

    @Autowired
    private AutorRepositorios autorRepositorios;
    
    @Transactional (rollbackFor = Exception.class)
    public Autor crear(String nombre, Boolean alta) throws ErrorServicio {

        validar(nombre, alta);

//        if(nombre == null || nombre.isEmpty()){
//        throw new ErrorServicio("El nombre del autor no puede ser nulo");
//        
//        }
        Autor autor = new Autor();

        autor.setAlta(true);

        autor.setNombre(nombre);

        return autorRepositorios.save(autor);

    }
    @Transactional (rollbackFor = Exception.class)
    public Autor modificar(String id, String nombre, Boolean alta) throws ErrorServicio, Exception {

        validar(nombre, alta);

        Optional<Autor> respuesta = autorRepositorios.findById(id);
        
        if (respuesta.isPresent()) {
            Autor autor = autorRepositorios.findById(id).get();

            autor.setAlta(alta);
            autor.setNombre(nombre);

            return autorRepositorios.save(autor);
        } else {
            throw new ErrorServicio("No se encontró el libro solicitado");
        }
    }

    private void validar(String nombre, Boolean alta) throws ErrorServicio {

        if (nombre == null || nombre.isEmpty()) {
            throw new ErrorServicio("El nombre del autor no puede ser nulo.");
        }

        if (alta == null) {
            throw new ErrorServicio("La fecha de alta de los autores no puede ser nula");
        }
    }

    public Autor remover(String id, String nombre, Boolean alta) throws ErrorServicio {
        Optional<Autor> respuesta = autorRepositorios.findById(id);
        if (respuesta.isPresent()) {

            Autor autor = autorRepositorios.findById(id).get();
            autor.setBaja(new Date());

            return autorRepositorios.save(autor);
        } else {
            throw new ErrorServicio("No se encontró el libro solicitado");
        }

    }

    public Autor habilitar(String id, String nombre, Boolean alta) throws ErrorServicio {
        Optional<Autor> respuesta = autorRepositorios.findById(id);
        if (respuesta.isPresent()) {

            Autor autor = autorRepositorios.findById(id).get();
            autor.setBaja(null);

            return autorRepositorios.save(autor);
        } else {
            throw new ErrorServicio("No se encontró el libro solicitado");

        }

    }
   
    public List <Autor> listarTodos(){
    
    return autorRepositorios.findAll();
    }
            
            
}
