import java.util.Scanner;
import java.util.InputMismatchException;

public class ScientificCalculator {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Main loop for continuous operation
        while (true) {
            // Display the menu
            displayMenu();
            int choice;
            try {
                System.out.println("Enter your choice (0-16): ");
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 0:
                default:
            }
        }
    }

    // Menu display method
    public static void displayMenu() {
        System.out.println("\n=== Scientific Calculator ===");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("7. Sine (degrees)");
        System.out.println("8. Cosine (degrees)");
        System.out.println("9. Tangent (degrees)");
        System.out.println("10. log");
        System.out.println("11. log base 10");
        System.out.println("12. round");
        System.out.println("13. Ceil");
        System.out.println("14. Floor");
        System.out.println("15. Min");
        System.out.println("16. Max");
        System.out.println("0. Exit");
    }
    //public static double add(){}1
    //public static double subtract(){}2
    //public static double multiply(){}3
    //public static double divide(){}4
    //public static double calculateSquareRoot(){}5
    //public static double calculatePower(){}6
    //public static double calculateSine(){}7
    //public static double calculateCosine(){}8
    //public static double calculateTangent(){}9
    //public static double calculateNaturalLogarithm(){}10
    //public static double calculateLogarithmBase10(){}11
    //public static long roundNumber(){}12
    //public static double ceilingNumber(){}13
    //public static double floorNumber(){}14
    //public static double findMin(){}15
    //public static double findMax(){}16

    //private static void performAddition(Scanner scanner) {
        // Prompt for first number
        // Prompt for second number
        // Call add() method
        // Print result
        // Implement try-catch for InputMismatchException here!
    //}

    //private static void performSubtraction(Scanner scanner)

}


