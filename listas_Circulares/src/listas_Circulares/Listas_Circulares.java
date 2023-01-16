/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_Circulares;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrea
 */
public class Listas_Circulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      lista_circular list = new lista_circular();
     int opcion = 0, elemen;
     do
     {
      
       opcion = Integer.parseInt(JOptionPane.showInputDialog(null ,
                "1. Agregar un nodo a la lista circular \n "
        //    + "2. Eliminar un nodo de la lista circular \n"
              + "3. Mostrar la lista circular\n"
              + "4. Salir", " Menu de Opciones",3));
       
       switch (opcion){
        
           case 1:
                elemen = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento:"));
                // Agregando al nodo
                list.insertar(elemen);
           break;
           
           case 2:
             
                
           break;
           
           case 3:
                if (!list.estaVacia()){
                list.mostrarlista();
                } else {
                JOptionPane.showMessageDialog(null, "Aun no hay nodos");
                }
           break;
           case 4:
               JOptionPane.showMessageDialog(null, "Programa Finalizado");
           default:
               JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
          
       }
       
    } while (opcion != 4);
    
    
    }   
}
