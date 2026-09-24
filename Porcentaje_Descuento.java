package com.mycompany.porcentaje_descuento;
import java.util.Scanner;

public class Porcentaje_Descuento {

    public static double descuento(double precioFinal, double precioVenta) {
        double resultado = ((precioVenta - precioFinal) / precioVenta) * 100;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el precio final pagado: ");
        double precioFinal = SC.nextDouble();

        System.out.println("Ingrese el precio de venta al público: ");
        double precioVenta = SC.nextDouble();

        descuento(precioFinal, precioVenta);

        System.out.println("El porcentaje de descuento aplicado es: " + descuento(precioFinal, precioVenta) + "%");
    }
}