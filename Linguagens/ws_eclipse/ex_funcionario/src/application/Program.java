package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		
		Employee employee = new Employee();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		employee.name = leia.next();
		
		System.out.println("Digite seu salário bruto: ");
		employee.grossSalary = leia.nextDouble();
		
		System.out.println("Digite a taxa de desconto: ");
		employee.tax = leia.nextDouble();
		
		System.out.println(employee.toString());
		
		System.out.println("Which percentage to increase salary?");	
		double percentage = leia.nextDouble();
		
		System.out.println("updated data: " + employee.name + ",  $ " + employee.increaseSalary(percentage));
		
		
	}

}
