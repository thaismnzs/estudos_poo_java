package sistema_veiculos;

public class Main {

	public static void main(String[] args) {
		Frota frota = new Frota();
		Carro carro1 = new Carro("Nissan", "Kicks", 2023, 150.000);
		Carro carro2 = new Carro("BYD", "Dolphin", 2023, 180.000);
		Caminhao caminhao1 = new Caminhao("Volvo", "FH 540", 2020, 50.000);
		frota.adicionarVeiculo(carro1);
		frota.adicionarVeiculo(carro2);
		frota.adicionarVeiculo(caminhao1);
		caminhao1.calcularImposto();
		carro1.calcularImposto();
		carro2.calcularImposto();
		
		double total = frota.calcularImpostos();
		System.out.println("Total de impostos: "+total);
		
		carro1.exibirDetalhes();
		carro2.exibirDetalhes();
	}

}
