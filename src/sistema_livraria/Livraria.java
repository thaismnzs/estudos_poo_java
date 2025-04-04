package sistema_livraria;

public class Livraria {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Morri para viver", "Andressa Urach", 2015, true);
		Biblioteca biblioteca = new Biblioteca();
		
		biblioteca.adicionarLivro(livro1);
		biblioteca.consultarLivro("Morri para viver");
		biblioteca.emprestarLivro("Morri para viver");
		

	}

}

