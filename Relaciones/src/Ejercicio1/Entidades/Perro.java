package Ejercicio1.Entidades;

//Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
//dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
//Persona con atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
//que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
//mostrar desde la clase Persona, la información del Perro y de la Persona.

public class Perro {
    
    private String nombre;
    private String raza;
    private String edad;
    private String tamaño;

    public Perro(String nombre, String raza, String edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public Perro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
    
}