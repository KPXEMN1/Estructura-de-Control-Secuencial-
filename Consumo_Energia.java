package com.mycompany.consumo_energia;
import java.util.Scanner;

public class Consumo_Energia {

    public static double consumo(double anterior, double actual, double costo) {
        double kilovatios = actual - anterior;
        double resultado = kilovatios * costo;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese la lectura anterior: ");
        double anterior = SC.nextDouble();

        System.out.println("Ingrese la lectura actual: ");
        double actual = SC.nextDouble();

        System.out.println("Ingrese el costo por kilovatio: ");
        double costo = SC.nextDouble();

        consumo(anterior, actual, costo);

        System.out.println("El monto total a pagar es: " + consumo(anterior, actual, costo));
    }
}
