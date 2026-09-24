package com.mycompany.alquiler_automovil;
import java.util.Scanner;

public class Alquiler_Automovil {

    public static double calcular(double km) {
        double resultado;

        if (km <= 300) {
            resultado = 5000;
        } else if (km <= 1000) {
            resultado = 5000 + ((km - 300) * 200);
        } else {
            resultado = 5000 + (700 * 200) + ((km - 1000) * 150);
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese los kilómetros recorridos: ");
        double km = SC.nextDouble();

        System.out.println("El valor a pagar es: " + calcular(km));
    }
}
