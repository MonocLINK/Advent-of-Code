import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int product = 0;
        int index = 0;

        try {
            File inputFile = new File("input.txt");
            int[] dataArray = new int[(int) inputFile.length()];
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNextLine()) {
                // put all data into array, need to access all elements
                int data = Integer.parseInt(scanner.nextLine());
                dataArray[index] = data;
                index++;

                // check if data + index of array adds to 2020
                for (int i = 0; i < dataArray.length; i++) {
                    if (dataArray[i] + data == 2020) {
                        product = dataArray[i] * data;
                    }
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        println(product);
    }

    private static void println(Object o) {
        System.out.println(o);
    }
}
