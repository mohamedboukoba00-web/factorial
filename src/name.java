
import java.util.Scanner;

public class name {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Solicite un número para calcular su factorial:");
        int numFact = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= numFact; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + numFact + " ! es: " + factorial);

        scanner.close();
    }
}
