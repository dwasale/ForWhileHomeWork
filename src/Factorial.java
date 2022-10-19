import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // Creating object of scanner class

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();     // Storing user input value

        factorial(number);      // Calling the method
    }

    private static void factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++){
            fact = fact * i;        // Calculating the factorial of user input value
        }
        System.out.println("Factorial of " + number + " is " + fact);
    }
}
