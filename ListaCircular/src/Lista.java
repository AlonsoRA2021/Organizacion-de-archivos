public class Lista {
    protected NodoCircular ultimo ; //Puntoros para saber donde esta el inicio y el fin
    
    public Lista (){
        ultimo = null;
    }

    // Metodo para saber si la lista esta vacia
    public boolean estaVacia (){
        if (ultimo == null) {
            return true;
        }else{
            return false;
        }
    }
    
    //Metodo para insertar nodos
    public Lista insertar(int valor){
        NodoCircular nuevo = new NodoCircular (valor);
        if (ultimo != null) {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        return this;
    }

    // Metodo para mostar la lista
    public void mostrarlista(){
        NodoCircular recorrer = ultimo.siguiente;
        System.out.println();
        do{
            System.out.print("[" + recorrer.dato + "]--->");
            recorrer = recorrer.siguiente;
        } while (recorrer!= ultimo.siguiente) ;
    }

}
