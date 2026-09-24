package com.mycompany.ganancia_naranjas;
import java.util.Scanner;

public class Ganancia_Naranjas {

    public static double ganancia(double naranjas, double precioDocena, double venta) {
        double costo = (naranjas / 12) * precioDocena;
        double resultado = ((venta - costo) / costo) * 100;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de naranjas: ");
        double naranjas = SC.nextDouble();

        System.out.println("Ingrese el precio de la docena: ");
        double precioDocena = SC.nextDouble();

        System.out.println("Ingrese el dinero obtenido por la venta: ");
        double venta = SC.nextDouble();

        ganancia(naranjas, precioDocena, venta);

        System.out.println("El porcentaje de ganancia es: " + ganancia(naranjas, precioDocena, venta) + "%");
    }
}
