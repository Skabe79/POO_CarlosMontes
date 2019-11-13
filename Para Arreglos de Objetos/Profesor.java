/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesParaArreglos;

/**
 *
 * @author skabe
 */
public class Profesor {
    private String nombre;
    private String matricula;
    private String zona;

    public Profesor(String nombre, String matricula, String zona) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.zona = zona;
    }

    @Override
    public String toString() {
        return  "Soy Profesor mi nombre es: "+this.nombre+" mi matricula es:"
                + ""+this.matricula+" Mi zona es: "+this.zona;
    }
    
    
}
