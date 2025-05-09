import java.util.Scanner;

public class BancoDinheiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 500.00;
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor inválido para depósito.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o valor para saque: ");
                    double saque = scanner.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente ou valor inválido.");
                    }
                    break;

                case 3:
                    System.out.println("Seu saldo atual é: R$ " + saldo);
                    break;

                case 4:

                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
