package com.mycompany.promedio_edades;
import java.util.Scanner;

public class Promedio_Edades {

    public static void calcular(Scanner SC) {
        double pesoNinos = 0;
        double pesoJovenes = 0;
        double pesoAdultos = 0;
        double pesoViejos = 0;

        int ninos = 0;
        int jovenes = 0;
        int adultos = 0;
        int viejos = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.println("Ingrese la edad: ");
            int edad = SC.nextInt();

            System.out.println("Ingrese el peso: ");
            double peso = SC.nextDouble();

            if (edad <= 12) {
                pesoNinos += peso;
                ninos++;
            } else if (edad <= 29) {
                pesoJovenes += peso;
                jovenes++;
            } else if (edad <= 59) {
                pesoAdultos += peso;
                adultos++;
            } else {
                pesoViejos += peso;
                viejos++;
            }
        }

        if (ninos > 0)
            System.out.println("Promedio niños: " + pesoNinos / ninos);

        if (jovenes > 0)
            System.out.println("Promedio jóvenes: " + pesoJovenes / jovenes);

        if (adultos > 0)
            System.out.println("Promedio adultos: " + pesoAdultos / adultos);

        if (viejos > 0)
            System.out.println("Promedio viejos: " + pesoViejos / viejos);
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        calcular(SC);
    }
}