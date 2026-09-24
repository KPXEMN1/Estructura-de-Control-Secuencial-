package com.mycompany.salario_neto;
import java.util.Scanner;

public class Salario_Neto {

    public static double salario(double horas, double precioHora) {
        double sueldo = horas * precioHora;
        double descuento = sueldo * 0.20;
        double resultado = sueldo - descuento;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas: ");
        double horas = SC.nextDouble();

        System.out.println("Ingrese el precio de la hora: ");
        double precioHora = SC.nextDouble();

        salario(horas, precioHora);

        System.out.println("El salario neto es: " + salario(horas, precioHora));
    }
}
