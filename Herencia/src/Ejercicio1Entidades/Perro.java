
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

public class Perro extends Animal {

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Perro() {
        
        super();
    }
    
    
    
}
