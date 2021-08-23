/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multidimensional;

import java.util.Scanner;

/**
 *
 * @author DESKTOP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int m1[][] = new int[2][2];
        int m2[][] = new int[2][2];
        int mrm[][] = new int[2][2];
        //llenado primera matriz
        System.out.println("Ingrese los valores para la matriz 1");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                System.out.println("Ingrese valor en [" + i + "][" + j + "] : ");
                m1[i][j] = teclado.nextInt();
            }
        }
        System.out.println("");
        //Llenado segunda matriz
        System.out.println("Ingrese los valores para la matriz 2");
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                System.out.println("Ingrese valor en  [" + i + "][" + j + "] : ");
                m2[i][j] = teclado.nextInt();
            }
        }
        //Multiplicamos las matrices
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                for (int h = 0; h < m1.length; h++) {
                    mrm[i][j] += m1[i][h] * m2[h][j];
                }
            }
            System.out.println("");
        }
        //Mostramos las matrices
        System.out.println("");
        System.out.println("La multiplicacion es : ");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                System.out.print(" [ " + m1[i][j] + " ] ");
            }
            if (i == 1) {
                System.out.print("     X    ");
            } else {
                System.out.print("          ");
            }
            for (int j = 0; j < m2.length; j++) {
                System.out.print(" [ " + m2[i][j] + " ] ");
            }
            if (i == 1) {
                System.out.print("     =    ");
            } else {
                System.out.print("          ");
            }
            for (int j = 0; j < mrm.length; j++) {
                System.out.print(" [ " + mrm[i][j] + " ] ");
            }
            System.out.println("");
        }
    }
}
