import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sumaNotas = 0;
        int contadorNotas = 0;
        int aprobados = 0;

        while (true) {
            System.out.print("Ingrese la nota del alumno (-1 para terminar): ");
            double nota = scanner.nextDouble();

            if (nota == -1) {
                break;
            }

            // Validar nota
            if (nota < 0 || nota > 10) {
                System.out.println("Dato erróneo. Introduce una nota válida (0-10).");
                continue; // vuelve a pedir la nota
            }

            // Contabilizar nota válida
            sumaNotas += nota;
            contadorNotas++;

            // Contar aprobados
            if (nota >= 5) {
                aprobados++;
                System.out.println("Aprobado");
            } else {
                System.out.println("Suspenso");
            }
        }

        // Mostrar resultados finales
        if (contadorNotas > 0) {
            double media = sumaNotas / contadorNotas;
            System.out.println("\nNúmero de notas introducidas: " + contadorNotas);
            System.out.println("Media de las notas: " + media);
            System.out.println("Número de aprobados: " + aprobados);
        } else {
            System.out.println("No se introdujeron notas válidas.");
        }

        scanner.close();
    }
}
