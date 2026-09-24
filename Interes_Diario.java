package com.mycompany.interes_diario;
import java.util.Scanner;

public class Interes_Diario {

    public static double calcular(double capital, double tasa, int semanas) {
        int dias = semanas * 7;
        double interesDiario = (capital * tasa / 100) / 365;
        double resultado = capital + (interesDiario * dias);

        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el capital: ");
        double capital = SC.nextDouble();

        System.out.println("Ingrese la tasa de interés: ");
        double tasa = SC.nextDouble();

        System.out.println("Ingrese la duración en semanas: ");
        int semanas = SC.nextInt();

        System.out.println("Capital acumulado: " + calcular(capital, tasa, semanas));
    }
}
