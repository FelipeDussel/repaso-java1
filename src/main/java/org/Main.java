package org;

import Entidades.Propina;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hola! Para calcular la propina, ingrese el monto total de la cuenta: ");
        double precioTotal =  teclado.nextDouble();
        System.out.println("Bien, ahora ingrese el porcentaje de propina: ");
        int porcentaje = teclado.nextInt();
        System.out.println("Cuenta: $" + precioTotal + " | Propina (" + porcentaje + "%): $" + Propina.calcular(precioTotal, porcentaje));
        }
    }
