/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol_binario;

/**
 *
 * @author Andrea
 */
public class nodoArbol {
    
    public int dato;
    String nombre;
    nodoArbol hijoizquierdo, hijoderecho;
    
   
    public nodoArbol(int d, String nom) {
       this.dato = d;
       this.nombre = nom; 
       this.hijoderecho = null ;
       this.hijoizquierdo = null ;
    }
    
    // Mostrar la información del nodo

    public String  toString()
{
   return nombre + " Su Dato es:  "  + dato ;
    
}
}
