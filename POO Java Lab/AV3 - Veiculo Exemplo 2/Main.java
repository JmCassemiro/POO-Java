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

        int contR = 0;
        int contB = 0;

        Veiculo veiculo = new Veiculo();

        while (executando) {
            System.out.println("+++ BEM-VINDO AO MENU DE CADASTRO DE VEICULOS +++");
            System.out.println("1. Cadastar veículos");
            System.out.println("2. Listar veículos");
            System.out.println("3. Listar veículos em ordem crescente de ano");
            System.out.println("4. Listar veículos em ordem decrescente de ano");
            System.out.println("5. Listar quantidade de veículos de cada marca disponíveis");
            System.out.println("6. Sair");
            int op = sc.nextInt();
            sc.nextLine();
            ArrayList<Veiculo> veiculos = arquivo.ler();
            // Menu
            switch (op) {

                case 1:
                    // Coletando as informções do funcionário

                    try {
                        System.out.println("Marca: ");
                        veiculo.setMarca(sc.nextLine());
                        if ((veiculo.getMarca().equalsIgnoreCase("Rolls-Royce")
                                || veiculo.getMarca().equalsIgnoreCase("Bentley")) == false) {
                            throw new ValorInvalidoException();
                        }
                    } catch (Exception e) {
                        break;
                    }
                    System.out.println("Modelo: ");
                    veiculo.setModelo(sc.nextLine());
                    System.out.println("Potencia do Motor: ");
                    veiculo.motor.setPotencia(sc.nextInt());
                    System.out.println("Cilindradas do Motor");
                    veiculo.motor.setNumCilindros(sc.nextInt());

                    try {
                        System.out.println("Ano: ");
                        veiculo.setAno(sc.nextInt());
                        System.out.println("Km Rodado: ");
                        veiculo.setKmRodados(sc.nextInt());
                        if (veiculo.getAno() < 1960 || veiculo.getAno() > 2024 || veiculo.getKmRodados() < 0) {
                            throw new ValorInvalidoException();
                        }
                    } catch (Exception e) {
                        break;
                    }

                    if (veiculo.getMarca().equalsIgnoreCase("Rolls-Royce")) {

                        contR++;

                    }

                    if (veiculo.getMarca().equalsIgnoreCase("Bentley")) {

                        contB++;

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
                        System.out.println("Cilindradas: " + veiculos.get(i).motor.getNumCilindros());
                        System.out.println("Potencia: " + veiculos.get(i).motor.getPotencia());

                    }
                    break;
                case 3:
                    // Executar o método de leitura em ordem crescente
                    Collections.sort(veiculos);

                    System.out.println("INFORMAÇÕES DOS VEÍCULOS");
                    for (int i = 0; i < veiculos.size(); i++) {
                        System.out.println("Marca: " + veiculos.get(i).getMarca());
                        System.out.println("Modelo: " + veiculos.get(i).getModelo());
                        System.out.println("Ano: " + veiculos.get(i).getAno());
                        System.out.println("Cilindradas: " + veiculos.get(i).motor.getNumCilindros());
                        System.out.println("Potencia: " + veiculos.get(i).motor.getPotencia());

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
                        System.out.println("Cilindradas: " + veiculos.get(i).motor.getNumCilindros());
                        System.out.println("Potencia: " + veiculos.get(i).motor.getPotencia());
                    }
                    break;
                case 5:

                    System.out.println("Quantidade de veiculos Bentley");
                    System.out.println(contB);

                    System.out.println("Quantidade de veiculos RoSJIOEREKQ");
                    System.out.println(contR);

                    break;

                case 6:
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
