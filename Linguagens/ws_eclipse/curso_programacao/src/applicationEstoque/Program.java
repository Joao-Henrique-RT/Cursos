package applicationEstoque;

import java.util.Locale;
import java.util.Scanner;

import entities.Square;
import entitiesEstoque.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		
		Scanner leia = new Scanner(System.in);
		
		//Chamando os parametros da classe product
		
		Product product = new Product();
		
		System.out.println("Enter Product data");
		System.out.print("Name: ");
		product.name = leia.nextLine();
		
		System.out.print("Price: ");
		product.price = leia.nextDouble();
		
		System.out.print("Quantity: ");
		product.quantity = leia.nextInt();
		
		System.out.println();
		System.out.println("Product data: "+ product.toString());
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = leia.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated " + " Product data: "+ product.toString());
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = leia.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated " + " Product data: " + product.toString());
		
		
		
		leia.close();
	}

}
