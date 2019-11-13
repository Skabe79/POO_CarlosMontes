/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Alumno
 */
public class Jframeteclado extends JFrame{
    String titulo;

    public Jframeteclado(String titulo) {
        this.titulo = titulo;
    }
    public void inicializarPanel(){
        JPanel principal= new JPanel();
        JbuttonTeclado btna= new JbuttonTeclado("A");
        JbuttonTeclado btnb= new JbuttonTeclado("B");
        JbuttonTeclado btnc= new JbuttonTeclado("C");
        JbuttonTeclado btnd= new JbuttonTeclado("D");
        JbuttonTeclado btne= new JbuttonTeclado("E");
        JbuttonTeclado btnf= new JbuttonTeclado("F");
        JbuttonTeclado btng= new JbuttonTeclado("G");
        JbuttonTeclado btnh= new JbuttonTeclado("H");
        JbuttonTeclado btni= new JbuttonTeclado("I");
        JbuttonTeclado btnj= new JbuttonTeclado("J");
        JbuttonTeclado btnk= new JbuttonTeclado("K");
        JbuttonTeclado btnl= new JbuttonTeclado("L");
        JbuttonTeclado btnm= new JbuttonTeclado("M");
        JbuttonTeclado btnn= new JbuttonTeclado("N");
        JbuttonTeclado btnio= new JbuttonTeclado("Ñ");
        JbuttonTeclado btno= new JbuttonTeclado("O");
        JbuttonTeclado btnp= new JbuttonTeclado("P");
        JbuttonTeclado btnq= new JbuttonTeclado("Q");
        JbuttonTeclado btnr= new JbuttonTeclado("R");
        JbuttonTeclado btns= new JbuttonTeclado("S");
        JbuttonTeclado btnt= new JbuttonTeclado("T");
        JbuttonTeclado btnu= new JbuttonTeclado("U");
        JbuttonTeclado btnv= new JbuttonTeclado("V");
        JbuttonTeclado btnw= new JbuttonTeclado("W");
        JbuttonTeclado btnx= new JbuttonTeclado("X");
        JbuttonTeclado btny= new JbuttonTeclado("Y");
        JbuttonTeclado btnz= new JbuttonTeclado("Z");
        JbuttonTeclado btn0= new JbuttonTeclado("0");
        JbuttonTeclado btn1= new JbuttonTeclado("1");
        JbuttonTeclado btn2= new JbuttonTeclado("2");
        JbuttonTeclado btn3= new JbuttonTeclado("3");
        JbuttonTeclado btn4= new JbuttonTeclado("4");
        JbuttonTeclado btn5= new JbuttonTeclado("5");
        JbuttonTeclado btn6= new JbuttonTeclado("6");
        JbuttonTeclado btn7= new JbuttonTeclado("7");
        JbuttonTeclado btn8= new JbuttonTeclado("8");
        JbuttonTeclado btn9= new JbuttonTeclado("9");
        JbuttonTeclado btnarriba= new JbuttonTeclado("⇑");
        JbuttonTeclado btnabajo= new JbuttonTeclado("⇓");
        JbuttonTeclado btnizquierda= new JbuttonTeclado("⇐");
        JbuttonTeclado btnderecha= new JbuttonTeclado("⇒");
        btn0.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                int key = ke.getKeyCode();
                if(key=='A'|| key=='a'){
                    btna.setBackground(Color.GREEN);
                } 
                if(key=='B'|| key=='b'){
                    btnb.setBackground(Color.GREEN);
                } 
                if(key=='C'|| key=='c'){
                    btnc.setBackground(Color.GREEN);
                } 
                if(key=='D'|| key=='d'){
                    btnd.setBackground(Color.GREEN);
                } 
                if(key=='E'|| key=='e'){
                    btne.setBackground(Color.GREEN);
                } 
                if(key=='F'|| key=='f'){
                    btnf.setBackground(Color.GREEN);
                } 
                if(key=='G'|| key=='g'){
                    btng.setBackground(Color.GREEN);
                } 
                if(key=='H'|| key=='h'){
                    btnh.setBackground(Color.GREEN);
                } 
                if(key=='I'|| key=='i'){
                    btni.setBackground(Color.GREEN);
                } 
                if(key=='J'|| key=='j'){
                    btnj.setBackground(Color.GREEN);
                } 
                if(key=='K'|| key=='k'){
                    btnk.setBackground(Color.GREEN);
                } 
                if(key=='L'|| key=='l'){
                    btnl.setBackground(Color.GREEN);
                } 
                if(key=='M'|| key=='m'){
                    btnm.setBackground(Color.GREEN);
                } 
                if(key=='N'|| key=='n'){
                    btnn.setBackground(Color.GREEN);
                } 
                if(key==165|| key==164){
                    btnio.setBackground(Color.GREEN);
                } 
                if(key=='O'|| key=='o'){
                    btno.setBackground(Color.GREEN);
                } 
                if(key=='P'|| key=='p'){
                    btnp.setBackground(Color.GREEN);
                } 
                if(key=='Q'|| key=='q'){
                    btnq.setBackground(Color.GREEN);
                } 
                if(key=='R'|| key=='r'){
                    btnr.setBackground(Color.GREEN);
                } 
                if(key=='S'|| key=='s'){
                    btns.setBackground(Color.GREEN);
                } 
                if(key=='T'|| key=='t'){
                    btnt.setBackground(Color.GREEN);
                } 
                if(key=='U'|| key=='u'){
                    btnu.setBackground(Color.GREEN);
                } 
                if(key=='V'|| key=='v'){
                    btnv.setBackground(Color.GREEN);
                } 
                if(key=='W'|| key=='w'){
                    btnw.setBackground(Color.GREEN);
                } 
                if(key=='X'|| key=='x'){
                    btnx.setBackground(Color.GREEN);
                } 
                if(key=='Y'|| key=='y'){
                    btny.setBackground(Color.GREEN);
                } 
                if(key=='Z'|| key=='z'){
                    btnz.setBackground(Color.GREEN);
                } 
                if(key=='0'){
                    btn0.setBackground(Color.YELLOW);
                } 
                if(key=='1'){
                    btn1.setBackground(Color.YELLOW);
                } 
                if(key=='2'){
                    btn2.setBackground(Color.YELLOW);
                } 
                if(key=='3'){
                    btn3.setBackground(Color.YELLOW);
                } 
                if(key=='4'){
                    btn4.setBackground(Color.YELLOW);
                } 
                if(key=='5'){
                    btn5.setBackground(Color.YELLOW);
                } 
                if(key=='6'){
                    btn6.setBackground(Color.YELLOW);
                } 
                if(key=='7'){
                    btn7.setBackground(Color.YELLOW);
                } 
                if(key=='8'){
                    btn8.setBackground(Color.YELLOW);
                } 
                if(key=='9'){
                    btn9.setBackground(Color.YELLOW);
                }  
                if(key==KeyEvent.VK_DOWN){
                    btnabajo.setBackground(Color.RED);
                }
                if(key==KeyEvent.VK_RIGHT){
                    btnderecha.setBackground(Color.RED);
                }
                if(key==KeyEvent.VK_LEFT){
                    btnizquierda.setBackground(Color.RED);
                }
                if(key==KeyEvent.VK_UP){
                    btnarriba.setBackground(Color.RED);
                }
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                int key= ke.getKeyChar();
                if(key=='A'|| key=='a'){
                    btna.setBackground(Color.BLUE);
                } 
                if(key=='B'|| key=='b'){
                    btnb.setBackground(Color.BLUE);
                } 
                if(key=='C'|| key=='c'){
                    btnc.setBackground(Color.BLUE);
                } 
                if(key=='D'|| key=='d'){
                    btnd.setBackground(Color.BLUE);
                } 
                if(key=='E'|| key=='e'){
                    btne.setBackground(Color.BLUE);
                } 
                if(key=='F'|| key=='f'){
                    btnf.setBackground(Color.BLUE);
                } 
                if(key=='G'|| key=='g'){
                    btng.setBackground(Color.BLUE);
                } 
                if(key=='H'|| key=='h'){
                    btnh.setBackground(Color.BLUE);
                } 
                if(key=='I'|| key=='i'){
                    btni.setBackground(Color.BLUE);
                } 
                if(key=='J'|| key=='j'){
                    btnj.setBackground(Color.BLUE);
                } 
                if(key=='K'|| key=='k'){
                    btnk.setBackground(Color.BLUE);
                } 
                if(key=='L'|| key=='l'){
                    btnl.setBackground(Color.BLUE);
                } 
                if(key=='M'|| key=='m'){
                    btnm.setBackground(Color.BLUE);
                } 
                if(key=='N'|| key=='n'){
                    btnn.setBackground(Color.BLUE);
                } 
                if(key==165|| key==164){
                    btnio.setBackground(Color.BLUE);
                } 
                if(key=='O'|| key=='o'){
                    btno.setBackground(Color.BLUE);
                } 
                if(key=='P'|| key=='p'){
                    btnp.setBackground(Color.BLUE);
                } 
                if(key=='Q'|| key=='q'){
                    btnq.setBackground(Color.BLUE);
                } 
                if(key=='R'|| key=='r'){
                    btnr.setBackground(Color.BLUE);
                } 
                if(key=='S'|| key=='s'){
                    btns.setBackground(Color.BLUE);
                } 
                if(key=='T'|| key=='t'){
                    btnt.setBackground(Color.BLUE);
                } 
                if(key=='U'|| key=='u'){
                    btnu.setBackground(Color.BLUE);
                } 
                if(key=='V'|| key=='v'){
                    btnv.setBackground(Color.BLUE);
                } 
                if(key=='W'|| key=='w'){
                    btnw.setBackground(Color.BLUE);
                } 
                if(key=='X'|| key=='x'){
                    btnx.setBackground(Color.BLUE);
                } 
                if(key=='Y'|| key=='y'){
                    btny.setBackground(Color.BLUE);
                } 
                if(key=='Z'|| key=='z'){
                    btnz.setBackground(Color.BLUE);
                } 
                if(key=='0'){
                    btn0.setBackground(Color.BLUE);
                } 
                if(key=='1'){
                    btn1.setBackground(Color.BLUE);
                } 
                if(key=='2'){
                    btn2.setBackground(Color.BLUE);
                } 
                if(key=='3'){
                    btn3.setBackground(Color.BLUE);
                } 
                if(key=='4'){
                    btn4.setBackground(Color.BLUE);
                } 
                if(key=='5'){
                    btn5.setBackground(Color.BLUE);
                } 
                if(key=='6'){
                    btn6.setBackground(Color.BLUE);
                } 
                if(key=='7'){
                    btn7.setBackground(Color.BLUE);
                } 
                if(key=='8'){
                    btn8.setBackground(Color.BLUE);
                } 
                if(key=='9'){
                    btn9.setBackground(Color.BLUE);
                }
                if(key==KeyEvent.VK_DOWN){
                    btnabajo.setBackground(Color.BLUE);
                }
                if(key==KeyEvent.VK_RIGHT){
                    btnderecha.setBackground(Color.BLUE);
                }
                if(key==KeyEvent.VK_LEFT){
                    btnizquierda.setBackground(Color.BLUE);
                }
                if(key==KeyEvent.VK_UP){
                    btnarriba.setBackground(Color.BLUE);
                }
            }
        });
        //ListenerTeclas123 l123= new ListenerTeclas123();
        //ListenerTeclasABC labc= new ListenerTeclasABC();
        /*btn0.addKeyListener(l123);
        btn1.addKeyListener(l123);
        btn2.addKeyListener(l123);
        btn3.addKeyListener(l123);
        btn4.addKeyListener(l123);
        btn5.addKeyListener(l123);
        btn6.addKeyListener(l123);
        btn7.addKeyListener(l123);
        btn8.addKeyListener(l123);
        btn9.addKeyListener(l123);
        btna.addKeyListener(labc);
        btnb.addKeyListener(labc);
        btnc.addKeyListener(labc);
        btnd.addKeyListener(labc);
        btne.addKeyListener(labc);
        btnf.addKeyListener(labc);
        btng.addKeyListener(labc);
        btnh.addKeyListener(labc);
        btni.addKeyListener(labc);
        btnj.addKeyListener(labc);
        btnk.addKeyListener(labc);
        btnl.addKeyListener(labc);
        btnm.addKeyListener(labc);
        btnn.addKeyListener(labc);
        btnio.addKeyListener(labc);
        btnp.addKeyListener(labc);
        btnq.addKeyListener(labc);
        btnr.addKeyListener(labc);
        btns.addKeyListener(labc);
        btnt.addKeyListener(labc);
        btnu.addKeyListener(labc);
        btnv.addKeyListener(labc);
        btnw.addKeyListener(labc);
        btnx.addKeyListener(labc);
        btny.addKeyListener(labc);
        btnz.addKeyListener(labc);*/
        
        principal.add(btn0);
        principal.add(btn1);
        principal.add(btn2);
        principal.add(btn3);
        principal.add(btn4);
        principal.add(btn5);
        principal.add(btn6);
        principal.add(btn7);
        principal.add(btn8);
        principal.add(btn9);
        principal.add(btna);
        principal.add(btnb);
        principal.add(btnc);
        principal.add(btnd);
        principal.add(btne);
        principal.add(btnf);
        principal.add(btng);
        principal.add(btnh);
        principal.add(btni);
        principal.add(btnj);
        principal.add(btnk);
        principal.add(btnl);
        principal.add(btnm);
        principal.add(btnn);
        principal.add(btnio);
        principal.add(btno);
        principal.add(btnp);
        principal.add(btnq);
        principal.add(btnr);
        principal.add(btns);
        principal.add(btnt);
        principal.add(btnu);
        principal.add(btnv);
        principal.add(btnw);
        principal.add(btnx);
        principal.add(btny);
        principal.add(btnz);
        principal.add(btnarriba);
        principal.add(btnizquierda);
        principal.add(btnderecha);
        principal.add(btnabajo);
        add(principal);
        setSize(650, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
