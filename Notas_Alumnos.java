package com.mycompany.notas_alumnos;
import java.util.Scanner;

public class Notas_Alumnos {

    public static void calcular(Scanner SC) {
        double menorProgramacion = 6;
        double sumaProgramacion = 0;

        int alumnos = 0;
        int noPresentaronIngles = 0;
        int presentaronIngles = 0;
        int aprobaronTodas = 0;
        int presentaronMatematica = 0;
        int reprobaronMatematica = 0;

        System.out.println("Ingrese -1 en Matemática para terminar.");

        while (true) {
            System.out.println("Nota de Matemática: ");
            double matematica = SC.nextDouble();

            if (matematica == -1) {
                break;
            }

            System.out.println("Nota de Programación: ");
            double programacion = SC.nextDouble();

            System.out.println("Nota de Inglés (-1 si no presentó): ");
            double ingles = SC.nextDouble();

            alumnos++;
            sumaProgramacion += programacion;

            if (programacion < menorProgramacion) {
                menorProgramacion = programacion;
            }

            presentaronMatematica++;

            if (matematica < 3) {
                reprobaronMatematica++;
            }

            if (ingles == -1) {
                noPresentaronIngles++;
            } else {
                presentaronIngles++;
            }

            if (matematica >= 3 && programacion >= 3 && ingles >= 3) {
                aprobaronTodas++;
            }
        }

        System.out.println("Nota menor de Programación: " + menorProgramacion);

        if (presentaronIngles > 0) {
            System.out.println("Porcentaje que no presentó Inglés: "
                    + (noPresentaronIngles * 100.0 / presentaronIngles) + "%");
        }

        System.out.println("Aprobaron todas: " + aprobaronTodas);
        System.out.println("Promedio de Programación: " + sumaProgramacion / alumnos);

        System.out.println("Porcentaje que reprobó Matemática: "
                + (reprobaronMatematica * 100.0 / presentaronMatematica) + "%");
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        calcular(SC);
    }
}
