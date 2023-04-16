import java.io.IOException;
import java.util.Scanner;

public class TratamientoFichero {
    public static void main(String[] args) throws IOException {

        String path ="Pacientes.txt", dni, nombre, calle, localidad, opt;
        String fecha, hora, unidad_peso, unidad_altura;
        int edad, cod_postal, peso, altura;
        
        Scanner entradaEscaner = new Scanner (System.in);				//pedimos los datos al usuario por consola

        System.out.println ("Introduzca los datos");

        System.out.printf ("DNI[*]: ");
        dni = entradaEscaner.nextLine();

        System.out.printf ("Nombre[*]: ");
        nombre = entradaEscaner.nextLine();

        System.out.printf ("Edad[*]: ");
        edad = entradaEscaner.nextInt();
        calle = entradaEscaner.nextLine();
        System.out.printf ("Calle[*]: ");
        calle = entradaEscaner.nextLine();

        System.out.printf ("Localidad[*]: ");
        localidad = entradaEscaner.nextLine();

        System.out.printf ("Cod postal[*]: ");
        cod_postal = entradaEscaner.nextInt();

        FileScanner filescanner = new FileScanner();
        EscribeFichero escribeFichero = new EscribeFichero();

        if (! filescanner.search(path, dni)) {

            EscribeFichero.write(
                    path,
                    dni+","+nombre+","+edad+","+calle+","+localidad+","+cod_postal
            );

        }

        /*
            ahora se registran los datos en el fichero Visitas
         */

        path = "Visitas.txt";

        System.out.println ("Seccion de visitas");

        System.out.printf ("Desea pedir una cita[y|n]: ");
        opt = entradaEscaner.nextLine();
        opt = entradaEscaner.nextLine();

        if (opt.equals("N") || opt.equals("n")) {
            System.out.println("Gracias por su visita");
            return;
        }

        System.out.println("Acontinuacion intrduzca los datos para la cita");

        System.out.printf ("Fecha[*]: ");
        fecha = entradaEscaner.nextLine();

        System.out.printf ("Hora[*]: ");
        hora = entradaEscaner.nextLine();

        System.out.printf ("Peso[*]: ");
        peso = entradaEscaner.nextInt();

        System.out.printf ("Unidad peso[*]: ");
        unidad_peso = entradaEscaner.nextLine();
        unidad_peso = entradaEscaner.nextLine();

        System.out.printf ("Altura[*]: ");
        altura = entradaEscaner.nextInt();

        System.out.printf ("Unidad altura[*]: ");
        unidad_altura = entradaEscaner.nextLine();
        unidad_altura = entradaEscaner.nextLine();

        EscribeFichero.write(
                path,
                dni+","+fecha+","+hora+","+peso+","+unidad_peso+","+altura+","+unidad_altura
        );

        System.out.println("Su IMC es: ["+peso%(altura*altura)+"]");
    };
}


