public class Academia {

    // Atributos

    String nome; // Nome da academia

    String numTelefone; // Numero de telefone da academia

    Equipamento[] Equipamento = new Equipamento[40]; // Array dos equipamentos da academia

    // Metodos

    void mostrarInfos() {

        System.out.println("\n****** INFORMAÇÕES DA ACADEMIA ******");

        System.out.println("Nome da Academia: " + nome);

        System.out.println("Numero da Academia: " + numTelefone);

        System.out.println("****** INFORMAÇÕES DOS EQUIPAMENTOS ******");

        for (int i = 0; i < Equipamento.length; i++) {

            if (Equipamento[i] != null) {

                Equipamento[i].mostrarInfos();

            }

        }

    }

    void cadastrarEquipamento(Equipamento e) {

        for (int i = 0; i < Equipamento.length; i++) {

            if (Equipamento[i] == null) {

                Equipamento[i] = e;

                break;
            }

        }

    }

    void infosEquipamentoManutencao() {

        int qtdE = 0; // Quantidade de equipamentos

        float qtdEM = 0; // Quantidade de equipamentos em manutençao

        float porcentagem = 0; // Porcentagem de equipamento

        for (int i = 0; i < Equipamento.length; i++) {

            if (Equipamento[i] != null) {

                if (Equipamento[i].status.equalsIgnoreCase("Manutencao")) {
                    qtdEM++;
                }

                qtdE++;
            }

        }
        porcentagem = (qtdEM / qtdE) * 100;

        System.out.println("Quantidade de Equipamentos registrados em manutencao: " + qtdEM);
        System.out.println(+porcentagem + "% de equipamentos em manutencao ");
    }

    void mostrarMaisCaroBarato() {

        double maior = 0;

        double menor = -999999999;

        int posMaior = 0;

        int posMenor = 0;

        for (int i = 0; i < Equipamento.length; i++) {

            if (Equipamento[i] != null) {

                if (Equipamento[i].valorAquisicao > maior) {

                    maior = Equipamento[i].valorAquisicao;
                    posMaior = i;

                }

                else if (Equipamento[i].valorAquisicao < menor) {

                    menor = Equipamento[i].valorAquisicao;
                    posMenor = i;

                }

            }

        }

        System.out.println("Produto com maior valor");
        Equipamento[posMaior].mostrarInfos();

        System.out.println("Produto com menor valor");
        Equipamento[posMenor].mostrarInfos();

    }

}