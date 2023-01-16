package Sistema_Citas;

import javax.swing.JOptionPane;

/**
 *
 * @author Alonso
 */

public class Datos {
    
    protected Cita inicio, fin; // Punteros para saber donde esta el inicio y el fin
    public int contadorCita = 0;
    
    public Datos () {
        inicio = null;
        fin = null;
    }
    
    public boolean vacia(){
        return inicio == null;
    }
    
    //Método para agregar una cita
    public void agregarCita (String nombrePaciente, String hora, String fecha, String nombreDoctor){
        
        contadorCita++;
        if (!vacia()) {
            inicio = new Cita (contadorCita, nombrePaciente, hora, fecha, nombreDoctor, inicio , null);
            inicio.siguiente.anterior = inicio;
        }else{
            inicio = fin = new Cita (contadorCita, nombrePaciente, hora, fecha, nombreDoctor);
        }
        JOptionPane.showMessageDialog(null, "Cita asignada con exito!");
    }
    
    //Método para mostar las consultas
    public void mostrarTodaConsulta () {
        
        Cita recorrer = fin;
        while (recorrer!= null) {
            JOptionPane.showMessageDialog(null, "Cita N°: " + recorrer.numeroCita + "\n"
                                               +"Nombre del paciente: " + recorrer.nombrePaciente + "\n"
                                               +"Hora: " + recorrer.hora + "\n"
                                               +"Fecha: " + recorrer.fecha + "\n"
                                               +"Doctor asignado: " + recorrer.nombreDoctor);
            recorrer = recorrer.anterior;
        }
    }
    
    //Método para eliminar cita
    public void eliminarCita (String nombre) {
        
        if (!vacia()) {
            if (buscarPaciente(nombre)) {
                if (inicio == fin) {
                    inicio = fin = null;
                }else{
                    inicio = inicio.siguiente;
                    inicio.anterior = null;
                }
                JOptionPane.showMessageDialog(null, "Se ha eliminado la cita de "+nombre);
                if (inicio == null & fin == null) {
                    JOptionPane.showMessageDialog(null, "La cita eliminada era la ultima,"
                                             + " no hay mas citas en la base de consultas");
                }
                contadorCita--;
            }
        }else {
            JOptionPane.showMessageDialog(null, "No hay citas en la base de consultas");
        }
    }
    
    //Método para buscar cita por paciente
    public boolean buscarPaciente (String nombre) {
        Cita aux = inicio;
        boolean encontrado = false; //bandera
        while (aux != null && encontrado != true) {
            if (aux.nombrePaciente.equalsIgnoreCase(nombre)) {
                encontrado = true;
            }else {
                aux = aux.siguiente;
            }
        }
        if (encontrado == true) {
            JOptionPane.showMessageDialog(null, "El paciente "+aux.nombrePaciente+" tiene cita para el dia "
                                                +aux.fecha+" de "+aux.hora);
        }else {
            JOptionPane.showMessageDialog(null, nombre+" no cuenta con cita(s) asignada(s)");
        }
        return encontrado;
    }

}
