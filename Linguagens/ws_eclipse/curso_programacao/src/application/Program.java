package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Square;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		
		Triangle x,y;
		x = new Triangle(); //instancia!
		y = new Triangle(); //instancia!
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = leia.nextDouble();
		x.b = leia.nextDouble();
		x.c = leia.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = leia.nextDouble();
		y.b = leia.nextDouble();
		y.c = leia.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX );
		
		System.out.printf("Triangle Y area: %.4f%n", areaY );
		
		if(areaX > areaY) {
			System.out.println("larger area: X ");
		}
		else {
			System.out.println("Larger area: Y ");
		}
		
		
		/*
		Square lados;
		lados = new Square();//instanciado 
		
		
		
		System.out.println("Digite um lado do quadrado");
		lados.a = leia.nextDouble();
		
		System.out.println("digite o outro lado do quadrado");
		lados.b = leia.nextDouble();
		
		double areaSquare= lados.areaSquare();  
		
		System.out.println("O resultado �: " + areaSquare);
		*/
		
		leia.close();
		
	}

}
