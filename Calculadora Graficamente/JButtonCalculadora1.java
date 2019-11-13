/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu_gato;

import java.awt.Color;
import java.awt.Desktop.Action;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author Carlos Montes Leyva
 */
public class JButtonCalculadora1 extends JButton{
    public JButtonCalculadora1(String etiqueta, Dimension dim, Color color){
        super(etiqueta);
        setSize(dim);
        //TODO cambiar tamaño de la etiqueta
        Font aux= getFont();
        String fuente=aux.getName();
        int estilo = aux.getStyle();
        Font aux2= new Font(fuente,estilo, 40);
        setFont(aux2);
        setBackground(color);
    }
}
