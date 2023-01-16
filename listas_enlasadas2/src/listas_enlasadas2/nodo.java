/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_enlasadas2;

/**
 *
 * @author Andrea
 */
public class nodo {
    
    public int dato;
    public nodo siguiente ; // Puntero enalce 
    

    
    // Constructor para insertar al inicio
   
    public nodo(int d, nodo n) {
       dato = d;
       siguiente = n ;
    }
    
    // Constructor para agregar un nodo al final de lista

    public nodo (int d)
{
    this.dato = d;
    this.siguiente = null;
    
}
}
