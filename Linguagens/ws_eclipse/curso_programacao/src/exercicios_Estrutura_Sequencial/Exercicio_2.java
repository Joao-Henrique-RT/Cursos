
package exercicios_Estrutura_Sequencial;
import java.util.Locale;
import java.util.Scanner;


public class Exercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double raio,area, num_pi = 3.14159; 
		System.out.println("Digite o raio do círculo: ");
		
		raio = leia.nextFloat();
		
		
		//math.pow = Raio elevado a 2
		area =  (num_pi*(Math.pow(raio, 2)));
		
		System.out.printf("A área é: %.4f", area);
		
		
		
	}

}
