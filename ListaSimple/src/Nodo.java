public class Nodo {
    public int dato;
    public Nodo siguiente; //puntero enlace

    //Constructor para insertar al inicio
    public Nodo (int dato, Nodo nodo) {
        this.dato = dato;
        this.siguiente = nodo;
    }

    //Constructor para agregar un nodo al final de la lista
    public Nodo (int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
