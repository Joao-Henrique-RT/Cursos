package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = leia.nextDouble();
		x.b = leia.nextDouble();
		x.c = leia.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = leia.nextDouble();
		y.b = leia.nextDouble();
		y.c = leia.nextDouble();
		
		double p = (x.a + x.b + x.c)/2.0;
		
		double areaX = Math.sqrt(p*(p - x.a)*(p - x.b)*(p - x.c));
		
		p = (y.a + y.b + y.c)/2.0;
		
		double areaY = Math.sqrt(p*(p - y.a)*(p - y.b)*(p - y.c));
		
		System.out.printf("Triangle X area: %.4f%n", areaX );
		
		System.out.printf("Triangle Y area: %.4f%n", areaY );
		
		if(areaX > areaY) {
			System.out.println("larger area: X ");
		}
		else {
			System.out.println("Larger area: Y ");
		}
		
		
		leia.close();
		
	}

}
