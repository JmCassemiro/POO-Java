import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        Personagem personagem = new Personagem();

        Arma arma = new Arma();

        personagem.arma = arma;

        System.out.print("Entre com o nome do seu personagem: ");

        personagem.nome = Entrada.nextLine();

        System.out.print("Entre com os pontos de vida do seu personagem: ");

        personagem.pontos = Entrada.nextInt();

        System.out.println("==============================================");

        Entrada.nextLine();

        System.out.print("Entre com o nome da arma: ");

        arma.nome = Entrada.nextLine();

        System.out.print("Entre com a descricao do arma: ");

        arma.descricao = Entrada.nextLine();

        System.out.print("Entre com o poder da arma: ");

        arma.poder = Entrada.nextInt();

        System.out.print("Entre com a resistencia da arma: ");

        arma.resistencia = Entrada.nextInt();

        System.out.println("\n");

        System.out.println("Vida do seu personagem: " + personagem.pontos);

        int op;

        int vidaInimigo = 20;

        System.out.println("Vida do seu inimigo: " + vidaInimigo);

        System.out.println("\n");

        do {

            System.out.println("1. Atacar seu inimigo");
            System.out.println("2. Ver info da arma");
            System.out.println("3. Ver a vida do seu personagem");
            System.out.println("4. Ver a vida do seu inimigo");
            System.out.println("5. Atirar em si próprio");
            System.out.println("\n");

            op = Entrada.nextInt();

            if (op == 1) {

                personagem.usarArma();

                vidaInimigo = vidaInimigo - arma.poder;

                System.out.println("Voce atirou no seu inimigo!");

                System.out.println("\n");

            }

            if (op == 2) {

                arma.mostraInfoArma();

            }

            if (op == 3) {

                System.out.println("Vida do seu personagem: " + personagem.pontos);
                System.out.println("\n");

            }

            if (op == 4) {

                System.out.println("Vida do seu inimigo: " + vidaInimigo);
                System.out.println("\n");

            }

            if (op == 5) {

                System.out.println("Voce ta se matando, vai pra igreja por favor!");

                System.out.println("\n");

                personagem.tomarDano();

            }

        } while (vidaInimigo > 0 && arma.resistencia > 0);

        Entrada.close();

        if (vidaInimigo == 0) {

            System.out.println("Seu inimigo está morto, meus parabéns");
        }

        else if (arma.resistencia == 0) {

            System.out.println("Sua arma quebrou, vc está fadado ao fracasso e irá morrer!");
        }

    }

}