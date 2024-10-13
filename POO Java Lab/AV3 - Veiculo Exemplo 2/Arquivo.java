import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    // Métodos da classe

    // 1. Escrever
    public void escrever(Veiculo veiculos) {
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            // Estruturas básicas para escrita em um arquivo
            os = new FileOutputStream("Veiculos.txt", true); // Arquivo
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            // Escrevendo as informações do funcionário
            bw.write("+++ VEICULO +++\n"); // Flag
            bw.write(veiculos.getMarca() + "\n");
            bw.write(veiculos.getModelo() + "\n");
            bw.write(veiculos.getAno() + "\n");
            bw.write(veiculos.getKmRodados() + "\n");
            bw.write(veiculos.motor.getPotencia() + "\n");
            bw.write(veiculos.motor.getNumCilindros() + "\n");

        } catch (Exception e) {

        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // 2. Ler
    /**
     * @return
     */
    public ArrayList<Veiculo> ler() {
        ArrayList<Veiculo> veiculosEncontradosNoArquivo = new ArrayList<>();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String auxLeitura; // Ponteiro do arquivo

        try {
            // Estrutura básica para leitura
            is = new FileInputStream("Veiculos.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Realizando a leitura dos dados
            auxLeitura = br.readLine();
            while (auxLeitura != null) {
                if (auxLeitura.equalsIgnoreCase("+++ VEICULO +++")) {
                    Veiculo auxVeiculo = new Veiculo();
                    auxVeiculo.setMarca(br.readLine());
                    auxVeiculo.setModelo(br.readLine());
                    auxVeiculo.setAno(Integer.parseInt(br.readLine()));
                    auxVeiculo.setKmRodados(Double.parseDouble(br.readLine()));
                    auxVeiculo.motor.setPotencia(Double.parseDouble(br.readLine()));
                    auxVeiculo.motor.setNumCilindros(Integer.parseInt(br.readLine()));
                    // Transformando String para int
                    // (Double ->
                    // Double.parseDouble)

                    // Criar a estrutura para tratar as infos do funcionário no Java

                    // Adicionando o funcionário no array list
                    veiculosEncontradosNoArquivo.add(auxVeiculo);
                }
                auxLeitura = br.readLine(); // Pula para a próxima linha
            }
        } catch (Exception e) {

        }
        return veiculosEncontradosNoArquivo;
    }
}
