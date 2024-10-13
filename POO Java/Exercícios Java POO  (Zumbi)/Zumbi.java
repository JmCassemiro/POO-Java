public class Zumbi {

    String nome;

    double vida;

    double mostravida(double vida) {

        return vida;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia) {

        if (vida >= quantia) {

            vida = vida - quantia;

            zumbiAlvo.vida = zumbiAlvo.vida + quantia;

            System.out.println("Vida transferida com sucesso!");

            return true;
        }

        else {

            System.out.println("Nao foi possível transferir vida pro seu amiguinho!");

            return false;

        }

    }

}
