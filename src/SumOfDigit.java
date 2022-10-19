import java.util.Scanner;

public class SumOfDigit {
    static int sum = 0;

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        while (true) {      // Until the condition is true it keeps looping
            System.out.print("Enter 5 digit number: ");
            int number = scanner.nextInt(); // Asking 5 digit user input

            if (String.valueOf(number).length() < 5) {      // Checking if the user input number is less than 5-digit
                System.out.println("Number less then 5 digit");

            } else if (String.valueOf(number).length() > 5) {   // Checking if the user input number is more than 5-digit
                System.out.println("Number more then 5 digit");
            } else {    // It will execute this condition if the user input is 5 digit only
                System.out.println("Sum of 5 digit number " + number + " is : " + sumOf(number));   // Calling and printing the sum of 5-digit number
                break;
            }
        }
    }

    private static int sumOf(int number) {      // Function to calculate sum of 5-digit number with an integer argument
        while (number != 0){    // Condition if the number is not Zero '0' then it will execute
            sum += number % 10;     // Getting the reminder and summing up
            number = number / 10;   // Getting the remaining value
        }
        return sum;
    }


}
