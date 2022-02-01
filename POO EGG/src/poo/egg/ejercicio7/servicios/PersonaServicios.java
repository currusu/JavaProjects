package poo.egg.ejercicio7.servicios;
//Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
//sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún

import java.util.Scanner;
import poo.egg.ejercicio7.entidades.Persona;

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
public class PersonaServicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        System.out.println("Por favor ingese un nombre");

        String nombre = leer.next();

        System.out.println("Por favor ingrese la edad");

        float edad = leer.nextFloat();

        String sexo1;

        do {
            System.out.println("Por favor ingrese el sexo de la persona en mayúsculas");

            String sexo = leer.next();

            if ("H".equals(sexo) || "M".equals(sexo) || "O".equals(sexo)) {

                sexo1 = sexo;

            } else {

                sexo1 = "Equivocado";
            }
        } while ("Equivocado".equals(sexo1));

        System.out.println("Por favor ingrese el peso");

        float peso = leer.nextFloat();

        System.out.println("Por favor ingrese la altura");

        float altura = leer.nextFloat();

        Persona humana = new Persona();

        humana.setNombre(nombre);
        humana.setEdad(edad);
        humana.setSexo(sexo1);
        humana.setPeso(peso);
        humana.setAltura(altura);

        return humana;
    }

    public float calcularIMC(Persona humana) {

        //Esta variable es la que voy a utilizar 
        //para los valores 0,1 y -1 de la condición
        //IF
        float P = 0;

        float IMC = (float) (humana.getPeso() / (Math.pow(humana.getAltura(), 2)));

        if (IMC < 20) {

            //P = -1;
            System.out.println("Ud se encuentra por debajo de su peso ideal");

            return -1;
        }

        if (IMC >= 20 || IMC <= 25) {

            //P=0; 
            System.out.println("Ud se encuentra en su peso ideal");

            return 0;
        }
        
        if (IMC>25){
            
            System.out.println("Ud tiene sobrepeso"); 
        
        }
        return 1;
    }

    public boolean esMayorDeEdad(Persona humana) {

        boolean T = true;

        boolean F = false;

        if (humana.getEdad() > 18) {

            T = true;

            System.out.println("Ud es mayor de edad");
        }

        if (humana.getEdad() < 18) {

            F = false;

            System.out.println("Ud es menor de edad");
        }

        return humana.getEdad() > 18;
    }

}
