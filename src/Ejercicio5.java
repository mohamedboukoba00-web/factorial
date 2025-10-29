import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int contadorA = 0;
        int contadorM = 0;
        int contadorOtros = 0;

        while (true) {
            System.out.print("Introduce una palabra (salir para terminar): ");
            String palabra = scanner.nextLine();

            if (palabra.equalsIgnoreCase("salir")) {
                break;
            }

            if (palabra.length() > 0) {
                char primeraLetra = Character.toUpperCase(palabra.charAt(0));

                if (primeraLetra == 'A') {
                    contadorA++;
                } else if (primeraLetra == 'M') {
                    contadorM++;
                } else {
                    contadorOtros++;
                }
            }
        }

        System.out.println("\nNúmero de palabras que empiezan por A: " + contadorA);
        System.out.println("Número de palabras que empiezan por M: " + contadorM);
        System.out.println("Número de palabras que no empiezan por A ni M: " + contadorOtros);

        scanner.close();
    }
}
