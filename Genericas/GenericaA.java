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
public class GenericaA <S>{
    S aux;

    public GenericaA(S aux) {
        this.aux = aux;
    }
    public void classType(){
        System.out.println(this.aux.getClass());
    }
}
