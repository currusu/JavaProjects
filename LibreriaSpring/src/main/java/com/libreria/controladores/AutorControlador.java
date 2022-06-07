
package com.libreria.controladores;

import com.libreria.Errores.ErrorServicio;
import com.libreria.entidades.Autor;
import com.libreria.servicios.AutorServicios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/autor")
public class AutorControlador {
   
 @Autowired     
 AutorServicios autorservicios;
 
  @GetMapping("/form")
    public String form(){
    
        return "autor-form.html";
    }
 @PostMapping("/form") 
   public String crearAutor( ModelMap modelo, @RequestParam String nombre){
   
       try {
           autorservicios.crear( nombre,true);
       } catch (ErrorServicio e) {
           modelo.put("Error", e.getMessage());
       }
   return "autor-form.html";
   }
  @GetMapping ("/listAutor")
  
  public String listAutor(ModelMap modelo){
      
  List <Autor> autores=autorservicios.listarTodos();
  
  modelo.put("autores",autores);
  
  return "list-autor.html";
  }
  
  
}
