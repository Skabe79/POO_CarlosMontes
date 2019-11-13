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
 * @author skabe
 */
public class ListenerYellow implements ActionListener{
private DisplayCalcu display;
    public ListenerYellow(DisplayCalcu display){
        this.display=display;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButtonCalculadora1 boton=(JButtonCalculadora1) e.getSource();
        if(boton.getText().equals("CE")){
            display.getNumero().CE();
            display.setText(display.getNumero().getTexto());
        }
        else{
            display.getNumero().C();
            display.setText(display.getNumero().getTexto());
        }
    }
}
