public class Humano extends Personagem implements Aprimorar, Lutar {
    private String nome;
    private int idade;
    private boolean vagalume;
    private double energia;
    private double distanciaEscuta;

    // Agregação

    Arma arma; // Personagem pode ou não ter uma arma

    // Métodos
    public void mostrarInfos() {
        System.out.println("----- Info do " + this.nome + " -----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Vagalume: " + this.vagalume);
        System.out.println("Energia: " + this.energia);
        System.out.println("Distancia da escuta: " + this.distanciaEscuta);
        super.mostrarInfos();
    }

    public void addArma(Arma arma) {
        this.arma = arma;
    }

    // Getters e Setters
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

    public boolean isVagalume() {
        return vagalume;
    }

    public void setVagalume(boolean vagalume) {
        this.vagalume = vagalume;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public double getDistanciaEscuta() {
        return distanciaEscuta;
    }

    public void setDistanciaEscuta(double distanciaEscuta) {
        this.distanciaEscuta = distanciaEscuta;
    }

    // Interfaces
    @Override
    public void modificarArma() {
        int poder = this.arma.getForca();
        poder += 5;
        this.arma.setForca(poder);
        System.out.println("A arma do " + this.nome + " aumentou 5 de força!!!");
    }

    @Override
    public void modificarHabilidade(int qtdPilulas, String tipoHabilidade) {
        if (qtdPilulas <= 0) {
            System.out.println("Quantidade de pílulas inválida, favor um valor maior que 0");
        } else {
            if (tipoHabilidade.equalsIgnoreCase("Energia")) {
                if (qtdPilulas < 10) {
                    double auxEnergia = this.energia;
                    auxEnergia = auxEnergia + (auxEnergia * 0.02);
                    this.energia = auxEnergia;
                    System.out.println("A energia do " + this.nome + " aumentou em 2%");

                } else if (qtdPilulas >= 10) {
                    double auxEnergia = this.energia;
                    auxEnergia = auxEnergia + (auxEnergia * 0.04);
                    this.energia = auxEnergia;
                    System.out.println("A energia do " + this.nome + " aumentou em 4%");
                }
            } else if (tipoHabilidade.equalsIgnoreCase("Escuta")) {
                if (qtdPilulas < 10) {
                    double auxDistancia = this.distanciaEscuta;
                    auxDistancia = auxDistancia + (auxDistancia * 0.2);
                    this.distanciaEscuta = auxDistancia;
                    System.out.println("A distância de escuta do " + this.nome + " aumentou em 20%");

                } else if (qtdPilulas >= 10) {
                    double auxDistancia = this.distanciaEscuta;
                    auxDistancia = auxDistancia + (auxDistancia * 0.5);
                    this.distanciaEscuta = auxDistancia;
                    System.out.println("A distância de escuta do " + this.nome + " aumentou em 50%");
                }
            }
        }

    }

    @Override
    public void atacar() {
        System.out.println(this.nome + " atacou o zumbi!!!");
        System.out.println("--- Info da arma usada ---");
        this.arma.mostrarInfos();
        System.out.println("--------------------");

    }

    @Override
    public void defender() {
        System.out.println(this.nome + "  defendeu do ataque do zumbi!!!");
    }
}
