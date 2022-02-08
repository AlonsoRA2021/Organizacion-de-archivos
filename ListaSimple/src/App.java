import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        Lista lista = new Lista();
        int opcion = 0, valorIngresado;

        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null ,
                    "1. Agregar un elemento al inicio de la lista \n"
                  + "2. Agregar un elemento al final de la lista \n"
                  + "3. Eliminar al inicio de la lista\n"
                  + "4. Eliminar al Final de la lista\n" 
                  + "5. Mostrar los datos de la lista\n"
                  + "6. Salir", " Menu de Opciones",3));
                  
                  switch (opcion){
                      case 1:
                      valorIngresado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento:",
                      "Insertado al inicio",3 ));
                      lista.agregarAlInicio(valorIngresado);
                      break;

                      case 2:
                      valorIngresado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento:",
                      "Insertado al final",3 ));
                      lista.agregarAlFinal(valorIngresado);
                      break;

                      case 3:
                      JOptionPane.showMessageDialog(null, "Se ha eliminado al inicio");
                      lista.eliminarAlInicio();
                      break;
                      
                      case 4:
                      JOptionPane.showMessageDialog(null, "Se ha eliminado al final");
                      lista.eliminarAlFinal();
                      break;

                      case 5:
                      lista.mostrarLista();
                      break;

                      case 6:
                      JOptionPane.showMessageDialog(null, "Hasta pronto!");
                      System.exit(0);

                      default:
                      JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                    }
        }while (opcion != 6);
    }

}
