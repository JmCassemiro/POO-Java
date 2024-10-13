public class Computador {

    // Atributos

    String marca;

    float preco;

    HardwareBasico hardwareBasico;

    SistemaOperacional sistemaOperacional;

    Cliente cliente;

    MemoriaUSB memoria;

    // Construtor

    public Computador() {

        sistemaOperacional = new SistemaOperacional();

        hardwareBasico = new HardwareBasico();

    }

    // Metodos

    public void mostraPCConfigs() {

        System.out.println("Marca do Computador: " + marca);

        System.out.println("Preco do Computador: " + preco);

        System.out.println("Hardware do Computador: " + hardwareBasico.nome);

        System.out.println("Capacidade do Hardware: " + hardwareBasico.capacidade + " GB ");

        System.out.println("Sistema Operacional do Computador: " + sistemaOperacional.nome);

        System.out.println("Tipo do Sistema Operacional: " + sistemaOperacional.tipo + " Bits ");

    }

    public void addMemoriaUSB(MemoriaUSB musb) {

        System.out.println("*** Acompanha um Brinde ***");
        System.out.println("\n");

        System.out.println("Tipo de Memoria USB: " + musb.nome);
        System.out.println("Capacidade da Memoria USB: " + musb.capacidade);

    }

}