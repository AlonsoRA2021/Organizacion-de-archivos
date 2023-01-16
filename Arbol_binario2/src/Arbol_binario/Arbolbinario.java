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
public class Arbolbinario {
    
   nodoArbol raiz ; 
   
public Arbolbinario (){

    raiz = null;
}


// Metodo para agregar un nodo en el arbol

public void agregarnodo (int d, String nom){

    nodoArbol nuevo = new nodoArbol (d, nom);
    
    if (raiz == null){
        raiz = nuevo;
    }else
    {
        nodoArbol auxiliar =  raiz;
        nodoArbol padre;
        while (true)
        {
            padre = auxiliar;
            if (d < auxiliar.dato)
            {
                auxiliar = auxiliar.hijoizquierdo;
                if (auxiliar == null)
                {
                 padre.hijoizquierdo = nuevo;
                 return;
                }
            }else
              {
                 auxiliar = auxiliar.hijoderecho;
                 if (auxiliar == null)
                  {
                     padre.hijoderecho = nuevo;
                     return;
                  }
              } 
        }
    }
}

// Metodo para saber si el arbol esta vacio

public boolean estaVacio(){
       return raiz == null;
}

// Metodod por la funcion INORDEN

public void inOrden (nodoArbol r){

    if (r != null){
        inOrden (r.hijoizquierdo);
        System.out.println(r.dato);
        inOrden(r.hijoderecho);
    }
}
 
// Metodod por la funcion PREORDEN

public void preOrden (nodoArbol r){

    if (r != null){
        System.out.println(r.dato);
        preOrden (r.hijoizquierdo);
        preOrden(r.hijoderecho);
    }

}


// Metodod por la funcion POSTORDEN

public void postOrden (nodoArbol r){

    if (r != null){
        postOrden (r.hijoizquierdo);
        postOrden(r.hijoderecho);
        System.out.println(r.dato);
    }


}


}