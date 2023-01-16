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
public class lista_circular {
    
    protected nodo_circular ultimo ; // Puntoros para saber donde esta el inicio y el fin
 
public lista_circular (){

    ultimo = null;
    
}

// Metodo para saber si la lista esta vacia

public boolean estaVacia (){
    
if (ultimo == null)
   {
    return true; 
   }
else 
    {
    return false;
    }
}

//Metodo para insertar nodos

public lista_circular insertar(int valor){
    
   nodo_circular nuevo = new nodo_circular (valor);
 
if (ultimo != null) {

    nuevo.siguiente = ultimo.siguiente;
    ultimo.siguiente = nuevo;
}  
   ultimo = nuevo;
   return this;
    }
    
// Metodo para mostar la lista

public void mostrarlista(){
    
    nodo_circular recorrer = ultimo.siguiente;
    System.out.println();
  do
   {
     System.out.print("[" + recorrer.dato + "]--->");
     recorrer = recorrer.siguiente;
   }
  while (recorrer!= ultimo.siguiente) ;
}



  
}



