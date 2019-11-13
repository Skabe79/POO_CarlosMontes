/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atributosclase;

/**
 *
 * @author Carlos Montes Leyva
 */
public class GenericClass <T> {
    T obj;
    public GenericClass(T o){
        obj = o;
    }
    public void quesoy(){
        System.out.println("Hola soy un objeto tipo : "+obj.getClass().getName());
        
    }
}
