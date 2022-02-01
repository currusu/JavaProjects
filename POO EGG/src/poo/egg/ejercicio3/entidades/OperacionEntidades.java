package poo.egg.ejercicio3.entidades;
//Crear una clase llamada Operacion que tenga como atributos privados numero1 y
//numero2. A continuación, se deben crear los siguientes métodos:

import java.util.Scanner;

//a) Método constructor con todos los atributos pasados por parámetro.
//b) Metodo constructor sin los atributos pasados por parámetro.
//c) Métodos get y set.
//17
//d) Método para crearOperacion(): que le pide al usuario los dos números y los
//guarda en los atributos del objeto.
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
//si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
//error. Si no, se hace la multiplicación y se devuelve el resultado al main
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
//pasar una división por cero, el método devuelve 0 y se le informa al usuario el
//error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
//al main
public class OperacionEntidades {

    private int numero1;
    private int numero2;

    //Constructor con atributos por parámetros
    
    public OperacionEntidades(int numero1, int numero2) {

        this.numero1 = numero1;
        this.numero2 = numero2;

    }
    //Metodo constructor vacío

    public OperacionEntidades() {

    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    //Método para crear Operación
    
    public void crearOperacionEntidades() {

        System.out.println("Por favor ingrese el primer número");

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        numero1 = leer.nextInt();

        System.out.println("Por favor ingrese el segundo número");

        numero2 = leer.nextInt();

    }
    //Método para sumar (sería una función porque retorna un resultado)

    public int suma() {

        return numero1 + numero2;

    }
     
    //Método para restar
    
    public int resta() {

        return numero1 - numero2;

    }
    //Método multiplicacion. Con el if estoy validando
    //si la multiplicación está o no en cero. Las || significan "o"

    public int multiplicacion() {

        if (numero1 == 0 || numero2 == 0) {

            return 0;

        } else {

            return numero1 * numero2;

        }
    }
        //Acá estoy haciendo lo mismo que en la multiplicación
    
    public int division(){
    
        if(numero1 == 0 || numero2 == 0){
        
        return 0;
        
        } else {
            
            return numero1 / numero2;
        }
    }
    
}



