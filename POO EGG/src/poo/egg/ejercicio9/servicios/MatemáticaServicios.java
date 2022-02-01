package poo.egg.ejercicio9.servicios;
//Realizar una clase llamada Matemática que tenga como atributos dos números reales
//con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener

import java.util.Scanner;
import poo.egg.ejercicio9.entidades.Matemática;

//un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
//usará el Math.random para generar los dos números y se guardaran en el objeto con
//su respectivos set. Deberá además implementar los siguientes métodos: 
//• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
//valor
//20
//• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
//• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número

public class MatemáticaServicios {

    //Método Crear Matemáticas
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Matemática crearMatemática() {

        System.out.println("Por favor ingrese un número");

        double numero = leer.nextDouble();

        System.out.println("Por favor ingrese otro número");

        double numerodos = leer.nextDouble();

        Matemática matemática = new Matemática();
        
       
       matemática.setNumero(numero);
       
       matemática.setNumerodos(numerodos);
       
       return matemática;
        
        
    }

    //Método Devolver Mayor Y Menor
    
    public void DevolverMayorYmenor(Matemática matemática) {

        if(matemática.getNumero()>matemática.getNumerodos()){
        
        System.out.println("El número mayor es " + matemática.getNumero());
        
        
        }else{
            System.out.println("El número es menor");  
            
        }
        
        
    }
    
  
      //Método Calcular Potencia
    
    public void CalcularPotencia(Matemática matemática){
        
       double numero=0;
       
       double numerodos=0;
        
        Math.round(numero);
        
        Math.round(numerodos);
        
        double potencia = Math.pow(matemática.getNumero(),matemática.getNumerodos());
     
        
        System.out.println("La potencia del primer numero es "+ potencia);
        
        
    }
    
    //Método Calcular Raíz
    
    public void CalcularRaíz (Matemática matemática){
        
    double numerodos = 0;
        
        
        if(numerodos>0){
        
            double absoluto = numerodos * -1;
            
        
        }else{
            
            double absoluto = numerodos;
        }
    
        double cuadrada = Math.sqrt(matemática.getNumerodos());
        
        
        
        System.out.println("La raíz cuadrada es " +cuadrada);
        
    }
    
    
}
