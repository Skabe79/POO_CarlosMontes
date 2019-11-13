/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author skabe
 */
public class ListenerTeclas123 implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        JbuttonTeclado boton =(JbuttonTeclado) e.getSource();
        int key = e.getKeyCode();
        System.out.println(key);
        System.out.println(boton.getCaracterAscii());
        if(key==boton.getCaracterAscii()){
            boton.setBackground(Color.yellow);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        JbuttonTeclado boton =(JbuttonTeclado) e.getSource();
        boton.setBackground(Color.BLUE);
    }
    
}