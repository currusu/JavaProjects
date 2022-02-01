
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nati
 */
public class Ejercicio23 {
//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
//pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
//encuentra el numero y si se encuentra repetido

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Por favor ingrese el tamaño del vector");

        int n = leer.nextInt();

        int[] vector = new int[n];
        
        System.out.println("Su vector es");
        
        //Acá invoqué el subproceso. Hay que ponerle el nombre que tiene en el main
        //para que ande.
        
        llenarvector(vector);
        
        System.out.println("Por favor diga que número desea buscar");

        int x = leer.nextInt();
        
        System.out.println("Las posiciones del número que busca son");
        
        buscarnumero(vector,x);
        
        // TODO code application logic here
    }

    public static void llenarvector(int[] v) {

        //Aca defini i dentro del vector con int
        for (int i = 0; i < v.length; i++) {

            //El número 10 es el limite sin incluir
            v[i] = (int) (Math.random() * 10);

            System.out.println(v[i]);

        }

    }

    public static void buscarnumero(int[] v, int m) {

        int contador=0;
        
             //Esta expresión es la que indica que número estoy buscando
        for (int i = 0; i < v.length ; i++ ) {
            
            //Esta expresion es la que indica si el número está repetido
            if (v [i] == m){
            
                //Contador indica cuantas veces se repite el número
                
                contador=(contador+1);
                
                //En este caso i viene a ser la posicion donde se encuentra
                //el número buscado. El +1 es para que las posiciones empiecen
                //desde 1 y no desde 0.
                
                System.out.println(i+1);
                
            }
            
        }
        System.out.println("Las veces que se repite su número son " + contador);
    }
    
}
