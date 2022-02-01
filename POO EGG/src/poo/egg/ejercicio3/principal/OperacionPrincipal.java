
package poo.egg.ejercicio3.principal;

import poo.egg.ejercicio3.entidades.OperacionEntidades;


public class OperacionPrincipal {

    
    public static void main(String[] args) {
        
        //Antes de empezar no olvidarese de importar
        //la clase al MAIN
        
        OperacionEntidades cuenta = new OperacionEntidades (); 
       
       cuenta.crearOperacionEntidades();
        
        System.out.println("El resultado de la suma es" + cuenta.suma());
        
        System.out.println("El resultado de la resta es" + cuenta.resta());
        
        System.out.println("El resultado de la multiplicacion es incorrecto" + 0 );
        
        System.out.println("El resultado de la multiplicacion es " + cuenta.multiplicacion());
        
        System.out.println("El resultado de la division es incorrecto" + 0);
        
        System.out.println("El resultado de la division es " + cuenta.division());
    }
    
    
    
}
