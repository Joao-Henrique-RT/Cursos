package topicos_java;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Soma.executar();
		
	}
	
	
	public static void executar() {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		
		int num1 = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		
		int num2 = leia.nextInt();
		
		int resultado = soma(num1,num2);
		
		showResult(resultado);
		
		int maior = maior(num1, num2);
		
		
		//O m�todo shoResult pegou o valor de resultado e ir� imprimir a mensagem conforme o m�todo criado
	
		
		leia.close();
		
	}
	
	public static int soma(int a, int b) {
		//M�todo publico que far� a a��o de somar os dois atributos (a e b poderiam ser quaisquer outros nomes;
		int resultado = (a + b);
		
		return resultado;
		
	}
	
	public static void showResult(int resultado) {
		//m�todo publico que far� a a��o de mostrar o resultado na tela (value poderia ser qualquer nome);
		
		System.out.println("O resultado �: " + resultado);
		
	}
	
	public static int maior(int a, int b) {
		//M�todo p�blico que ir� mostrar qual dos dois n�meros � maior
		
		int aux;
		
		if(a > b) {
			aux = a;
			System.out.println("O maior n�mero �: "+ a);
		}
		else {
			aux = b;
			System.out.println("O maior n�mero �: "+ b);
		}
		return aux;
		
		
	}
	
	
	
	
	
	
	

}
