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
public class Leche {
    String marca;
    String tipo;
    double litros;
    double precio;
    public Leche(String marca, String tipo, double litros, double precio){
        this.marca=marca;
        this.tipo=tipo;
        this.litros=litros;
        this.precio=precio;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public double getLitros(){
        return this.litros;
    }
    public void setLitros(double litros){
        this.litros=litros;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
}
