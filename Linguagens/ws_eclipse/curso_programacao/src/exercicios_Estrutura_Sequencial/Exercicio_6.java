package exercicios_Estrutura_Sequencial;
import java.util.Scanner;
public class Exercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		double a,b,c, area_triangulo, area_circulo, area_trapezio, area_quadrado,
		area_retangulo;
		
		System.out.println("Digite o primeiro valor:");
		a = leia.nextDouble();

		System.out.println("Digite o segundo valor:");
		b = leia.nextDouble();
		
		System.out.println("Digite o Terceiro valor");
		c = leia.nextDouble();
		
		//CALCULO DE TODAS AS �REAS, O RESULTADO IR� MOSTRAR 3 CASAS AP�S A V�RGULA
		area_triangulo = (a*c)/2;
		System.out.printf("Tri�ngulo: %.3f%n", area_triangulo);
		
		area_circulo = (Math.pow(c, 2) * 3.14159);
		System.out.printf("Circulo: %.3f%n", area_circulo);
		
		area_trapezio = ((a+b)/2)*c;
		System.out.printf("Trap�zio: %.3f%n", area_trapezio);
		
		area_quadrado = Math.pow(b, 2);
		System.out.printf("Quadrado %.3f%n", area_quadrado);
		
		area_retangulo = (a * b);
		System.out.printf("Ret�ngulo %.3f%n", area_retangulo);
	}

}
