import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Kart k1 = new Kart();
        Kart k2 = new Kart();

        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();

        Scanner Entrada = new Scanner(System.in);

        // Dando nomes pros karts e pilotos

        k1.nome = "Supermaquina";
        k2.nome = "Carrinho do mario";

        p1.nome = "Mario";
        p2.nome = "Luigi";

        // Colocando o piloto no kart

        k1.piloto = p1;
        k2.piloto = p2;

        // Entrando com as cilindradas do motor

        System.out.print("Entre com os valores da cilindradas do motor do kart 1. 50, 100 ou 150: ");

        k1.motor.cilindradas = Entrada.nextLine();

        System.out.print("Entre com os valores da cilindradas do motor do kart 2. 50, 100 ou 150: ");

        k2.motor.cilindradas = Entrada.nextLine();

        System.out.println("\n");

        System.out.print("Entre com o valor da velocidade do kart 1:  ");

        k1.motor.velocidadeMaxima = Entrada.nextFloat();

        System.out.print("Entre com o valor da velocidade do kart 2:  ");

        k2.motor.velocidadeMaxima = Entrada.nextFloat();

        System.out.println("\n");

        System.out.println("Ações do kart");

        // Executando as ações dos kart

        k1.fazerDrift();
        k2.fazerDrift();

        //

        System.out.println("\n");

        k1.soltarTurbo();
        k2.soltarTurbo();

        //

        System.out.println("\n");

        k1.fazerDrift();
        k2.fazerDrift();

        System.out.println("\n");

        // Executando as ações do piloto

        System.out.println("Ações do piloto");

        p1.soltaSuperPoder();
        p2.soltaSuperPoder();

        System.out.println("\n");

        System.out.println("Informações do motor");

        // Mostrando as informações do motor

        System.out.println("Informações do motor do kart 1");

        k1.motor.mostraInfo();

        System.out.println("\n");

        System.out.println("Informações do motor do kart 2: ");

        k2.motor.mostraInfo();

        Entrada.close();

    }

}
