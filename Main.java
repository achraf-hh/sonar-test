import java.util.ArrayList;
import java.util.List;

public class Main {

    // 1. Variable non utilisée (SonarLint: Remove this unused "unusedVariable" local variable.)
    private static int unusedVariable = 42;

    public static void main(String[] args) {

        // 2. Utilisation de System.out.println() au lieu d’un logger (SonarLint: "System.out" should not be used to log messages.)
        System.out.println("Hello, SonarCloud!");

        // 3. NullPointerException possible (SonarLint: "NullPointerException" might be thrown)
        String text = null;
        System.out.println(text.length());

        // 4. Boucle inefficace (SonarLint: "for" loop replaceable with "forEach")
        List<String> names = new ArrayList<>();
        names.add("Achraf");
        names.add("SonarCloud");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // 5. Hardcoded credentials (SonarLint: Remove this hardcoded password)
        String password = "12345";

        // 6. Exception non gérée (SonarLint: "InterruptedException" should not be ignored)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Problème: l'exception est ignorée, il faudrait la journaliser ou la relancer.
        }
    }
}


