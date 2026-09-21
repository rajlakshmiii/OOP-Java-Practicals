import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 5000;

        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("Balance = " + balance);
                }

                else if (choice == 2) {
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();

                    if (amount > balance)
                        throw new ArithmeticException("Insufficient funds");

                    balance = balance - amount;
                    System.out.println("Withdrawal successful");
                }

                else if (choice == 3) {
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();

                    if (amount <= 0)
                        throw new IllegalArgumentException("Invalid amount");

                    balance = balance + amount;
                    System.out.println("Deposit successful");
                }

                else if (choice == 4) {
                    System.out.println("Thank you!");
                    break;
                }

                else {
                    throw new IllegalArgumentException("Invalid choice");
                }

            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());

            } finally {
                System.out.println("Transaction completed.");
            }
        }

        sc.close();
    }
}
