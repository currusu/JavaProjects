
package colecciones.Ejercicio3.servicios;



import colecciones.Ejercicio3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

//Crear una clase llamada Alumno que mantenga información sobre las notas de
//distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
//de tipo Integer con sus 3 notas.
//En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
//información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no. 
//Despues de ese bucle tendremos el siguiente método en la clase Alumno: 
//Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular 
//su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama 
//al método. Dentro del método se usará la lista notas para calcular el promedio 
//final de alumno. Siendo este promedio final, devuelto por el método y mostrado 
//en el main. 

public class AlumnoServicios {
    
    //Esta es la declaración del  Scanner y ArrayList Alumno
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList<Alumno>listaAlumnos;
    
    //Esta es la instanciación de ArrayList Alumno por medio de la lista alumnos
    //Es un constructor
    
    public AlumnoServicios(){
    
        listaAlumnos = new ArrayList();
    }
    //Acá creé el método crear alumno
    
    public Alumno crearAlumno(int cantidadNotas){
        
        //Acá creé el objeto aula que se vincula con la clase Alumno
        
        Alumno alumno = new Alumno();
        
        
        System.out.println("Por favor ingrese el nombre del alumno");
        
        String nombre = leer.next();
        
        //Esta línea lo que va a hacer es modificar el nombre del alumno
        //cada vez que se ingresa uno nuevo
        
        alumno.setNombre(nombre);
         
        //Este bucle se hace para rellenar el Arraylist y vaya tomando
        //cada nota que va ingresando el usuario. Esto permite hacerlo más dinámico.
        //En caso de tener que agregar más notas, solo se cambia el valor de i. En cambio
        //si usabamos un getter y setter para cada nota hay que repetirlo todas las veces
        //que el usuario ingresa una nota
        
        for(int i=0 ; i<cantidadNotas ; i++){
        
         System.out.println("Por favor ingrese la nota " +(i+1));
           
         int nota = leer.nextInt();
         
         //Con esta línea de código estoy llenando mi Arraylist notas
         //con la variable nota que es lo que ingresa el usuario
         
         alumno.getNotas().add(nota);
         
        }
        
        return alumno;
        
    }       
    
       //En esta línea por medio de mi nuevo ArrayList de tipo alumnos,
      //agrego los nuevos alumnos vinculandolos con mi objeto de Crear Alumno
      //que sería aula
    
       public void agregarAlumno(Alumno alumno){
       
       listaAlumnos.add(alumno);
       
       }
       
       public float notaFinal (String alumno ,int cantidadNotas){
       
           int suma = 0;
           
           //Este for each recorre el ArrayList Alumno
           
           for (Alumno aux : listaAlumnos) {
               
               //Este if agarra el ArrayList Alumno y verifica si el nombre ingresado
               //que vendria a ser alumno,pertenece o no a la lista
               
               if (aux.getNombre().equals(alumno)){
                   
                    System.out.println("El alumno se encuentra en la lista");
                    
                   //Este for each recorre el Arraylist de las notas que se
                   //vincula con el objeto de crear alumno que seria aula y
                   //tambien con la nota que ingresa el usuario que seria
                   //nota
                   
                   for (Integer nota: aux.getNotas()) {
                       
                       
                       
                       suma=suma+nota;
                      
                   }
                     
               }else{
                   
                   System.out.println("El alumno no se encuentra en la lista");
               }
                   
           }
        return suma/cantidadNotas ;
       
       }

       //Esto seria como una funcion de Paeint
       
      public int cuantasNotasIngresaPorAlumno(){
      
          System.out.println("Escriba cuantas notas desea ingresar");
          
          int cantidadNotas = leer.nextInt();
          
          return cantidadNotas;
      
      }
}


       
                   
            
           
           
        
            
           
       
       
       
       
       
         
          
     
    
    
    

