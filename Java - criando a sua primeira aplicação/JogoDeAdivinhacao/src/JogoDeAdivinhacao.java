import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101);

        int tentativas = 0;
        int max_tentativas = 8;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo de Adivinhação!!");
        System.out.println("Adivinhe um número entre 0 e 100:");


        while (tentativas < max_tentativas) {
            System.out.print("Tentativa " + (tentativas + 1) + ": ");
            int palpite = scanner.nextInt();


            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número!");
                break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é maior que " + palpite + ".");
            } else {
                System.out.println("O número é menor que " + palpite + ".");
            }

            tentativas++;
        }


        if (tentativas == max_tentativas) {
            System.out.println("Suas tentativas acabaram! O número era " + numeroAleatorio + ".");
        }

        scanner.close();
    }
}