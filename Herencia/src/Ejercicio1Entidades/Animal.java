
package Ejercicio1Entidades;

//Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
//La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
//Animal.
//Crear un método en la clase Animal a través del cual cada clase hija deberá
//mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
//una clase Main que realice lo siguiente:
    
    //public class Main{

    //public static void main(String[] args){
    
    //Declaración del objeto PERRO
    //Animal perro = new Perro ("Stitch","Carnívoro",15,"Doberman");
    //perro.Alimentarse();
    
    //Declaración de otro objeto PERRO
    //Perro perro1 = new Perro ("Teddy,"Croquetas",10,"Chihuahua");
    //perro1.Alimentarse();
    
    //Declaración del objeto GATO
    //Animal gato = new Gato ("Pelusa","Galletas",15,"Siames");
    //gato.Alimentarse();
    
    //Declaración del objeto CABALLO
    //Animal caballo = new Caballo ("Spark","Pasto",25,"Fino");
    //caballo.Alimentarse();
    
    
//}
//}

public class Animal {
    
   
   protected String nombre;
   protected String alimento;
   protected Integer edad;
   protected String raza;

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public Animal() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", edad=" + edad + ", raza=" + raza + '}';
    }
   
   public void Alimentarse(){
    
       System.out.println("El nombre es " +nombre+ " El animal se alimenta con " + alimento+ " Su edad es " +edad+ " Su raza es " +raza);
   
   }
    
}
