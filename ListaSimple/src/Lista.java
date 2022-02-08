public class Lista {
    protected Nodo inicio, fin;

    public Lista () {
        inicio = null;
        fin = null;
    }

    public boolean estaVacia () {
        if (inicio == null) {
            return true;
        }else{
            return false;
        }
    }

    public void agregarAlInicio (int valor) {
        inicio = new Nodo(valor, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }

    public void agregarAlFinal (int valor) {
        if (!estaVacia()) {
            fin.siguiente = new Nodo(valor);
            fin = fin.siguiente;
        }else{
            inicio = fin = new Nodo(valor);
        }
    }

    public void mostrarLista () {
        Nodo recorrer = inicio;
        System.out.println();
        while (recorrer!= null) {
            System.out.print("[" + recorrer.dato + "]--->");
            recorrer = recorrer.siguiente;
        }
    }

    public int eliminarAlInicio () {
        int valor = inicio.dato;
        if (inicio == fin) {
            inicio = null;
            fin = null;
        }else{
            inicio = inicio.siguiente;
        }
        return valor;
    }

    public int eliminarAlFinal () {
        int valor = fin.dato;
        if (inicio == fin) {
            inicio = fin;
            fin = null;
        }else{
            Nodo temporal = inicio;
            while (temporal.siguiente != fin) {
                temporal = temporal.siguiente;
            }
            fin = temporal;
            fin.siguiente = null;
        }
        return valor;
    }

}
