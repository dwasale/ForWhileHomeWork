import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);   // Creating scanner class object

        System.out.print("Enter number: ");     // Getting user value
        int number = scanner.nextInt();

        isPrime(number);    // Calling the method isPrime

    }

    private static void isPrime(int number) {   // Static isPrime method
        boolean prime = true;     // Declaring and initializing boolean value
        if (number <= 1){       // Checking 0 and 1 which is not a prime number
            prime = false;
        } else {                // If the above condition is false this code block will execute
            for (int i = 2; i <= number/2; i++){
                if (number % i == 0){       // Checking the given value is divisible by any number
                    prime = false;          // Once it's divisible by every number prime value is changed to false, which is not a prime number
                    break;                  
                }
            }
        }

        if (prime){     // Printing the value according to the boolean variable prime ture/false
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}
