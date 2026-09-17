import java.util.Date;

public class Venta {
    private String idVenta;
    private Date fecha;
    private int cantidad;
    private double precioUnitario;
    private Cliente cliente;
    private Libro libro;

    // Constructor vacio
    public Venta() {
    }

    // Constructor con parametros (segun UML)
    public Venta(String idVenta, Date fecha, int cantidad, double precioUnitario) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    // Metodo del diagrama UML
    public double calcularTotalVenta() {
        return this.cantidad * this.precioUnitario;
    }

    // Getters y Setters
    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}