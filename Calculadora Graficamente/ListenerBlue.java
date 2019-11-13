/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu_gato;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Carlos Montes Leyva
 */
public class ListenerBlue implements ActionListener{
    private DisplayCalcu display;
    public ListenerBlue(DisplayCalcu display) {
        this.display = display;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButtonCalculadora1 boton =(JButtonCalculadora1) e.getSource();
        if(display.getNumero().isAcctrue() && !(boton.getText().equals("="))){
        display.concatenar(boton.getText());
        display.getNumero().setAcc(boton.getText());
        display.getNumero().setAcctrue(false);
        display.getNumero().setSeparacion(display.getText().length());
        display.getNumero().setPunto(false);
        
        //display.getText()
        //StringTokenizer
        }else if(boton.getText().equals("-")){
            if(display.getNumero().isNegativo2()){}else{
            display.getNumero().setNegativo2(true);
            display.setText(display.getNumero().getTexto());
            }
        }
        else{
            if(boton.getText().equals("=")){
                display.igual();
            }else{
                display.igual();
                display.concatenar(boton.getText());
                display.getNumero().setAcc(boton.getText());
                display.getNumero().setAcctrue(false);
                display.getNumero().setSeparacion(display.getText().length());
            }
        }
    }
    
}
