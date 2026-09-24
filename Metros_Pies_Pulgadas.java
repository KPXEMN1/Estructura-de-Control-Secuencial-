package com.mycompany.metros_pies_pulgadas;
import java.util.Scanner;

public class Metros_Pies_Pulgadas {

    public static double convertir(double metros) {
        double pulgadas = metros * 39.27;
        double pies = pulgadas / 12;
        return pies;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de metros: ");
        double metros = SC.nextDouble();

        convertir(metros);

        System.out.println("La cantidad de metros es: " + metros);
        System.out.println("La cantidad de pies es: " + convertir(metros));
        System.out.println("La cantidad de pulgadas es: " + (metros * 39.27));
    }
}