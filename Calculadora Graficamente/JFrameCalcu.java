/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu_gato;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Carlos Montes Leyva
 */
public class JFrameCalcu extends JFrame{
    String titulo;
    Dimension dim;
    Dimension dim2;
    private String numero1="";
    private String numero2;
    public JFrameCalcu(String titulo, Dimension dim){
        this.titulo=titulo;
        this.dim2=new Dimension(100, 100);;
        this.dim= dim;
    }
    public void inicializapanel(){
        JPanel central= new JPanel(new GridLayout(5, 4));
        JButtonCalculadora1 btnC = new JButtonCalculadora1("C", dim, Color.YELLOW);
        JButtonCalculadora1 btnCE = new JButtonCalculadora1("CE", dim, Color.YELLOW);
        JButtonCalculadora1 btnMM = new JButtonCalculadora1("+/-", dim, Color.GREEN);
        JButtonCalculadora1 btnMulti = new JButtonCalculadora1("X", dim, Color.BLUE);
        JButtonCalculadora1 btn7 = new JButtonCalculadora1("7", dim, Color.GREEN);
        JButtonCalculadora1 btn8 = new JButtonCalculadora1("8", dim, Color.GREEN);
        JButtonCalculadora1 btn9 = new JButtonCalculadora1("9", dim, Color.GREEN);
        JButtonCalculadora1 btnDiv = new JButtonCalculadora1("/", dim, Color.BLUE);
        JButtonCalculadora1 btn4 = new JButtonCalculadora1("4", dim, Color.GREEN);
        JButtonCalculadora1 btn5 = new JButtonCalculadora1("5", dim, Color.GREEN);
        JButtonCalculadora1 btn6 = new JButtonCalculadora1("6", dim, Color.GREEN);
        JButtonCalculadora1 btnMenos = new JButtonCalculadora1("-", dim, Color.BLUE);
        JButtonCalculadora1 btn1 = new JButtonCalculadora1("1", dim, Color.GREEN);
        JButtonCalculadora1 btn2 = new JButtonCalculadora1("2", dim, Color.GREEN);
        JButtonCalculadora1 btn3 = new JButtonCalculadora1("3", dim, Color.GREEN);
        JButtonCalculadora1 btnMas = new JButtonCalculadora1("+", dim, Color.BLUE);
        JButtonCalculadora1 btncero = new JButtonCalculadora1("0", dim, Color.GREEN);
        JButtonCalculadora1 btnpunto = new JButtonCalculadora1(".", dim, Color.GREEN);
        JButtonCalculadora1 btnisgual = new JButtonCalculadora1("=", dim, Color.BLUE);
        JButtonCalculadora1 btnAcerca = new JButtonCalculadora1("?", dim, Color.ORANGE);
        
        setVisible(true);
        setSize(dim);
        setLayout(new BorderLayout());
        central.add(btnC);
        central.add(btnCE);
        central.add(btnMM);
        central.add(btnMulti);
        central.add(btn7);
        central.add(btn8);
        central.add(btn9);
        central.add(btnDiv);
        central.add(btn4);
        central.add(btn5);
        central.add(btn6);
        central.add(btnMenos);
        central.add(btn1);
        central.add(btn2);
        central.add(btn3);
        central.add(btnMas);
        central.add(btnpunto);
        central.add(btncero);
        central.add(btnisgual);
        central.add(btnAcerca);
        
        setLayout(new BorderLayout());
        add(central, BorderLayout.CENTER);
        DisplayCalcu display= new DisplayCalcu();
        Font auxFuente=display.getFont();
        Font nueva= new Font(auxFuente.getName(),auxFuente.getStyle(), 20);
        display.setFont(nueva);
        add(display, BorderLayout.NORTH);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        ListenerGreen orejon= new ListenerGreen(display);
        ListenerBlue orejon2= new ListenerBlue(display);
        ListenerYellow orejon3= new ListenerYellow(display);
        btn1.addActionListener(orejon);
        btn2.addActionListener(orejon);
        btn3.addActionListener(orejon);
        btn4.addActionListener(orejon);
        btn5.addActionListener(orejon);
        btn6.addActionListener(orejon);
        btn7.addActionListener(orejon);
        btn8.addActionListener(orejon);
        btn9.addActionListener(orejon);
        btncero.addActionListener(orejon);
        btnMM.addActionListener(orejon);
        btnMulti.addActionListener(orejon2);
        btnDiv.addActionListener(orejon2);
        btnMas.addActionListener(orejon2);
        btnMenos.addActionListener(orejon2);
        btnisgual.addActionListener(orejon2);
        btnpunto.addActionListener(orejon);
        btnC.addActionListener(orejon3);
        btnCE.addActionListener(orejon3);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //tn1.addActionListener(new ListenerGreen(getNumero1(), "1", display));
    }
}