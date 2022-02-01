
package pooegg.Ejercicio4.principal;

import pooegg.Ejercicio4.entidades.Rectangulo;


public class Rectanguloprincipal {

    
    public static void main(String[] args) {
        
      Rectangulo figura = new Rectangulo ();
      
      figura.crearRectangulo();
      
        System.out.println("La superficie del rectángulo es " + figura.superficie());
        
        System.out.println("El perímetro del rectángulo es " + figura.perímetro());
        
        //Llamado de subproceso desde la clase al main
        
        figura.DibujarRectangulo();
        
    }
    
}
