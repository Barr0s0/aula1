package application;
import java.util.Scanner;
import java.util.Locale;
import java.util.Scanner;

import entities.product;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		product product= new product();
		System.out.println("enter product data :");
		System.out.print("name : ");
		product.name = sc.nextLine();
		System.out.print("price : ");
		product.price = sc.nextDouble();
		System.out.print("quantity in stock : ");
		product.quantity = sc.nextInt();
		System.out.println();
		System.out.println("product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("update data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity =sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("update data: " + product);
		
		sc.close();
		
	}

}
