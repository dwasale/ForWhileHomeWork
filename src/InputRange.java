import java.util.InputMismatchException;
import java.util.Scanner;

public class InputRange {

    static int initial, endNum; // Declaring global static variable


    public static void main(String[] args) {

        Scanner scanner  =  new Scanner(System.in); // Scanner object creation for user input

        while (true) {  // It will run until the condition is true
            System.out.print("Enter initial number: ");

            try {   //  Below statement catch the error and throws exception, it will ask user until the value is valid (Integer)
                initial = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid data");
                scanner.next();
            }
        }

        while (true){
            System.out.print("Enter end number: ");

                try {
                    endNum = scanner.nextInt();
                    if (endNum > initial && endNum >= initial + 9 || endNum <= initial-9){  // This statement will check endNum range
                        break;                                                              // and endNum value must be at least more or
                    } else {                                                                // less than 10th value of initial value
                        System.out.println("Please enter valid range, must be at least 10");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid data");
                    scanner.next();
                }
        }
            printingNumber();   // If all the above condition is true it will call this method
    }

    public static void printingNumber(){    // Creating a method to print 10th incremental or decremental numbers between the given range
        System.out.println("Printing 10 numbers between " + initial + " to " + endNum);

        if (endNum > initial) {     // It will check and print 10 incremental number from given initial number
            for (int i = initial; i <= initial + 9; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = initial; i >= initial -9; i--){      // It will check and print 10 decremental number from the given initial number
                System.out.println(i);
            }
        }
    }
}
