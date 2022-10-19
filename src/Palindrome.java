import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {     // Main method of this class
        int temp, r, sum = 0;     // Initialising/local variable declaration
        Scanner scanner = new Scanner(System.in);  // Scanner class object creation

        while (true) {
            System.out.print("Enter a number: ");

            try {   // try...catch block to get the InputMismatch exception
                int number = scanner.nextInt();     // Getting user input integer
                temp = number;      // Storing user input integer in temp variable for comparison
                while (number > 0) {     // Giving true condition in While loop
                    r = number % 10;    // Getting last digit of the integer
                    sum = (sum * 10) + r;   // Reversing by last digit
                    number /= 10;   // Getting the remaining digit after removing last previous digit
                }
                break;
            } catch (InputMismatchException e){    // Input data is not integer it will throw this exception message
                System.out.println("Invalid data, Please enter valid integer data");
                scanner.next();
            }
        }

        if (temp == sum){   // Comparing last original integer and reversed integer
            System.out.println(temp + " is a palindrome number");
        } else {
            System.out.println(temp + " is not a palindrome number");
        }
    }
}
