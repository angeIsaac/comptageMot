import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ComptageMot implements AutoCloseable {
    private final Scanner scanner;
    private int nombreMot;

    ComptageMot(String path) throws FileNotFoundException {
        if (path == null || path.trim().isEmpty()) {
            throw new IllegalArgumentException("Le chemin du fichier ne peut pas être nul ou vide.");
        }

        this.scanner = new Scanner(new File(path));
        this.nombreMot = 0;
    }

    public int nombreDeMot() {
        this.nombreMot = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            this.nombreMot += this.compterMot(line);
        }

        return this.nombreMot;
    }

    private int compterMot(String ligne) {
        if (ligne == null || ligne.trim().isEmpty()) {
            return 0;
        }
        return ligne.trim().split("\\s+").length;
    }

    @Override
    public void close() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
