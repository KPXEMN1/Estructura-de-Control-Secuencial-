package com.mycompany.ecuacion_segundo_grado;
import java.util.Scanner;

public class Ecuacion_Segundo_Grado {

    public static void calcular(double a, double b, double c) {
        double d = Math.pow(b, 2) - (4 * a * c);

        if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("X1 = " + x);
            System.out.println("X2 = " + x);
        } else if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        } else {
            System.out.println("No existen soluciones reales.");
        }
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese A: ");
        double a = SC.nextDouble();

        System.out.println("Ingrese B: ");
        double b = SC.nextDouble();

        System.out.println("Ingrese C: ");
        double c = SC.nextDouble();

        calcular(a, b, c);
    }
}