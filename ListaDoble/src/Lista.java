public class Lista {
    protected NodoDoble inicio, fin ; // Punteros para saber donde esta el inicio y el fin

    public Lista (){
        inicio = null;
        fin = null ;
    }
    
    public boolean vacia(){
        return inicio == null;
    }

    //Método para agregar un nodo al final
    public void agregarAlFinal (int valor){
        if (!vacia()) {
            fin = new NodoDoble (valor, null , fin);
            fin.anterior.siguiente = fin;
        }else{
            inicio = fin = new NodoDoble(valor);
        }
    }

    //Método para agregar un nodo al inicio
    public void agregarAlInicio (int valor){
        if (!vacia()) {
            inicio = new NodoDoble (valor, inicio , null);
            inicio.siguiente.anterior = inicio;
        }else{
            inicio = fin = new NodoDoble(valor);
        }
    }

    //Método para mostar la lista de inicio a fin
    public void mostrarListaInicioFin () {
        if (!vacia()) {}
        NodoDoble recorrer = inicio;
        System.out.println();
        while (recorrer!= null) {
            System.out.print("[" + recorrer.dato + "]<--->");
            recorrer = recorrer.siguiente;
        }
    }

    //Método para mostar la lista de Fin a Inicio
    public void mostrarListaFinInicio(){
        if (!vacia()) {}
        NodoDoble recorrer = fin;
        System.out.println();
        while (recorrer!= null) {
            System.out.print("[" + recorrer.dato + "]<--->");
            recorrer = recorrer.anterior;
        }
    }

    //Método para eliminar al inicio
    public int eliminarAlInicio () {
        int valor = fin.dato;
        if (inicio == fin) {
            inicio = fin;
            fin = null;
        }else{
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        return valor;
    }

    //Método para eliminar al final
    public int eliminarAlFinal () {
        int valor = fin.dato;
        if (inicio == fin) {
            inicio = fin;
            fin = null;
        }else{
            fin = fin.anterior;
            fin.siguiente = null;
        }
        return valor;
    }
}
