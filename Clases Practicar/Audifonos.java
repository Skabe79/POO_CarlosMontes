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
public class Audifonos {
    private String marca;
    private double precio;
    private double peso;
    private String color;
    
     public Audifonos(String mar, double pre, double pes, String col){
        this.marca = mar;
        this.precio = pre;
        this.peso = pes;
        this.color = col;
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
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }
}
