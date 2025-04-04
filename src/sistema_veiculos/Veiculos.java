package sistema_veiculos;

abstract class Veiculos {
	private String marca;
	private String modelo;
	private int ano;
	
	public Veiculos(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public void exibirDetalhes() {
		System.out.println("Marca: "+marca+ "\nModelo: "+modelo+"\nAno: "+ano);
	}
	
	public abstract double calcularImposto();
}
