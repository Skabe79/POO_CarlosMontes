/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atributosclase;

import java.awt.List;

/**
 *
 * @author Carlos Montes Leyva
 */
public class MainStatic {
    int x;
    static int aux;
    public static int contador=0;
    public MainStatic(int x){
        this.x=x;
        contador=contador+1;
    }
    public static void main(String[] args){
        ListAlgoritmo<Algoritmo> hola= new ListAlgoritmo<>();
    }
    public void hola(){
        MainStatic a= new MainStatic(4);
        System.out.println();
        MainStatic b= new MainStatic(14);
        System.out.println();
    }
}
