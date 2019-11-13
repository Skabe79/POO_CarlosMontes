/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu_gato;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author Carlos Montes Leyva
 */
public class CalculadoraMain {
    public CalculadoraMain(){
        
    }
    public static void main(String[] Args){
        JFrameCalcu h= new JFrameCalcu("hola", new Dimension(1000, 1000));
        h.inicializapanel();
        
    }
}
