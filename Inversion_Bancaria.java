package com.mycompany.invercion_bancaria;

import java.util.Scanner;

public class Invercion_Bancaria {

    public static double dineroFinal(double capital) {
        double interes = capital * 0.02;
        double resultado = capital + interes;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el capital a invertir: ");
        double capital = SC.nextDouble();

        dineroFinal(capital);

        System.out.println("El capital inicial es: " + capital);
        System.out.println("El dinero obtenido después de un mes es: " + dineroFinal(capital));
    }
}
