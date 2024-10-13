import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome cliente 1: ");
        Cliente newCliente1 = new Cliente(sc.nextLine());
        System.out.print("Nome cliente 2: ");
        Cliente newCliente2 = new Cliente(sc.nextLine());
        System.out.print("Nome cliente 3: ");
        Cliente newCliente3 = new Cliente(sc.nextLine());

        Conta conta = new Conta(Cliente.getCont());

        boolean controle = true;
        while (controle) {
            System.out.println("\nMenu da conta");
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("1. Sacar");
            System.out.println("2. Depositar");
            System.out.println("3. Extrato");
            System.out.println("4. Sair");
            System.out.print("Selecione uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite valor do saque: ");
                    conta.saca(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Digite valor do depósito: ");
                    conta.deposita(sc.nextDouble());
                    break;
                case 3:
                    conta.extrato();
                    break;
                case 4:
                    controle = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
