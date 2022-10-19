import java.util.Scanner;

public class Fibonacci {

    private static int[] cache;     // Declaring array variable for storing value which later we use for Memoization for accelerating performance by caching return value

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);  // Calling scanner class by creating scanner object

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();     // Asking value from user

        cache = new int[number + 1]; // Initialising cache

        System.out.println(":: "+ number +" Fibonacci number ::");
        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacci(i) + "\t"); // Prints every fibonacci number as user input
        }
    }

    public static int fibonacci(int number){
        if (number <= 1){       // Printing initial/base value to prevent recursion/stack overflow
            return number;
        }

        if (cache[number] != 0){    // Checking if cache has any value
            return cache[number];
        }
        int result = fibonacci(number - 1) + fibonacci(number - 2);
        cache[number] = result; // Storing nth fibonacci result in cache
        return (result); // Return the nth fibonacci number by adding its previous number
    }
}
