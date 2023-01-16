
package listas_Doble;

public class nodoDoble {
    
    public int dato;
    nodoDoble siguiente, anterior ; // Puntero enalce 
    
   // Constructor para cuando ya hay nodos
   
    public nodoDoble(int valor, nodoDoble s, nodoDoble a) {
       dato = valor;
       siguiente = s ;
       anterior = a ;
    }
    
    // Constructor para cuando aun no hay nodos

    public nodoDoble (int valor)
{
    this(valor, null, null);
    
}
}
