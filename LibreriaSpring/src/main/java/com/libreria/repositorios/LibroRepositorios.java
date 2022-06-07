
package com.libreria.repositorios;

import com.libreria.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepositorios extends JpaRepository <Libro,String>{
    
    @Query("SELECT c FROM Libro c WHERE c.id = :id")
    public Libro buscarPorId(@Param ("id") String id);
}
