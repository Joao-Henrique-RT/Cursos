package exercicios_Estrutura_Condicional;
import java.util.Scanner;
public class Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		String dia;
		System.out.println("Digite um numero: ");
		
		numero = leia.nextInt();
		
		switch (numero) {
		case 1:{
			dia = "Segundou";
			System.out.println(dia);
			break;
		}
		case 2:{
			dia ="Domingou";
			System.out.println(dia);
			break;
		}
		default:{
			System.out.println("Digite um n�mero v�lido");
			break;
		}
			
		}
		
		
		
		
		
	}

}
