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
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego

package Ejercicio2Entidades;

import java.util.Scanner;


public class Revolver {
    
    private int posicionactual;
    private int posicionagua;

    public Revolver(int posicionactual, int posicionagua) {
        this.posicionactual = posicionactual;
        this.posicionagua = posicionagua;
    }

    public Revolver() {
    }

    public int getPosicionactual() {
        return posicionactual;
    }

    public void setPosicionactual(int posicionactual) {
        this.posicionactual = posicionactual;
    }

    public int getPosicionagua() {
        return posicionagua;
    }

    public void setPosicionagua(int posicionagua) {
        this.posicionagua = posicionagua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionactual=" + posicionactual + ", posicionagua=" + posicionagua + '}';
    }
    
    //Acá declaré e instancié la clase Scanner
  
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //Se le suma 1 para evitar que cuente a partir de 0. Agregando 1 posición
       //la primera va a ser 1 y no 0 como es de costumbre.
       //En este caso el (int) lo que hace es castear. Castear es forzar a otro
       //tipo de dato lo que originalmente devuelve el método utilizado. En este
       //caso el método casteado es el Math que devuelve datos float y double.
    
    public void  llenarRevolver(){
        
       
      posicionactual= (int) (Math.random()*6+1);
        
    }
    
      //Este método dice que si la posición de agua es igual a la
      //posición actual  la variable que por defecto es falsa, va a ser verdadera.
    
    public boolean mojar(){
        
        boolean aux = false;
        
       
        if(posicionagua==posicionactual){
            
            aux=true;
        }

        return aux;
      
    }
    
       //Este método quiere decir que cuando las veces que 
      //se aprieta el gatillo lleguen a 6 que es el máximo
      //vuelva a 0 y empiece de nuevo
    
        
    public void siguienteChorro(){
        
        posicionactual = posicionactual +1;
        
        if (posicionactual<=6){
        
            posicionactual=0;
        
        }
    
       // int contador = 0;
        
        //for (int i = 0; i <=revolver.getPosicionagua(); i++) {
           //contador++;
           // System.out.println(i);
          
        //if(revolver.getPosicionactual()>revolver.getPosicionagua())
            
                //System.out.println("La posición no existe");
               
        //}
       
   }

    //Acá solo se invocaron los métodos
    
    public static void toString (Revolver revolver){
   
       System.out.println(revolver.getPosicionactual());
       System.out.println(revolver.getPosicionagua());
    
    }



}





    
    
    
    

