/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu_gato;

import javax.swing.JTextField;

/**
 *
 * @author Carlos Montes Leyva
 */
public class DisplayCalcu extends JTextField{
    private NumeroDisplay numero;

    public DisplayCalcu() {
        this.numero= new NumeroDisplay();
    }
    public void concatenar(String texto){
        this.numero.concatenar(texto);
        setText(this.numero.getTexto());
    }
    public void igual(){
        this.numero.igual();
        setText(this.numero.getTexto());
    }
    public NumeroDisplay getNumero(){
        return this.numero;
    }
    public void setNumero(NumeroDisplay numero){
        this.numero=numero;
    }
}
