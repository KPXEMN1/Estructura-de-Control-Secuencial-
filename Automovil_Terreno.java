package com.mycompany.automovil_terreno;
import java.util.Scanner;

public class Automovil_Terreno {

    public static String calcular(double valor, double devaluacion, double incremento) {
        double perdida = valor * devaluacion / 100;
        double ganancia = valor * incremento / 100;

        if (perdida <= ganancia / 2) {
            return "Puede comprar el automóvil.";
        } else {
            return "No debe comprar el automóvil.";
        }
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el valor inicial: ");
        double valor = SC.nextDouble();

        System.out.println("Ingrese el porcentaje de devaluación del automóvil: ");
        double devaluacion = SC.nextDouble();

        System.out.println("Ingrese el porcentaje de incremento del terreno: ");
        double incremento = SC.nextDouble();

        System.out.println(calcular(valor, devaluacion, incremento));
    }
}