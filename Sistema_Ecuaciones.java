package com.mycompany.sistema_ecuaciones;
import java.util.Scanner;

public class Sistema_Ecuaciones {

    public static double resolver(double a, double b, double c, double d, double e, double f) {
        double x = ((c * e) - (b * f)) / ((a * e) - (b * d));
        double y = ((a * f) - (c * d)) / ((a * e) - (b * d));

        System.out.println("El valor de X es: " + x);
        System.out.println("El valor de Y es: " + y);

        return x;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese A: ");
        double a = SC.nextDouble();

        System.out.println("Ingrese B: ");
        double b = SC.nextDouble();

        System.out.println("Ingrese C: ");
        double c = SC.nextDouble();

        System.out.println("Ingrese D: ");
        double d = SC.nextDouble();

        System.out.println("Ingrese E: ");
        double e = SC.nextDouble();

        System.out.println("Ingrese F: ");
        double f = SC.nextDouble();

        resolver(a, b, c, d, e, f);
    }
}
