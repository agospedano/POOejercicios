package service;


import entidades.Libro;
import java.util.Scanner;

/*clase service*/ 

public class LibroService {
    Scanner leer = new Scanner(System.in);
    
    /*crear libro*/
    public Libro crearLibro(){
      Libro libro1 = new Libro();
        System.out.println("Ingresa el ISBN");
        libro1.setISBN(leer.nextLine());
        System.out.println("Ingrese el nombre del libro");
        libro1.setTitulo(leer.nextLine());
        System.out.println("Ingrese el autor del libro");
        libro1.setAutor(leer.nextLine());
        System.out.println("Ingrese la cantidad de páginas");
        libro1.setCantidadPaginas(leer.nextInt());
        
        return libro1;
    }
    
    /*mostrar datos libro*/
    
    public void mostrarLibro(Libro libroInfo){
        System.out.println("ISBN: " + libroInfo.getISBN());
        System.out.println("Titulo: " + libroInfo.getTitulo());
        System.out.println("Autor: " + libroInfo.getAutor());
        System.out.println("Cantidad de paginas: " + libroInfo.getCantidadPaginas());
        
    }
}
