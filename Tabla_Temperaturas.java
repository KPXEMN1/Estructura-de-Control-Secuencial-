package com.mycompany.tabla_temperaturas;
import java.util.Scanner;

public class Tabla_Temperaturas {

    public static void calcular(int inicio, int fin, int intervalo) {
        System.out.println("Fahrenheit\tCelsius\tKelvin\tRankine");

        for (int f = inicio; f <= fin; f += intervalo) {
            double c = 5 * (f - 32) / 9.0;
            double k = c + 273.15;
            double r = f + 459.67;

            System.out.println(f + "\t\t" + c + "\t" + k + "\t" + r);
        }
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese temperatura inicial: ");
        int inicio = SC.nextInt();

        System.out.println("Ingrese temperatura final: ");
        int fin = SC.nextInt();

        System.out.println("Ingrese el intervalo: ");
        int intervalo = SC.nextInt();

        calcular(inicio, fin, intervalo);
    }
}
