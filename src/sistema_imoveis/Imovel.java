package sistema_imoveis;

public class Imovel {
	protected String endereco;
	protected double preco;
	
	public Imovel(String endereco, double preco) {
		this.endereco = endereco;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return ("Endereço: "+this.endereco+ "\nPreço: " +this.preco);
	}
	
	public double valorVenda() {
		return this.preco;
	}
}
	
