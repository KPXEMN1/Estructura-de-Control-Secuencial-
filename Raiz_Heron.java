package com.mycompany.raiz_heron;
import java.util.Scanner;

public class Raiz_Heron {

    public static double calcular(double n) {
        double x = 0.1;
        double rn;

        do {
            rn = (x + n / x) / 2;
            x = rn;
        } while (Math.abs(x - (n / x + x) / 2) >= 0.000001);

        return rn;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese un número positivo: ");
        double n = SC.nextDouble();

        if (n > 0) {
            System.out.println("La raíz cuadrada es: " + calcular(n));
        } else {
            System.out.println("El número debe ser positivo.");
        }
    }
}
/**
 *
 * @author Usuario
 */
public class Raiz_Heron {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
