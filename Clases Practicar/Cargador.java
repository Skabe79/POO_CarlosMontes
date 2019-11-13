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
public class Cargador {
    private String marca;
    private double precio;
    private double peso;
    private String marcacompatible;
    public Cargador(String marca, double precio,double peso,String marcacompatible){
        this.marca=marca;
        this.precio=precio;
        this.peso=peso;
        this.marcacompatible= marcacompatible;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
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
    public String getMarcacompatible(){
        return this.marcacompatible;
    }
    public void setMarcacompatible(String marcacompatible){
        this.marca=marcacompatible;
    }
}
