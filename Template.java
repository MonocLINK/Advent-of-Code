import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Template {
    public static void main(String[] args) {
        
        try {
            File inputFile = new File("input.txt");
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                // MAIN ALGO
                
                // END
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    private static void println(Object o){
        System.out.println(o);
    }
}
