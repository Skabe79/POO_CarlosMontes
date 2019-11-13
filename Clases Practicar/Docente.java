/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Carlos Montes Leyva
 */
public class Docente extends Persona{
    private int matricula;
    private String materia;
    private String cubiculo;
    public Docente (){
        this.matricula=0;
        this.materia="Desconocido";
        this.cubiculo="Desconocido";
    }
    public Docente(String nom, int age, double est, double pes, String sex,
        int matricula, String materia, String cubiculo){
        super(nom, age, est, pes, sex);
        this.matricula=matricula;
        this.materia=materia;
        this.cubiculo=cubiculo;
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * @return the cubiculo
     */
    public String getCubiculo() {
        return cubiculo;
    }

    /**
     * @param cubiculo the cubiculo to set
     */
    public void setCubiculo(String cubiculo) {
        this.cubiculo = cubiculo;
    }
    
}
