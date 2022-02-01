
package poo.egg.ejercicio5.principal;

import poo.egg.ejercicio5.entidades.Cuenta;
import poo.egg.ejercicio5.servicios.CuentaServicios;








public class CuentaPrincipal {

    
    public static void main(String[] args) {
        
        //Ahora voy a crear un objeto para vincular mi clase
        //servicios con mi main
        
        //crearCuenta es un método de la clase Cuenta Servicios que 
        //devuelve un objeto serviciobanco que también es un objeto de Cuenta 
        //Servicios
        
        
        CuentaServicios serviciobanco = new CuentaServicios ();
        
        //Acá creé cuenta bancaria uno que también es un objeto
        //pero del tipo Cuenta
        
       Cuenta cuentaBancariaUno = serviciobanco.crearCuenta();
       
        serviciobanco.ingresar(cuentaBancariaUno);
       
        serviciobanco.retirar(cuentaBancariaUno);
       
        serviciobanco.extraccion(cuentaBancariaUno);
       
        serviciobanco.consultarSaldo(cuentaBancariaUno);
        
        serviciobanco.consultarDatos(cuentaBancariaUno);
    }
    
}
