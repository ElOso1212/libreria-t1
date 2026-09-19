import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Venta {
    private String idVenta;
    private Date fecha;
    private int cantidad;
    private double precioUnitario;

    // Constructor vacio
    public Venta() {
    }

    // Constructor con parametros
    public Venta(String idVenta, Date fecha, int cantidad, double precioUnitario) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    // Metodos del diagrama UML
    public void registrarVenta(int idLibro, int idCliente, Date fecha, int cantidad, double precioUnitario) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        System.out.println("Venta registrada con exito.");
    }

    public double calcularTotalVenta() {
        return this.cantidad * this.precioUnitario;
    }

    public List<Venta> getHistorialVenta() {
        return new ArrayList<>();
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
}