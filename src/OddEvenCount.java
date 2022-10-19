import java.util.Scanner;

public class OddEvenCount {
    // Global static variable declaration to store respective values
    static int temp;
    static int sumOdd = 0;
    static int sumEven = 0;
    static int countOdd = 0;
    static int countEven = 0;

    public static void main(String[] args) {        // Main class method/function
        Scanner scanner  = new Scanner(System.in);  // Scanner class object creation

        while (true){       // While loop to check the conditions i.e, 5 digit integer only
            System.out.print("Enter 5 digit number: ");
            int number = scanner.nextInt(); // User input integer

            if (String.valueOf(number).length() < 5){   // Checks the input integer is less than 5 digit
                System.out.println("Number entered is less then 5 digit");

            } else if (String.valueOf(number).length() > 5){    // Checks the user input integer is more than 5 digit
                System.out.println("Number entered is more than 5 digit");

            } else {    // If the condition is true(5 digit integer), it will call the method sumOddEven()
                sumOddEven(number);
                break;
            }
        }
    }

    private static void sumOddEven(int number) {        // Method/function for adding and counting odd and even digits

        while (number != 0) {   // If number is not equal to 0, i.e. if number variable has actual integer value it will execute the code inside while loop
            temp = number % 10;     // Getting the reminder, i.e. getting last digit of the integer
            number /= 10;       // Getting the remaining digit after the last digit from integer is taken/calculated
            if (temp % 2 == 0) {    // Checking if each digit is even number
                countEven++;    // Adding up even number count only
                sumEven += temp;   // Adding the even numbers together
            } else {    // Gets all the odd numbers
                countOdd++; // Adding up odd number counts only
                sumOdd += temp;  // Adding odd numbers together
            }
        }
        System.out.println("Total number of even digit are " + countEven);
        System.out.println("Total number of odd digit are " + countOdd);
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}
