public class Main {
    public static void main(String[] args) {
        Cidade townsville = new Cidade();

        townsville.setNome("VAITOMARNOCUEERCICODOERJ");
        System.out.println(townsville.getNome());

        // Criando armas pros personagens humanos
        Arma arma1 = new Arma();
        arma1.setTipoArma("Canivete");
        arma1.setForca(10);

        Arma arma2 = new Arma();
        arma2.setTipoArma("Bazuka");
        arma2.setForca(1000);

        // Criando personagens humanos
        Humano humano1 = new Humano();
        humano1.setNome("Vilas");
        humano1.setIdade(20);
        humano1.setEnergia(100);
        humano1.setVagalume(false);
        humano1.setDistanciaEscuta(5);
        humano1.setVida(100);
        humano1.addArma(arma1);
        townsville.adicionarPersonagens(humano1);
        humano1.modificarHabilidade(9, "Energia");

        Humano humano2 = new Humano();
        humano2.setNome("Zeca Pagodinho");
        humano2.setIdade(65);
        humano2.setEnergia(1000);
        humano2.setVagalume(true);
        humano2.setDistanciaEscuta(1);
        humano2.setVida(40);
        humano2.addArma(arma2);
        townsville.adicionarPersonagens(humano2);
        humano2.modificarHabilidade(15, "Escuta");

        // Criando personagens zumbis
        Zumbi corredor = new Zumbi();
        corredor.setDiasInfeccao(10);
        corredor.setVida(20);
        townsville.adicionarPersonagens(corredor);

        Zumbi perseguidor = new Zumbi();
        perseguidor.setDiasInfeccao(100);
        perseguidor.setVida(40);
        townsville.adicionarPersonagens(perseguidor);

        Zumbi estalador = new Zumbi();
        estalador.setDiasInfeccao(366);
        estalador.setVida(60);
        townsville.adicionarPersonagens(estalador);

        townsville.listarPersonagens();
    }
}
