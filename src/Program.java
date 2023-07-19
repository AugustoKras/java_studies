// This program ask to user to enter the name, price and quantity of a product.
// The program will print the name, price and quantity of the product.
// The program will also print the total value of the product.
// The program will ask to user to enter the quantity of product to add.

package src;

import java.util.Locale;
import java.util.Scanner;
import src.entities.Product;
public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");

        System.out.println("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();


        //System.out.print(product.name + ", " + product.price + ", " + product.quantity);
        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println(" Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println(" Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();

    }

}