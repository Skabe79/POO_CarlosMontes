/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu_gato;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;


/**
 *
 * @author Carlos Montes Leyva
 */
public class ListenerGreen implements ActionListener{
    private DisplayCalcu display;
    public ListenerGreen(DisplayCalcu display){
        this.display=display;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButtonCalculadora1 boton=(JButtonCalculadora1) e.getSource();
        switch (boton.getText()){
                case "+/-":
                    if(display.getNumero().isAcctrue()){
                        if(display.getNumero().isNegativo1()){
                            display.getNumero().setNegativo1(false);
                        }
                        else{
                            display.getNumero().setNegativo1(true);
                        }
                    }
                    else{
                        if(display.getNumero().isNegativo2()){
                            display.getNumero().setNegativo2(false);
                        }
                        else{
                            display.getNumero().setNegativo2(true);
                        }
                    }
                    display.setText(display.getNumero().getTexto());
                    break;
                case ".":
                    if(display.getNumero().isPunto()){
                    }
                    else{
                    display.concatenar(boton.getText());
                    display.getNumero().setPunto(true);
                    }
                    break;
                default:
                    display.concatenar(boton.getText());
                    break;
        }
    }
}
