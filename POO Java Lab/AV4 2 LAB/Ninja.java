public abstract class Ninja {

    // Atributos

    private static int numTotalNinjas = 0;

    private int registroNinja;

    private String nome;

    private int idade;

    private char rank;

    private double chakra;

    private int numMissoesCompletas;

    private int poder;

    // Construtor

    public Ninja() {

        Ninja.numTotalNinjas++;

        this.registroNinja = numTotalNinjas;

    }

    Jutsu jutsu;

    // Atributos

    public void mostrarInfo() {

        System.out.println("\n");

        System.out.println("Registro Ninja: " + this.registroNinja);

        System.out.println("Nome: " + this.nome);

        System.out.println("Idade: " + this.idade);

        System.out.println("Rank: " + this.rank);

        System.out.println("Chakra: " + this.chakra);

        System.out.println("Numero de Missões completas: " + this.numMissoesCompletas);

        System.out.println("Poder: " + this.poder);

    }

    public void treinarJutsu() {

    }

    public void classificar() {

        if (numMissoesCompletas < 2) {
            System.out.println("Ninja sem Rank");

        }

        else if (numMissoesCompletas >= 2 && numMissoesCompletas <= 10) {

            this.rank = 'C';

        }

        else if (numMissoesCompletas >= 11 && numMissoesCompletas <= 20) {

            this.rank = 'B';

        }

        else if (numMissoesCompletas >= 21 && numMissoesCompletas < 40) {

            this.rank = 'A';

        }

        else {

            this.rank = 'S';

        }

    }

    // Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getChakra() {
        return chakra;
    }

    public void setChakra(double chakra) {
        this.chakra = chakra;
    }

    public int getNumMissoesCompletas() {
        return numMissoesCompletas;
    }

    public void setNumMissoesCompletas(int numMissoesCompletas) {
        this.numMissoesCompletas = numMissoesCompletas;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

}