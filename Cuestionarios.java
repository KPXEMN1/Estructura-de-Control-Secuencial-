package com.mycompany.cuestionarios;
import java.util.Scanner;

public class Cuestionarios {

    public static void calcular(Scanner SC) {
        double sumaGeneral = 0;
        double mayor = 0;
        double menor = 6;

        int instrumentoMayor = 0;
        int instrumentoMenor = 0;

        int menores3 = 0;
        int mayores4 = 0;
        int entre45y5 = 0;

        for (int i = 1; i <= 64; i++) {
            int puntos = 0;

            for (int j = 1; j <= 23; j++) {
                System.out.println("Cuestionario " + i + ", pregunta " + j);
                puntos += SC.nextInt();
            }

            double promedio = puntos / 23.0;

            sumaGeneral += promedio;

            if (promedio > mayor) {
                mayor = promedio;
                instrumentoMayor = i;
            }

            if (promedio < menor) {
                menor = promedio;
                instrumentoMenor = i;
            }

            if (promedio < 3) menores3++;
            if (promedio > 4) mayores4++;
            if (promedio >= 4.5 && promedio <= 5) entre45y5++;
        }

        System.out.println("Promedio general: " + sumaGeneral / 64);
        System.out.println("Mayor promedio: " + mayor);
        System.out.println("Instrumento mayor: " + instrumentoMayor);
        System.out.println("Menor promedio: " + menor);
        System.out.println("Instrumento menor: " + instrumentoMenor);

        if (mayores4 > 0) {
            System.out.println("Porcentaje menores de 3 respecto a mayores de 4: "
                    + (menores3 * 100.0 / mayores4) + "%");
        }

        System.out.println("Porcentaje entre 4.5 y 5: "
                + (entre45y5 * 100.0 / 64) + "%");
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        calcular(SC);
    }
}