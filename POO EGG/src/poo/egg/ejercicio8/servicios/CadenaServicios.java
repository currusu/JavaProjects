package poo.egg.ejercicio8.servicios;
//Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
//String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese

import java.util.Scanner;
import poo.egg.ejercicio8.entidades.Cadena;

//una frase que puede ser una palabra o varias palabras separadas por un espacio en
//blanco y a través de los métodos set, se guardará la frase y la longitud de manera
//automática según la longitud de la frase ingresada. Deberá además implementar los
//siguientes métodos: 
//• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//frase ingresada.
//• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
//por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
//• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
//ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
//frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
//• Método compararLongitud(String frase), deberá comparar la longitud de la frase
//que compone la clase con otra nueva frase ingresada por el usuario.
//• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.
//• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y
//mostrar la frase resultante.
//• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no
public class CadenaServicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Método Crear Cadena
    public Cadena crearCadena() {

        System.out.println("Por favor ingrese una frase");

        String frase = leer.next();

        Cadena cadena = new Cadena();

        //Con estos comandos se guardan frase y longitud
        //automáticamente
        cadena.setFrase(frase);

        cadena.setLongitud(frase.length());

        return cadena;
    }

    //Método Mostrar Vocales
    public void mostrarVocales(Cadena cadena) {

        int vocal = 0;
        
        int contador = 1;
        
        for (int i = 0; i < cadena.getLongitud(); i++) {

            char letra = cadena.getFrase().charAt(i);

            if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u')){
                
            contador++;
            }
        }
      System.out.println("La cantidad de vocales son " +contador);
    }

    //Método Invertir Frase
    public void inverirFrase(Cadena cadena) {

        StringBuilder sb = new StringBuilder(cadena.getFrase());

        System.out.println(sb.reverse());

    }

    //Método Veces Repetido
    public void VecesRepetido(Cadena cadena) {

        //Acá cuento cuantas veces se repite una misma letra
        //dentro de la frase ingresada al principio
        //por el usuario
        
        System.out.println("Por favor ingrese un caracter");

        String letra = leer.next();

        int contador = 0;

        for (int i = 0; i < cadena.getLongitud(); i++) {

            if (cadena.getFrase().substring(i, i + 1).equals(letra)) {

                contador++;

            }
            System.out.println("La letra se repite " + contador + "veces");

        }

    }

    //Método Comparar Longitud
    
    public void CompararLongitud(Cadena cadena) {

        System.out.println("Por favor ingrese una nueva frase");

        String nuevafrase = leer.next();

        //Acá lo que hice fue invocar length en mi frase original
        //para poder comparar con el length  de la nueva frase
        if (cadena.getFrase().length() == nuevafrase.length()) {

            System.out.println("Son de la misma longitud");

        } else {

            System.out.println("No son de la misma longitud");
        }

    }

        //Método Unir Frase
    
    public void UnirFrase(Cadena cadena) {

        System.out.println("Por favor ingrese otra nueva frase");

        String nuevafrasedos = leer.next();

        //Acá lo que hice fue crear un objeto nuevo 
        //que se llama sb y mediante este, pude generar
        //un vinculo entre mi frase original y la nueva
        //para unirlas. Por pantalla puse el nombre del objeto
        //porque justamente es lo que representa a mis 
        //dos frases
        
        StringBuffer sb = new StringBuffer();

        sb.append(cadena.getFrase());

        sb.append(nuevafrasedos);

        System.out.println(sb);
    }

        //Método reemplazar
    
    public void Reemplazar(Cadena cadena) {

        System.out.println("Por favor ingrese un caracter");

        //Acá en este método lo que hice fue crear una variable
        //de tipo char,porque le asigné una fórmula que recorre
        //caracter por caracter a mi cadena. Después en el IF
        //la usé para comparar con "A". Después en acciones del IF
        //puse set frase porque este método modifica y despúes usé
        //get frase porque me toma la frase que modifiqué y reemplaza
        //las letra "a" que es lo que pide el enunciado.
        
        char letra1 = leer.next().charAt(0);

        int vocal = 0;

        for (int i = 0; i < cadena.getLongitud(); i++) {

            char recorrerpalabra = cadena.getFrase().charAt(i);

            if (recorrerpalabra == 'a') {

                cadena.setFrase(cadena.getFrase().replace('a', letra1));

            }

        }
        System.out.println(cadena.getFrase());
    }
    
      //Método Contiene
    
       public boolean Contiene(Cadena cadena){
        
           System.out.println("Por favor ingrese una letra");
           
           String letra2 = leer.next();
           
           if(cadena.getFrase().contains(letra2)){
           
               System.out.println("Si se encontró");
              
           }else{
                
               System.out.println("No se encontró");
           }
        return false;
        
           
          
           
           
                   
                   
       
       }

}
