import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = 1;

        while (choice != 0) {

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            System.out.println("\n1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Answer = " + (a + b));
                    break;

                case 2:
                    System.out.println("Answer = " + (a - b));
                    break;

                case 3:
                    System.out.println("Answer = " + (a * b));
                    break;

                case 4:
                    if (b != 0)
                        System.out.println("Answer = " + (a / b));
                    else
                        System.out.println("Cannot divide by zero");
                    break;

                case 5:
                    System.out.println("Answer = " + (a % b));
                    break;

                case 6:
                    System.out.println("Answer = " + Math.pow(a, b));
                    break;

                case 0:
                    System.out.println("Calculator closed");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
