package algebraSimples;

import java.util.Scanner;

public class algebra {
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		int num_1, num_2;
		
		System.out.println("Digite um número inteiro: ");
		num_1 = teclado.nextInt();
		System.out.println("Digite outro número inteiro: ");
		num_2 = teclado.nextInt();
		
		int soma = num_1 + num_2;
		int subtracao = num_1 - num_2;
		int multiplicacao = num_1 * num_2;
		int divisao = num_1 / num_2;
		int resto = num_1 % num_2;
		
		System.out.printf("%d + %d = %d\n"
						+ "%d - %d = %d\n" 
						+ "%d * %d = %d\n"
						+ "%d / %d = %d\n"
						+ "resto = %d\n", 
						num_1, num_2, soma,
						num_1, num_2, subtracao,
						num_1, num_2, multiplicacao,
						num_1, num_2, divisao,
						resto);		
	}

}
