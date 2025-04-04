package sistema_livraria;

public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private boolean disponivel;
	
	public Livro(String titulo, String autor, int anoPublicacao, boolean disponivel) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.disponivel = disponivel;
	}

	public String getTitulo() {
		return titulo;
	}

	@Override
	public String toString() {
		return "Título: " + titulo + "\nAutor: " + autor + "\nAno de Publicação: " + anoPublicacao + "\nDisponibilidade: "
				+ disponivel;
	}


	public String getAutor() {
		return autor;
	}


	public int getAnoPublicacao() {
		return anoPublicacao;
	}


	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	

}
