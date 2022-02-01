
package colecciones.Ejercicio3.principal;
import colecciones.Ejercicio3.entidades.Alumno;
import colecciones.Ejercicio3.servicios.AlumnoServicios;
import java.util.Scanner;


public class AlumnoPrincipal {
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
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        AlumnoServicios alumnoservicios = new AlumnoServicios();
       
        String respuesta = "";
        
        
        //Esta acción relaciona la variable con el método y almacena lo que
        //este devuelve
        
        int cantidadNotas=alumnoservicios.cuantasNotasIngresaPorAlumno();
        
        do{
            
            //Con este método creo el alumno y le almaceno la cantidadNotas
          Alumno alumno = alumnoservicios.crearAlumno(cantidadNotas); 
          
          //Acá invoqué el método agregar alumno y le almacené el objeto 
          //vinculado a mi método Crear Alumno
          alumnoservicios.agregarAlumno(alumno);
        
            System.out.println("Desea agregar otro alumno?");
            
            respuesta=leer.next();
            
         //Esto quiere decir que si la respuesta es Si (toUpperCase no distingue
         //mayúscula de minúscula) va a seguir agregando alumnos
         
        }while(respuesta.toUpperCase().equals("SI"));
        
        System.out.println("Ingrese el nombre del alumno al que desea calcular nota final");
        
        String Alumno = leer.next();
        
        //Esto es lo mismo que lo que escribí arriba y en este caso vinculé
        //mi método con la clase Alumno y con la variable cantidadNotas
        
         float notaFinal = alumnoservicios.notaFinal(Alumno,cantidadNotas);
        
        System.out.println("La nota final de " +Alumno+ " es " + notaFinal);
        
         
         
    
    }}
