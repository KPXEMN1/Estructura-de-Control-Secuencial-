package com.mycompany.encuesta_alumnos;
import java.util.Scanner;

public class Encuesta_Alumnos {

    public static void calcular(Scanner SC, int cantidad) {
        int hombres = 0;
        int mujeres = 0;

        int hombresSolteros = 0;
        int mujeresSolteras = 0;

        int mujeresAdultas = 0;
        int hombresJovenes = 0;

        double edadHombres = 0;
        double edadMujeres = 0;

        int solteros = 0;
        int casados = 0;
        int divorciados = 0;
        int viudos = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Edad: ");
            int edad = SC.nextInt();

            System.out.println("Sexo (M/F): ");
            String sexo = SC.next();

            System.out.println("Estado civil (Soltero/Casado/Divorciado/Viudo): ");
            String estado = SC.next();

            System.out.println("Especialidad: ");
            String especialidad = SC.next();

            if (sexo.equalsIgnoreCase("M")) {
                hombres++;
                edadHombres += edad;

                if (edad > 17 && edad < 21) {
                    hombresJovenes++;
                }

                if (estado.equalsIgnoreCase("Soltero")) {
                    hombresSolteros++;
                }
            } else {
                mujeres++;
                edadMujeres += edad;

                if (edad > 21) {
                    mujeresAdultas++;
                }

                if (estado.equalsIgnoreCase("Soltero")) {
                    mujeresSolteras++;
                }
            }

            if (estado.equalsIgnoreCase("Soltero")) solteros++;
            if (estado.equalsIgnoreCase("Casado")) casados++;
            if (estado.equalsIgnoreCase("Divorciado")) divorciados++;
            if (estado.equalsIgnoreCase("Viudo")) viudos++;
        }

        System.out.println("Promedio edad mujeres: " + edadMujeres / mujeres);
        System.out.println("Promedio edad hombres: " + edadHombres / hombres);

        System.out.println("Cantidad hombres: " + hombres);
        System.out.println("Cantidad mujeres: " + mujeres);

        System.out.println("Solteros: " + solteros);
        System.out.println("Casados: " + casados);
        System.out.println("Divorciados: " + divorciados);
        System.out.println("Viudos: " + viudos);

        System.out.println("Porcentaje mujeres adultas: "
                + (mujeresAdultas * 100.0 / mujeres) + "%");

        System.out.println("Porcentaje hombres jóvenes: "
                + (hombresJovenes * 100.0 / hombres) + "%");

        System.out.println("Hombres solteros: " + hombresSolteros);
        System.out.println("Mujeres solteras: " + mujeresSolteras);
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Cantidad de alumnos: ");
        int cantidad = SC.nextInt();

        calcular(SC, cantidad);
    }
}
