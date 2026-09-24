package com.mycompany.gasolinera;
import java.util.Scanner;

public class Gasolinera {

    public static double cobrar(double galones) {
        double litros = galones * 3.785;
        double resultado = litros * 100;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de galones: ");
        double galones = SC.nextDouble();

        cobrar(galones);

        System.out.println("La cantidad de litros es: " + (galones * 3.785));
        System.out.println("El valor a cobrar es: " + cobrar(galones));
    }
}