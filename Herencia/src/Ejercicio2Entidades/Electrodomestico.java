package Ejercicio2Entidades;
//Crear una superclase llamada Electrodomestico con los siguientes atributos:
//precio, color, consumo energético (letras entre A y F) y peso.

import java.util.Scanner;

//Los constructores que se deben implementar son los siguientes:
//• Un constructor vacío.
//• Un constructor con todos los atributos pasados por parámetro.
//Los métodos a implementar son:
//• Métodos getters y setters de todos los atributos.
//11
//• Método comprobarConsumoEnergetico(char letra): comprueba que la letra
//es correcta, sino es correcta usara la letra F por defecto. Este método se debe
//invocar al crear el objeto y no será visible.
//• Método comprobarColor(String color): comprueba que el color es correcto, y
//si no lo es, usa el color blanco por defecto. Los colores disponibles para los
//electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
//está en mayúsculas o en minúsculas. Este método se invocará al crear el
//objeto y no será visible.
//• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el
//consumo. Al precio se le da un valor base de $1000.
//• Método precioFinal(): según el consumo energético y su tamaño, aumentará
//el valor del precio. Esta es la lista de precios:

//LETRA PRECIO 
//A $1000
//B $800
//C $600
//D $500
//E $300
//F $100
//PESO PRECIO 
//Entre 1 y 19 kg $100
//Entre 20 y 49 kg $500
//Entre 50 y 79 kg $800
//Mayor que 80 kg $1000


//A continuación se debe crear una subclase llamada Lavadora, con el atributo
//carga, además de los atributos heredados.
//Los constructores que se implementarán serán:
//• Un constructor vacío.
//• Un constructor con la carga y el resto de atributos heredados. Recuerda que
//debes llamar al constructor de la clase padre.
//Los métodos que se implementara serán:
//• Método get y set del atributo carga.
//• Método crearLavadora (): este método llama a crearElectrodomestico() de la
//clase padre, lo utilizamos para llenar los atributos heredados del padre y
//después llenamos el atributo propio de la lavadora.

//• Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
//si la carga es menor o igual, no se incrementará el precio. Este método debe
//llamar al método padre y añadir el código necesario. Recuerda que las
//condiciones que hemos visto en la clase Electrodomestico también deben
//afectar al precio.
//Se debe crear también una subclase llamada Televisor con los siguientes
//atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
//atributos heredados.
//Los constructores que se implementarán serán:
//• Un constructor vacío.
//• Un constructor con la resolución, sintonizador TDT y el resto de atributos
//heredados. Recuerda que debes llamar al constructor de la clase padre.
//Los métodos que se implementara serán:
//• Método get y set de los atributos resolución y sintonizador TDT.
//• Método crearTelevisor(): este método llama a crearElectrodomestico() de la
//clase padre, lo utilizamos para llenar los atributos heredados del padre y
//después llenamos los atributos del televisor.
//• Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
//aumentará $500. Recuerda que las condiciones que hemos visto en la clase
//Electrodomestico también deben afectar al precio.
//Finalmente, en el main debemos realizar lo siguiente:
//Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
//para mostrar el precio final de los dos electrodomésticos
public class Electrodomestico {

    //Crear una superclase llamada Electrodomestico con los siguientes atributos:
//precio, color, consumo energético (letras entre A y F) y peso.
//Los constructores que se deben implementar son los siguientes:
//• Un constructor vacío.
//• Un constructor con todos los atributos pasados por parámetro.
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected Integer precio;
    protected String color;
    protected String consumoenergetico;
    protected Integer peso;

    public Electrodomestico(Integer precio, String color, String consumoenergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoenergetico = consumoenergetico;

        this.peso = peso;
    }

    public Electrodomestico() {

    }

    //Los métodos a implementar son:
//• Métodos getters y setters de todos los atributos.
//11
//• Método comprobarConsumoEnergetico(char letra): comprueba que la letra
//es correcta, sino es correcta usara la letra F por defecto. Este método se debe
//invocar al crear el objeto y no será visible.
//• Método comprobarColor(String color): comprueba que el color es correcto, y
//si no lo es, usa el color blanco por defecto. Los colores disponibles para los
//electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
//está en mayúsculas o en minúsculas. Este método se invocará al crear el
//objeto y no será visible.
//• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el
//consumo. Al precio se le da un valor base de $1000.
//• Método precioFinal(): según el consumo energético y su tamaño, aumentará
//el valor del precio. Esta es la lista de precios:
//LETRA PRECIO 
//A $1000
//B $800
//C $600
//D $500
//E $300
//F $100
//PESO PRECIO 
//Entre 1 y 19 kg $100
//Entre 20 y 49 kg $500
//Entre 50 y 79 kg $800
//Mayor que 80 kg $1000
    
    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoenergetico() {
        return consumoenergetico;
    }

