import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            int numero1 = 0;
            int numero2 = 0;

            Scanner sc = new Scanner(System.in);

            System.out.println("Escribe el primer número :");
            numero1 = sc.nextInt();

            System.out.println("Escribe el segundo número :");
            numero2 = sc.nextInt();

            int resultado = numero2 + numero1;

            System.out.println("La suma es " + numero1 + " + " + numero2 + " = " + resultado); }
}