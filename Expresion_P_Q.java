package com.mycompany.expresion_p_q;
import java.util.Scanner;

public class Expresion_P_Q {

    public static boolean calcular(int p, int q) {
        double resultado = Math.pow(p, 3) + Math.pow(q, 4) - (2 * Math.pow(p, 2));

        return resultado > 680;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese P: ");
        int p = SC.nextInt();

        System.out.println("Ingrese Q: ");
        int q = SC.nextInt();

        if (calcular(p, q)) {
            System.out.println("P y Q satisfacen la expresión.");
            System.out.println("P = " + p);
            System.out.println("Q = " + q);
        } else {
            System.out.println("P y Q no satisfacen la expresión.");
        }
    }
}
