/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atributosclase;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author skabe
 * @param <t>
 */
public class ListAlgoritmo <t> implements List<Object>{
    t obj;
    private int size;
    private boolean empty;
    private Algoritmo inicial;
    private Algoritmo fin_nal;

    public ListAlgoritmo() {
        this.inicial=null;
        this.fin_nal=null;
        this.size=0;
        this.empty=true;
    }

    public ListAlgoritmo(t obj) {
        this.obj = obj;
        this.inicial= (Algoritmo) obj;
        this.fin_nal= (Algoritmo) obj;
        this.size=1;
        this.empty=false;
    }
    
    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.empty;
    }

    @Override
    public boolean contains(Object o) {
        Algoritmo actual= inicial;
        for(int i=0; i<=this.size; i++){
            if(actual.equals(o)){
                return true;
            }
            actual= actual.siguiente;
        }
        return false;
    }

    @Override
    public Iterator<Object> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Object e) {
        Algoritmo nuevo= (Algoritmo) e;
        if(this.inicial!=null){
            this.fin_nal.siguiente=nuevo;
            this.fin_nal=nuevo;
            this.size++;
        }
        else{
            this.inicial=nuevo;
            this.fin_nal=nuevo;
            this.empty=false;
            this.size++;
        }
        return this.fin_nal==nuevo;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends Object> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int i, Collection<? extends Object> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        this.inicial=null;
        this.fin_nal=null;
        this.size=0;
        this.empty=true;
    }

    @Override
    public Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object set(int i, Object e) {
        Algoritmo actual= inicial;
        Algoritmo nuevo= (Algoritmo) e;
        for(int j=0;j<i-1; j++){
            if(actual.siguiente==null){
                return actual;
            }
            actual=actual.siguiente;
        }
        nuevo.siguiente=actual.siguiente.siguiente;
        actual.siguiente=nuevo;
        return actual;
    }

    @Override
    public void add(int i, Object e) {
        Algoritmo actual= inicial;
        Algoritmo nuevo= (Algoritmo) e;
        if(i==0){
            nuevo.siguiente=actual;
            inicial=nuevo;
            this.size++;
            return ;
        }
        for(int j=0;j<i-1; j++){
            if(actual.siguiente==null){
                actual.siguiente= nuevo;
                this.size++;
                return ;
            }
            actual=actual.siguiente;
        }
        nuevo.siguiente=actual.siguiente;
        actual.siguiente=nuevo;
        this.size++;
    }

    @Override
    public Object remove(int i) {
        Algoritmo actual= inicial;
        if(i==0){
            if(actual.siguiente==null){
                inicial=null;
                fin_nal=null;
                this.size--;
            }
            inicial=actual.siguiente;
            return actual;
        }
        for(int j=0;j<i-1; j++){
            if(actual.siguiente==null){
                actual=null;
                this.size--;
                return actual;
            }
            actual=actual.siguiente;
        }
        Algoritmo eliminado=actual.siguiente;
        actual.siguiente=actual.siguiente.siguiente;
        this.size--;  
        return eliminado;
        
    }

    @Override
    public int indexOf(Object o) {
        Algoritmo actual= inicial;
        int index=0;
        for(int i=0; i<=this.size; i++){
            if(actual.equals(o)){
                return index;
            }
            actual= actual.siguiente;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        Algoritmo actual= inicial;
        int n=0;
        int index=-1;
        for(int i=0; i<=this.size; i++){
            if(actual.equals(o)){
                index= n;
            }
            actual= actual.siguiente;
            n++;
        }
        return index;
    }

    @Override
    public ListIterator<Object> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<Object> listIterator(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> subList(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
