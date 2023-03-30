import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ol� mundo!");

		// Tipo de vari�vel Byte, short, int, long, float

		double y = 10.35784;
		System.out.printf("%.2f%n", y);
		// Neste caso ir� delimitar para duas casas decimais
		// %N para quebrar a linha (poderia ser tamb�m \n)
		// PrintF est� indicando que o que ser� printado ser� formatado

		System.out.printf("%.4f%n", y);
	
		// Para localizar o dispositivo como se fosse dos estados unidos

		System.out.printf("%.4f%n", y);
		// Neste caso ir� imprimir a casa decimal com ponto ao inv�s de v�rgula

		System.out.printf("RESULTADO = %.4f metros%n", y);
		// com PrintF a vari�vel Y entrar� no lugar de %.4f

		String nome = "Maria";
		int idade = 35;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, renda);
		// %f = ponto flutuante
		// %d = inteiro
		// %s = texto
		// %n = quebra de linha

		System.out.println("EXERC�CIO DE FIXA��O!");
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.0;
		double measure = 53.234567;
		
		System.out.println("Produtcs:");
		System.out.println(product1+", which price is $"+ price1);
		System.out.println(product2+", which price is $"+price2);
		System.out.println("Record: "+age+" years old, code "+code+" and gender: "+gender);
		System.out.printf("Measue: %.8f%n", measure);
		System.out.printf("Rouded  %.3f%n",measure );
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point %.3f%n ",measure);
		
		//Casting � uma t�cnica de covers�o expl�cita dos dados em java
		
		double a =10;
		int b;
		//b = a; // neste caso o java aponta um erro pois s�o variaveis de tipos diferentes
		
		b = (int) a; // fazemos com que o java execute independente de int para double
		
		
		//sc.nextLine (l� a linha inteira, n�o importando espa�os);
		
		System.out.println("FUN��ES MATEM�TICAS EM JAVA");
		a  = Math.sqrt(b); //Vari�vel A recebe a raiz quadrada de b
		a = Math.pow(a, b); //Vari�vel A recebe o resultado de A elevado a B
		a = Math.abs(b); //Variavel A recebe o valor absoluto de B
		
		//java.lang.math pesquisar na web para mais fun��es
		
		
		
		
		
		
		
		
	}

}
