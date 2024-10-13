import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Zumbi Zumbizinho = new Zumbi();

        Zumbi Zumbizao = new Zumbi();

        Scanner Entrada = new Scanner(System.in);

        Zumbizinho.nome = "Zumbizonho";

        Zumbizao.nome = "Carrapato";

        Zumbizinho.vida = 100;

        Zumbizao.vida = 120;

        System.out.println("Vida zumbi 1: " + Zumbizinho.vida);

        System.out.println("Vida zumbi 1: " + Zumbizao.vida);

        Zumbizao = Zumbizinho;

        System.out.println("Vida do Zumbizinho: " + Zumbizinho.vida);

        System.out.println("Vida do Zumbizao: " + Zumbizao.vida);

        Entrada.close();

        Zumbizao.transfereVida(Zumbizinho, 300);

        Zumbizinho.transfereVida(Zumbizinho, 90);

    }

}
