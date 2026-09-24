package com.mycompany.area_figuras;
import java.util.Scanner;

public class Area_Figuras {

    public static String figura(double valor1, double valor2, double area) {
        double triangulo = (valor1 * valor2) / 2;
        double circulo = Math.PI * Math.pow(valor1, 2);
        double rectangulo = valor1 * valor2;

        if (Math.abs(triangulo - area) < 0.01) {
            return "Triángulo";
        } else if (Math.abs(circulo - area) < 0.01) {
            return "Círculo";
        } else if (Math.abs(rectangulo - area) < 0.01) {
            return "Rectángulo";
        } else {
            return "No coincide con ninguna figura";
        }
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        double valor1 = SC.nextDouble();

        System.out.println("Ingrese el segundo valor: ");
        double valor2 = SC.nextDouble();

        System.out.println("Ingrese el área: ");
        double area = SC.nextDouble();

        System.out.println("La figura es: " + figura(valor1, valor2, area));
    }
}
