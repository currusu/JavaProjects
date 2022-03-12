/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

/**
 *
 * @author Nati
 */
public class LibroDAO extends DAO {
  
    public void guardar (Libro libro){
    
        conectar();
        em.getTransaction().begin();
        em.persist(libro); //Esto almacena
        em.getTransaction().commit();
        desconectar();
    }
    
    public Libro editar (Libro libro){
        
        conectar();
        em.getTransaction().begin();
        Libro l= em.merge(libro); //Esto modifica 
        em.getTransaction().commit();
        desconectar();
        return l;
    }

    public void eliminar (Libro libro){
    
        conectar();
        em.getTransaction().begin();
        em.remove(libro); //Esto elimina
        em.getTransaction().commit();
        desconectar();
    
    }
    public Libro buscarPorIsbn (String isbn) {
       
       conectar();
       
       Libro l = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn LIKE :isbn").setParameter("isbn", isbn).getSingleResult();
       
       desconectar ();
   return l;
   
   } 
   public Libro buscarPorTitulo (String titulo) {
       
       conectar();
       
       Libro l = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo").setParameter("titulo", titulo).getSingleResult();
       
       desconectar ();
   return l; 
    
}
}
