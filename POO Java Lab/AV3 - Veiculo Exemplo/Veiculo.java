public class Veiculo implements Comparable<Veiculo> {

    //Atributos do veículo
    private String modelo;
    private String marca;
    private int ano;

    // Construtor
    public Veiculo (){}

    @Override
    public int compareTo(Veiculo veiculo) {
        //return this.modelo.compareTo(veiculo.modelo);
        return Integer.compare(this.ano, veiculo.ano);
    }

    //Getters e setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
