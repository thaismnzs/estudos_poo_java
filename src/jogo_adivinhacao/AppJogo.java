package jogo_adivinhacao;
import java.util.Scanner;

public class AppJogo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		JogoAdivinhacao jogo = new JogoAdivinhacao();
		int palpite;
		String resultado;
		
		System.out.println("Bem vindo ao Jogo de Adivinhação!");
		System.out.println("Dê um palpite entre 1 e 1000: ");
		
		do {
			System.out.println("Palpite: ");
			palpite = scanner.nextInt();
			
			resultado = jogo.fazerPalpite(palpite);
			System.out.println(resultado);
		} while (!resultado.startsWith("Parabéns"));
		scanner.close();
		
	}

}
