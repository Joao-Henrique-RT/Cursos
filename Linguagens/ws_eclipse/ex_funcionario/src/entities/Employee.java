package entities;

public class Employee { //funcion�rio

	public String name;
	public double grossSalary;//Sal�rio bruto
	public double tax; //taxa
	
	public double netSalary() { //salario liquido
		return grossSalary - tax;
		
	}
	
	public double increaseSalary(double percentage) { //percentage  ser� atribuida no programa
		return grossSalary += grossSalary * percentage/100;
	}
	
	public String toString() {
		return "Employee: " +
				name + 
				",  $ " +
				
				String.format("%.2f", netSalary());
	}
	
	
	
}
