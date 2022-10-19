import java.util.Scanner;

public class Reverse {

    static int rev = 0; //Initialising reversed number to store
    static int originalNumber;      // Storing user input number

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      // Creating object for scanner class to get user input

        System.out.print("Enter number to reverse: ");
        int number = scanner.nextInt();
        originalNumber = number;    // Storing user value
        reverse(number);        // Calling the method to reverse
    }

    public static void reverse(int number){     // Method to reverse a number
        while (number > 0){     // If the condition is true then executing the code below
            int value = number % 10;    // Getting the reminder
            number/= 10;
            rev = rev * 10 + value;

        }
        System.out.println("Reversed of " + originalNumber + " is " + rev);
    }
}
