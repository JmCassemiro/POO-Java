public class Veiculo implements Comparable<Veiculo> {

    // Atributos do veiculo

    private String marca;

    private String modelo;

    private int ano;

    private double kmRodados;

    // Construtor

    public Veiculo() {
    }

    Motor motor = new Motor(kmRodados, ano);

    @Override
    public int compareTo(Veiculo veiculo) {
        // return this.modelo.compareTo(veiculo.modelo);
        return Integer.compare(this.ano, veiculo.ano);
    }

    // Getters and Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(double string) {
        this.kmRodados = string;
    }

    public void mostrarInfos() {

        System.out.println("Marca do Veiculo: " + modelo);
        System.out.println("Marca do Veiculo: " + marca);
        System.out.println("Ano do Veiculo: " + ano);
        System.out.println("Km Rodados:" + kmRodados);

    }

}