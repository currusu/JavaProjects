
package com.libreria.servicios;

import com.libreria.Errores.ErrorServicio;
import com.libreria.entidades.Editorial;
import com.libreria.repositorios.EditorialRepositorios;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EditorialServicios {
    @Autowired
    private EditorialRepositorios editorialRepositorios;
    
    @Transactional (rollbackFor = Exception.class)
    public Editorial crear(String nombre, Boolean alta) throws ErrorServicio {

        validar(nombre,alta);
       

        //if(nombre == null || nombre.isEmpty()){
        //throw new ErrorServicio("El nombre de la editorial no puede ser nulo");
        
       // }
        Editorial editorial= new Editorial();

        editorial.setAlta(alta);
        editorial.setNombre(nombre);

       return editorialRepositorios.save(editorial);

    }
    @Transactional (rollbackFor = Exception.class)
    public void modificar(String id,String nombre, Boolean alta) throws ErrorServicio, Exception {

        validar(nombre,alta);

        Optional<Editorial> respuesta = editorialRepositorios.findById(id);
        if (respuesta.isPresent()) {
            Editorial editorial = editorialRepositorios.findById(id).get();

            editorial.setAlta(alta);
            editorial.setId(id);
            editorial.setNombre(nombre);

            editorialRepositorios.save(editorial);
        } else {
            throw new ErrorServicio("No se encontró la editorial solicitada");
        }
    }

    private void validar(String nombre, Boolean alta) throws ErrorServicio {
        

        if (nombre == null || nombre.isEmpty()) {
            throw new ErrorServicio("El nombre de la editorial no puede ser nulo.");
        }

       

        if (alta == null) {
            throw new ErrorServicio("La fecha de alta de las editoriales no puede ser nula");
        }
    }

    public void remover(String id, String nombre, Boolean alta) throws ErrorServicio {
        Optional<Editorial> respuesta = editorialRepositorios.findById(id);
        if (respuesta.isPresent()) {

            Editorial editorial = editorialRepositorios.findById(id).get();
            editorial.setBaja(new Date());

            editorialRepositorios.save(editorial);
        } else {
            throw new ErrorServicio("No se encontró la editorial solicitada");
        }
     
     
    }
    public void habilitar(String id,String nombre, Boolean alta) throws ErrorServicio {
        Optional<Editorial> respuesta = editorialRepositorios.findById(id);
        if (respuesta.isPresent()) {

            Editorial editorial = editorialRepositorios.findById(id).get();
            editorial.setBaja(null);
    
    editorialRepositorios.save(editorial);
        } else {
            throw new ErrorServicio("No se encontró la editorial solicitada");

        }

    }

}
