public class NodoDoble {
    public int dato;
    NodoDoble siguiente, anterior; //Punteros enlace

    //Constructor para cuando ya hay nodos
    public NodoDoble (int dato, NodoDoble siguiente, NodoDoble anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    //Constructor para cuando aun no hay nodos
    public NodoDoble (int dato) {
        this(dato, null, null);
    }
}
