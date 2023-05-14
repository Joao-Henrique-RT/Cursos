package application;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		
		Scanner leia = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = leia.nextDouble();
		rectangle.height = leia.nextDouble();
		
		System.out.println(rectangle.toString());
		
		
		
		
		
		leia.close();
	}

}
