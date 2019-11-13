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
public class Camara {
    private String marca;
    private String calidad;
    private double precio;
    private double peso;
    public Camara(String marca, String calidad, double precio, double peso){
        this.marca= marca;
        this.calidad=calidad;
        this.precio= precio;
        this.peso= peso;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getCalidad(){
        return this.calidad;
    }
    public void setCalidad(String calidad){
        this.calidad=calidad;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }
}
