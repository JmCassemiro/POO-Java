import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        List<String> listString = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            listString.add(sc.nextLine());

        }

        Collections.sort(listString);

        for (int i = 0; i < listString.size(); i++) {

            System.out.println(listString.get(i));

        }

        sc.close();

    }

}