    public void setConsumoenergetico(String consumoenergetico) {
        this.consumoenergetico = consumoenergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoenergetico=" + consumoenergetico + ", peso=" + peso + '}';
    }

    //• Método comprobarConsumoEnergetico(char letra): comprueba que la letra
//es correcta, sino es correcta usara la letra F por defecto. Este método se debe
//invocar al crear el objeto y no será visible.
    
    private void comprobarConsumoEnergetico() {

        if (consumoenergetico != ("A").toUpperCase() || consumoenergetico != ("B").toUpperCase() || consumoenergetico != ("C").toUpperCase() || consumoenergetico != ("D").toUpperCase() || consumoenergetico != ("E").toUpperCase()) {

            this.consumoenergetico = "F";
        } else {

            this.consumoenergetico = consumoenergetico;

        }

    }

//• Método comprobarColor(String color): comprueba que el color es correcto, y
//si no lo es, usa el color blanco por defecto. Los colores disponibles para los
//electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
//está en mayúsculas o en minúsculas. Este método se invocará al crear el
//objeto y no será visible.
    
    private void comprobarColor() {

        if (color != ("Blanco").toUpperCase() || color != ("Negro").toUpperCase() || color != ("Rojo").toUpperCase() || color != ("Azul").toUpperCase() || color != ("Gris").toUpperCase()) {

            this.color = "blanco";
           
            System.out.println("El color ingresado no existe. El electrodoméstico será blanco por defecto");
           
        }

    }

    //• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el
//consumo. Al precio se le da un valor base de $1000.
    // Para hacer comentarios parciales escribir /* y */
    
    public void crearElectrodomestico(/*Integer peso, Integer precio, String color,  String consumoenergetico*/) {

        System.out.println("Por favor ingrese el peso del electrodoméstico");

        peso = leer.nextInt();

        System.out.println("Por favor ingrese el color del electrodoméstico");

        String color = leer.next();

        comprobarColor();

        System.out.println("Por favor ingrese el consumo energético del electrodoméstico");

        String letras = leer.next();

        comprobarConsumoEnergetico();

        precio = 1000;

    }

    //• Método precioFinal(): según el consumo energético y su tamaño, aumentará
//el valor del precio. Esta es la lista de precios:
//LETRA PRECIO 
//A $1000
//B $800
//C $600
//D $500
//E $300
//F $100
//PESO PRECIO 
//Entre 1 y 19 kg $100
//Entre 20 y 49 kg $500
//Entre 50 y 79 kg $800
//Mayor que 80 kg $1000
    
    public void precioFinal() {

        switch (consumoenergetico) {
            
            case "A":
               
                if (peso>=1 && peso<=19){
                
                    precio=precio + 1100;
                
                }
                
                if(peso>=20 && peso<=49){
                
                precio=precio + 1500;
                
                }
                
                if(peso>=50 && peso<=79){
                
                    precio=precio + 1800;
                }
                
                if(peso>=80){
                
                precio=precio + 2000;
                
                }
               
                break;
            
            case "B":
                
               if (peso>=1 && peso<=19){
                
                    precio=precio + 900;
                
                }
                
                if(peso>=20 && peso<=49){
                
                precio=precio + 1300;
                
                }
                
                if(peso>=50 && peso<=79){
                
                    precio=precio + 1600;
                }
                
                if(peso>=80){
                
                precio=precio + 1800;
                
                } 
                break;
                
             case "C":
                
               if (peso>=1 && peso<=19){
                
                    precio=precio + 700;
                
                }
                
                if(peso>=20 && peso<=49){
                
                precio=precio + 1100;
                
                }
                
                if(peso>=50 && peso<=79){
                
                    precio=precio + 1400;
                }
                
                if(peso>=80){
                
                precio=precio + 1600;
                
                } 
                break; 
                
              case "D":
                
               if (peso>=1 && peso<=19){
                
                    precio=precio + 600;
                
                }
                
                if(peso>=20 && peso<=49){
                
                precio=precio + 1000;
                
                }
                
                if(peso>=50 && peso<=79){
                
                    precio=precio + 1300;
                }
                
                if(peso>=80){
                
                precio=precio + 1500;
                
                } 
                break;  
                
                case "E":
                
               if (peso>=1 && peso<=19){
                
                    precio=precio + 400;
                
                }
                
                if(peso>=20 && peso<=49){
                
                precio=precio + 800;
                
                }
                
                if(peso>=50 && peso<=79){
                
                    precio=precio + 1100;
                }
                
                if(peso>=80){
                
                precio=precio + 1300;
                
                } 
                break;  
                
                case "F":
                
               if (peso>=1 && peso<=19){
                
                    precio=precio + 200;
                
                }
                
                if(peso>=20 && peso<=49){
                
                precio=precio + 400;
                
                }
                
                if(peso>=50 && peso<=79){
                
                    precio=precio + 900;
                }
                
                if(peso>=80){
                
                precio=precio + 1100;
                
                } 
                break; 
        }

    }

    

}
