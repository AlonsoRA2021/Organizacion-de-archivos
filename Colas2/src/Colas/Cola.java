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
public class Cola {
    
    protected nodoCola inicio, fin ; // Puntoros para saber donde esta el inicio y el fin
    
 
public Cola (){

    inicio=fin = null ;
     
}

// Metodo para saber si la lista esta vacia

public boolean estaVacia (){
    
  return inicio == null; 
}

//Metodo para insertar al final de las lista

public void insertar (int valor){
    
    nodoCola nuevo = new nodoCola (valor);
    
    if (estaVacia()){
        
       inicio = nuevo;
    }
    else {
        fin.siguiente = nuevo;
         }
    fin = nuevo;
     
}

public int quitar(){
   
    int aux = inicio.dato;
    inicio =  inicio.siguiente;
    return aux;
    
}

}
