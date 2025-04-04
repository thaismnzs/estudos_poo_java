package sistema_imoveis;

public class Novo extends Imovel {
	protected double adicional;

	public Novo(String endereco, double preco, double adicional) {
		super(endereco, preco);
		this.adicional = adicional;
	}
	
	public String toString() {
		return "Endereço: "+this.endereco+ "\nPreço: " +this.preco+ "\nPreço com adicional de: " +this.adicional;
	}
	
	public double valorVenda() {
		return this.preco+this.adicional;
	}
}
	
