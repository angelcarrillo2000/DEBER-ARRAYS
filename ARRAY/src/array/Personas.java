/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author DESKTOP
 */
public class Personas {

    private String cedula, nombre;
    private double edad;

    public Personas() {
        nombre = "";
        cedula = "";
        edad = 0;

    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public String toString() {

        return "El de mayor " + edad + " es: " + getNombre() + " Tiene la edad de : " + getEdad();
    }
}
