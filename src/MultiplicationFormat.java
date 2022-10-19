import java.util.Scanner;

public class MultiplicationFormat {

    public static void main(String[] args) {
        int x = 1, y;       // Initialising the variable for multiply
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter nth multiplication: ");     // Taking user input
        int number = scanner.nextInt();

        do {
            y = 1;  // Initial multiplication
            do {
                System.out.print("\t" + x * y); // Multiplying and printing out the values
                y++;        // Increasing the factor by 1
            } while (y <= 3);   // Giving the condition to print up to
            System.out.println();
            x++;        // Increasing the factor and comparing with user input
        } while (x <= number);  // Until this condition is false it will keep looping

    }
}
