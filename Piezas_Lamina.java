package com.mycompany.piezas_lamina;
import java.util.Scanner;

public class Piezas_Lamina {

    public static double piezas(double largo, double ancho, double consumo) {
        double area = largo * ancho;
        double cantidad = area / consumo;
        return cantidad;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el largo de la lámina: ");
        double largo = SC.nextDouble();

        System.out.println("Ingrese el ancho de la lámina: ");
        double ancho = SC.nextDouble();

        System.out.println("Ingrese el consumo de la pieza: ");
        double consumo = SC.nextDouble();

        piezas(largo, ancho, consumo);

        System.out.println("La cantidad de piezas que se fabrican es: " + piezas(largo, ancho, consumo));
        System.out.println("El desperdicio es: " + ((largo * ancho) % consumo));
    }
}