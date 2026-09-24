package com.mycompany.expresion_matematica;
import java.util.Scanner;

public class Expresion_Matematica {

    public static double calcular(int a, int b, int c, int d) {
        double resultado;

        if (d == 0) {
            resultado = Math.pow(a - c, 2);
        } else {
            resultado = Math.pow(a - b, 3) / d;
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

        System.out.println("El resultado es: " + calcular(a, b, c, d));
    }
}