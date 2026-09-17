public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private double precio;
    private int stock;

    // Constructor vacio
    public Libro() {
    }

    // Constructor con parametros (segun UML)
    public Libro(String isbn, String titulo, String autor, double precio, int stock) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.stock = stock;
    }

    // Metodos del diagrama UML
    public void descontarStock(int cantidad) {
        if (cantidad <= this.stock) {
            this.stock -= cantidad;
        }
    }

    public int verificarStock(String isbn) {
        return this.stock;
    }

    // Getters y Setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}