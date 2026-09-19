import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTION - LIBRERIA PAGETURNER ===");

        // Instanciar Cliente segun diagrama UML
        Cliente cliente = new Cliente(1, "72345678", "Juan Perez", "juan.perez@email.com");
        System.out.println("Cliente registrado: " + cliente.getNombre() + " (DNI: " + cliente.getDni() + ")");

        // Instanciar Libro segun diagrama UML
        Libro libro = new Libro(101, "978-3-16-148410-0", "Programacion en Java", "Autor Ejemplo", 45.50, 10);
        System.out.println("Libro disponible: " + libro.getTitulo() + " | Stock inicial: " + libro.getStock());

        // Operacion de stock
        libro.descontarStock(2);

        // Instanciar Reserva segun diagrama UML
        Reserva reserva = new Reserva(501, new Date());
        reserva.registrarReserva(cliente.getIdCliente(), libro.getIdLibro(), new Date());

        // Instanciar Venta segun diagrama UML
        Venta venta = new Venta("V-001", new Date(), 2, 45.50);
        System.out.println("Total de venta calculada: S/. " + venta.calcularTotalVenta());

        System.out.println("=== COMPILACION Y PRUEBA EXITOSA ===");
    }
}