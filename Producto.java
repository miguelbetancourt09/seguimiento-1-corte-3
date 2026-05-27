import java.util.*;

public class Producto {
    private final String nombre;
    private final double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }

    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Laptop", 2500.0));
        productos.add(new Producto("Teléfono", 1200.0));
        productos.add(new Producto("Tablet", 800.0));

        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}
