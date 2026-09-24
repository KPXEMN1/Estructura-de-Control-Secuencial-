package com.mycompany.porcentaje_hym;
import java.util.Scanner;
public class Porcentaje_HyM {
public static double porcentaje(int cantidad, int total) {
        double resultado = (cantidad * 100.0) / total;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de hombres: ");
        int hombres = SC.nextInt();

        System.out.println("Ingrese la cantidad de mujeres: ");
        int mujeres = SC.nextInt();

        int total = hombres + mujeres;

        porcentaje(hombres, total);
        porcentaje(mujeres, total);

        System.out.println("El porcentaje de hombres es: " + porcentaje(hombres, total) + "%");
        System.out.println("El porcentaje de mujeres es: " + porcentaje(mujeres, total) + "%");
    }
}