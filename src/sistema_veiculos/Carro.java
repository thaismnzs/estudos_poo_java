package sistema_veiculos;

public class Carro extends Veiculos {
	private double preco;

	public Carro(String marca, String modelo, int ano, double preco) {
		super(marca, modelo, ano);
		this.preco = preco;
	}
	
	@Override
	public double calcularImposto() {
		return preco*0.05;
	}
	

}
