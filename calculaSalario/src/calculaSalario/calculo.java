package calculaSalario;

import java.util.Scanner;

public class calculo {
	public static void main(String [] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		float salario, aumento;
		
		System.out.println("Digite o seu salário atual: ");
		salario = entrada.nextFloat();
		System.out.println("Digite o seu percentual de aumento: ");
		aumento = entrada.nextFloat();
		
		float novoSalario = (salario * (100 + aumento)) / 100;
		
		System.out.printf("Seu novo salario é: %.2f", novoSalario);
		
	}
}
