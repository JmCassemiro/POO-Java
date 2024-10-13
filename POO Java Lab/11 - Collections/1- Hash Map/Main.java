import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> colecaoIdadesAlunos = new HashMap<>(); // Criando Hash Map

        // Adicionando na colecao

        colecaoIdadesAlunos.put("Jm", 22);
        colecaoIdadesAlunos.put("Jmm", 20);
        colecaoIdadesAlunos.put("Jmmm", 12);
        colecaoIdadesAlunos.put("Jmmmm", 24);

        // Imprimindo Valores

        // Forma 1

        // Forma 2

        System.out.println("=================");

        System.out.println("Antes da Remoção");

        System.out.println("=================");

        System.out.println("\n");

        colecaoIdadesAlunos.forEach((key, value) -> {

            System.out.println("Chave " + key);

            System.out.println("Valor " + value);

        });

        // Removendo os itens

        colecaoIdadesAlunos.remove("Jm");

        // Depois da remoção

        System.out.println("\n");

        System.out.println("==================");

        System.out.println("Depois da Remoção");

        System.out.println("==================");

        System.out.println("\n");

        colecaoIdadesAlunos.forEach((key, value) -> {

            System.out.println("Chave " + key);

            System.out.println("Valor " + value);

        });

    }

}