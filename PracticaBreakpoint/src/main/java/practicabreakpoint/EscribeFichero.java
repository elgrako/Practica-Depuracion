package practicabreakpoint;

import java.io.*;

/*
 * Aquí contemplamos una de las opciones a la hora de capturar excepciones
 * En esta parte lo hacemos con la estructura try + catch y añadimos la
 * opción de ejecución
 * obligatoria con la sentencia finally.
 */
public class EscribeFichero {

    public void write(
            String path, String content) throws IOException {
        String ruta = path;
        FileWriter fichero = null;
        PrintWriter pw = null;

        try (FileWriter FileWriter = new FileWriter(ruta, true)) {
            pw = new PrintWriter(FileWriter);
            /*for (int i = 0; i < 10; i++) {
                pw.println("Coche " + i);
            }*/

            pw.println(content);
            System.out.println("Nuevo registro añadido con exito [path: " + path + "]");
            System.out.println("> [" + content + "]");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}