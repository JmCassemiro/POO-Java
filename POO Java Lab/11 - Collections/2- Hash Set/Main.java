import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Integer> colecaoQualquer = new HashSet<>(); // Criando Hash Set

        // Adicionando dados no hash set

        colecaoQualquer.add(1);
        colecaoQualquer.add(2);
        colecaoQualquer.add(3);
        colecaoQualquer.add(1);

        // Imprimindo os dados

        // Forma 1

        System.out.println(colecaoQualquer);

        // Forma 2

        for (Integer valor : colecaoQualquer) {

            System.out.println("Valor " + valor);

        }

    }
}
