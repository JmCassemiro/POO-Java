public class Main {

    public static void main(String[] args) {

        Aldeia aldeia = new Aldeia();

        System.out.println(" Aldeia " + aldeia.getNome());

        System.out.println("Localização: " + aldeia.getPaisLocalizacao());

        Jutsu jutsu1 = new Jutsu();

        jutsu1.setTipo("Kekkei-Genkai");

        jutsu1.setRankJutsu('A');

        Jutsu jutsu2 = new Jutsu();

        jutsu2.setTipo("taijutsu");

        jutsu2.setRankJutsu('S');

        // Criando ninjas

        Gennin gennin = new Gennin();

        gennin.setNome("Jm");

        gennin.setPoder(350);

        gennin.setChakra(1000);

        gennin.setIdade(27);

        gennin.setNumMissoesCompletas(30);

        gennin.setNomeSensei("Felipe");

        gennin.jutsu = jutsu1;

        aldeia.registrarNinja(gennin);

        Jonnin jonnin = new Jonnin();

        jonnin.setNome("JMm");

        jonnin.setPoder(300);

        jonnin.setChakra(400);

        jonnin.setIdade(15);

        jonnin.setNumMissoesCompletas(100);

        jonnin.setHabilidadeEspecial("Teletransporte");

        jonnin.jutsu = jutsu2;

        aldeia.registrarNinja(jonnin);

        aldeia.listarNinjas();

        System.out.println("Número total de ninjas: " + Ninja.getNumTotalNinjas());

    }

}