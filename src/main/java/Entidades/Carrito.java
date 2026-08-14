package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;

        for (Producto producto : productos) {
            total += producto.getPrecio();
        }

        return total;
    }

    public double aplicarDescuento(double porcentaje) {
        double total = calcularTotal();
        double totalDescuento = total * (porcentaje * 0.01);

        return total - totalDescuento;
    }

    public void mostrarResumen() {
        System.out.println("Resumen del carrito: \n");
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getNombre() + " | Precio: $" + producto.getPrecio());
        }
        System.out.println("\nEl total de los productos es de: $" + calcularTotal());
        System.out.println("El total con 15% de descuento: $" + aplicarDescuento(15));
    }
}
