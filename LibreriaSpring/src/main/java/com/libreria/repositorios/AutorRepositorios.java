
package com.libreria.repositorios;

import com.libreria.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface AutorRepositorios extends JpaRepository <Autor,String>{
    @Query("SELECT c FROM Autor c WHERE c.id = :id")
    public Autor buscarPorId(@Param ("id") String id); 
}
