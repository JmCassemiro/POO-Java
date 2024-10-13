import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto de arquivo
        Arquivo arquivo = new Arquivo();

        // Criando uma estrutura para entrada de dados
        Scanner sc = new Scanner(System.in);

        boolean executando = true;
        // Criando um objeto de funcionário
        Veiculo veiculo = new Veiculo();
        while (executando) {
            System.out.println("+++ BEM-VINDO AO MENU DE CADASTRO DE VEICULOS +++");
            System.out.println("1. Cadastar veículos");
            System.out.println("2. Listar veículos");
            System.out.println("3. Listar veículos em ordem crescente de ano");
            System.out.println("4. Listar veículos em ordem decrescente de ano");
            System.out.println("5. Sair");
            int op = sc.nextInt();
            sc.nextLine();
            ArrayList<Veiculo> veiculos = arquivo.ler();
            // Menu
            switch (op) {

                case 1:
                    // Coletando as informções do funcionário
                    System.out.println("Marca: ");
                    veiculo.setMarca(sc.nextLine());
                    System.out.println("Modelo: ");
                    veiculo.setModelo(sc.nextLine());

                    try {
                        System.out.println("Ano: ");
                        veiculo.setAno(sc.nextInt());
                        if (veiculo.getAno() <= 0) {
                            throw new AnoVeiculoException();
                        }
                    } catch (Exception e) {
                        break;
                    }

                    // Escrevendo funcionário no arquivo
                    arquivo.escrever(veiculo);
                    break;
                case 2:
                    // Executar o método de leitura

                    System.out.println("INFORMAÇÕES DOS VEÍCULOS");
                    for (int i = 0; i < veiculos.size(); i++) {
                        System.out.println("Marca: " + veiculos.get(i).getMarca());
                        System.out.println("Modelo: " + veiculos.get(i).getModelo());
                        System.out.println("Ano: " + veiculos.get(i).getAno());
                    }
                    break;
                case 3:
                    // Executar o método de leitura
                    Collections.sort(veiculos);

                    System.out.println("INFORMAÇÕES DOS VEÍCULOS");
                    for (int i = 0; i < veiculos.size(); i++) {
                        System.out.println("Marca: " + veiculos.get(i).getMarca());
                        System.out.println("Modelo: " + veiculos.get(i).getModelo());
                        System.out.println("Ano: " + veiculos.get(i).getAno());
                    }
                    break;
                case 4:
                    // Executar o método de leitura em ordem decrescente
                    Collections.reverse(veiculos);

                    System.out.println("INFORMAÇÕES DOS VEÍCULOS");
                    for (int i = 0; i < veiculos.size(); i++) {
                        System.out.println("Marca: " + veiculos.get(i).getMarca());
                        System.out.println("Modelo: " + veiculos.get(i).getModelo());
                        System.out.println("Ano: " + veiculos.get(i).getAno());
                    }
                    break;
                case 5:
                    executando = false;
                    break;
                default:
                    System.out.println("Entrada errada...");
                    break;
            }
        }

        sc.close();

    }
}
