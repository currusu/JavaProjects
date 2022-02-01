
package poo.egg.ejercicio9.entidades;
//Realizar una clase llamada Matemática que tenga como atributos dos números reales
//con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
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

public class Matemática {
    
    private double numero;
    private double numerodos;
    
    //Constructor por parámetros
    
    public Matemática (double numero,double numerodos){
    
    this.numero=numero;
    this.numerodos=numerodos;
  
    }
    //Constructor vacío
    
    public Matemática(){
    
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getNumerodos() {
        return numerodos;
    }

    public void setNumerodos(double numerodos) {
        this.numerodos = numerodos;
    }


    
}
