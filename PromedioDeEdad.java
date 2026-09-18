/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedio.de.edad;

import java.util.Scanner;

/**
 *
 * @author AdminSena
 */
public class PromedioDeEdad {

    /**
     * @param args the command line arguments
     */
    public static double promedioedad (int e1, int e2, int e3){
        double resultado = (e1 + e2 + e3) /3;
        return resultado;
    }
    public static void main(String[] args) {
    Scanner SC = new Scanner (System.in);
        System.out.println("Ingrese la primera edad: ");
        int e1 = SC.nextInt();
        System.out.println("Ingrese la segunda edad: ");
        int e2 = SC.nextInt();
        System.out.println("Ingrese la tercera edad: ");
        int e3 = SC.nextInt();
        
        promedioedad(e1, e2, e3);
        
        System.out.println("La primera edad es:" + e1);
        System.out.println("La segunda edad es:" + e2);
        System.out.println("La tercera edad es:" + e3);
        System.out.println("El promedio de la edad es: " +  promedioedad(e1, e2, e3));
    }
    
}
