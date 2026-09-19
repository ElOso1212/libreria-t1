public class Libro {
    private int idLibro;
    private String isbn;
    private String titulo;
    private String autor;
    private double precio;
    private int stock;

    // Constructor vacio
    public Libro() {
    }

    // Constructor con parametros
    public Libro(int idLibro, String isbn, String titulo, String autor, double precio, int stock) {
        this.idLibro = idLibro;
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.stock = stock;
    }

    // Metodos del diagrama UML
    public boolean existeStock(int cantidad) {
        return this.stock >= cantidad;
    }

    public void descontarStock(int cantidad) {
        if (existeStock(cantidad)) {
            this.stock -= cantidad;
            System.out.println("Stock actualizado con exito.");
        } else {
            System.out.println("Stock insuficiente para realizar la operacion.");
        }
    }

    public int verificarStock(int idLibro) {
        return this.stock;
    }

    public int calcularTotalVentas() {
        return 0;
    }

    public double calcularTotalIngresos() {
        return 0.0;
    }

    // Getters y Setters
    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

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