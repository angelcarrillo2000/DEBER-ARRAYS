/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;

/**
 *
 * @author DESKTOP
 */
public class ListasPersonas {

    private double[] lista;

    public double promedioEdad(Personas[] p) {
        double sumEdad = 0;
//r es el objeto y p es la lista 
        for (Personas r : p) {
            sumEdad = sumEdad + r.getEdad();
        }
        double resultado = sumEdad / p.length;
        return resultado;

    }

    public double edadMax(Personas[] p) {
        Personas obj;
        double maxima = 0;
        String nombre = "";
        for (int i = 0; i < p.length; i++) {
            if (p[i].getEdad() > maxima) {
                maxima = p[i].getEdad();
                nombre = p[i].getNombre();
            }
        }
        System.out.println("la edad maxima es la de: " + nombre + " su edad es: " + maxima);
        return maxima;
    }
    public double edadMax2(ArrayList<Personas> p) {
        double max = p.get(0).getEdad();
        for (int i = 1; i < p.size(); i++) {
            if (p.get(i).getEdad() > max) {
                max = p.get(i).getEdad();

            }
        }
        return max;
    }
    public Personas edadMax3(ArrayList<Personas> p) {
        Personas max = new Personas();

        max = p.get(0);

        for (int i = 1; i < p.size(); i++) {
            if (p.get(i).getEdad() > max.getEdad()) {
                max = p.get(i);

            }
        }
        return max;
    }

    public Personas edadMi(ArrayList<Personas> p) {
        Personas min = new Personas();

        min = p.get(1);
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).getEdad() < min.getEdad()) {
                min = p.get(i);
            }
        }
        return min;
    }
}
