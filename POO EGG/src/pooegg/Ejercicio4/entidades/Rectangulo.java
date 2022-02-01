package pooegg.Ejercicio4.entidades;


import java.util.Scanner;

//Crear una clase Rectángulo que modele rectángulos por medio de un atributo
//privado base y un atributo privado altura. La clase incluirá un método para crear el
//rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
//método para calcular la superficie del rectángulo y un método para calcular el
//perímetro del rectángulo. Por último, tendremos un método que dibujará el
//rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
//los métodos getters, setters y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2

public class Rectangulo {

    //Declaracion de atributos
    private int base;
    private int altura;
    
    
    //Constructor con atributos por parámetros
    public Rectangulo(int base, int altura) {

        this.base = base;
        this.altura = altura;

    }
    //Metodo constructor vacío
    
    public Rectangulo() {

    }

    public float getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    //Método para crear Rectángulo
    
    public void crearRectangulo() {

        System.out.println("Por favor ingrese la base");

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        base=leer.nextInt();

        System.out.println("Por favor ingrese la altura");

        altura = leer.nextInt();
        
   
}
    
    //Metodo para calcular superficie
    
      public int superficie() {
         
        int superficie = base * altura;
                
      return superficie;
             
     
}
      public int perímetro () {
  
          int perímetro = (base + altura)*2;
          
      return perímetro;
  } 

      public void DibujarRectangulo(){
      
       ///Linea superior
            
        for(int i=0 ; i < base; i++){
            
          System.out.print("* ");
          
        }
            System.out.println();
            
            //Centro de la forma. El n-2 es porque el centro
            //representa el dibujo sin la línea superior e inferior
            
            for( int i = 0; i < altura-2; i++){
            
                System.out.print("* ");
                
                for(int j = 0; j < base-2 ; j++){
                
                    System.out.print("  ");
                }
                System.out.println("*");  
            }
           //Linea inferior
           
        for( int i=0 ; i < base; i++){
            
            System.out.print("* ");
        }
        
      
      }
      
}
    
