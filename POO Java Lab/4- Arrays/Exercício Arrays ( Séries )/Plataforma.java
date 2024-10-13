public class Plataforma {

    // Atributos

    String nome; // Nome da plataforma

    Serie[] series = new Serie[10]; // Arrays de serie

    // Metodos

    void mostraInfo() {

        System.out.println("\n****** INFORMAÇÕES DA PLATAFORMA ******");

        System.out.println("Nome da plataforma: " + nome);

        System.out.println("****** INFORMAÇÕES DAS SERIES ******");

        for (int i = 0; i < series.length; i++) {

            if (series[i] != null) {

                series[i].mostrarInfo();

            }

        }

    }

    void addSerie(Serie serie) {

        for (int i = 0; i < series.length; i++) {

            if (series[i] == null) {

                series[i] = serie;

                break;
            }

        }

    }

    String serieMaisLongaFinalizada() {

        int maiorSerie = 0; // Maior numero de temp

        int posMaior = 0; // Mostrar a serie que tem o maior numero de temp

        for (int i = 0; i < series.length; i++) {

            if (series[i] != null) {

                if (series[i].finalizada == true) {

                    if (series[i].temporadas > maiorSerie) {

                        maiorSerie = series[i].temporadas;
                        posMaior = i;

                    }

                }

            }

        }
        return series[posMaior].nome;

    }

    void mediaPorcentagem() {

        int contt3 = 0; // Numero de series com 3 ou mais temporadas

        float qtdSeries = 0; // Quantidade de series

        double contNotas = 0; // contador de nota

        double media = 0; // Media das notas

        float porcentagem = 0; // Porcentagem de series

        for (int i = 0; i < series.length; i++) {

            if (series[i] != null) {

                if (series[i].finalizada == true) {

                    if (series[i].temporadas >= 3) {
                        contt3++;
                        contNotas = contNotas + series[i].nota;

                    }

                }

                qtdSeries++;

            }

        }

        porcentagem = (contt3 / qtdSeries) * 100;
        media = contNotas / qtdSeries;

        System.out.println(+porcentagem + "%  de series");
        System.out.println("Media das notas: " + media);

    }

}
