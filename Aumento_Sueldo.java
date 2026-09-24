package com.mycompany.aumento_sueldo;
import java.util.Scanner;

public class Aumento_Sueldo {

    public static double calcular(double sueldo) {
        double resultado;

        if (sueldo < 40000) {
            resultado = sueldo + (sueldo * 0.15);
        } else {
            resultado = sueldo + (sueldo * 0.12);
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el sueldo: ");
        double sueldo = SC.nextDouble();

        System.out.println("El nuevo sueldo es: " + calcular(sueldo));
    }
}