package com.mycompany.sueldo_trabajador;
import java.util.Scanner;

public class Sueldo_Trabajador {

    public static double sueldo(double horasNormales, double pagoHora, double horasExtras, int hijos) {
        double sueldoBase = horasNormales * pagoHora;
        double pagoExtra = horasExtras * (pagoHora * 1.25);
        double asignaciones = 25000 + (hijos * 17300) + 18000;
        double deducciones = sueldoBase * 0.14;
        double resultado = sueldoBase + pagoExtra + asignaciones - deducciones;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el nombre del trabajador: ");
        String nombre = SC.nextLine();

        System.out.println("Ingrese las horas normales trabajadas: ");
        double horasNormales = SC.nextDouble();

        System.out.println("Ingrese el pago de una hora normal: ");
        double pagoHora = SC.nextDouble();

        System.out.println("Ingrese las horas extras trabajadas: ");
        double horasExtras = SC.nextDouble();

        System.out.println("Ingrese la cantidad de hijos: ");
        int hijos = SC.nextInt();

        sueldo(horasNormales, pagoHora, horasExtras, hijos);

        System.out.println("Trabajador: " + nombre);
        System.out.println("El sueldo neto es: " + sueldo(horasNormales, pagoHora, horasExtras, hijos));
    }
}
