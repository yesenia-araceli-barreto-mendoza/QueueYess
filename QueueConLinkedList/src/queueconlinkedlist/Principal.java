/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueconlinkedlist;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Yess
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Insertan datos
        //Retorna una exception en caso de no poder almacenar el elemento.
        
        Queue<String> queue= new LinkedList();
                queue.add("Yess");
                queue.add("Dano");
                queue.add("Mary");
                queue.add("Luis");
                queue.add("Alan");
                queue.add("Jona");
                queue.add("Jane");
                 //Insertan datos
        //Retorna una exception en caso de no poder almacenar el elemento.
                queue.offer("Jose");
                //Elimina un elemento
                System.out.println("Se eliminó: "+queue.remove());
                //Muestra el frente de una cola
                System.out.println("Frente de la cola: "+queue.element());
                //Elimina un elemento de la cola, muestra null si la cola está vacía,
                System.out.println("Se eliminó: "+queue.peek());
                //Mostrar todo el contenido
                System.out.println("Contenido: "+queue.toString());
    }
    
}
