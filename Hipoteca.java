package com.mycompany.hipoteca;
import java.util.Scanner;

public class Hipoteca {

    public static void calcular(double hipoteca, double inversion) {
        double persona;
        double socio;

        if (hipoteca < 1000000) {
            persona = inversion * 0.50;
            socio = inversion * 0.50;
        } else {
            double resto = inversion - hipoteca;
            persona = hipoteca + resto / 2;
            socio = resto / 2;
        }

        System.out.println("Inversión de la persona: " + persona);
        System.out.println("Inversión del socio: " + socio);
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el monto de la hipoteca: ");
        double hipoteca = SC.nextDouble();

        System.out.println("Ingrese el monto total de la inversión: ");
        double inversion = SC.nextDouble();

        calcular(hipoteca, inversion);
    }
}
