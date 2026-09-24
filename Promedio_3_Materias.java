package com.mycompany.promedio_3_materias;
import java.util.Scanner;

public class Promedio_3_Materias {

    public static double promedio(double m1, double m2, double f1, double f2, double q1, double q2) {
        double matematica = (m1 * 0.90) + (m2 * 0.10);
        double fisica = (f1 * 0.80) + (f2 * 0.20);
        double quimica = (q1 * 0.85) + (q2 * 0.15);
        double resultado = (matematica + fisica + quimica) / 3;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese nota del examen de Matemática: ");
        double m1 = SC.nextDouble();

        System.out.println("Ingrese promedio de tareas de Matemática: ");
        double m2 = SC.nextDouble();

        System.out.println("Ingrese nota del examen de Física: ");
        double f1 = SC.nextDouble();

        System.out.println("Ingrese promedio de tareas de Física: ");
        double f2 = SC.nextDouble();

        System.out.println("Ingrese nota del examen de Química: ");
        double q1 = SC.nextDouble();

        System.out.println("Ingrese promedio de tareas de Química: ");
        double q2 = SC.nextDouble();

        promedio(m1, m2, f1, f2, q1, q2);

        System.out.println("El promedio general es: " + promedio(m1, m2, f1, f2, q1, q2));
    }
}