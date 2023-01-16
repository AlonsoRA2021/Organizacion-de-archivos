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
public class lista {
    
    protected nodo inicio, fin ; // Puntoros para saber donde esta el inicio y el fin
 
public lista (){

    inicio = null;
    fin = null ;
}

// Metodo para saber si la lista esta vacia

public boolean estaVacia (){
    
if (inicio == null)
   {
    return true; 
   }
else 
    {
    return false;
    }
}





// Metodo para agregar un nodo al inicio de lista

public void agregarAlinicio (int valor){
// creacion del nodo
inicio = new nodo(valor, inicio);
if (fin == null)
{
   fin = inicio;
}

}



//Metodo para insertar al final de las lista

public void agregarAlFinal(int valor){
    if (!estaVacia()){
        
        fin.siguiente = new nodo (valor);
        fin = fin.siguiente;
    }
    else {
        inicio = fin = new nodo (valor);
        
    }
    
}





// Metodo para mostar la lista
public void mostrarlista(){
    
    nodo recorrer = inicio;
    System.out.println();
  while (recorrer!= null) 
   {
     System.out.print("[" + recorrer.dato + "]--->");
     recorrer = recorrer.siguiente;
   }
  
    
}
}


