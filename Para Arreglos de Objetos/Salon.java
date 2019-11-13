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
public class Salon {
    private String nombre;
    private int planta;

    public Salon(String nombre, int planta) {
        this.nombre = nombre;
        this.planta = planta;
    }

    @Override
    public String toString() {
        return "Salon{" + "nombre=" + nombre + ", planta=" + planta + '}';
    }
    
}
