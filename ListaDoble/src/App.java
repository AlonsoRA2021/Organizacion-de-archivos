import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();
        int opcion = 0, valorIngresado;
        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null ,
               "1. Agregar un nodo al inicio de la lista \n"
             + "2. Agregar un nodo al final de la lista \n"
             + "3. Mostrar la lista de inicio a fin  \n"   
             + "4. Mostrar la lista de fin a inicio \n" 
             + "5. Eliminar un nodo al inicio \n"   
             + "6. Eliminar un nodo al final \n" 
             + "7. Eliminar un nodo de la lista \n"
             + "8. Salir", " Menu de Opciones",3));
             
             switch (opcion){
                 case 1:
                 valorIngresado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento:",
                 "Insertando al inicio",3 ));
                 lista.agregarAlInicio(valorIngresado);
                 break;
                 
                 case 2:
                 valorIngresado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento:",
                 "Insertando al final",3 ));
                 lista.agregarAlFinal(valorIngresado);
                 break;
                 
                 case 3:
                 if (!lista.vacia()){
                     lista.mostrarListaInicioFin();
                    }else{
                        JOptionPane.showMessageDialog(null, "No hay nodos");
                    }
                 break;
                 
                 case 4:
                 if (!lista.vacia()){
                     lista.mostrarListaFinInicio();
                    }else{
                        JOptionPane.showMessageDialog(null, "No hay nodos");
                    }
                 break;
                 
                 case 5:
                 JOptionPane.showMessageDialog(null, "Se ha eliminado al inicio");
                 lista.eliminarAlInicio();
                 break;

                 case 6:
                 JOptionPane.showMessageDialog(null, "Se ha eliminado al final");
                 lista.eliminarAlFinal();
                 break;

                 case 7:
                 JOptionPane.showMessageDialog(null, "Eliminando cualquiera");

                 case 8:
                 JOptionPane.showMessageDialog(null, "Hasta pronto");
                 System.exit(0);

                 default:
                 JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                }
        } while (opcion != 8);
    }

}
