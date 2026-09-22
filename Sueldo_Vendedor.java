package com.mycompany.sueldo_vendedor;
import java.util.Scanner;

public class Sueldo_Vendedor {

    public static double Sueldototal(double sueldo, double e1, double e2, double e3) {
        double comisiones = (e1 + e2 + e3) * 0.10;
        double resultado = sueldo + comisiones;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el sueldo base: ");
        double sueldo = SC.nextDouble();

        System.out.println("Ingrese el valor de la primera venta: ");
        double e1 = SC.nextDouble();

        System.out.println("Ingrese el valor de la segunda venta: ");
        double e2 = SC.nextDouble();

        System.out.println("Ingrese el valor de la tercera venta: ");
        double e3 = SC.nextDouble();

        Sueldototal(sueldo, e1, e2, e3);

        System.out.println("Las comisiones son: " + ((e1 + e2 + e3) * 0.10));
        System.out.println("El sueldo total es: " + Sueldototal(sueldo, e1, e2, e3));
    }
}
