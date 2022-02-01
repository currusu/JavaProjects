
package poo.egg.ejercicio5.entidades;


public class Cuenta {
  
    private float numeroCuenta;
    private float DNI;
    private float saldo;
    
    
    //Constructor con atributos y parámetros
    
    public Cuenta(float numeroCuenta,float DNI,float saldo){
    
    this.numeroCuenta=numeroCuenta;
    this.DNI=DNI;
    this.saldo=saldo;
    
    }
    
    //Constructor vacío
    
    public Cuenta(){
    
    }

    public float getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(float numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public float getDNI() {
        return DNI;
    }

    public void setDNI(float DNI) {
        this.DNI = DNI;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
   
}
