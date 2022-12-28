import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double operand1 = null;
        double operand2;
        char mathFunction;
        double result;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (operand1 == null) {                        // Check if operand1 exists
                System.out.print("Input first number: ");  // Get 1st number
                operand1 = scanner.nextDouble();
                System.out.print("Input math operator: "); // Get math operator
            }

            mathFunction = scanner.next().charAt(0);

            if (mathFunction == 'C'|| mathFunction == 'c') {   //Check for C
                operand1 = null;
                System.out.println("Cleared, starting again");
                continue;
            }

            if (mathFunction == 'S' || mathFunction == 's') {  // Check for S
                break;
            }

            System.out.print("Input second number: ");  // Get 2nd number
            operand2 = scanner.nextDouble();

            result = mathCount(mathFunction, operand1, operand2); // Counting result
            operand1 = result;
            System.out.println("Result: " + result + '\n' + '\n' +// What to do next
                    "Enter:" + '\n' +
                    "Math operator to continue" + '\n' +
                    "C - clear" + '\n' +
                    "S - turn off"
            );
        }
        System.out.println("calculator is OFF");
    }

    public static double mathCount(char i, double a, double b) {
        double result = 0;
        switch (i) {
            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;

            case '*':
                result = a * b;
                break;

            case '/':
                result = a / b;
                break;

            default:
                System.out.println("try again");
        }
        return result;
    }
}