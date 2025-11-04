import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número primero: ");
        int num1 = scanner.nextInt();

        System.out.println("Introduce el número segundo: ");
        int num2 = scanner.nextInt();

        // Tomar el menor de los dos números
        int menor = (num1 < num2) ? num1 : num2;
        int maximo_comun_divisor = 1;

        // Buscar desde el menor hacia 1 el primer número que divide a ambos
        for (int i = menor; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                maximo_comun_divisor = i;
                break; // cuando lo encontramos, salimos del bucle
            }
        }

        System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es: " + maximo_comun_divisor);

        scanner.close();
    }
}
