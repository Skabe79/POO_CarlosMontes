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
public class Cable {
    private String uso;
    private double precio;
    private double peso;
    public Cable(String uso, double precio, double peso){
        this.uso= uso;
        this.precio= precio;
        this.peso= peso;
    }
    public String getUso(){
        return this.uso;
    }
    public void setUso(String uso){
        this.uso=uso;
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
