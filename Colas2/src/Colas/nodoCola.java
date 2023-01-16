/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;

/**
 *
 * @author Andrea
 */
public class nodoCola {
    
    public int dato;
    public nodoCola siguiente ; // Puntero enalce 
    
 
    
    // Constructor para insertar al inicio
   
    public nodoCola(int d) {
       dato = d;
       siguiente = null ;
    }
    
  }
