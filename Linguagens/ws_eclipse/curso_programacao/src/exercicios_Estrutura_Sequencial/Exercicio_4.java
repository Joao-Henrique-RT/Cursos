package exercicios_Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double num_func, horas, valor_hora, salario_final;
		
		System.out.println("Digite o n�mero do funcion�rio: ");
		num_func = leia.nextDouble();
		
		System.out.println("N�mero de horas trabalhadas: ");
		horas = leia.nextDouble();
		
		System.out.println("Qual o valor da hora trabalhada: ");
		valor_hora = leia.nextDouble();
		
		salario_final = (horas*valor_hora);
		
		System.out.println("Funcion�rio n�mero: "+num_func);
		System.out.printf("Sal�rio: R$ %.2f",salario_final);
		
	}

}
