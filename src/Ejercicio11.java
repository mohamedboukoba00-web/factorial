import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Solicita la hora ");
        int hora = scanner.nextInt();

        System.out.println("Solicita minutos");
        int minuto = scanner.nextInt();

        System.out.println("Solicita segundos ");
        int segundo = scanner.nextInt();

        System.out.print("¿Cuántos segundos deseas incrementar?: ");
        int inc = scanner.nextInt();

        // Añadir los segundos
        segundo += inc;

        // Si pasa de 60, convertir en minutos
        if (segundo >= 60) {
            minuto += segundo / 60;
            segundo = segundo % 60;
        }

        // Si los minutos pasan de 60, convertir en horas
        if (minuto >= 60) {
            hora += minuto / 60;
            minuto = minuto % 60;
        }

        // Si las horas pasan de 24
        if (hora >= 24) {
            hora = hora % 24;
        }

        System.out.printf("Nueva hora: %02d:%02d:%02d\n", hora, minuto, segundo);

        scanner.close();
    }
}
