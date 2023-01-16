/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_Doble;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrea
 */
public class Listas_Doble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      listaDoble list = new listaDoble();
     int opcion = 0, elemen;
     do
     {
      
       opcion = Integer.parseInt(JOptionPane.showInputDialog(null ,
               "1. Agregar un nodo al inicio de la lista \n"
             + "2. Agregar un nodo al final de la lista \n"
             + "3. Mostrar la lista de inicio a fin  \n"   
             + "4. Mostrar la lista de fin a inicio \n" 
     /**     + "5. Eliminar un nodo al inicio \n"   
             + "6. Eliminar un nodo al final \n" 
             + "7. Eliminar un nodo de la lista \n"        **/  
             + "8. Salir", " Menu de Opciones",3));
       
       switch (opcion){
        
           case 1:
                elemen = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento:",
                "Insertando al inicio",3 ));
                list.agregarAlinicio(elemen);
           break;
                 
           case 2:
                elemen = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento:",
                 "Insertando al final",3 ));
                 list.agregarAlfinal(elemen);
           break;
           
           case 3:
               if (!list.vacia()){
               list.mostrarListaInicioFin();
               }else {
               JOptionPane.showMessageDialog(null, "No hay nodos");
               }
           break;
           
           case 4:
               if (!list.vacia()){
               list.mostrarListaFinInicio();
               }else {
               JOptionPane.showMessageDialog(null, "No hay nodos");
               }
           break;
           
           case 5:
               JOptionPane.showMessageDialog(null, "Aplicacion Finalizada");
           break;
           
           default:
               JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
          
       }
       
    } while (opcion != 5);
    
    
    }   
}
