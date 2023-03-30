package exercicios_Estrutura_Sequencial;
import java.util.Locale;
import java.util.Scanner;
public class Exercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double num_peca1, num_peca2, qtde_pecas1,qtde_pecas2, valor_peca, valor_total;
		
		System.out.println("Digite o código da peça");
		num_peca1 = leia.nextDouble();
		
		System.out.println("Digite a quantidade de peças: ");
		qtde_pecas1 = leia.nextDouble();
		
		System.out.println("Digite o valor da peça: ");
		valor_peca = leia.nextDouble();
		
		valor_peca = (qtde_pecas1* valor_peca);
		
		
		
		System.out.println("Digite o código da peça 2");
		num_peca2 = leia.nextDouble();
		
		System.out.println("Digite a quantidade de peças: ");
		qtde_pecas2 = leia.nextDouble();
		
		System.out.println("Digite o valor da peça: ");
		double valor_peca2 = leia.nextDouble();
		
		valor_peca2 = qtde_pecas2 * valor_peca2;
		
		valor_total = valor_peca + valor_peca2;
		
		
		System.out.printf("Total a pagar: R$ %.2f",valor_total);
		
		
		
		
	}

}
