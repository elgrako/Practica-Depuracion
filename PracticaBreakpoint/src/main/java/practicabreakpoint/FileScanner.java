package practicabreakpoint;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {
    public boolean search(String path, String value) {
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(value)) {
                    scanner.close();
                    return true;
                }
            }

            scanner.close();
            return false;
        } catch (FileNotFoundException e) {
            return false; // Archivo no encontrado
        }
    }
}
