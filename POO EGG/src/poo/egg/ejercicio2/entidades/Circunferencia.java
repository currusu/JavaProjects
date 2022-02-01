
package poo.egg.ejercicio2.entidades;
//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
//de tipo real. A continuación, se deben crear los siguientes métodos:

import java.util.Scanner;

//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crear Circunferencia(): que le pide el radio y lo guarda en el atributo
//del objeto.
//d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
//e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).

public class Circunferencia {
    
    //Radio vendría a ser un atributo
    
    private float radio;
    
    //Método constructor que inicializa radio pasado por parámetros
    
    public Circunferencia(float radio){
    
        this.radio=radio;
        
    }
     // Método constructor vacío
    
    public Circunferencia() {
    }
    
    
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

       //Método para crear circunferencia
    
    public void crearCircunferencia(){
    
        System.out.println("Por favor ingrese el radio");
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        radio = leer.nextFloat();
    }
     // Esto sería el método(función) para calcular el área y el retorno sería la fórmula
    
    public float area() {
        
      return (float) (Math.PI*Math.pow(radio,2));

     
}
  public float perímetro () {
  
      return (float) (2*(Math.PI)*radio);
  } 
}

