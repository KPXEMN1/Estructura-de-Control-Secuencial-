package com.mycompany.estadisticas_empresas;
import java.util.Scanner;

public class Estadisticas_Empresas {

    public static void calcular(Scanner SC, int cantidad) {
        int agricolas = 0;
        int minerasSur = 0;
        int mineras = 0;

        int industrialesNorte = 0;
        int industrialesSur = 0;
        int industrialesCentro = 0;

        int trabajadoresAgricolas = 0;
        int trabajadoresMineras = 0;
        int trabajadoresIndustriales = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Actividad: Agricola / Minera / Industrial");
            String actividad = SC.next();

            System.out.println("Localización: Norte / Sur / Centro");
            String localidad = SC.next();

            System.out.println("Número de trabajadores: ");
            int trabajadores = SC.nextInt();

            if (actividad.equalsIgnoreCase("Agricola")) {
                agricolas++;
                trabajadoresAgricolas += trabajadores;
            }

            if (actividad.equalsIgnoreCase("Minera")) {
                mineras++;
                trabajadoresMineras += trabajadores;

                if (localidad.equalsIgnoreCase("Sur")) {
                    minerasSur++;
                }
            }

            if (actividad.equalsIgnoreCase("Industrial")) {
                trabajadoresIndustriales += trabajadores;

                if (localidad.equalsIgnoreCase("Norte")) {
                    industrialesNorte++;
                } else if (localidad.equalsIgnoreCase("Sur")) {
                    industrialesSur++;
                } else {
                    industrialesCentro++;
                }
            }
        }

        System.out.println("Porcentaje de empresas agrícolas: "
                + (agricolas * 100.0 / cantidad) + "%");

        if (mineras > 0) {
            System.out.println("Porcentaje de mineras del sur: "
                    + (minerasSur * 100.0 / mineras) + "%");
        }

        if (agricolas > 0)
            System.out.println("Promedio trabajadores agrícolas: "
                    + trabajadoresAgricolas / (double) agricolas);

        if (mineras > 0)
            System.out.println("Promedio trabajadores mineros: "
                    + trabajadoresMineras / (double) mineras);

        System.out.println("Industriales Norte: " + industrialesNorte);
        System.out.println("Industriales Sur: " + industrialesSur);
        System.out.println("Industriales Centro: " + industrialesCentro);
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Cantidad de empresas: ");
        int cantidad = SC.nextInt();

        calcular(SC, cantidad);
    }
}
