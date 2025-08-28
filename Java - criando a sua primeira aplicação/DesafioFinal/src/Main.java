
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Enzo Maciel";
        String conta = "Corrente";
        double saldo = 12000.00;


        System.out.println("*************************************************");
        System.out.println("Dados do cliente : ");
        System.out.println("\nNome do cliente: " + nome   );
        System.out.println("Tipo da conta : " + conta);
        System.out.println("Saldo Inicial : " + saldo);
        System.out.println("*************************************************");

        int opcao = 0;

        String menu = """
                ** DIGITE SUA OPÇÃO **
                1 - Consultar saldo.
                2 - Transferir valor.
                3-  Receber valor.
                4 - Sair. 
                
                """;

        Scanner scanner = new Scanner(System.in);

        while (opcao != 4 ) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.println("O saldo está com o valor de " + saldo);
            } else if (opcao == 2) {
                System.out.println("Gostaria de fazer uma transferencia de qual valor ?");
                double valorTransferencia = scanner.nextDouble();
                if (valorTransferencia > saldo){
                    System.out.println("Saldo indisponivel!");
                } else {
                     saldo -= valorTransferencia;
                    System.out.println("Você fez uma transferencia de " + valorTransferencia  + ".");

                }
            } else if (opcao == 3) {
                System.out.println("Qual o valor que você vai receber?");
                double valorReceber = scanner.nextDouble();

                saldo += valorReceber;
                System.out.println("Você recebeu " + valorReceber + " e seu saldo está em "
                        + saldo + " .");
            } else if (opcao == 4){
                System.out.println("Fechando o menu!");
                scanner.close();
            } else {
                System.out.println("Opção invalida !");
                scanner.close();
            }


        }

    }
}