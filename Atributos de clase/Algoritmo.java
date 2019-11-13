/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atributosclase;


/**
 *
 * @author skabe
 */
public class Algoritmo {
    private String nombrealgoritmo;
    private int nivel;
    Algoritmo siguiente;

    public Algoritmo(String nombrealgoritmo, int nivel) {
        this.nombrealgoritmo = nombrealgoritmo;
        this.nivel = nivel;
        this.siguiente=null;
    }
    
    /**
     * @return the nombrealgoritmo
     */
    public String getNombrealgoritmo() {
        return nombrealgoritmo;
    }

    /**
     * @param nombrealgoritmo the nombrealgoritmo to set
     */
    public void setNombrealgoritmo(String nombrealgoritmo) {
        this.nombrealgoritmo = nombrealgoritmo;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
}
