
import java.util.Scanner;

public class Ejercicio10 {


    public static void main(String[] args){

        Scanner scanner =new Scanner(System.in);

        System.out.println(" inttoduce el num decimal ");
        int numdecimal =scanner.nextInt();
        if (numdecimal==0){
            System.out.println(" el binario de "+numdecimal+" =0 ");
        }else {
            String binario =" ";

while(numdecimal>0){
    numdecimal = numdecimal / 2;
    int resto = numdecimal % 2;
        binario = resto + binario;


}
            System.out.println(binario);

        }
    }
}
