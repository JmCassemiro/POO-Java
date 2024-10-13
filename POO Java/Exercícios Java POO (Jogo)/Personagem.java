public class Personagem {

    String nome;

    int pontos; // Pontos de vida

    Arma arma;

    void usarArma() {

        arma.resistencia = arma.resistencia - 2;

    }

    void tomarDano() {

        pontos = pontos - 5;

    }

}
