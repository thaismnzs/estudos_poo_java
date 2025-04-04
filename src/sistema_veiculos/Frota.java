package sistema_veiculos;
import java.util.ArrayList;

public class Frota {
	private ArrayList<Veiculos> veiculos = new ArrayList<>();
	
	public Frota() {
		this.veiculos = new ArrayList<>();
	}
	public void adicionarVeiculo(Veiculos veiculo) {
		veiculos.add(veiculo);
	}
	
	public double calcularImpostos() {
		double total=0;
		for(int i=0; i<veiculos.size(); i++) {
			Veiculos veiculo = veiculos.get(i);
			total += veiculo.calcularImposto();
		}
		return total;
	}
	
}
