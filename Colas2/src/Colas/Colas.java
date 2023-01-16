/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrea
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Cola colita = new Cola();
     int opcion = 0, elemen =0 ;
     do
     {
      
       opcion = Integer.parseInt(JOptionPane.showInputDialog(null ,
                 "1. Insertar un elemento en la Cola \n"
               + "2. Eliminar un elementos ne la Cola \n"
               + "3 ¿La Cola esta vacia? \n"
               + "4. Elemento ubicado al inicio de la Cola \n"
               + "5. Tamanio de la Cola \n"     
               + "6. Cantidad de elemenots de la Cola \n" 
               + "7. Elementos repetidos en la Cola \n"               
               + "8. Salir", " Menu de Opciones de la Cola", JOptionPane.QUESTION_MESSAGE ));
       
       switch (opcion){
        
           case 1:
                elemen = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento a Insertar:",
                "Insertando en la Cola", JOptionPane.QUESTION_MESSAGE));
                // Agregando al nodo
                colita.insertar(elemen);
           break;
           
           case 2:
               if (!colita.estaVacia()) {
                   
                JOptionPane.showMessageDialog(null, "El elemento eliminado es:  " + colita.quitar() , 
                "Quitando elementos en la Cola", JOptionPane.QUESTION_MESSAGE);
               }else {
                JOptionPane.showInputDialog(null, "La Cola esta vacia " , 
                "Cola vacia", JOptionPane.INFORMATION_MESSAGE);
               
               }
                
           break;
           
           case 3:
               if (colita.estaVacia()) {
                   
                JOptionPane.showMessageDialog(null, "La Cola Esta vacia" , 
                "Cola Vacia", JOptionPane.INFORMATION_MESSAGE);
               }else {
                   JOptionPane.showMessageDialog(null, "La Cola NO Esta vacia" , 
                "Cola NO Vacia", JOptionPane.INFORMATION_MESSAGE);
               }
            break ;
            
           case 4:
                              
               break;
               
           case 5:
               
               break;
               
           case 6:
               
               break;
               
           case 7:
               
               break;  
               
           case 8:
               
               JOptionPane.showMessageDialog(null, "Aplicacion Finalizada ");  
               break;
               
           default:
               JOptionPane.showMessageDialog(null, "Opcion Incorrecta");  
           break;
               
       }
       
    } while (opcion != 8);
    
    
    }   
}
