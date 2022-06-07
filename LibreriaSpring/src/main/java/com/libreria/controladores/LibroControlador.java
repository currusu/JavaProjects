
package com.libreria.controladores;

import com.libreria.Errores.ErrorServicio;
import com.libreria.servicios.LibroServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LibroControlador {
    
    @Autowired
    private LibroServicios libroServicios;
    
    @GetMapping("/libro/form")
    public String form(){
    
        return "libro-form.html";
    }
   @PostMapping("/libro/form") 
   public String crearLibro( ModelMap modelo,@RequestParam String isbn,@RequestParam String titulo,@RequestParam Integer anio,@RequestParam Integer ejemplares,@RequestParam Integer ejemplaresPrestados, @RequestParam Integer ejemplaresRestantes,@RequestParam Boolean alta){
   
       try {
           libroServicios.crear( isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta);
       } catch (ErrorServicio e) {
           modelo.put("Error", e.getMessage());
       }
   return "libro-form.html";
   }
    
}
