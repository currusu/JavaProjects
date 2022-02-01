
package Ejercicio1.Entidades;

//Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
//dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
//Persona con atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
//que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
//mostrar desde la clase Persona, la información del Perro y de la Persona.

public class Persona {
    
    private String nombre;
    private String apellido;
    private String edad;
    private String documento;
    private Perro perro;

    public Persona(String nombre, String apellido, String edad, String documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro + '}';
    
    }
    
    //Este método es lo que va a mostrarse por pantalla. El objeto persona
    //solo indica el parámetro que necesita el método mostraPersona para 
    //funcionar y Persona es la clase. Estas SIEMPRE van con mayúsculas.La máquina
    //en este caso solo identifica las posiciones. Clase con mayúsculas y en posicion 1.
    //Parámetro en posición 2 y con minúsculas. De esta manera se relaciona este método
    //con la clase Persona.
    
    public void mostrarPersona(Persona persona){
    
        System.out.println(persona);
    
    }
   
   
   }





            
   
       
  
    

