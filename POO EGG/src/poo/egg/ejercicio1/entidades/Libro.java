
package poo.egg.ejercicio1.entidades;

/**
 *
 * @author Nati
 * 
 *///Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
//Autor, Número de páginas, y un constructor con todos los atributos pasados por
//parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
//datos al usuario y luego informar mediante otro método el número de ISBN, el título,
//el autor del libro y el numero de páginas

public class Libro {
   
    //Atributos clase libro
  private String ISBN;
  private String título;
  private String autor;
  private int    numpag;
  
  public Libro(){// constructor por defecto o vacio
  this.ISBN="4567";
  this.título="Cujo";
  this.autor="Stephen King";
  this.numpag=45;
  }
  //Constructor con todos los parametros
  public Libro(String ISBN, String título, String autor, int numpag ){
  this.ISBN=ISBN;
  this.título=título;
  this.autor=autor;
  this.numpag=numpag;
  }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN =ISBN;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumpag() {
        return numpag;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }   
    
    
}
