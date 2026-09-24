package com.mycompany.nomina_empleados;
import java.util.Scanner;

public class Nomina_Empleados {

    public static void calcular(Scanner SC, int m) {
        double totalSueldos = 0;
        double sumaEdades = 0;

        int venezolanos1 = 0;
        int venezolanos2 = 0;
        int venezolanos3 = 0;
        int extranjerosImpares = 0;

        for (int i = 1; i <= m; i++) {
            System.out.println("Nombre: ");
            String nombre = SC.next();

            System.out.println("Nacionalidad (V/E): ");
            String nacionalidad = SC.next();

            System.out.println("Edad: ");
            int edad = SC.nextInt();

            System.out.println("Tipo de empleado (1/2/3): ");
            int tipo = SC.nextInt();

            System.out.println("Horas trabajadas: ");
            double horas = SC.nextDouble();

            double pagoHora;

            if (tipo == 1) {
                pagoHora = 5000;
                if (nacionalidad.equalsIgnoreCase("V")) venezolanos1++;
            } else if (tipo == 2) {
                pagoHora = 10000;
                if (nacionalidad.equalsIgnoreCase("V")) venezolanos2++;
            } else {
                pagoHora = 15000;
                if (nacionalidad.equalsIgnoreCase("V")) venezolanos3++;
            }

            double sueldo = horas * pagoHora;

            if (nacionalidad.equalsIgnoreCase("E") && edad % 2 != 0) {
                extranjerosImpares++;
            }

            sumaEdades += edad;
            totalSueldos += sueldo;

            System.out.println("Empleado: " + nombre);
            System.out.println("Sueldo básico: " + sueldo);

            if (sueldo > 100000) {
                System.out.println("Seguro Social: " + sueldo * 0.03);
            }
        }

        System.out.println("Venezolanos tipo 1: " + venezolanos1);
        System.out.println("Venezolanos tipo 2: " + venezolanos2);
        System.out.println("Venezolanos tipo 3: " + venezolanos3);
        System.out.println("Extranjeros con edad impar: " + extranjerosImpares);
        System.out.println("Promedio de edad: " + sumaEdades / m);
        System.out.println("Total a pagar en sueldos: " + totalSueldos);
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese cantidad de empleados: ");
        int m = SC.nextInt();

        calcular(SC, m);
    }
}