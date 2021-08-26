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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personas p1 = new Personas();
        p1.setNombre("Marco");
        p1.setEdad(40);

        Personas p2 = new Personas();
        p2.setNombre("Felipe");
        p2.setEdad(10);

        Personas p3 = new Personas();
        p3.setNombre("Jose");
        p3.setEdad(60);

        Personas p4 = new Personas();
        p4.setNombre("Maria");
        p4.setEdad(20);

        ArrayList<Personas> nombres = new ArrayList<Personas>();
        nombres.add(p1);
        nombres.add(p2);
        ListasPersonas lista = new ListasPersonas();

        Personas maxObjeto = lista.edadMax3(nombres);
        System.out.println(maxObjeto);

        Personas minObjeto = lista.edadMi(nombres);
        System.out.println(minObjeto);

    }
}
