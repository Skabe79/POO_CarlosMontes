/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu_gato;


/**
 *
 * @author Carlos Montes Leyva
 */
public class NumeroDisplay {
    private String texto;
    private boolean negativo1;
    private boolean negativo2;
    private boolean punto;
    private boolean acctrue;
    private int separacion;
    private String acc;
    public NumeroDisplay() {
        this.texto="";
        this.negativo1=false;
        this.negativo2=false;
        this.punto=false;
        this.acctrue=true;
        this.separacion=0;
    }

    public NumeroDisplay(String texto) {
        this.texto = texto;
    }
    public void CE(){
        setTexto(getTexto().substring(0, separacion));
        this.negativo2=false;
        this.punto= false;
    }
    public void C(){
        this.texto="";
        this.negativo1=false;
        this.negativo2=false;
        this.punto=false;
        this.acctrue=true;
        this.separacion=0;
    }
    public void igual(){
        double valor1, valor2, resultado=0;
        switch (this.acc){
            case "X":
                valor1=getValue1();
                valor2=getValue2();
                resultado= valor1*valor2;
                setTexto(resultado+"");
                setAcctrue(true);
                break;
            case "/":
                valor1=getValue1();
                valor2=getValue2();
                resultado= valor1/valor2;
                setTexto(resultado+"");
                setAcctrue(true);
                break;
            case "+":
                valor1=getValue1();
                valor2=getValue2();
                resultado= valor1+valor2;
                setTexto(resultado+"");
                setAcctrue(true);
                break;
            case "-":
                valor1=getValue1();
                valor2=getValue2();
                resultado= valor1-valor2;
                setTexto(resultado+"");
                setAcctrue(true);
                break;
            default:
                    break;
        }
        if(resultado<0){
            negativo1=true;
            negativo2=false;
        }else{
            negativo1=false;
            negativo2=false;
        }
    }
    public void concatenar(String texto){
        this.setTexto(this.getTexto() + texto);
    }
    public double getValue1(){
        double valor= new Double(texto.substring(0, separacion-1));
        if(isNegativo1()){
            valor= new Double(texto.substring(1,separacion-1));
            valor= valor*-1;
        }
        return valor;
    }
    public double getValue2(){
        double valor= new Double(texto.substring(separacion));
        if(isNegativo2()){
            valor= new Double(texto.substring(separacion+1));
            valor= valor*-1;
        }
        return valor;
    }
    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * @return the negativo
     */
    public boolean isNegativo1() {
        return negativo1;
    }

    /**
     * @param negativo the negativo to set
     */
    public void setNegativo1(boolean negativo) {
        this.negativo1 = negativo;
        if(negativo==true){
            setTexto("-"+getTexto());
        }
        else{
            setTexto(getTexto().substring(1));
        }
    }
    /**
     * @return the negativo2
     */
    public boolean isNegativo2() {
        return negativo2;
    }

    /**
     * @param negativo2 the negativo2 to set
     */
    public void setNegativo2(boolean negativo2) {
        this.negativo2 = negativo2;
        if(negativo2==true){
            setTexto(getTexto().substring(0, separacion)+"-"+getTexto().substring(separacion));
        }
        else{
            setTexto(getTexto().substring(0, separacion)+getTexto().substring(separacion+1));
        }
    }
    /**
     * @return the punto
     */
    public boolean isPunto() {
        return punto;
    }

    /**
     * @param punto the punto to set
     */
    public void setPunto(boolean punto) {
        this.punto = punto;
    }

    /**
     * @return the separacion
     */
    public int getSeparacion() {
        return separacion;
    }

    /**
     * @param separacion the separacion to set
     */
    public void setSeparacion(int separacion) {
        this.separacion = separacion;
    }

    /**
     * @return the acc
     */
    public String getAcc() {
        return acc;
    }

    /**
     * @param acc the acc to set
     */
    public void setAcc(String acc) {
        this.acc = acc;
    }

    /**
     * @return the acctrue
     */
    public boolean isAcctrue() {
        return acctrue;
    }

    /**
     * @param acctrue the acctrue to set
     */
    public void setAcctrue(boolean acctrue) {
        this.acctrue = acctrue;
    }
}
