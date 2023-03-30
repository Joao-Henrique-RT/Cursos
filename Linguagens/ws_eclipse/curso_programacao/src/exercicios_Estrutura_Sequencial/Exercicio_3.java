package exercicios_Estrutura_Sequencial;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		double a,b,c,d, diferenca;
		
		System.out.println("Digite o valor de A");
		a = leia.nextDouble();
		System.out.println("Digite o valor de B");
		b = leia.nextDouble();
		System.out.println("Digite o valor de C");
		c = leia.nextDouble();
		System.out.println("Digite o valor de D");
		d = leia.nextDouble();
		
		diferenca = ((a*b)-(c*d));
		
		System.out.println("Diferença: "+diferenca);
		
		
		
	}

}
