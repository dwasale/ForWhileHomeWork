import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // Object creation of Scanner class

        System.out.print("Enter number for multiplication: ");     //Asking user choice of multiplication table
        int number = scanner.nextInt();

        System.out.println("Multiplication table for " + number);
        for (int i = 1; i <= 10; i ++){         // Multiplying until the 10th value
            System.out.println(number + " x " + i + " = " + (i*number));
        }
    }
}
