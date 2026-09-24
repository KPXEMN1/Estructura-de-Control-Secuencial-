package com.mycompany.multiplicacion_rusa;
import java.util.Scanner;

public class Multiplicacion_Rusa {

    public static int calcular(int multiplicador, int multiplicando) {
        int resultado = 0;

        while (multiplicador > 0) {
            if (multiplicador % 2 != 0) {
                resultado = resultado + multiplicando;
            }

            multiplicador = multiplicador / 2;
            multiplicando = multiplicando * 2;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int a = SC.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int b = SC.nextInt();

        System.out.println("Resultado: " + calcular(a, b));
    }
}
