package org;

import Entidades.Carrito;
import Entidades.Producto;
import Entidades.Propina;

import java.util.Scanner;

public class Main {
    static void main() {
        Carrito carrito = new Carrito();
        carrito.agregarProducto(new Producto("Manzana", 250));
        carrito.agregarProducto(new Producto("Leche", 1500));
        carrito.agregarProducto(new Producto("Televisor", 150000));
        carrito.agregarProducto(new Producto("Buzo", 25000));
        carrito.agregarProducto(new Producto("Coca Cola", 3000));
        carrito.mostrarResumen();
        }
    }
