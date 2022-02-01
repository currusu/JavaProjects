///Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se
//trata de un número de jugadores, que, con un revolver de agua, el cual posee una sola
//carga de agua, se dispara y se moja. Las clases a hacer del juego son las siguientes:
//Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
//(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
//posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
//aleatoriamente.
//Métodos:
//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
//valores deben ser aleatorios.
//• mojar(): devuelve true si la posición del agua coincide con la posición actual
//• siguienteChorro(): cambia a la siguiente posición del tambor
//• toString(): muestra información del revolver (posición actual y donde está el agua)
//Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
//jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
//(indica si está mojado o no el jugador). El número de jugadores será decidido por el
//usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
//Métodos:
//9
//• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
//Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
//Jugadores) y Revolver
//Métodos:
//• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
//jugadores y el revolver para guardarlos en los atributos del juego.
//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
//sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
//tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.

package Ejercicio2Entidades;



import java.util.ArrayList;


public class Juego {
    
    private ArrayList<Jugador>jugadores;
    private Revolver revolver;

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public Juego() {
        
        jugadores=new ArrayList();
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }

    
    
   
    //Acá se pasaron el ArrayList  y la clase Revolver con sus atributos
    //por parámetros. Después se rellenaron sus objetos con los respectivos atributos.
    
    public void llenarJuego(ArrayList<Jugador>j, Revolver r){
        
        jugadores = j;
        Revolver rev = r;
        
        
    }
    
    //En este método con el primer For muestro mi lista de jugadores
    //a través de mi Arraylist Jugador.Después con el Do/While recorro
    //mi ArrayList con el segundo For y por último a través de mi objeto 
    //jugador uso mi método Disparo y muestro quien fue eliminado y quien 
    //sigue en juego. While va a devolver verdadero para que todo lo que engloba
    //se cumpla.La palabra return después del If en este caso indica que se 
    //cerró todo el bucle que está ántes. En el caso de break corta de a un solo
    //bucle.
    
    public void ronda (Revolver r){
    
        for (Jugador jugador : jugadores) {
            
            System.out.println(jugador);
            
        }
        do{
              
        
        for (Jugador jugador : jugadores) {
           
            
           
            
          if (jugador.Disparo(r)) {
          
              System.out.println(jugador.getNombre()+ " Fue eliminado");
              
              return;
             
          }else{
            
              System.out.println(jugador.getNombre()+ " Sigue en juego");
              //System.out.println("El jugador que se mojó es " +jugador);
              
             
              
          }
    
        }
        }while (true);
    }
    }


