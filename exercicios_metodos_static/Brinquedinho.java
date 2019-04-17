package fiap_metodos_static;

import java.util.Scanner;

public class Brinquedinho {
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		int dado1 = 1+ (int)(Math.random()* 6);
		int dado2 = 1+ (int)(Math.random()* 6);
		
		int somaDosDoisDados = dado1 + dado2;
		System.out.println("Digite o resultado");
		
		int tentativa = leitor.nextInt();
		if (tentativa == somaDosDoisDados) {
			System.out.println("Você acertou!!!");
		}
		else {
			System.out.println("Voçê errou ;0");
		}
		leitor.close();
	
	}
}
