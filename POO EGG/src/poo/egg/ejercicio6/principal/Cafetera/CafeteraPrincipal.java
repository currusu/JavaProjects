package poo.egg.ejercicio6.principal.Cafetera;

//Programa Nespresso. Desarrolle una clase Cafetera con los atributos

import poo.egg.ejercicio6.entidades.Cafetera.Cafetera;
import poo.egg.ejercicio6.servicios.Cafetera.CafeteraServicios;

//capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
//cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
//menos, los siguientes métodos: 
//18
//• Constructor predeterminado o vacío
//• Constructor con la capacidad máxima y la cantidad actual
//• Métodos getters y setters.
//• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
//máxima. 
//• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
//• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada
public class CafeteraPrincipal {

   
    public static void main(String[] args) {
        
        CafeteraServicios cafeterauno = new CafeteraServicios();
        
        Cafetera cafeteraDos = cafeterauno.crearCafetera();
        
        cafeterauno.llenarCafetera(cafeteraDos);
        cafeterauno.servirTaza(cafeteraDos);
        cafeterauno.vaciarCafetera(cafeteraDos);
        cafeterauno.agregarCafe(cafeteraDos);
    }
    
}
