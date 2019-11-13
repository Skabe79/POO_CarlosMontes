/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Alumno
 */
public class Laptop {
    String marca;
    String procesador;
    double capacidad;
    double precio;
    public Laptop(String marca, String procesador, double capacidad,double precio){
        this.marca=marca;
        this.procesador=procesador;
        this.capacidad=capacidad;
        this.precio=precio;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getProcesador(){
        return this.procesador;
    }
    public void setProcesador(String procesador){
        this.procesador=procesador;
    }
    public double getCapacidad(){
        return this.capacidad;
    }
    public void setCapacidad(double capacidad){
        this.capacidad=capacidad;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
}
