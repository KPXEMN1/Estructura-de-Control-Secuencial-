package com.mycompany.tipo_triangulo;
import java.util.Scanner;

public class Tipo_Triangulo {

    public static void calcular(double a, double b, double c) {
        double mayor = Math.max(a, Math.max(b, c));
        double sumaMenores = a + b + c - mayor;

        if (sumaMenores <= mayor) {
            System.out.println("No es un triángulo.");
        } else {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            if (a == b && b == c) {
                System.out.println("Triángulo equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triángulo isósceles.");
            } else {
                System.out.println("Triángulo escaleno.");
            }

            System.out.println("Área: " + area);
        }
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese lado A: ");
        double a = SC.nextDouble();

        System.out.println("Ingrese lado B: ");
        double b = SC.nextDouble();

        System.out.println("Ingrese lado C: ");
        double c = SC.nextDouble();

        calcular(a, b, c);
    }
}
