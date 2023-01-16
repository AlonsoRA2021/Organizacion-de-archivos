/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author Andrea
 */
public class nodoPila {
    
    public int dato;
    public nodoPila siguiente ; // Puntero enalce 
    
 
    public nodoPila(int d) {
       dato = d;
       siguiente = null ;
    }
   
}
