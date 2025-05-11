import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try (ComptageMot compteur = new ComptageMot("src/TestExercice3.txt")) {
            int nombreMots = compteur.nombreDeMot();
            int nombreDeMot2 = compteur.nombreDeMot();
            System.out.println("Nombre de mots : " + nombreMots + " - le deuxieme nombre de mot erroné: " + nombreDeMot2);
        } catch (FileNotFoundException e) {
            System.err.println("Fichier non trouvé : " + e.getMessage());
        }
    }
}