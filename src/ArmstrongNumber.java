import java.util.InputMismatchException;
import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {   // Checks if there is no exception
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();     // User input data

                if (isArmstrong(number)) {      // Calling the function/method to check if its palindrome or not
                    System.out.println(number + " :: Armstrong Number");
                } else {
                    System.out.println(number + " :: Not Armstrong Number");
                }
                break;
            } catch (InputMismatchException e){  // If exception is encounter it will throw the message
                System.out.println("Please enter valid data type, i.e. Integer");
                scanner.next();
            }
        }
    }

    private static boolean isArmstrong(int number) {    // Method/Function to check armstrong number
        int temp, sum = 0, digits = 0, last;    // Declaring and assigning integer variables locally

        temp = number;  // Temporarily holding original integer value

        while (temp > 0) {  // Loop to check/count number of digits in the integer
            temp /= 10;
            digits++;   // Counting number of digits
        }

        temp = number;

        while (temp > 0){   // Loops until the condition is false
            last = temp % 10;   // Getting the last digit of the integer
            sum += Math.pow(last, digits);   // Adding the every digit with power by number of digits
            temp /= 10;  // Removing the integer digit one by one
        }

        return number == sum;   // Returning true if number is equal to sum or else false
    }
}
