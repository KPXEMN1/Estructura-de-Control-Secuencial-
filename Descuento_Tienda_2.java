package com.mycompany.descuento_tienda_2;
import java.util.Scanner;

public class Descuento_Tienda_2 {

    public static double calcular(double compra) {
        double descuento;

        if (compra < 500) {
            descuento = 0;
        } else if (compra <= 1000) {
            descuento = compra * 0.05;
        } else if (compra <= 7000) {
            descuento = compra * 0.11;
        } else if (compra <= 15000) {
            descuento = compra * 0.18;
        } else {
            descuento = compra * 0.25;
        }

        return descuento;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = SC.nextLine();

        System.out.println("Ingrese el monto de la compra: ");
        double compra = SC.nextDouble();

        double descuento = calcular(compra);

        System.out.println("Cliente: " + nombre);
        System.out.println("Compra: " + compra);
        System.out.println("Descuento: " + descuento);
        System.out.println("Monto a pagar: " + (compra - descuento));
    }
}