/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas_estaticas;

/**
 *
 * @author Andrea
 */
public class Pila {
    int vectorPila[];
    int cima;
// Constructor
  
public Pila (int tamano){

    vectorPila = new int[tamano];
    cima = -1;
}

// Metodo push

public void empujar (int dato){
    cima++;
    vectorPila[cima] = dato;
}


// Metodo para saber si la pila esta vacia

public boolean estaVacia(){
    return cima == -1;
}

// Metodo para saber si la pila esta llena

public boolean estaLlena(){
    return vectorPila.length-1 == cima;
}



// Metodo para saber el tamano de la pila

public int tamanoPila(){
    return vectorPila.length;
}

public void mostrar(){
    
    int recorrer = cima;
    System.out.println();
 while (recorrer!= -1) 
  {
   System.out.print("[" + vectorPila[recorrer] + "]--->");
    recorrer--;
  }
  
}



}

