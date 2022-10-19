import java.util.Scanner;

public class SumNatural {

    public static void main(String[] args) {
        int sum = 0;        // Initialising the variable to store sum of natural number
        Scanner scanner  = new Scanner(System.in);  // Creating scanner class object

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        for (int i =1; i <= number; i++){   // Calculating each natural number until the given user input
            sum += i;
        }
        System.out.println("Sum of " + number + " natural number is " + sum);
    }
}
