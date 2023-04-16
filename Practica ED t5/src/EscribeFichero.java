import java.io.*;

/*
 * Aquí contemplamos una de las opciones a la hora de capturar excepciones
 * En esta parte lo hacemos con la estructura try + catch y añadimos la
 * opción de ejecución
 * obligatoria con la sentencia finally.
 */


public class EscribeFichero {
    public static void write(
            String path, String content
    ) {
        String ruta = path;
        FileWriter fichero = null;
        PrintWriter pw = null;

        try (FileWriter FileWriter = new FileWriter(ruta, true)) {
            pw = new PrintWriter(FileWriter);
            /*for (int i = 0; i < 10; i++) {
                pw.println("Coche " + i);
            }*/

            pw.println(content);
            System.out.println("Nuevo registro añadido con exito [path: "+path+"]");
            System.out.println("> ["+content+"]");
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

  /*  public void escribir(
            String ruta,
            String dni, String nombre, int edad,
            String calle, String localidad, int cod_postal
    ) throws IOException {

        PrintWriter pw = null;
        try {
            pw = new PrintWriter(ruta);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String content = "";
        System.out.println(LeerFichero.muestraContenido("Pacientes.txt"));

        content += "\n"+dni+","+nombre+","+edad+","+calle+","+localidad+","+cod_postal;
        System.out.println(content);

        pw.println(content);
        pw.close();
    }*/
}