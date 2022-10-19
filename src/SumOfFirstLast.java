import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfFirstLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                System.out.print("Enter 5 digit number: "); // Asking user for integer
                int number = scanner.nextInt();
                if (String.valueOf(number).length() < 5){   // Checking if it is less than 5 digits
                    System.out.println("Number is less than 5 digits");
                } else if (String.valueOf(number).length() > 5){    // Checking if it is more than 5 digits
                    System.out.println("Number is more than 5 digits");
                } else {
                    sumFirstLast(number);   // Calling method to get the result
                    break;
                }
            } catch (InputMismatchException e){     // Exception handling
                System.out.println("Please enter valid data as integer");
                scanner.next();
            }

        }
    }

    private static void sumFirstLast(int number) {  // Function to get the sum of first and last digit of the integer
        int first = 0,last, temp;

        temp = number;  // Storing the integer in temp variable
        last = number % 10; // Getting the last digit of the integer

        while (number > 0){
            first = number % 10;    // Getting the first digit of the integer
            number /= 10;
        }
        System.out.println(temp + " First digit " + first + " and " + "last digit " +
                last);
        System.out.println("Sum: " +(first + last));
    }
}
