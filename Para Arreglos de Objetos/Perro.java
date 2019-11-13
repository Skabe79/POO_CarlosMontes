/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesParaArreglos;

/**
 *
 * @author skabe
 */
public class Perro {
    private String nombre;
    private String raza;
    private String nomdueño;

    public Perro(String nombre, String raza, String nomdueño) {
        this.nombre = nombre;
        this.raza = raza;
        this.nomdueño = nomdueño;
    }

    @Override
    public String toString() {
        return "Este es un traductor de perro: Perro{" + "nombre=" + nombre + ", "
                + "raza=" + raza + ", Nambre dueño=" + nomdueño + '}';
    }
    
}
