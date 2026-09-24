package com.mycompany.produccion_harina_aceite;
import java.util.Scanner;

public class Produccion_Harina_Aceite {

    public static double ingreso(double harina, double aceite, double b1, double b2, double b3, double b4) {
        double bultosHarina = (int) harina / 24;
        double sobranteHarina = harina % 24;

        double cajasAceite = (int) aceite / 15;
        double sobranteAceite = aceite % 15;

        double ingresoHarina = (bultosHarina * b1) + (sobranteHarina * b3);
        double ingresoAceite = (cajasAceite * b2) + (sobranteAceite * b4);

        double resultado = ingresoHarina + ingresoAceite;

        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese los kilogramos de harina: ");
        double harina = SC.nextDouble();

        System.out.println("Ingrese los litros de aceite: ");
        double aceite = SC.nextDouble();

        System.out.println("Ingrese el precio del bulto de harina: ");
        double b1 = SC.nextDouble();

        System.out.println("Ingrese el precio de la caja de aceite: ");
        double b2 = SC.nextDouble();

        System.out.println("Ingrese el precio del kilogramo de harina al detal: ");
        double b3 = SC.nextDouble();

        System.out.println("Ingrese el precio del litro de aceite al detal: ");
        double b4 = SC.nextDouble();

        ingreso(harina, aceite, b1, b2, b3, b4);

        System.out.println("El ingreso total es: " + ingreso(harina, aceite, b1, b2, b3, b4));
    }
}
