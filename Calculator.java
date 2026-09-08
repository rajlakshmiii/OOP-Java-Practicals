import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            System.out.println("\nChoose Operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");

            System.out.print("Enter your choice (1-6): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result = " + (a + b));
                    break;

                case 2:
                    System.out.println("Result = " + (a - b));
                    break;

                case 3:
                    System.out.println("Result = " + (a * b));
                    break;

                case 4:
                    if (b == 0)
                        System.out.println("Error: Cannot divide by zero!");
                    else
                        System.out.println("Result = " + (a / b));
                    break;

                case 5:
                    if (b == 0)
                        System.out.println("Error: Cannot find modulus by zero!");
                    else
                        System.out.println("Result = " + (a % b));
                    break;

                case 6:
                    System.out.println("Result = " + Math.pow(a, b));
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("\nDo you want to continue? (1 = Yes, 0 = No): ");
            int again = sc.nextInt();

            if (again == 0)
                break;

        } while (true);

        System.out.println("Calculator closed.");
        sc.close();
    }
}