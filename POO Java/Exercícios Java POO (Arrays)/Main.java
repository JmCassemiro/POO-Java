public class Main {

    public static void main(String[] args) {

        Cantina cantina = new Cantina();

        cantina.nome = "Cantina da inatel";

        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        salgado1.nome = "Coxinha";

        cantina.addSalgado(salgado1);

        salgado2.nome = "Cigarrete";

        cantina.addSalgado(salgado2);

        salgado3.nome = "Empada";

        cantina.addSalgado(salgado3);

        cantina.mostraInfo();

    }

}
