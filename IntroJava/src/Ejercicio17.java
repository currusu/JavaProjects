
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
public class Ejercicio17 {

    /**Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
carácter tiene que ser X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
secuencia distinta de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
se utilizan las siguientes funciones de Java Substring(), Length(), equals.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
       
        
        //Declaracion de variables
        
        String cadena;
        
        int longitud,i,contador,contadorincorrecto;
      
        longitud = 0;
        
        contador=0;
        
        contadorincorrecto=0;
        
       do{
         
           System.out.println("Ingrese una palabra");
           
           cadena=leer.next();
           longitud=cadena.length();
           //Los paréntesis tienen que estar de manera tal que la línea
           //esté dividida en términos.
           
           //
           
           if(cadena.substring(0,1).equalsIgnoreCase("X") && cadena.substring(longitud-1,longitud).equalsIgnoreCase("O") && longitud==5){
             
           //Este contador es para contar cuantos datos fueron ingresados CORRECTAMENTE
      
           contador=(contador+1);
            
           
           }else{contadorincorrecto=contadorincorrecto+1;
               
               
           }
           
        
    }while(!cadena.equals("&&&&&"));
    
        System.out.println("El dato ingresado es correcto");         
        System.out.println("Las palabras correctas son: " + contador);
        System.out.println("Las palabras incorrectas son:"+ contadorincorrecto);
        
        // TODO code application logic here
       }
    
}
    

