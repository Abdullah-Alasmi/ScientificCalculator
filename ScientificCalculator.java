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
        System.out.println("0. Exit");
    }

}


