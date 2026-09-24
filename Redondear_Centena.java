package com.mycompany.redondear_centena;
import java.util.Scanner;

public class Redondear_Centena {

    public static int redondear(int a, int b, int c, int d) {
        int n = a * 1000 + b * 100 + c * 10 + d;
        int resultado;

        if (d >= 5) {
            resultado = ((n / 100) + 1) * 100;
        } else {
            resultado = (n / 100) * 100;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese A: ");
        int a = SC.nextInt();

        System.out.println("Ingrese B: ");
        int b = SC.nextInt();

        System.out.println("Ingrese C: ");
        int c = SC.nextInt();

        System.out.println("Ingrese D: ");
        int d = SC.nextInt();

        System.out.println("El resultado redondeado es: " + redondear(a, b, c, d));
    }
}