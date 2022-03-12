/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import libreria.entidades.Editorial;

/**
 *
 * @author Nati
 */
public class EditorialDAO extends DAO{
    public void guardar (Editorial editorial){
    
        conectar();
        em.getTransaction().begin();
        em.persist(editorial); //Esto almacena
        em.getTransaction().commit();
        desconectar();
    }
    
    public Editorial editar (Editorial editorial){
        
        conectar();
        em.getTransaction().begin();
        Editorial l= em.merge(editorial); //Esto modifica 
        em.getTransaction().commit();
        desconectar();
        return l;
    }

    public void eliminar (Editorial editorial){
    
        conectar();
        em.getTransaction().begin();
        em.remove(editorial); //Esto elimina
        em.getTransaction().commit();
        desconectar();
    
    }
    
}
