
package poo.egg.ejercicio2.principal;

import poo.egg.ejercicio2.entidades.Circunferencia;


public class Circunferencialprincipal {

    
    public static void main(String[] args) {
        
        //Este método sirve para crear el objeto y así
        //vincularlo con la clase. En este caso el objeto
        //sería "figura"
        
       Circunferencia figura = new Circunferencia (); 
       
       figura.crearCircunferencia();
       
        System.out.println("El área es " + figura.area());
        
        System.out.println("El perímetro es " + figura.perímetro());
    }
    
}
