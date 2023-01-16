/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol_binario;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrea
 */
public class Arbol_binario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int opcion = 0, elemen;
     String nombre;
     Arbolbinario arbolito = new Arbolbinario();
     
     do
     {
       try{
       opcion = Integer.parseInt(JOptionPane.showInputDialog(null ,
               "1. Agregar un nodo\n"
             + "2. Recorrer el albor InOrden \n"
             + "3. Recorrer el albor PreOrden  \n" 
             + "4. Recorrer el albor PostOrden  \n"  
             + "5. Buscar un Nodo en el Albor \n"  
             + "6. Salir \n"        
             + " Elige una Opcion " , " Arboles Binarios ",JOptionPane.QUESTION_MESSAGE));
       
       switch (opcion){
        
           case 1:
                elemen = Integer.parseInt(JOptionPane.showInputDialog(null, 
                      "Ingrese el numero del nodo:", "Agregando nodo", 
                      JOptionPane.QUESTION_MESSAGE));
                nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del nodo",
                       "Agregando nodo" , JOptionPane.QUESTION_MESSAGE);
                arbolito.agregarnodo(elemen, nombre);
           break;
                 
           case 2:
               
               if (!arbolito.estaVacio()){
                   arbolito.inOrden(arbolito.raiz);
               }else
                     { 
                       JOptionPane.showMessageDialog(null, "El Arbol esta vacio"); 
                     }
           break;
           
           case 3:
               if (!arbolito.estaVacio()){
                   arbolito.preOrden(arbolito.raiz);
               }else
                     { 
                       JOptionPane.showMessageDialog(null, "El Arbol esta vacio"); 
                     }
           break;
           
           case 4:
                if (!arbolito.estaVacio()){
                   arbolito.postOrden(arbolito.raiz);
               }else
                     { 
                       JOptionPane.showMessageDialog(null, "El Arbol esta vacio"); 
                     }
           break;
           
           case 5:
                
           break;
               
           case 6:
               JOptionPane.showMessageDialog(null, "Aplicacion Finalizada");
           break;
           
           default:
               JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
          
       }
       }catch (NumberFormatException n){
       JOptionPane.showMessageDialog(null, " Error " + n.getMessage());
       }
    } while (opcion != 6);
    
    
    }   
}
