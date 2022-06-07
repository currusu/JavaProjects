
package com.libreria.controladores;

import com.libreria.Errores.ErrorServicio;
import com.libreria.servicios.EditorialServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/editorial")
public class EditorialControlador {
   @Autowired     
 EditorialServicios editorialservicios;
 
  @GetMapping("/form")
    public String form(){
    
        return "editorial-form.html";
    }
 @PostMapping("/form") 
   public String crearEditorial( ModelMap modelo, @RequestParam String nombre,@RequestParam Boolean alta){
   
       try {
           editorialservicios.crear(nombre,true);
       } catch (ErrorServicio e) {
           modelo.put("Error", e.getMessage());
       }
   return "editorial-form.html";
   } 
}
