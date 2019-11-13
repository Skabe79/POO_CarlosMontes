/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesParaArreglos;

import java.util.ArrayList;

/**
 *
 * @author skabe
 */
public class ArreglosDeObjetosMain {
    public static void Main2(String [] args){
        ArrayList<Object> arregloUno= new ArrayList<>(5);
        Computadora aux1= new Computadora("Acer", "Nitro 5", 1599.0);
        Perro aux2= new Perro("Sparky", "Chihuahua", "Carlos Montes Leyva");
        Profesor aux3= new Profesor("Miguel", "1524FFFDS", "NORTE-1");
        Salon aux4= new Salon("Aula 1", 0);
        Silla aux5= new Silla("Aorus", "F15-hs", 4799.0);
        arregloUno.add(aux1);
        arregloUno.add(aux2);
        arregloUno.add(aux3);
        arregloUno.add(aux4);
        arregloUno.add(aux5);
        for(Object aux0: arregloUno){
            System.out.println(aux0.toString());
        }
    }

    public static void Main2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
