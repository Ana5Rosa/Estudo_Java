//Exercício 5: Leia uma variável t com um tempo qualquer em segundos e imprima esse valor em hora, minuto e segundo.

package transformaSegundo;

import java.util.Scanner;

public class calculo {
	public static void main(String [] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		int t;
		System.out.println("Digite o tempo em segundos: ");
		t = entrada.nextInt();
		
		int anos = (((t / 3600) / 24) / 30) / 12,
			meses = (((t / 3600) / 24) / 30) % 12,
			dias = ((t / 3600) / 24) % 30, 
			horas = (t / 3600) % 24,
		    minutos = (t % 3600) / 60,
			segundos = (t % 3600) % 60;
		
		System.out.printf("%d ANOS %d MESES %d DIAS %02d:%02d:%02d", anos, meses, dias, horas, minutos, segundos);
	}
}
