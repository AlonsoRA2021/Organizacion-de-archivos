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
public class Pila {
    
    private nodoPila cima;
    


public Pila (){

    cima = null;
   
}

// Metodo para saber cuando la pila esta vacia

public boolean estaVacia(){
    return cima == null; 
}

// Metodo para insertar un elemento en la Pila

public void insertar (int valor){

 nodoPila nuevo = new nodoPila (valor);
 nuevo.siguiente = cima;
 cima = nuevo;


}
// Metodo para sacar un elemento en la Pila

public int sacar (){

 int auxiliar = cima.dato;
 cima = cima.siguiente;
 
 return auxiliar;
}



 //Metodo para mostar la lista

public void mostrarlista(){
    
    nodoPila recorrer = cima;
    System.out.println();
  while (recorrer!= null) 
   {
     System.out.print("[" + recorrer.dato + "]--->");
     recorrer = recorrer.siguiente;
   }
  
    
} 

}

