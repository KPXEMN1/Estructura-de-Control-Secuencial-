package com.mycompany.intereses_banco;
import java.util.Scanner;

public class Intereses_Banco {

    public static double calcular(double capital, double tasa) {
        double interes = capital * tasa / 100;

        if (interes > 7000) {
            capital = capital + interes;
        }

        return capital;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el capital: ");
        double capital = SC.nextDouble();

        System.out.println("Ingrese la tasa de interés: ");
        double tasa = SC.nextDouble();

        System.out.println("El dinero final en la cuenta es: " + calcular(capital, tasa));
    }
}
