/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu_gato;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Carlos Montes Leyva
 */
public class Gato {
    private char tablero[][];
    private int a;
    private int b;
    private boolean turno;
    private String player1;
    private String player2;
    private String ganador;
    public Gato(){
       tablero= new char[][] {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
       player1="Jugador 1 ---X";
       player2="Jugador 2 ---O";
       ganador="Aun no hay ganador";
       Random aleatorio =new Random(System.currentTimeMillis());
       turno=aleatorio.nextBoolean();
    }
    public void juego(){
        System.out.println("JUEGO INICIADO:\nPrecione el numero que esta "
                + "en la posiscion que desa colocar movimiento");
        if(turno){
            System.out.println("Es turno de jugador 1 ---X");
        }
        else{
            System.out.println("Es turno de jugador 2 ---O");
        }
        mostrarTablero();
        if(revisarGanador()){
            System.out.println(this.ganador);
        }
        else{
            jugada();
        }
    }
    private void mostrarTablero(){
        for(int i=0;i<3;i++){
            String mostablero="|"+this.tablero[i][0]+"|"+this.tablero[i][1]+"|"
                    +this.tablero[i][2]+"|";
            System.out.println(mostablero);
        }
    }
    private void jugada(){
        Scanner boton=new Scanner(System.in);
        setAB(boton);
        if(this.tablero[getA()][getB()]!='X' && this.tablero[getA()][getB()]!='O'){
            if(isTurno()){
                this.tablero[getA()][getB()]='X';
                this.turno=(false);
            }
            else{
                this.tablero[getA()][getB()]='O';
                this.turno=(true);
            }
        }
        else{
            System.out.println("Error la posicion ya esta ocupada");
        }
        juego();
    }
    
    private boolean revisarGanador(){
        for(int i=0; i<3;i++){
            if(this.tablero[i][0]=='X' && this.tablero[i][1]=='X' && this.tablero[i][2]=='X'){
                this.ganador="EL jugador 1 ha ganado, pieza: X";
                return true;
            }
            else if(this.tablero[i][0]=='O' && this.tablero[i][1]=='O' && this.tablero[i][2]=='O'){
                this.ganador="EL jugador 2 ha ganado, pieza: O";
                return true;
            }
        }
        for(int i=0; i<3;i++){
            if(this.tablero[0][i]=='X' && this.tablero[1][i]=='X' && this.tablero[2][i]=='X'){
                this.ganador="EL jugador 1 ha ganado, pieza: X";
                return true;
            }
            else if(this.tablero[0][i]=='O' && this.tablero[1][i]=='O' && this.tablero[2][i]=='O'){
                this.ganador="EL jugador 2 ha ganado, pieza: O";
                return true;
            }
        }
        if(this.tablero[0][0]=='X' && this.tablero[1][1]=='X' && this.tablero[2][2]=='X'){
            this.ganador="EL jugador 1 ha ganado, pieza: X";
            return true;
        }
        else if(this.tablero[0][0]=='O' && this.tablero[1][1]=='O' && this.tablero[2][2]=='O'){
            this.ganador="EL jugador 2 ha ganado, pieza: O";
            return true;
        }
        if(this.tablero[2][0]=='X' && this.tablero[1][1]=='X' && this.tablero[0][2]=='X'){
            this.ganador="EL jugador 1 ha ganado, pieza: X";
            return true;
        }
        else if(this.tablero[2][0]=='O' && this.tablero[1][1]=='O' && this.tablero[0][2]=='O'){
            this.ganador="EL jugador 2 ha ganado, pieza: O";
            return true;
        }
        return false;
    }
    /**
     * @return the tablero
     */
    public char[][] getTablero() {
        return tablero;
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    private void setAB(Scanner boton) {
        switch (boton.nextInt()){
            case 1:
                this.a=0;
                this.b=0;
                break;
            case 2:
                this.a=0;
                this.b=1;
                break;
            case 3:
                this.a=0;
                this.b=2;
                break;
            case 4:
                this.a=1;
                this.b=0;
                break;
            case 5:
                this.a=1;
                this.b=1;
                break;
            case 6:
                this.a=1;
                this.b=2;
                break;
            case 7:
                this.a=2;
                this.b=0;
                break;
            case 8:
                this.a=2;
                this.b=1;
                break;
            case 9:
                this.a=2;
                this.b=2;
                break;
        }
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }


    /**
     * @return the turno
     */
    public boolean isTurno() {
        return turno;
    }


    /**
     * @return the ganador
     */
    public String getGanador() {
        return ganador;
    }
}
