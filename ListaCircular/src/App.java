import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista ();
        int opcion = 0, valorIngresado;
        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null ,
                "1. Agregar un nodo a la lista circular \n "
        //    + "2. Eliminar un nodo de la lista circular \n"
              + "3. Mostrar la lista circular\n"
              + "4. Salir", " Menu de Opciones",3));
              
              switch (opcion){
                  case 1:
                  valorIngresado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento:"));
                  //Agregando al nodo
                  lista.insertar(valorIngresado);
                  break;
                  
                  case 2:
                  JOptionPane.showMessageDialog(null, "Sin programar");
                  break;
                  
                  case 3:
                  if (!lista.estaVacia()){
                      lista.mostrarlista();
                    }else{
                        JOptionPane.showMessageDialog(null, "Aun no hay nodos");
                    }
                  break;
                  
                  case 4:
                  JOptionPane.showMessageDialog(null, "Programa Finalizado");
                  System.exit(0);

                  default:
                  JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                }
        } while (opcion != 4);
    }
    
}
