/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ganerico;

/**
 *
 * @author Carlos Montes Leyva
 */
public class GenericasMain {
    public static void Main(String[] args){
        GenericaA<Integer> aux = new GenericaA<>(new Integer(5));
        GenericaA<Integer> aux2 = new GenericaA<>(new Integer(5));
    }
}
