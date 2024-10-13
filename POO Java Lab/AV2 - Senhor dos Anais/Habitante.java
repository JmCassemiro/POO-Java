public abstract class Habitante {

    // Atributos

    public static int contador = 0;

    private int id;

    private String nome;

    private int idade;

    private float energia;

    // Construtor Habitante (Sempre que tiver static) !

    public Habitante() {

        Habitante.contador++;

        this.id = contador;

    }

    // Agregação

    Arma arma;

    // Metodos

    public void atacar() {

        if (this.arma == null) {
            System.out.println("Ele nao tem arma");
        }

        else {

            System.out.println("Informações da arma: ");
            System.out.println("Nome: " + arma.getNomeArma());
            System.out.println("Mágica: " + arma.isMagica());

            if (arma.isMagica()) {

                System.out.println("Ataque com arma mágica!");

                this.energia = this.energia - 20;

                System.out.println("Energia após o ataque: " + this.energia);

            }

            else {

                System.out.println("Ataque com arma normal");

                this.energia = this.energia - 10;

                System.out.println("Energia após o ataque: " + this.energia);

            }

        }

    }

    public void mostraInfo() {

        System.out.println("\n");

        System.out.println("ID: " + this.id);

        System.out.println("Nome: " + this.nome);

        System.out.println("Idade: " + this.idade);

        System.out.println("Energia: " + this.energia);

    }

    // Getters and setters

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

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }

}