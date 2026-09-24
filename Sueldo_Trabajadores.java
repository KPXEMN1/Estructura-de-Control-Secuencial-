package com.mycompany.sueldo_trabajadores;
import java.util.Scanner;

public class Sueldo_Trabajadores {

    public static void calcular(Scanner SC, int cantidad) {

        for (int i = 1; i <= cantidad; i++) {

            System.out.println("Ingrese nombre: ");
            String nombre = SC.next();

            System.out.println("Ingrese cédula: ");
            String cedula = SC.next();

            System.out.println("Ingrese tipo (1=Obrero, 2=Administrativo, 3=Ejecutivo): ");
            int tipo = SC.nextInt();

            System.out.println("Ingrese cantidad de hijos: ");
            int hijos = SC.nextInt();

            System.out.println("Ingrese porcentaje de asistencia: ");
            double asistencia = SC.nextDouble();

            double sueldoBasico;

            if (tipo == 1) {
                sueldoBasico = 100000;
            } else if (tipo == 2) {
                sueldoBasico = 165500;
            } else {
                sueldoBasico = 250000;
            }

            if (hijos > 5) {
                hijos = 5;
            }

            double aporteHijos = hijos * (sueldoBasico * 0.10);
            double aporteAsistencia = 0;

            if (asistencia > 95) {
                aporteAsistencia = sueldoBasico * 0.05;
            }

            double cajaAhorros = sueldoBasico * 0.10;
            double seguroSocial = sueldoBasico * 0.02;

            double sueldoNeto = sueldoBasico
                    + aporteHijos
                    + aporteAsistencia
                    - cajaAhorros
                    - seguroSocial;

            System.out.println("-------------------------");
            System.out.println("Nombre: " + nombre);
            System.out.println("Cédula: " + cedula);
            System.out.println("Sueldo básico: " + sueldoBasico);
            System.out.println("Aporte Caja de Ahorros: " + cajaAhorros);
            System.out.println("Seguro Social: " + seguroSocial);
            System.out.println("Sueldo neto: " + sueldoNeto);
        }
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese cantidad de trabajadores: ");
        int cantidad = SC.nextInt();

        calcular(SC, cantidad);
    }
}
