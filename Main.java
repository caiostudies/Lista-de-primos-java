
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        int numero = sc.nextInt();


        for(int primos = 0;primos<=numero;primos++) {
            if(primos%2==1) {

            System.out.println(+primos);

            }
        }


    }




}