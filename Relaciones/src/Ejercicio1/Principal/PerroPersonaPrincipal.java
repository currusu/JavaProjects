
package Ejercicio1.Principal;

import Ejercicio1.Entidades.Perro;
import Ejercicio1.Entidades.Persona;


public class PerroPersonaPrincipal {
    
//Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
//dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
//Persona con atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
//que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
//mostrar desde la clase Persona, la información del Perro y de la Persona.

    
    public static void main(String[] args) {
        
        
        Perro perro1 = new Perro ("Olivia", "San Bernardo", "10", "Gigangte");
        Perro perro2 = new Perro ("Alfie", "Maltés", "8" , "Pequeño");
        Persona persona1 = new Persona("Julieta", "Jiménez", "20", "39.147.654",perro1);
        Persona persona2 = new Persona("Mariana","Rodriguez", "40", "30.123.756",perro2);
       
        
        
        persona1.mostrarPersona(persona1);
        persona2.mostrarPersona(persona2);
    }}       
       
    
    
