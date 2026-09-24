package com.mycompany.aumento_categoria;
import java.util.Scanner;

public class Aumento_Categoria {

    public static double calcular(int categoria, double sueldo) {
        double resultado;

        if (categoria == 1) {
            resultado = sueldo + sueldo * 0.15;
        } else if (categoria == 2) {
            resultado = sueldo + sueldo * 0.10;
        } else if (categoria == 3) {
            resultado = sueldo + sueldo * 0.08;
        } else {
            resultado = sueldo + sueldo * 0.07;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese la categoría: ");
        int categoria = SC.nextInt();

        System.out.println("Ingrese el sueldo: ");
        double sueldo = SC.nextDouble();

        System.out.println("Categoría: " + categoria);
        System.out.println("Nuevo sueldo: " + calcular(categoria, sueldo));
    }
}
