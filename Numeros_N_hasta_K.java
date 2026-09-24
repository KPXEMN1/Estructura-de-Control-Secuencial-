
package com.mycompany.numeros_n_hasta_k;
import java.util.Scanner;

public class Numeros_N_hasta_K {

    public static void calcular(int n, int k) {
        for (int i = n; i >= k; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("Ingrese N: ");
        int n = SC.nextInt();

        System.out.println("Ingrese K: ");
        int k = SC.nextInt();

        calcular(n, k);
    }
}
