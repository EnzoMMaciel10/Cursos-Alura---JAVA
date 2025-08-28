import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero qualquer: ");
        float numero = scanner.nextFloat();

        if (numero >= 0){
            System.out.println("Este numero é positivo!");

        }else {
            System.out.println("Este numero é negativo!");
        }

        System.out.println("Digite dois numeros inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 != num2){
            System.out.println("Os numeros são diferentes .");
            if (num1 > num2){
                System.out.println("O " + num1 + " é maior que o " + num2 + ".");

            } else {
                System.out.println("O " + num2 + " é maior que o " + num1 + ".");
            }
        }else {
            System.out.println("Os numeros são iguais .");
        }


        System.out.println("Digite um numeros para mostrarmos a tabuada dele: ");
        int numTabuada = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(numTabuada * i);
        }


        System.out.println("Digite um numero inteiro: ");
        int numInt = scanner.nextInt();

        if (numInt % 2 == 0){
            System.out.println("Este numero é par!");
        } else {
            System.out.println("Este numero é impar!");
        }


        System.out.println("Digite um numero fatorial (sem o !): ");
        int numFatorial = scanner.nextInt();

        if (numFatorial < 0) {
            System.out.println("Erro: O fatorial não está definido para números negativos.");
        } else {
            long fatorial = 1;


            for (int i = 2; i <= numFatorial; i++) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + numFatorial + " é: " + fatorial);
        }

        scanner.close();
    }
}
