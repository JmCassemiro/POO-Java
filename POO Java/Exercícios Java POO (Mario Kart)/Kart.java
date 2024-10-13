public class Kart {

    String nome;

    Piloto piloto;

    Motor motor;

    public Kart() {

        motor = new Motor();

    }

    void pular() {

        System.out.println("Puleeeeiiii");

    }

    void soltarTurbo() {

        System.out.println("Estou mt rapidaoooo");

    }

    void fazerDrift() {

        System.out.println("Quase capoteeei");

    }

}
