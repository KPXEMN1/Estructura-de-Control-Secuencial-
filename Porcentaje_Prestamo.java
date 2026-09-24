package com.mycompany.porcentaje_prestamo;
import java.util.Scanner;

public class Porcentaje_Prestamo {

    public static double porcentaje(double capital, double intereses) {
        double resultado = (intereses * 100) / (capital * 4);
        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el capital del préstamo: ");
        double capital = SC.nextDouble();

        System.out.println("Ingrese los intereses pagados: ");
        double intereses = SC.nextDouble();

        porcentaje(capital, intereses);

        System.out.println("El porcentaje anual cobrado fue: " + porcentaje(capital, intereses) + "%");
    }
}