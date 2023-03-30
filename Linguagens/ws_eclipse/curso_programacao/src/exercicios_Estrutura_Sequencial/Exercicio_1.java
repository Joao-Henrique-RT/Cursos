package exercicios_Estrutura_Sequencial;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(
				"Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma\r\n"
						+ "mensagem explicativa,");

		double num1, num2, total;

		Scanner leia = new Scanner(System.in);

		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));

		total = num1 + num2;	
		
		JOptionPane.showMessageDialog(null, "A soma dos dois números é igual a: "+total);
	}

}
