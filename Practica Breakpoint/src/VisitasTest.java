import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class VisitasTest {

	@Test
	public void testRegistrarVisita() throws IOException {
		Visitas visitas = new Visitas();

		String respuesta = "y";
		String fecha = "01-01-2023";
		String hora = "09:00";
		int peso = 70;
		String unidad_peso = "kg";
		double altura = 1.75;
		String unidad_altura = "m";

		String input = respuesta + "\n" + fecha + "\n" + hora + "\n" + peso + "\n" + unidad_peso + "\n" + altura + "\n"
				+ unidad_altura;

		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());

		System.setIn(inputStream);

		Visitas.registrarVisita();
	}
}
