import java.util.Scanner;

public class CharCount {

    public static void main(String[] args) {
        int charCount = 0;  // Variable to store the count of repeating number of specific character
        char findChar = 'a';    // Char 'a' is assigned as char to find in the user input string
        Scanner scanner  = new Scanner(System.in);

        System.out.print("Enter any string: ");
        String string = scanner.nextLine().toLowerCase();   // Getting string value from user

        for (int i = 0; i < string.length(); i++){  // Loops until the length of the string is false
            if (string.charAt(i) == findChar){      // Comparing the character 'a' within the user input string
                charCount++;    // Adding/increasing the count of number of char 'a' that are found
            }
        }
        System.out.println("String: '" + string + "' has " + charCount + " character 'a' ");
    }
}
