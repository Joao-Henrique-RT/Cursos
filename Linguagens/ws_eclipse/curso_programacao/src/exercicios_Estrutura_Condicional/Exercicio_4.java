package exercicios_Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		double hora_inicio, hora_termino, resultado;

		System.out.println("Digite a hora de inicio");
		hora_inicio = leia.nextDouble();
		System.out.println("Digite a hora de t�rmino");
		hora_termino = leia.nextDouble();
		
		
		resultado = hora_termino - hora_inicio;
		
		System.out.println("O jogo teve de dura��o "+ resultado + " horas");
		
		
	}

}
