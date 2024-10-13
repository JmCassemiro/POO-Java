import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Double> listDouble = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 5; i++) {

            listDouble.add(random.nextDouble(5));

        }

        Collections.sort(listDouble, Collections.reverseOrder());

        System.out.println(listDouble);

    }

}