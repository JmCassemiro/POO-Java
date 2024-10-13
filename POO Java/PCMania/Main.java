import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();

        Computador comp1 = new Computador();

        Computador comp2 = new Computador();

        Computador comp3 = new Computador();

        MemoriaUSB memoriaUSB1 = new MemoriaUSB();

        MemoriaUSB memoriaUSB2 = new MemoriaUSB();

        MemoriaUSB memoriaUSB3 = new MemoriaUSB();

        // Promoção 1

        comp1.marca = "Positivo";

        comp1.preco = 2300;

        comp1.hardwareBasico.nome = "Pentium Core I3 (2200 MHz ) - 8 GB de Memoria RAM";

        comp1.hardwareBasico.capacidade = 500;

        comp1.sistemaOperacional.nome = "Linux Ubuntu";

        comp1.sistemaOperacional.tipo = 32;

        memoriaUSB1.nome = "Pen drive";

        memoriaUSB1.capacidade = 16;

        // Promoção 2

        comp2.marca = "Acer";

        comp2.preco = 5800;

        comp2.hardwareBasico.nome = "Pentium Core I5 (3370 MHz ) - 16 GB de Memoria RAM";

        comp2.hardwareBasico.capacidade = 1000;

        comp2.sistemaOperacional.nome = "Windows 8";

        comp2.sistemaOperacional.tipo = 64;

        memoriaUSB2.nome = "Pen drive";

        memoriaUSB2.capacidade = 32;

        // Promoção 3

        comp3.marca = "Vaio";

        comp3.preco = 1800;

        comp3.hardwareBasico.nome = "Pentium Core I7 (4500 MHz ) - 32 GB de Memoria RAM";

        comp3.hardwareBasico.capacidade = 2000;

        comp3.sistemaOperacional.nome = "Windows 10";

        comp3.sistemaOperacional.tipo = 64;

        memoriaUSB3.nome = "HD Externo";

        memoriaUSB3.capacidade = 1000;

        // Entrada de dados
        System.out.print("Nome: ");
        cliente.nome = sc.nextLine();
        System.out.print("CPF: ");
        cliente.cpf = sc.nextLong();

        // Criando menu

        boolean controle = true;

        while (controle) {

            System.out.println("\n");

            System.out.println("======== Bem vindo a PcMania =======");

            System.out.println("1- Verificar Promoções");

            System.out.println("2- Adquirir algum computador na promoção");

            System.out.println("0- Sair ");

            int op = sc.nextInt();

            switch (op) {

                case 1:

                    System.out.println("***** Promoção 1 *****");
                    comp1.mostraPCConfigs();

                    System.out.println("\n");

                    System.out.println("***** Promoção 2 *****");
                    comp2.mostraPCConfigs();

                    System.out.println("\n");

                    System.out.println("***** Promoção 3 *****");
                    comp3.mostraPCConfigs();

                    break;

                case 2:
                    System.out.println("Digite a Promoção que deseja adquirir: ");

                    System.out.println("1. Promoção (1)");
                    System.out.println("2. Promoção (2)");
                    System.out.println("3. Promoção (3)");
                    System.out.println("4. Para sair ");

                    int x = sc.nextInt();

                    while (x != 4) {

                        if (x == 1) {

                            cliente.addPc(comp1);
                            System.out.println("Promoção 1 adquirida com sucesso!");

                        }

                        else if (x == 2) {

                            cliente.addPc(comp2);
                            System.out.println("Promoção 2 adquirida com sucesso!");

                        }

                        else if (x == 3) {

                            cliente.addPc(comp3);
                            System.out.println("Promoção 3 adquirida com sucesso!");

                        }
                        System.out.println("1. Promoção (1)");

                        System.out.println("2. Promoção (2)");

                        System.out.println("3. Promoção (3)");

                        System.out.println("4. Para sair ");

                        x = sc.nextInt();
                    }
                    break;
                case 0:
                    controle = false;
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        System.out.println("Valor total da compra: " + cliente.calculaTotalCompra() + "$");

        sc.close();

    }

}