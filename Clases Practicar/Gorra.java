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
public class Gorra {
    private String marca;
    private String talla;
    private double precio;
    public Gorra(String marca, String talla, double precio){
        this.marca=marca;
        this.talla=talla;
        this.precio=precio;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getTalla(){
        return this.talla;
    }
    public void setTalla(String talla){
        this.talla=talla;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
}
