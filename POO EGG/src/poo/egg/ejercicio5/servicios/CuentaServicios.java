 package poo.egg.ejercicio5.servicios;


import java.util.Scanner;
import poo.egg.ejercicio5.entidades.Cuenta;

//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
//atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
//operaciones asociadas a dicha clase son:
//• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//• Agregar los métodos getters y setters correspondientes
//• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
//• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
//ingresar y se la sumara a saldo actual.
//• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
//se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//pondrá el saldo actual en 0.
//• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
//que el usuario no saque más del 20%.
//• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//• Método consultarDatos(): permitirá mostrar todos los datos de la cuent

public class CuentaServicios {

        //Este objeto conviene crearlo fuera de los métodos
        //porque desde la clase va a ser leído por todos
        //los métodos
    
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
            
    //Método para crear cuenta
    
    public Cuenta crearCuenta() {

        System.out.println("Por favor ingrese los siguientes datos:Número de cuenta,DNI y saldo actual");

     
        float numeroCuenta = leer.nextInt();

        float DNI = leer.nextInt();

        float saldo = leer.nextInt();
        
        Cuenta bancaria = new Cuenta (numeroCuenta,DNI,saldo);
        
        return bancaria;

    }

   public void ingresar (Cuenta bancaria){
   
       System.out.println("Por favor ingrese un monto");
       
        float monto = leer.nextFloat();
       
       //Esta fórmula dice cuanto es el total de dinero
       //en la cuenta
       
        bancaria.setSaldo(bancaria.getSaldo()+ monto);
        
        //bancaria es mi variable para modificar y mostrar el saldo
        
       System.out.println("La suma de los números ingresados es "+ bancaria.getSaldo());
       
       
   }
   
   public void retirar (Cuenta bancaria){
    
       System.out.println("Por favor ingrese un monto");
       
        
       float monto = leer.nextFloat();
       
       
       if(monto>=bancaria.getSaldo()){
           
           //Este comando modifica saldo que es un atributo de Cuenta.
           //bancaria sería mi variable para llamarlo y modificarlo
           
       bancaria.setSaldo(0);
      
       
           System.out.println("Su saldo actual es " + bancaria.getSaldo());
           
       }else{
           
           bancaria.setSaldo(bancaria.getSaldo()-monto);
           
           System.out.println("Su saldo actual es " + (bancaria.getSaldo()));
       }
       
       
   
   }
   
   //Acá creé un objeto que es bancaria para vincular mi clase
   //cuenta con mi clase servicios
   
   public void extraccion (Cuenta bancaria){
       
   
       System.out.println("Por favor ingrese un monto");
       
       float monto = leer.nextFloat();
       
       if(monto<=((20*bancaria.getSaldo())/100)){
       
           System.out.println("Su dinero está disponible");
           
          //Esta fórmula va a modificar el saldo de la cuenta
          //en caso que la extraccion sea menor al 20%. Caso
          //contrario entra ELSE
          
           bancaria.setSaldo(bancaria.getSaldo()-monto);
                   
       }else{
           
         System.out.println("Su dinero no está disponible");  
       }
           
      
   }
   
   //Acá lo que hice fue vincular mi objeto con mi clase Cuenta 
   //e imprimir por pantalla el saldo actual
   
   public void consultarSaldo (Cuenta bancaria){

       System.out.println("Su saldo es " + bancaria.getSaldo());
       
}
   
   public void consultarDatos (Cuenta bancaria){
   
       System.out.println("Su DNI es: " +bancaria.getDNI());
       
       System.out.println("Su número de cuenta es: " +bancaria.getNumeroCuenta());
       
       System.out.println("Su saldo actual es " +bancaria.getSaldo());
   }
}
