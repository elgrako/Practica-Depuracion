import java.io.IOException;

public class TratamientoFichero {
    public static void main(String[] args) throws IOException {
        Pacientes pacientes = new Pacientes();
        Pacientes.registrarPaciente();
        
        Visitas visitas = new Visitas();
        Visitas.registrarVisita();
    }
}