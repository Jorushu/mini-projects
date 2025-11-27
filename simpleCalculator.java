import java.util.Scanner;
public class SimpleCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scr = new Scanner(System.in);

        System.out.println("--- Simple Java Calculator ---");

        // 1. Get the first number
        System.out.print("Enter first number: ");
        // We use double so the user can enter decimals (e.g., 5.5)
        double num1 = scr.nextDouble();

        // 2. Get the operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scr.next().charAt(0);

        // 3. Get the second number
        System.out.print("Enter second number: ");
        double num2 = scr.nextDouble();

        double result;
        boolean validOperation = true;

        // 4. Perform calculation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                // Handle division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    validOperation = false;
                    result = 0; // default value
                }
                break;

            default:
                System.out.println("Error: Invalid operator! Please use +, -, *, or /");
                validOperation = false;
                result = 0;
        }

        // 5. Display the result only if the operation was valid
        if (validOperation) {
            System.out.println("------------------------------");
            // This prints the result (e.g., 5.0 + 3.0 = 8.0)
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }

        // Close the scanner to prevent memory leaks
        scr.close();
    }
}