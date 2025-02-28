package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		
		Employee employee = new Employee();
		
		Scanner leia = new Scanner(System.in); //Metodo Scanner para inser��o de dados pelo usu�rio
		
		System.out.println("Digite seu nome: ");
		employee.name = leia.next(); //NOME FUNC
		
		System.out.println("Digite seu sal�rio bruto: ");
		employee.grossSalary = leia.nextDouble(); //SALARIO BRUTO
		
		System.out.println("Digite a taxa de desconto: ");
		employee.tax = leia.nextDouble();
		
		System.out.println(employee.netSalary()); //SALARIO LIQUIDO
		
		System.out.println("Which percentage to increase salary?");	
		double percentage = leia.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("updated data: " + employee);
		
		
		leia.close();
	}

}
