/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueconlinkedlist;
class Nodo{
    Object elemento;
    Nodo siguiente;

public Nodo(Object x){
elemento=x;
siguiente=null;
}}
public class ColaLista {
    protected Nodo frente;
    protected Nodo fin;

    public ColaLista() {
       frente=fin=null;
    }
    public void insertar(Object elemento){
        Nodo a;
        a= new Nodo(elemento);
        if(colaVacia()){
            frente=a;
        }else{
            fin.siguiente=a;
        }
        fin=a;
    }
    public Object quitar(){
        Object aux = null;
        if(!colaVacia()){
            aux=frente.elemento;
            frente=frente.siguiente;
        }else{
            System.out.println("Eliminar de una cola vacía");
        }
        return aux;
    }
    public void borrarCola(){
        for (; frente != null;) {
            frente=frente.siguiente;
            
        }
        System.gc();
    }
    public Object frenteCola(){
        if(colaVacia()){
            System.out.println("Error, cola vacía");
        }
        return(frente.elemento);
    
}
    public boolean colaVacia(){
        return(frente==null);
    }
    
    
    
    
}
