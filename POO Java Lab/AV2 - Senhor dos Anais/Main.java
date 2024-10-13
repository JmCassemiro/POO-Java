public class Main {

    public static void main(String[] args) {

        TerraMedia terraMedia = new TerraMedia();

        // Criando armas

        Arma arma1 = new Arma();
        arma1.setNomeArma("Bayblade");
        arma1.setMagica(true);

        Arma arma2 = new Arma();
        arma2.setNomeArma("Martelao");
        arma2.setMagica(false);

        Arma arma3 = new Arma();
        arma3.setNomeArma("Varinha");
        arma3.setMagica(true);

        // Criando herois

        Anao anao = new Anao();

        anao.setNome("Bruninho");
        anao.setIdade(982);
        anao.setEnergia(200);
        anao.setAltura(1.30f);
        anao.setReino("VAI TOMAR NO CU");
        anao.arma = arma2;

        Mago mago = new Mago();

        mago.setNome("Felps");
        mago.setIdade(21);
        mago.setEnergia(1000);
        mago.setCor("PRETO");
        mago.arma = arma3;

        Elfo elfo = new Elfo();

        elfo.setNome("Jm");
        elfo.setIdade(21);
        elfo.setEnergia(800);
        elfo.setTribo("Indígena");
        elfo.arma = arma1;

        // Atribuindo os herois na terra media

        terraMedia.addHabitante(anao);
        terraMedia.addHabitante(elfo);
        terraMedia.addHabitante(mago);

        // Mostrando informações dos habitantes

        terraMedia.listarHabitantes();

    }

}
