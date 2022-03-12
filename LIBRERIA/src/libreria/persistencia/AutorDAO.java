/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;

/**
 *
 * @author Nati
 */
public final class AutorDAO extends DAO {
    
    public void guardar (Autor autor){
    
        conectar();
        em.getTransaction().begin();
        em.persist(autor); //Esto almacena
        em.getTransaction().commit();
        desconectar();
    }
    
    public Autor editar (Autor autor){
        
        conectar();
        em.getTransaction().begin();
        Autor l= em.merge(autor); //Esto modifica 
        em.getTransaction().commit();
        desconectar();
        return l;
    }

    public void eliminar (Autor autor){
    
        conectar();
        em.getTransaction().begin();
        em.remove(autor); //Esto elimina
        em.getTransaction().commit();
        desconectar();
    
    }
    public Autor buscarPorId(String id) {
        return em.find(Autor.class, id);//Esto busca
    }
    
    public Autor buscarPorId2(String id) {
        Autor m = (Autor) em.createQuery("SELECT m FROM Mascota m WHERE m.id LIKE :id")
                .setParameter("id", id)
                .getSingleResult();
        
        return m;
    }
    
    public List<Autor> listarTodos() {
        
        conectar();
        desconectar();
        return em.createQuery("SELECT m FROM Mascota m").getResultList();
        
    }
    
    public List<Autor> listarPorNombre(String nombre) {
        return em.createQuery("SELECT m FROM Mascota m WHERE m.nombre LIKE :nombre AND m.colorDePelo LIKE :color")
                .setParameter("nombre", "%" + nombre + "%")
                .setParameter("color", "gris")
                .getResultList();
    }
   public Autor buscarPorNombre (String nombre) {
       
       conectar();
       
       Autor a = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
       
       desconectar ();
   return a;
   
   } 
}



        
        
       
    
    

