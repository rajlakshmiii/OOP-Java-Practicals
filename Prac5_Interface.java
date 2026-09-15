interface Addition {
    void add(int a, int b);
}

interface Multiplication {
    void multiply(int a, int b);
}

class Calculator implements Addition, Multiplication {

    public void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    public void multiply(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }
}

public class Interface {
    public static void main(String[] args) {

        Addition a = new Calculator();
        Multiplication m = new Calculator();

        a.add(10, 5);
        m.multiply(10, 5);
    }
}
