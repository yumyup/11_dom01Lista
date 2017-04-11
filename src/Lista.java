import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Helmut on 2017-04-11.
 */
public class Lista {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int numbers;
        do {
            System.out.println("podaj cyfrę dodatnią, Koniec jeśli podasz ujemną");
            numbers = scan.nextInt();
            if (numbers < 0) {
                System.out.println("STOP");
            } else
                list.add(numbers);

        }while ( numbers>=0);

        System.out.println(list.toString());

        File file = new File("txt");
        try {
            Scanner scanner = Scanner(file);
            while (scanner.hasNextInt());

        }

    }
}
