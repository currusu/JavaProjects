
package Ejercicio2;


public class ArregloPrincipal {

    //Definir una Clase que contenga algún tipo de dato de tipo array y agregue el 
   //código para generar y capturar una excepción ArrayIndexOutOfBoundsException
  //(índice de arreglo fuera de rango).
    
    public static void main(String[] args) {
        
        //Acá declaro mi array
        
       int [] zapatos = {15,20,10};
       
       try{
       
       for (int i = 0; i < 5; i++) {
            
            System.out.println(zapatos[i]);
        }
       
       
       }catch(ArrayIndexOutOfBoundsException e){
       
           System.out.println("El tamaño del array es menor al rango");
       }
        
       
       
              
        
    }
    
}
