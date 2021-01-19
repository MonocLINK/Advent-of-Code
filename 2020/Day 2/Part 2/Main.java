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
                // NOT ZERO INDEXED, INDEX 1 = INDEX 0
                String password = data.substring(data.indexOf(':') + 2);    // passwords only
                char characterCheckAgainst = data.charAt(data.indexOf(' ') + 1);   // char to check against
                char characterAtSpot1 = password.charAt(Integer.parseInt(data.substring(0, data.indexOf('-'))) - 1);   // 1st char that im looking at
                char characterAtSpot2 = password.charAt(Integer.parseInt(data.substring(data.indexOf('-') + 1, data.indexOf(' '))) - 1);   // 2nd char that im looking at
                boolean characterSeenOnce = false; // false at first, true when i see one charactr, false if i see it again

                // check spot 1
                if(characterCheckAgainst == characterAtSpot1){
                    characterSeenOnce = !characterSeenOnce; // toggles boolean
                    if(characterCheckAgainst == characterAtSpot2){
                        characterSeenOnce = !characterSeenOnce; // toggles boolean
                    } 
                }
                // check spot 2
                else if(characterCheckAgainst == characterAtSpot2){
                    characterSeenOnce = !characterSeenOnce; // toggles boolean
                    if(characterCheckAgainst == characterAtSpot1){
                        characterSeenOnce = !characterSeenOnce; // toggles boolean
                    }
                }
                // "else" is already false

                if(characterSeenOnce){
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
