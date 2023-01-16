public class NodoCircular {
    public int dato;
    public NodoCircular siguiente ; //Puntero enalce 
    
    //Constructor para insertar al inicio
    public NodoCircular (int dato) {
       this.dato = dato;
       siguiente = this;
    }

}
