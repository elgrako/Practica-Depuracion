import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* En este método contemplamos otra opción de captura de
excepciones con la llamada en la definición
* de un procedimmiento definido como estático con la palabra
reservada Throws seguida
* de las excepciones a capturar
*
*/
public class LeerFichero {
    public static String muestraContenido(String archivo) throws
            FileNotFoundException, IOException {
        String cadena, content="";
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while ((cadena = b.readLine()) != null) {
            //System.out.println(cadena);
            content+=cadena+"\n";
        }
        b.close();
        //System.out.println(content);
        return content;
    }

    public static void main(String[] args) throws IOException {
        String ruta = "Pacientes.txt";
        muestraContenido(ruta);
    }
}
