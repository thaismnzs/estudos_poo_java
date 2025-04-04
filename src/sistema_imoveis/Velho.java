package sistema_imoveis;

public class Velho extends Imovel {
	protected double desconto;

	public Velho(String endereco, double preco, double desconto) {
		super(endereco, preco);
		this.desconto = desconto;
	}
	
	public String toString() {
		return "Endereço: "+this.endereco+ "\nPreço: " +this.preco+ "\nPreço com o desconto de: " +this.desconto;
	}
	
	public double valorVenda() {
		return this.preco-this.desconto;
	}
}
