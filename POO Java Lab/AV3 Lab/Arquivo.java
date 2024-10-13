import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public void escrever(Livro livros) {
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {

            os = new FileOutputStream("livros.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("+++ LIVRO +++\n");
            bw.write(livros.getTitulo() + "\n");
            bw.write(livros.getPreco() + "\n");
            bw.write(livros.getGenLiterario() + "\n");
            bw.write(livros.getQtdFolhas() + "\n");
            bw.write(livros.getEditora() + "\n");
            bw.write(livros.getAnoLancamento() + "\n");

        } catch (Exception e) {

        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public ArrayList<Livro> ler() {
        ArrayList<Livro> livrosEncontradosNoArquivo = new ArrayList<>();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String auxLeitura;

        try {

            is = new FileInputStream("Livros.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Realizando a leitura dos dados
            auxLeitura = br.readLine();
            while (auxLeitura != null) {
                if (auxLeitura.equalsIgnoreCase("+++ LIVRO +++")) {
                    Livro auxLivro = new Livro();
                    auxLivro.setTitulo(br.readLine());
                    auxLivro.setPreco(Double.parseDouble(br.readLine()));
                    auxLivro.setGenLiterario(br.readLine());
                    auxLivro.setQtdFolhas(Integer.parseInt(br.readLine()));
                    auxLivro.setEditora(br.readLine());
                    auxLivro.setAnoLancamento(Integer.parseInt(br.readLine()));

                    livrosEncontradosNoArquivo.add(auxLivro);
                }
                auxLeitura = br.readLine();
            }
        } catch (Exception e) {

        }
        return livrosEncontradosNoArquivo;
    }
}
