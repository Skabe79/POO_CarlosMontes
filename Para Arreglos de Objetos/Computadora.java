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
public class Computadora {
    private String marca;
    private String modelo;
    private double precio;

    public Computadora(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + '}';
    }
    
}
