package sistema_lanchonete;
import java.util.ArrayList;

public class Pedido {
	ArrayList<Produto> produtos = new ArrayList<>();

	public Pedido() {
	this.produtos = new ArrayList<>();
}
	
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void removerProduto(Produto produto) {
		produtos.remove(produto);
	}
	
	public double calcularTotal() {
		double total=0;
		for(int i=0; i<produtos.size(); i++) {
			Produto produto = produtos.get(i);
			total+= produto.getPreco();
		}
		return total;
	}
}
