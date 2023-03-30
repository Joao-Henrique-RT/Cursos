package exercicios_Estrutura_Condicional;
import java.util.Scanner;
public class Exercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		double numero, resultado;
		
		System.out.println("Digite um número: ");
		numero = leia.nextDouble();
		
		
		
		if(numero%2 == 0) {
			System.out.println("Este número é par!");
		} else {
			System.out.println("Este número é ímpar!");
		}
		
		
		
	}

}
