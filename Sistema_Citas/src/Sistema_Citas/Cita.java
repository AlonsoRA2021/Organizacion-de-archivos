package Sistema_Citas;
/**
 *
 * @author Alonso
 */

public class Cita {
    
    public int numeroCita;
    public String nombrePaciente, hora, fecha, nombreDoctor;
    Cita siguiente;
    Cita anterior; //Punteros enlace

    //Constructor para cuando ya hay citas
    public Cita (int numeroCita, String nombrePaciente, String hora, String fecha, String nombreDoctor, Cita siguiente, Cita anterior) {
        this.numeroCita = numeroCita;
        this.nombrePaciente = nombrePaciente;
        this.hora = hora;
        this.fecha = fecha;
        this.nombreDoctor = nombreDoctor;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    //Constructor para cuando aun no hay citas
    public Cita (int numeroCita, String nombrePaciente, String hora, String fecha, String nombreDoctor) {
        this(numeroCita, nombrePaciente, hora, fecha, nombreDoctor, null, null);
    }

}
