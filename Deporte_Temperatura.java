package com.mycompany.deporte_temperatura;
import java.util.Scanner;

public class Deporte_Temperatura {

    public static String deporte(double temperatura) {
        if (temperatura > 85) {
            return "Natación";
        } else if (temperatura > 70) {
            return "Tenis";
        } else if (temperatura > 32) {
            return "Golf";
        } else if (temperatura > 10) {
            return "Esquí";
        } else {
            return "Marcha";
        }
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en Fahrenheit: ");
        double temperatura = SC.nextDouble();

        System.out.println("El deporte apropiado es: " + deporte(temperatura));
    }
}