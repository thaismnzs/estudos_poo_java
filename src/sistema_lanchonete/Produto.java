package sistema_lanchonete;

public class Produto {
	private String nome;
	private double preco;
	private String id;
	
	public Produto(String nome, double preco, String id) {
		this.nome = nome;
		this.preco = preco;
		this.id = id;
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome do produto: "+nome+"\nPreço: "+preco+"\nID: "+id);
	}

	public double getPreco() {
		return preco;
	}
}
