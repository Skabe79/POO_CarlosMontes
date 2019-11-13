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
public class Celular {
    private String marca;
    private double precio;
    private double peso;

public Celular(String marc, double prec, double pes){
    this.marca= marc;
    this.precio=prec;
    this.peso=pes;
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

}
