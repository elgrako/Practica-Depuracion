import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class PacientesTest {

	@Test
	public void testRegistrarPaciente() throws IOException {
		Pacientes pacientes = new Pacientes();

		String dni = "12345678A";
		String nombre = "Juan";
		int edad = 30;
		String calle = "Avd/ x";
		String localidad = "Alicante";
		int cod_postal = 01230;

		String input = dni + "\n" + nombre + "\n" + edad + "\n" + calle + "\n" + localidad + "\n" + cod_postal;

		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());

		System.setIn(inputStream);

		Pacientes.registrarPaciente();
	}
}
