package topicos_java;

import java.util.Scanner;

public class Anotacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Classe para anota��es.
		
		/*Padr�o camelCase � utilizado para pacotes, variaveis, metodos, etc.
		 * 
		 * Para classes utilizamos o padr�o Pascalcase, onde a primeira letra � mai�scula
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite tr�s n�meros");
		int a = leia.nextInt();
		int b = leia.nextInt();
		int c = leia.nextInt();
		
		int maior = max(a,b,c);
		
		showResult(maior);
		
		leia.close();
		
	}
	
	/*Public para ser chamada em qualquer classe
	 * Static para ser chamada inddwependente de cria��o de objeto;
	 * 
	 * INt para retornar um n�mero inteiro;
	 * 
	 * Entre parenteses, os par�metros(ou valores) da fun��o, os nomes
	 * N�o precisam ser iguais aos valores da classe main
	 * 
	 * Vari�vel Aux existe somente dentro da fun��o
	 * */
	public static int max(int x,int y, int z) {
		int aux;
		if(x>y && x>z) {
			aux = x;
		}
			else if(y>z) {
			aux = y;
		}
			else {
			aux = z;
		}
		return aux;
		
		
	}
	
	/*Quando uma fun��o faz uma a��o sem retornar um valor 
	 * dizemos que o tipo da fun��o � vazio "void"*/
	public static void showResult(int value){//value poderia ser qualquer nome
		System.out.println("O maior n�mero �: "+ value);
	}

}
