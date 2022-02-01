
package servicios;

import entidades.Persona;
import java.util.Scanner;


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
