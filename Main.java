class BankAccount {

    void deposit() {
        System.out.println("Money deposited");
    }

    void withdraw() {
        System.out.println("Money withdrawn");
    }
}

class SavingsAccount extends BankAccount {

    void interest() {
        System.out.println("Interest added");
    }
}

public class Main {

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount();

        s.deposit();
        s.withdraw();
        s.interest();
    }
}