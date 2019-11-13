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
public class Lentes {
    private String marca;
    private double precio;
    private int grad;
    public Lentes(String marca,double precio,int grad){
        this.marca=marca;
        this.precio=precio;
        this.grad=grad;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the grad
     */
    public int getGrad() {
        return grad;
    }

    /**
     * @param grad the grad to set
     */
    public void setGrad(int grad) {
        this.grad = grad;
    }
}
