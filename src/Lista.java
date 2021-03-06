import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Helmut on 2017-04-11.
 */
public class Lista {
    public static void main(String[] args) throws IOException {
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

        } while (numbers >= 0);

        String fileName = "text.txt";
        System.out.println(list.toString());
        try (
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bfw = new BufferedWriter(fileWriter);
        ) {
            bfw.write(numbers);
            bfw.newLine();
            bfw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

