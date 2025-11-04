import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args){
  Scanner scanner =new Scanner (System.in);

        System.out.println("Solicite un numero entero ");
        int numEnt=scanner.nextInt();

        System.out.println(" un triángulo rectángulo de "+numEnt+" elementos asterisco (*) de lado es :");
        for(int i=1; i<=numEnt;i++){


      System.out.println("*".repeat(i));


        }




    }
}
