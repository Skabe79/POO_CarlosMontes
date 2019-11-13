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
public class Refresco {
    private String Marca;
    private float cantidadLitros;
    private double precio;

    public Refresco() {
        this.Marca= "Desconocida";
    }

    public Refresco(String Marca, float cantidadLitros, double precio) {
        this.Marca = Marca;
        this.cantidadLitros = cantidadLitros;
        this.precio = precio;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the cantidadLitros
     */
    public float getCantidadLitros() {
        return cantidadLitros;
    }

    /**
     * @param cantidadLitros the cantidadLitros to set
     */
    public void setCantidadLitros(float cantidadLitros) {
        this.cantidadLitros = cantidadLitros;
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
    
}
