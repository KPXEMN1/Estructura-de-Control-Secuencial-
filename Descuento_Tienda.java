package com.mycompany.descuento_tienda;

import java.util.Scanner;

public class Descuento_Tienda {

    public static double Preciofinal(double compra) {
        double descuento = compra * 0.15;
        double resultado = compra - descuento;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el total de la compra: ");
        double compra = SC.nextDouble();

        Preciofinal(compra);

        System.out.println("El valor de la compra es: " + compra);
        System.out.println("El valor final a pagar es: " + Preciofinal(compra));
    }
}
