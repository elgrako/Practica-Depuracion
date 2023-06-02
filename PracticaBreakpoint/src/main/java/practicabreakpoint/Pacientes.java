package practicabreakpoint;

import java.io.IOException;
import java.util.Scanner;

public class Pacientes {

    public static void registrarPaciente() throws IOException {

        String path = "Pacientes.txt", dni, nombre, calle, localidad;
        int edad, cod_postal;

        Scanner entradaEscaner = new Scanner(System.in);				//pedimos los datos al usuario por consola

        System.out.println("Introduzca los datos");

        System.out.printf("DNI[*]: ");
        dni = entradaEscaner.nextLine();

        System.out.printf("Nombre[*]: ");
        nombre = entradaEscaner.nextLine();

        System.out.printf("Edad[*]: ");
        edad = entradaEscaner.nextInt();
        calle = entradaEscaner.nextLine();
        System.out.printf("Calle[*]: ");
        calle = entradaEscaner.nextLine();

        System.out.printf("Localidad[*]: ");
        localidad = entradaEscaner.nextLine();

        System.out.printf("Cod postal[*]: ");
        cod_postal = entradaEscaner.nextInt();

        FileScanner filescanner = new FileScanner();
        EscribeFichero EF = new EscribeFichero();

        if (!filescanner.search(path, dni)) {

            EF.write(
                    path,
                    dni + "," + nombre + "," + edad + "," + calle + "," + localidad + "," + cod_postal
            );

        }

    }
}
