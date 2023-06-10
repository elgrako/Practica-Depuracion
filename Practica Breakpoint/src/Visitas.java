import java.io.IOException;
import java.util.Scanner;

public class Visitas {

    public static void registrarVisita() throws IOException {
        String path ="Visitas.txt";
        String unidad_peso, unidad_altura, opt, fecha, hora;
        int peso; 
        double altura;
        Scanner entradaEscaner = new Scanner(System.in);

        System.out.println("Seccion de visitas");

        System.out.printf("Desea pedir una cita[y|n]: ");
        opt = entradaEscaner.nextLine();

        if (opt.equalsIgnoreCase("N")) {
            System.out.println("Gracias por su visita");
            return;
        }

        System.out.println("A continuación introduzca los datos para la cita");

        System.out.printf("Fecha[*]: ");
        fecha = entradaEscaner.nextLine();

        System.out.printf("Hora[*]: ");
        hora = entradaEscaner.nextLine();

        System.out.printf("Peso[*]: ");
        peso = entradaEscaner.nextInt();
        entradaEscaner.nextLine();

        System.out.printf("Unidad peso[*]: ");
        unidad_peso = entradaEscaner.nextLine();

        System.out.printf("Altura[*]: ");
        altura = entradaEscaner.nextDouble();
        entradaEscaner.nextLine();

        System.out.printf("Unidad altura[*]: ");
        unidad_altura = entradaEscaner.nextLine();

        FileScanner filescanner = new FileScanner();
        EscribeFichero EF = new EscribeFichero();

        if (!filescanner.search(path, "Visitas.txt")) {
            EF.write(
                    path,
                    fecha + "," + hora + "," + peso + "," + unidad_peso + "," + altura + "," + unidad_altura
            );
        }
        
        double imc = peso / (altura * altura);
        System.out.println("Su IMC es:" + imc + "]");
    }
}