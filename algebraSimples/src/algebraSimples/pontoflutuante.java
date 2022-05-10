package algebraSimples;

import java.util.Scanner;

public class pontoflutuante {

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		float num_1, num_2;
		
		System.out.println("Digite um número inteiro: ");
		num_1 = teclado.nextFloat();
		System.out.println("Digite outro número inteiro: ");
		num_2 = teclado.nextFloat();
		
		float soma = num_1 + num_2;
		float subtracao = num_1 - num_2;
		float multiplicacao = num_1 * num_2;
		float divisao = num_1 / num_2;
		
		System.out.printf("%.2f + %.2f = %.2f\n"
						+ "%.2f - %.2f = %.2f\n" 
						+ "%.2f * %.2f = %.2f\n"
						+ "%.2f / %.2f = %.2f\n",
						num_1, num_2, soma,
						num_1, num_2, subtracao,
						num_1, num_2, multiplicacao,
						num_1, num_2, divisao);
	}
}
