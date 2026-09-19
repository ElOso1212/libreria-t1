import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Reserva {
    private int idReserva;
    private Date fechaReserva;

    // Constructor vacio
    public Reserva() {
    }

    // Constructor con parametros
    public Reserva(int idReserva, Date fechaReserva) {
        this.idReserva = idReserva;
        this.fechaReserva = fechaReserva;
    }

    // Metodos del diagrama UML
    public void registrarReserva(int idCliente, int idLibro, Date fechaReserva) {
        this.fechaReserva = fechaReserva;
        System.out.println("Reserva registrada correctamente para el cliente ID: " + idCliente);
    }

    public List<Reserva> getHistorialReserva() {
        return new ArrayList<>();
    }

    // Getters y Setters
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
}