import java.util.Scanner;

public class DivisibleBy {

    static int choice;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       // Scanner class object creation

        System.out.println("From 1 to 100");
        // Giving user choice option
        System.out.println("""            
                Choose:
                1. Divisible by 3\s
                2. Divisible by 5
                3. Divisible by both 3 and 5
                """);

        while (true) {      // Condition to check if user input is in the valid choice
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            if (choice >= 1 && choice <=3){
                break;
            } else {
                System.out.println("Invalid Choice");
            }

        }
        divisible();    // Calling the divisible method
    }

    public static void divisible(){     // Function/Method creation
        switch (choice) {           // It will execute according to the user choice
            case 1 -> {
                System.out.println("Divisible by 3 from 1 to 100::");       // Getting divisible number by 3
                for (int i = 1; i <= 100; i++) {
                    if (i % 3 == 0) {
                        System.out.print(i + "\t");
                    }
                }
            }
            case 2 -> {
                System.out.println("Divisible by 5 from 1 to 100::");       // Getting divisible number by 5
                for (int i = 1; i <= 100; i++) {
                    if (i % 5 == 0) {
                        System.out.print(i + "\t");
                    }
                }
            }
            case 3 -> {
                System.out.println("Divisible by both 3 and 5 from 1 to 100::");    // Getting divisible number by both 3 and 5
                for (int i = 1; i <= 100; i++) {
                    if ((i % 3 == 0) && (i % 5 == 0)) {
                        System.out.print(i + "\t");
                    }
                }
            }
        }
    }
}
