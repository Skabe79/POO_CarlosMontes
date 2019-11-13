/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author Alumno
 */
public class JbuttonTeclado extends JButton{
    private int caracterAscii;
    public JbuttonTeclado(String etiqueta){
        super(etiqueta);
        char SS[]= etiqueta.toCharArray();
        this.caracterAscii= SS[0];
        setSize(20,20);
        Font aux= getFont();
        String fuente=aux.getName();
        int estilo = aux.getStyle();
        Font aux2= new Font(fuente,estilo, 40);
        setFont(aux2);
        setBackground(Color.blue);
        setVisible(true);
    }

    /**
     * @return the caracterAscii
     */
    public int getCaracterAscii() {
        return caracterAscii;
    }
    
}
