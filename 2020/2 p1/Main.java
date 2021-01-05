import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numValidPasswords = 0;  // number of valid passwords, SOLUTION
        try {
            File inputFile = new File("input.txt");
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                // MAIN ALGO
                int minRepeats = Integer.parseInt(data.substring(0, data.indexOf('-')));    // minimum number of repetitions of the char that must repeat
                int maxRepeats = Integer.parseInt(data.substring(data.indexOf('-') + 1, data.indexOf(' ')));    // maximum number of repetitions of the char that must repeat
                char charMustRepeat = data.charAt(data.indexOf(' ') + 1);   // char that must repeat
                String password = data.substring(data.indexOf(':') + 2);    // passwords only
                int numRepeats = 0; // checks if theres enough repetitions of the right character

                for(int i = 0; i < password.length(); i++){
                    if(password.charAt(i) == charMustRepeat){
                        numRepeats++;
                    }
                }
                if(numRepeats >= minRepeats && numRepeats <= maxRepeats){
                    numValidPasswords++;
                }

                // END
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        println(numValidPasswords);
    }
    private static void println(Object o){
        System.out.println(o);
    }
}
