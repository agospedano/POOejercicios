package entidades;

/*atributos*/

public class Libro {
   private String ISBN;
   private String titulo;
   private String autor;
   private int cantidadPaginas;
   
/*constructor x parametro*/
   
    public Libro(String ISBN, String titulo, String autor, int cantidadPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadPaginas = cantidadPaginas;
    }
   /*constructor vacio*/
    
   public Libro(){
       
   }
/*getter and setter*/
   
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }
   
}
