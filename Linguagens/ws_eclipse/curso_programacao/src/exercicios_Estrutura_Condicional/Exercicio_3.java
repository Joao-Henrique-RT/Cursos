package exercicios_Estrutura_Condicional;
import java.util.Scanner;
public class Exercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.println("Digite o primeiro n�mero");
		num1 = leia.nextDouble();
		
		System.out.println("Digite o segundo n�mero");
		num2 = leia.nextDouble();
		
		if(num1%num2 ==0 || num2%num1 ==0) {
			System.out.println("Os n�meros s�o m�ltiplos");
		}else {
			System.out.println("N�o s�o multiplos");
		}
		
		
	}

}
