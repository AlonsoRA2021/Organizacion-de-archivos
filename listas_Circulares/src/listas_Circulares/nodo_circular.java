/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_Circulares;

/**
 *
 * @author Andrea
 */
public class nodo_circular {
    
    public int dato;
    public nodo_circular siguiente ; // Puntero enalce 
    
 
    
    // Constructor para insertar al inicio
   
    public nodo_circular(int d) {
       dato = d;
       siguiente = this ;
    }
    
   
    
}
