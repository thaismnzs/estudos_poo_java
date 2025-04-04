package jogo_adivinhacao;
import java.util.Random;

public class JogoAdivinhacao {
	private int numero;
	private int tentativas;
	
	
	public JogoAdivinhacao() {
		reiniciar();
	}

	public void reiniciar() {
		Random random = new Random();
		numero = random.nextInt(1000);
		tentativas = 0;
	}
	
	public String fazerPalpite(int palpite) {
		tentativas++;
		if(palpite == numero) {
			return ("Parabéns! Você acertou em "+tentativas+" tentativas!");
		}else if(palpite < numero) {
				return ("O número secreto é maior.");
			} else {
				return("O número secreto é menor.");
		}
	}

	public int getTentativas() {
		return tentativas;
	}

	public int getNumero() {
		return numero;
	}
	
	
	
	

}
