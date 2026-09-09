
import java.util.Scanner;

class Product {
    String name;
    double price;
    int quantity;

    Product() {
        name = "Unknown";
        price = 0;
        quantity = 1;
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double total() {
        return price * quantity;
    }
}

public class Ecommerce {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        Product p = new Product(name, price, quantity);

        double total = p.total();
        double discount = 0;

        if (total >= 5000) {
            discount = total * 0.20;
        } 
        else if (total >= 3000) {
            discount = total * 0.10;
        } 
        else if (total >= 1000) {
            discount = total * 0.05;
        }

        double finalAmount = total - discount;

        System.out.println("\n------ INVOICE ------");
        System.out.println("Product    : " + p.name);
        System.out.println("Price      : " + p.price);
        System.out.println("Quantity   : " + p.quantity);
        System.out.println("Total      : " + total);
        System.out.println("Discount   : " + discount);
        System.out.println("Final Bill : " + finalAmount);

        sc.close();
    }
}

