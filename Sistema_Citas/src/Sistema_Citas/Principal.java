package Sistema_Citas;

import javax.swing.JOptionPane;

/**
 *
 * @author Alonso
 */

public class Principal {

    public static void main(String[] args) {
        
        Datos datos = new Datos();
        int opcion = 0;
        String nombrePaciente, nombreDoctor;
        
        String [] horas = {"7:00am a 8:30am",
                           "8:30am a 10:00am",
                           "10:00am a 11:30am",
                           "11:30am a 1:00pm",
                           "1:00pm a 2:15pm",
                           "2:15pm a 3:30pm"};
        String [] fechas = {"Lunes",
                            "Martes",
                            "Miercoles",
                            "Jueves",
                            "Viernes"};
        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null ,
               "1. Asignar Cita      \n"
             + "2. Eliminar Cita     \n"
             + "3. Mostrar Consultas \n"
             + "4. Buscar Paciente   \n"
             + "5. -Salir-", " Menu de Opciones",3));
            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Bienvenido(a) favor completar los siguientes datos");
                    nombrePaciente = JOptionPane.showInputDialog(null, "Nombre del paciente:",
                     "Asignando cita",3 );
                    nombreDoctor = JOptionPane.showInputDialog(null, "Nombre del doctor:",
                     "Asignando cita",3 );
                    Object opcionHora = JOptionPane.showInputDialog(null, "Selecciona una hora", "Elegir",
                     JOptionPane.QUESTION_MESSAGE,null,horas,horas[0]);
                    Object opcionFecha = JOptionPane.showInputDialog(null, "Selecciona una fecha", "Elegir",
                     JOptionPane.QUESTION_MESSAGE,null,fechas,fechas[0]);
                    datos.agregarCita(nombrePaciente, opcionHora.toString(), opcionFecha.toString(), nombreDoctor);
                break;
                
                case 2:
                    nombrePaciente = JOptionPane.showInputDialog(null, "Ingrese el nombre del paciente:",
                     "Buscando paciente",3 );
                    datos.eliminarCita(nombrePaciente);
                break;
                
                case 3:
                    if (!datos.vacia()) {
                        datos.mostrarTodaConsulta();
                    }else {
                        JOptionPane.showMessageDialog(null, "No hay consultas actualmente"); 
                    }
                break;
                
                case 4:
                    nombrePaciente = JOptionPane.showInputDialog(null, "Ingrese el nombre del paciente:",
                     "Buscando paciente",3 );
                    datos.buscarPaciente(nombrePaciente);
                break;
                
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema, hasta pronto!");
                    System.exit(0);
                break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
            }
            
        } while (opcion != 5); 
    }
    
}
