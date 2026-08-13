package Entidades;

public class Propina {

    public static double calcular(double precioTotal, int porcentaje) {
        return (precioTotal * (porcentaje * 0.01));
    }
}
