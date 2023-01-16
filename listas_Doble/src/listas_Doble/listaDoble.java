/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_Doble;

/**
 *
 * @author Andrea
 */
public class listaDoble {
    
    protected nodoDoble inicio, fin ; // Puntoros para saber donde esta el inicio y el fin
 
public listaDoble (){

    inicio = null;
    fin = null ;
}

public boolean vacia(){
return inicio == null;
}
// Metodo para agregar un nodo al final

public void agregarAlfinal (int el){

    if (!vacia()){
        fin = new nodoDoble (el, null , fin);
        fin.anterior.siguiente = fin;
    }else {
          inicio = fin = new nodoDoble(el);
    }
        
}

// Metodo para agregar un nodo al inicio

public void agregarAlinicio (int el){

    if (!vacia()){
        inicio = new nodoDoble (el, inicio , null);
        inicio.siguiente.anterior = inicio;
    }else {
          inicio = fin = new nodoDoble(el);
    }
        
}


// Metodo para mostar la lista de inicio a fin

public void mostrarListaInicioFin(){
    
    if (!vacia()){
    
    
    }
    nodoDoble recorrer = inicio;
    System.out.println();
  while (recorrer!= null) 
   {
     System.out.print("[" + recorrer.dato + "]<--->");
     recorrer = recorrer.siguiente;
   }
  
    
}

// Metodo para mostar la lista de Fin a Inicio

public void mostrarListaFinInicio(){
    
    if (!vacia()){
        
    }
    nodoDoble recorrer = fin;
    System.out.println();
  while (recorrer!= null) 
   {
     System.out.print("[" + recorrer.dato + "]<--->");
     recorrer = recorrer.anterior;
   }
  
    
}



}


