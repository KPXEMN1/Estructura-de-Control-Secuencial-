package com.mycompany.consumo_luz_2;
import java.util.Scanner;

public class Consumo_Luz_2 {

    public static double calcular(double anterior, double actual) {
        double consumo = actual - anterior;
        double costo;

        if (consumo <= 100) {
            costo = 2622.00;
        } else if (consumo <= 300) {
            costo = 79.78;
        } else if (consumo <= 500) {
            costo = 89.52;
        } else {
            costo = 97.95;
        }

        return consumo * costo;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese la lectura anterior: ");
        double anterior = SC.nextDouble();

        System.out.println("Ingrese la lectura actual: ");
        double actual = SC.nextDouble();

        System.out.println("El monto a pagar es: " + calcular(anterior, actual));
    }
}
