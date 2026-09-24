package com.mycompany.anemia;
import java.util.Scanner;

public class Anemia {

    public static String calcular(double edad, String sexo, double hemoglobina) {
        double minimo;

        if (edad <= 1) {
            minimo = 13;
        } else if (edad <= 6) {
            minimo = 10;
        } else if (edad <= 12) {
            minimo = 11;
        } else if (edad <= 60) {
            minimo = 11.5;
        } else if (edad <= 120) {
            minimo = 12.6;
        } else if (edad <= 180) {
            minimo = 13;
        } else if (sexo.equalsIgnoreCase("M")) {
            minimo = 14;
        } else {
            minimo = 12;
        }

        if (hemoglobina < minimo) {
            return "Tiene anemia.";
        } else {
            return "No tiene anemia.";
        }
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese la edad en meses: ");
        double edad = SC.nextDouble();

        System.out.println("Ingrese el sexo (M/F): ");
        String sexo = SC.next();

        System.out.println("Ingrese el nivel de hemoglobina: ");
        double hemoglobina = SC.nextDouble();

        System.out.println(calcular(edad, sexo, hemoglobina));
    }
}
