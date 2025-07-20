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
                    performAddition(scanner);
                    break;
                case 2:
                    performSubtraction(scanner);
                    break;
                case 3:
                    performMultiplication(scanner);
                    break;
                case 4:
                    performDivision(scanner);
                    break;
                case 5:
                    performSquareRoot(scanner);
                    break;
                case 6:
                    performPower(scanner);
                    break;
                case 7:
                    performSine(scanner);
                    break;
                case 8:
                    performCosine(scanner);
                    break;
                case 9:
                    performTangent(scanner);
                    break;
                case 10:
                    performNaturalLogarithm(scanner);
                    break;
                case 11:
                    performLogarithmBase10(scanner);
                    break;
                case 12:
                   performRound(scanner);
                    break;
                case 13:
                    performCeiling(scanner);
                    break;
                case 14:
                    performFloor(scanner);
                    break;
                case 15:
                    performMin(scanner);
                    break;
                case 16:
                    performMax(scanner);
                    break;
                case 0:
                    System.out.println("Exiting calculator. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Error: Invalid choice. Please select a number between 0 and 16.");
                    break;
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
    public static double add(double num1, double num2){
        return num1 + num2;
    }
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
    public static double calculateSquareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Square root of negative number is not allowed.");
        }
        return Math.sqrt(num);
    }
    public static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double calculateSine(double degrees) {
        return Math.sin(Math.toRadians(degrees));
    }

    public static double calculateCosine(double degrees) {
        return Math.cos(Math.toRadians(degrees));
    }

    public static double calculateTangent(double degrees) {
        double radians = Math.toRadians(degrees);
        if (Math.abs(Math.cos(radians)) < 1e-10) {
            throw new IllegalArgumentException("Tangent is undefined at " + degrees + " degrees.");
        }
        return Math.tan(radians);
    }

    public static double calculateNaturalLogarithm(double num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Logarithm of non-positive number is not allowed.");
        }
        return Math.log(num);
    }

    public static double calculateLogarithmBase10(double num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Logarithm base 10 of non-positive number is not allowed.");
        }
        return Math.log10(num);
    }

    public static long roundNumber(double num) {
        return Math.round(num);
    }

    public static double ceilingNumber(double num) {
        return Math.ceil(num);
    }

    public static double floorNumber(double num) {
        return Math.floor(num);
    }

    public static double findMin(double num1, double num2) {
        return Math.min(num1, num2);
    }

    public static double findMax(double num1, double num2) {
        return Math.max(num1, num2);
    }

    private static void performAddition(Scanner scanner) {
        try {
            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();
            double result = add(num1,num2);
            System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numbers.");
            scanner.nextLine();
        }
    }

    private static void performSubtraction(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            double result = subtract(num1, num2);
            System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numbers.");
            scanner.nextLine();
        }
    }
    private static void performMultiplication(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            double result = multiply(num1, num2);
            System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numbers.");
            scanner.nextLine();
        }
    }
    private static void performDivision(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            double result = divide(num1, num2);
            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numbers.");
            scanner.nextLine();
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            scanner.nextLine();
        }
    }
    private static void performSquareRoot(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();
            double result = calculateSquareRoot(num);
            System.out.println("Result: sqrt(" + num + ") = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            scanner.nextLine();
        }
    }
    private static void performPower(Scanner scanner) {
        try {
            System.out.print("Enter base: ");
            double base = scanner.nextDouble();
            System.out.print("Enter exponent: ");
            double exponent = scanner.nextDouble();
            double result = calculatePower(base, exponent);
            System.out.println("Result: " + base + "^" + exponent + " = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numbers.");
            scanner.nextLine();
        }
    }
    private static void performSine(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double degrees = scanner.nextDouble();
            double result = calculateSine(degrees);
            System.out.println("Result: sin(" + degrees + "°) = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
            scanner.nextLine();
        }
    }
    private static void performCosine(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double degrees = scanner.nextDouble();
            double result = calculateCosine(degrees);
            System.out.println("Result: cos(" + degrees + "°) = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
            scanner.nextLine();
        }
    }
    private static void performTangent(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double degrees = scanner.nextDouble();
            double result = calculateTangent(degrees);
            System.out.println("Result: tan(" + degrees + "°) = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            scanner.nextLine();
        }
    }
    private static void performNaturalLogarithm(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();
            double result = calculateNaturalLogarithm(num);
            System.out.println("Result: ln(" + num + ") = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            scanner.nextLine();
        }
    }
    private static void performLogarithmBase10(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();
            double result = calculateLogarithmBase10(num);
            System.out.println("Result: log10(" + num + ") = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            scanner.nextLine();
        }
    }
    private static void performRound(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();
            long result = roundNumber(num);
            System.out.println("Result: round(" + num + ") = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
            scanner.nextLine();
        }
    }

    private static void performCeiling(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();
            double result = ceilingNumber(num);
            System.out.println("Result: ceil(" + num + ") = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
            scanner.nextLine();
        }
    }

    private static void performFloor(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();
            double result = floorNumber(num);
            System.out.println("Result: floor(" + num + ") = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
            scanner.nextLine();
        }
    }

}


