
package poo.egg.ejercicio7.principal;

import poo.egg.ejercicio7.entidades.Persona;
import poo.egg.ejercicio7.servicios.PersonaServicios;


public class PersonaPrincipal {
//Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
//sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
//otro atributo, puede hacerlo. Los métodos que se implementarán son:
//• Un constructor por defecto.
//• Un constructor con todos los atributos como parámetro.
//• Métodos getters y setters de cada atributo.
//• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//O. Si no es correcto se deberá mostrar un mensaje
//• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
//que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
//fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
//está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
//fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.
//• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.
//A continuación, en la clase main hacer lo siguiente:
//Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
//los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
//tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
//persona es mayor de edad.
//Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
//en distintas variables, para después en el main, calcular un porcentaje de esas 4
//personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
//encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
//cuantos menores

    
    public static void main(String[] args) {
       
        PersonaServicios personauno = new PersonaServicios();
        
        Persona personaDos = personauno.crearPersona();
       
        Persona personaTres = personauno.crearPersona();
        
        Persona personaCuatro = personauno.crearPersona();
        
        Persona personaCinco = personauno.crearPersona();
        
        
        personauno.calcularIMC(personaDos);
        personauno.calcularIMC(personaTres);
        personauno.calcularIMC(personaCuatro);
        personauno.calcularIMC(personaCinco);
        personauno.esMayorDeEdad(personaDos);
        personauno.esMayorDeEdad(personaTres);
        personauno.esMayorDeEdad(personaCuatro);
        personauno.esMayorDeEdad(personaCinco);
        
        //Estas variables son cinco porque
        //sirven 3 para lo del IMC y 2 para la edad
        //Además son mis contadores
        int a =0;
        int b =0;
        int c =0;
        int d =0;
        int e =0;
        
        //Cálculo de cuantas personas están en su peso
        //con sobrepeso o bajo peso
        
        if (personauno.calcularIMC(personaDos)==0){
           
        a++;
        }
        if(personauno.calcularIMC(personaDos)==1){
        
        b++;
        }
        if(personauno.calcularIMC(personaDos)==-1){
        
        c++; 
        }
            
        if(personauno.calcularIMC(personaTres)==0){
        
        a++;
        }    
         if(personauno.calcularIMC(personaTres)==1)   
        
        b++;
         
         if(personauno.calcularIMC(personaTres)==-1){
             
         c++;
         }
         
         if(personauno.calcularIMC(personaCuatro)==0){
         
         a++;
         }
         if(personauno.calcularIMC(personaCuatro)==1){
         
         b++;
         }
         
         if(personauno.calcularIMC(personaCuatro)==-1){
             
         c++;
         }
         
         if(personauno.calcularIMC(personaCinco)==0){
         
         a++;
         }
         
         if(personauno.calcularIMC(personaCinco)==1){
         
         b++;
         }
         
         if(personauno.calcularIMC(personaCinco)==-1){
         
         c++;
         }
         
         //Cálculo de cuantas personas 
         //son mayores de edad y cuantes no
         
         if(personauno.esMayorDeEdad(personaDos)==true){
         
         d++;
         }
         if(personauno.esMayorDeEdad(personaDos)==false){
         
         e++;
         }
         
         if(personauno.esMayorDeEdad(personaTres)==true){
         
         d++;
         }
         if(personauno.esMayorDeEdad(personaTres)==false){
         
         e++;
         }
         if(personauno.esMayorDeEdad(personaCuatro)==true){
         
         d++;
         }
         if(personauno.esMayorDeEdad(personaCuatro)==false){
             
         e++;
         }
         if(personauno.esMayorDeEdad(personaCinco)==true){
             
         d++;
         }
         if(personauno.esMayorDeEdad(personaCinco)==false){
         
         e++;
         }
         
         //Cálculo del porcentaje de personas
         //con bajo peso.El case indica la cantidad
         //de personas.
         
         switch (1){
         
         case 0: System.out.println("El porcentaje de personas que están con bajo peso es de: " + 0 + "%" );
         break;
         case 1: System.out.println("El porcentaje de personas que están con bajo peso es de: " + 25 + "%");
         break;
         case 2: System.out.println("El porcentaje de personas que están con bajo peso es de: " + 50 + "%");
         break;
         case 3: System.out.println("El porcentaje de personas que están con bajo peso es de: " + 75 + "%");
         break;
         case 4: System.out.println("El porcentaje de personas que están con bajo peso es de: " + 100 + "%");
         }
         //Cálculo de porcentaje de personas que están
         //con sobrepeso
         
         switch (2){
         case 0: System.out.println("El porcentaje de personas que están con sobrepeso es de: " + 0 + "%" );
         break;
         case 1: System.out.println("El porcentaje de personas que están con sobrepeso es de: " + 25 + "%");
         break;
         case 2: System.out.println("El porcentaje de personas que están con sobrepeso es de: " + 50 + "%");
         break;
         case 3: System.out.println("El porcentaje de personas que están con sobrepeso es de: " + 75 + "%");
         break;
         case 4: System.out.println("El porcentaje de personas que están con sobrepeso es de: " + 100 + "%");
         }
         
         //Cálculo de porcentaje de personas que están 
         //con peso ideal
         
         switch(3){
         case 0: System.out.println("El porcentaje de personas que están con peso ideal es de: " + 0 + "%" );
         break;
         case 1: System.out.println("El porcentaje de personas que están con peso ideal es de: " + 25 + "%");
         break;
         case 2: System.out.println("El porcentaje de personas que están con peso ideal es de: " + 50 + "%");
         break;
         case 3: System.out.println("El porcentaje de personas que están con peso ideal es de: " + 75 + "%");
         break;
         case 4: System.out.println("El porcentaje de personas que están con peso ideal es de: " + 100 + "%");
         
       }
         
         //Cálculo de porcentaje de personas
         //mayores de edad
         
         switch(4){
         case 0: System.out.println("El porcentaje de personas que son mayores de edad es de: " + 0 + "%" );
         break;
         case 1: System.out.println("El porcentaje de personas que son mayores de edad  es de: " + 25 + "%");
         break;
         case 2: System.out.println("El porcentaje de personas que son mayores de edad es de: " + 50 + "%");
         break;
         case 3: System.out.println("El porcentaje de personas que son mayores de edad  es de: " + 75 + "%");
         break;
         case 4: System.out.println("El porcentaje de personas que son mayores de edad  es de: " + 100 + "%");
         
    }
    
        //Cálculo de porcentaje de personas
       //menores de edad
    switch(5){
         case 0: System.out.println("El porcentaje de personas que son menores de edad es de: " + 0 + "%" );
         break;
         case 1: System.out.println("El porcentaje de personas que son menores de edad  es de: " + 25 + "%");
         break;
         case 2: System.out.println("El porcentaje de personas que son menores de edad es de: " + 50 + "%");
         break;
         case 3: System.out.println("El porcentaje de personas que son menores de edad  es de: " + 75 + "%");
         break;
         case 4: System.out.println("El porcentaje de personas que son menores de edad  es de: " + 100 + "%");
    
    
}

}}

