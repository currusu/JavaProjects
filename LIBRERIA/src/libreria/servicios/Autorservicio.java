/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

/**
 *
 * @author Nati
 */
public class Autorservicio {
    private final AutorDAO dao;

    public  Autorservicio() {
        dao = new AutorDAO();
    }
    
  public Autor crear (String id, String nombre, boolean alta) {
  
  Autor autor = new Autor();
  
  autor.setId(id);
  autor.setNombre(nombre);
  autor.setAlta(alta);
  
  dao.guardar(autor);
  
  return autor;
  
  }

   public void modificar (String id, String nombre, boolean alta) {
  
  Autor autor = new Autor();
  
  autor.setId(id);
  autor.setNombre(nombre);
  autor.setAlta(alta);
  
  dao.editar(autor);  
   } 
   
   public void eliminar(String id) {
        Autor autor = buscarPorId(id);
        
        dao.eliminar(autor);
    } 
   public List<Autor> listarTodos() {
        return dao.listarTodos();
    }
    public Autor buscarPorId(String id) {
        return dao.buscarPorId(id);
    }
   public Autor buscarPorNombre (String nombre) {
       return dao.buscarPorNombre("nombre");
   }
}
