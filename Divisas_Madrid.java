package com.mycompany.divisas_madrid;
import java.util.Scanner;

public class Divisas_Madrid {

    public static double conversion(double chelines, double dracmas, double pesetas) {
        double pesetasChelines = chelines * 956.871 / 100;
        double pesetasDracmas = dracmas * 88.607 / 100;
        double francos = pesetasDracmas / 20.110;
        double dolares = pesetas / 122.499;
        double liras = pesetas * 100 / 9.289;

        return pesetasChelines + francos + dolares + liras;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese cantidad de chelines austríacos: ");
        double chelines = SC.nextDouble();

        System.out.println("Ingrese cantidad de dracmas griegos: ");
        double dracmas = SC.nextDouble();

        System.out.println("Ingrese cantidad de pesetas: ");
        double pesetas = SC.nextDouble();

        conversion(chelines, dracmas, pesetas);

        System.out.println("Pesetas de los chelines: " + (chelines * 956.871 / 100));
        System.out.println("Francos franceses de los dracmas: " + ((dracmas * 88.607 / 100) / 20.110));
        System.out.println("Dólares: " + (pesetas / 122.499));
        System.out.println("Liras italianas: " + (pesetas * 100 / 9.289));
    }
}
