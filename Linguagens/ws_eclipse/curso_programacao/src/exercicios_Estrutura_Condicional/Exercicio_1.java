package exercicios_Estrutura_Condicional;
import java.util.Scanner;
public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		double numero;
		
		
		System.out.println("Digite um número");
		
		numero = leia.nextDouble();
		
		if(numero<0) {
			System.out.println("Este número é negativo");
		}else {
			System.out.println("Este número é positivo");
		}
		
		
	}

}
