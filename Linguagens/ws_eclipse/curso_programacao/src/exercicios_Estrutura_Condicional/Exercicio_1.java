package exercicios_Estrutura_Condicional;
import java.util.Scanner;
public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		double numero;
		
		
		System.out.println("Digite um n�mero");
		
		numero = leia.nextDouble();
		
		if(numero<0) {
			System.out.println("Este n�mero � negativo");
		}else {
			System.out.println("Este n�mero � positivo");
		}
		
		
	}

}
