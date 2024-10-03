package pacoteMaterialExemplo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter produt data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.qtdd = sc.nextInt();

        System.out.println("Product data: " + product);
        System.out.print("Enter the number of products to be added in stock: ");
        int qtdd = sc.nextInt();
        product.addProducts(qtdd);
        System.out.println("Update data: " + product);
        System.out.print("Enter the number of products to be removed in stock: ");
        qtdd = sc.nextInt();
        product.removeProdutcs(qtdd);
        System.out.println("Update data: " + product);
        sc.close();
    }

}
