package com.mycompany.calificacion_final;
import java.util.Scanner;

public class Calificacion_Final {

    public static double calificacion(double p1, double p2, double p3, double examen, double trabajo) {
        double promedio = (p1 + p2 + p3) / 3.0;
        double resultado = (promedio * 0.55) + (examen * 0.30) + (trabajo * 0.15);
        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese la primera calificación parcial: ");
        double p1 = SC.nextDouble();

        System.out.println("Ingrese la segunda calificación parcial: ");
        double p2 = SC.nextDouble();

        System.out.println("Ingrese la tercera calificación parcial: ");
        double p3 = SC.nextDouble();

        System.out.println("Ingrese la calificación del examen final: ");
        double examen = SC.nextDouble();

        System.out.println("Ingrese la calificación del trabajo final: ");
        double trabajo = SC.nextDouble();

        calificacion(p1, p2, p3, examen, trabajo);

        System.out.println("La calificación final es: " + calificacion(p1, p2, p3, examen, trabajo));
    }
}