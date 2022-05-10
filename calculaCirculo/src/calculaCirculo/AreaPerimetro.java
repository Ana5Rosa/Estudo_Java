package calculaCirculo;

import java.util.Scanner;

public class AreaPerimetro {
	public static void main(String [] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		float raio;
		System.out.printf("Digite o raio do círculo: ");
		raio = entrada.nextFloat();
		
		float perimetro = (float) (2 * Math.PI * raio);
		float area = (float) (Math.PI * Math.pow(raio, 2));
		
		System.out.printf("perimetro = %.2f\n"
						+ "Área = %.2f", 
						perimetro, area);
		
	}

}
