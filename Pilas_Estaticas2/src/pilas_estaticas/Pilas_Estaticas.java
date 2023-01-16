/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas_estaticas;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrea
 */
public class Pilas_Estaticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int opcion, elemen, tamano;
    try {
    tamano = Integer.parseInt(JOptionPane.showInputDialog(null,
            "¿De que tamano quiere la Pila?"));
    Pila pilita = new Pila (tamano);
    
     do
     {
      
       opcion = Integer.parseInt(JOptionPane.showInputDialog(null ,
                 "1. Agregar un elemento a la Pila \n"
               + "2. Sacar un elemento de la Pila \n"
               + "3. ¿La pila esta vacia? \n"
               + "4. ¿La pila esta llena? \n"
               + "5. ¿Que elemento esta en la cima? \n"
               + "6. Tamano de la Pila \n"         
               + "7. Salir", " Menu de Opciones",
               JOptionPane.INFORMATION_MESSAGE));
       
       switch (opcion){
        
           case 1:
                elemen = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingrese el Elemento a insertar en la Pila: "));
                // Agregando al nodo
                if (!pilita.estaLlena()){
                pilita.empujar(elemen);
                }else {
                JOptionPane.showMessageDialog(null, "Pila esta llena"); 
                }
           break;
           
           case 2:
                
           break;
           
           case 3:
               if (pilita.estaVacia()){
                    JOptionPane.showMessageDialog(null, "La Pila esta Vacia"); 
                }else {
                JOptionPane.showMessageDialog(null, "La Pila NO esta vacia"); 
                }
                break;   
           case 4:
              if (pilita.estaLlena()){
                    JOptionPane.showMessageDialog(null, "La Pila esta Llena"); 
                }else {
                JOptionPane.showMessageDialog(null, "La Pila NO esta Llena"); 
                }
               break;
           case 5:
               
               break;
               
           case 6:            
                JOptionPane.showMessageDialog(null, "El tamano de la pila es: " + 
                pilita.tamanoPila());
           break;
           
           case 7:
             pilita.mostrar();
           break;
           
           
           case 8:
               JOptionPane.showMessageDialog(null, "Programa Finalizado");  
               break;
               
               
           default:
               JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
            break;
       }
       
    } while (opcion != 8);
        
    } catch (NumberFormatException n){
    JOptionPane.showMessageDialog(null," Errir "+ n.getMessage());
    }
    }
    
}
