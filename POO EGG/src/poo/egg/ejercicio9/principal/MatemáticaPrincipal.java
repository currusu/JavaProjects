
package poo.egg.ejercicio9.principal;

import poo.egg.ejercicio9.entidades.Matemática;
import poo.egg.ejercicio9.servicios.MatemáticaServicios;


public class MatemáticaPrincipal {

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
    public static void main(String[] args) {
        
        MatemáticaServicios mateserv = new MatemáticaServicios();
        
        Matemática matemática=mateserv.crearMatemática();
        matemática.setNumero((float)Math.random()*10);
        matemática.setNumerodos((float)Math.random()*10);
        mateserv.DevolverMayorYmenor(matemática);
        mateserv.CalcularPotencia(matemática);
        mateserv.CalcularRaíz(matemática);
        
        
    }
   
}
