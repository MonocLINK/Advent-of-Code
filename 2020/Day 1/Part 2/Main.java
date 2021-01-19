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

            }
            for (int i = 0; i < dataArray.length; i++) {
                for (int j = 0; j < dataArray.length; j++) {
                    for (int k = 0; k < dataArray.length; k++) {
                        if (dataArray[i] + dataArray[j] + dataArray[k] == 2020) {
                            product = dataArray[i] * dataArray[j] * dataArray[k];
                        }
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
