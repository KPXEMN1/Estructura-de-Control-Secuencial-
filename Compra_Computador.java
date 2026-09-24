package com.mycompany.compra_computador;
import java.util.Scanner;

public class Compra_Computador {

    public static double recargo(double precio, double cuota) {
        double total = cuota * 12;
        double resultado = ((total - precio) / precio) * 100;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el precio de contado: ");
        double precio = SC.nextDouble();

        System.out.println("Ingrese el valor de cada cuota: ");
        double cuota = SC.nextDouble();

        recargo(precio, cuota);

        System.out.println("El porcentaje de recargo es: " + recargo(precio, cuota) + "%");
    }
}