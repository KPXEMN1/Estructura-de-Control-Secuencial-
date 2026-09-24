package com.mycompany.area_triangulo;
import java.util.Scanner;

public class Area_Triangulo {

    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double resultado = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el lado A: ");
        double a = SC.nextDouble();

        System.out.println("Ingrese el lado B: ");
        double b = SC.nextDouble();

        System.out.println("Ingrese el lado C: ");
        double c = SC.nextDouble();

        area(a, b, c);

        System.out.println("El área del triángulo es: " + area(a, b, c));
    }
}
