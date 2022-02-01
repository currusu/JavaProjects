package poo.egg.ejercicio6.servicios.Cafetera;

//Programa Nespresso. Desarrolle una clase Cafetera con los atributos
import java.util.Scanner;
import poo.egg.ejercicio6.entidades.Cafetera.Cafetera;

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
public class CafeteraServicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Método crear cafetera
    //Acá creé la cafetera y usé el método set para definir 
    //los valores de los atributos.
    
    public Cafetera crearCafetera() {

        Cafetera expresso = new Cafetera();

        expresso.setCantidadActual(100);

        expresso.setCapacidadMaxima(250);

        return expresso;

    }
    //Método llenarCafetera

    public void llenarCafetera(Cafetera expresso) {

        System.out.println("Por favor ingrese el café");

        
        float CantidadActual = leer.nextFloat();

        if (CantidadActual == expresso.getCapacidadMaxima()) {

            expresso.setCapacidadMaxima(250);

            System.out.println("Su cafetera está llena");
        } else {

            System.out.println("Su cafetera no está llena");
        }

    }
    //Método Servir Taza

    public void servirTaza(Cafetera expresso) {

        System.out.println("Por favor ingrese café en su taza");

        //Esta sintaxis ántes del leer es como crear una variable
        
        float tamañotaza = leer.nextFloat();

        //Con esta fórmula estoy modificando la cantidad actual de
        //la cafetera para despues tomar ese valor y restarle el tamaño
        //de taza ingresado por el usuario
        expresso.setCantidadActual(expresso.getCantidadActual() - tamañotaza);

        if (expresso.getCantidadActual() < tamañotaza) {

            System.out.println("Su taza no ha podido llenarse");

        } else {

            System.out.println("Su taza ha sido llenada con éxito");
        }

        //Método Vaciar Cafetera
    }

    public void vaciarCafetera(Cafetera expresso) {
 
        expresso.setCantidadActual(0);
        
        System.out.println("Su cafetera está vacía");
    }
    
      //Método Agregar Café
    
    public void agregarCafe (Cafetera expresso){
    
        System.out.println("Por favor ingrese café");
    
        float mascafe = leer.nextFloat();
        
        expresso.setCantidadActual(expresso.getCantidadActual()+ mascafe);
        
        System.out.println("Su reposición de café ha sido lograda con éxito");
    }
}
