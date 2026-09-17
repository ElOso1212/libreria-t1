import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1. Crear instancias de prueba
        Cliente cliente1 = new Cliente("72819203", "Alonso Flores", "alonso@correo.com");
        Libro libro1 = new Libro("978-0134685991", "Java: Effective Programming", "Joshua Bloch", 120.0, 5);

        // 2. Probar una venta y descuento de stock
        Venta venta1 = new Venta("V-001", new Date(), 2, libro1.getPrecio());
        venta1.setCliente(cliente1);
        venta1.setLibro(libro1);
        libro1.descontarStock(venta1.getCantidad());

        // 3. Mostrar resumen en consola
        System.out.println("=== SISTEMA LIBRERIA PAGETURNER ===");
        System.out.println("Cliente: " + cliente1.getNombre());
        System.out.println("Libro adquirido: " + libro1.getTitulo());
        System.out.println("Monto total de venta: S/ " + venta1.calcularTotalVenta());
        System.out.println("Stock restante: " + libro1.getStock());
    }
}