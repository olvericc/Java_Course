package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

        }

        Product product = new Product();

        System.out.println("Please, enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.print("Enter the number of products to be added in stock: ");
        int quantityToBeAdded = sc.nextInt();
        product.addProducts(quantityToBeAdded);

        System.out.println("Updated data: " + product);

        System.out.print("Enter the number of products to be removed in stock: ");
        int quantityToBeRemoved = sc.nextInt();
        product.removeProducts(quantityToBeRemoved);

        System.out.println("Updated data: " + product);

        sc.close();

    }

}
