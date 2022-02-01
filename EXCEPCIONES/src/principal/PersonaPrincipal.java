
package principal;

import entidades.Persona;
import java.util.Scanner;
import servicios.PersonaServicios;

//Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar 
//de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el 
//código con una cláusula try-catch para probar la nueva excepción que debe ser 
//controlada

public class PersonaPrincipal {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Persona persona = null;
        
         PersonaServicios personauno = new PersonaServicios();
        
         try {
            personauno.esMayorDeEdad(persona);
        } catch (Exception e) {
             System.out.println(e.getMessage());
        }
             
          
          
             
             
             
             
         }
         
         
        
        //Persona personaDos = personauno.crearPersona();
       
        //Persona personaTres = personauno.crearPersona();
        
        //Persona personaCuatro = personauno.crearPersona();
        
        //Persona personaCinco = personauno.crearPersona();
        
        
       // personauno.calcularIMC(personaDos);
       // personauno.calcularIMC(personaTres);
       // personauno.calcularIMC(personaCuatro);
       // personauno.calcularIMC(personaCinco);
       // personauno.esMayorDeEdad(personaDos);
       // personauno.esMayorDeEdad(personaTres);
       // personauno.esMayorDeEdad(personaCuatro);
       // personauno.esMayorDeEdad(personaCinco);
        
        //Estas variables son cinco porque
        //sirven 3 para lo del IMC y 2 para la edad
        //Además son mis contadores
       // int a =0;
       // int b =0;
       // int c =0;
       // int d =0;
       // int e =0;
        
        //Cálculo de cuantas personas están en su peso
        //con sobrepeso o bajo peso
        
       // if (personauno.calcularIMC(personaDos)==0){
           
       // a++;
       // }
       // if(personauno.calcularIMC(personaDos)==1){
        
       // b++;
       // }
       // if(personauno.calcularIMC(personaDos)==-1){
        
        //c++; 
        //}
            
       // if(personauno.calcularIMC(personaTres)==0){
        
       // a++;
       // }    
        // if(personauno.calcularIMC(personaTres)==1)   
        
        //b++;
         
        // if(personauno.calcularIMC(personaTres)==-1){
             
        // c++;
        // }
         
        // if(personauno.calcularIMC(personaCuatro)==0){
         
        // a++;
        // }
        // if(personauno.calcularIMC(personaCuatro)==1){
         
        // b++;
        // }
         
        // if(personauno.calcularIMC(personaCuatro)==-1){
             
        // c++;
        // }
         
        // if(personauno.calcularIMC(personaCinco)==0){
         
        // a++;
        // }
         
        // if(personauno.calcularIMC(personaCinco)==1){
         
        // b++;
        // }
         
        // if(personauno.calcularIMC(personaCinco)==-1){
         
        // c++;
        // }
         
         //Cálculo de cuantas personas 
         //son mayores de edad y cuantas no
         
        // if(personauno.esMayorDeEdad(personaDos)==true){
         
        // d++;
        // }
        // if(personauno.esMayorDeEdad(personaDos)==false){
         
        // e++;
        // }
         
        // if(personauno.esMayorDeEdad(personaTres)==true){
         
        // d++;
        // }
        // if(personauno.esMayorDeEdad(personaTres)==false){
         
        // e++;
        // }
        // if(personauno.esMayorDeEdad(personaCuatro)==true){
         
        // d++;
        // }
        // if(personauno.esMayorDeEdad(personaCuatro)==false){
             
        // e++;
        // }
        // if(personauno.esMayorDeEdad(personaCinco)==true){
             
        // d++;
        // }
        // if(personauno.esMayorDeEdad(personaCinco)==false){
         
        // e++;
        // }
         
         //Cálculo del porcentaje de personas
         //con bajo peso.El case indica la cantidad
         //de personas.
         
        // switch (1){
         
//         case 0: System.out.println("El porcentaje de personas que están con bajo peso es de: " + 0 + "%" );
//         break;
//         case 1: System.out.println("El porcentaje de personas que están con bajo peso es de: " + 25 + "%");
//         break;
//         case 2: System.out.println("El porcentaje de personas que están con bajo peso es de: " + 50 + "%");
//         break;
//         case 3: System.out.println("El porcentaje de personas que están con bajo peso es de: " + 75 + "%");
//         break;
//         case 4: System.out.println("El porcentaje de personas que están con bajo peso es de: " + 100 + "%");
//         }
//         //Cálculo de porcentaje de personas que están
//         //con sobrepeso
//         
//         switch (2){
//         case 0: System.out.println("El porcentaje de personas que están con sobrepeso es de: " + 0 + "%" );
//         break;
//         case 1: System.out.println("El porcentaje de personas que están con sobrepeso es de: " + 25 + "%");
//         break;
//         case 2: System.out.println("El porcentaje de personas que están con sobrepeso es de: " + 50 + "%");
//         break;
//         case 3: System.out.println("El porcentaje de personas que están con sobrepeso es de: " + 75 + "%");
//         break;
//         case 4: System.out.println("El porcentaje de personas que están con sobrepeso es de: " + 100 + "%");
//         }
//         
//         //Cálculo de porcentaje de personas que están 
//         //con peso ideal
//         
//         switch(3){
//         case 0: System.out.println("El porcentaje de personas que están con peso ideal es de: " + 0 + "%" );
//         break;
//         case 1: System.out.println("El porcentaje de personas que están con peso ideal es de: " + 25 + "%");
//         break;
//         case 2: System.out.println("El porcentaje de personas que están con peso ideal es de: " + 50 + "%");
//         break;
//         case 3: System.out.println("El porcentaje de personas que están con peso ideal es de: " + 75 + "%");
//         break;
//         case 4: System.out.println("El porcentaje de personas que están con peso ideal es de: " + 100 + "%");
//         
//       }
//         
//         //Cálculo de porcentaje de personas
//         //mayores de edad
//         
//         switch(4){
//         case 0: System.out.println("El porcentaje de personas que son mayores de edad es de: " + 0 + "%" );
//         break;
//         case 1: System.out.println("El porcentaje de personas que son mayores de edad  es de: " + 25 + "%");
//         break;
//         case 2: System.out.println("El porcentaje de personas que son mayores de edad es de: " + 50 + "%");
//         break;
//         case 3: System.out.println("El porcentaje de personas que son mayores de edad  es de: " + 75 + "%");
//         break;
//         case 4: System.out.println("El porcentaje de personas que son mayores de edad  es de: " + 100 + "%");
//         
//    }
//    
//        //Cálculo de porcentaje de personas
//       //menores de edad
//    switch(5){
//         case 0: System.out.println("El porcentaje de personas que son menores de edad es de: " + 0 + "%" );
//         break;
//         case 1: System.out.println("El porcentaje de personas que son menores de edad  es de: " + 25 + "%");
//         break;
//         case 2: System.out.println("El porcentaje de personas que son menores de edad es de: " + 50 + "%");
//         break;
//         case 3: System.out.println("El porcentaje de personas que son menores de edad  es de: " + 75 + "%");
//         break;
//         case 4: System.out.println("El porcentaje de personas que son menores de edad  es de: " + 100 + "%");
//    
//    
//}
//
   }
   

