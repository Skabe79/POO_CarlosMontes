/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 * Crear objetos
 * @author CRUZLEIJA
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private double estatura;
    private double peso;
    private String sexo;
    public Persona(){
        nombre= "Desconocido";
        edad=0;
        estatura=0;
        peso=0;
        sexo="Desconocido";
    }
    public Persona(String nom, int age, double est, double pes, String sex){
        this.nombre=nom;
        this.edad=age;
        this.estatura=est;
        this.peso=pes;
        this.sexo=sex;
    }
    public  void saludar(){
        System.out.println("Intruduce la edad");
    } 

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the estatura
     */
    public double getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
