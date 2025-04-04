package sistema_lanchonete;

public class Lanchonete {

	public static void main(String[] args) {
		Produto p1 = new Produto("Hamburger", 12.50, "1");
		Produto p2 = new Produto("Pizza", 20.00, "2");
		Pedido pedido = new Pedido();
		
		p1.exibirInformacoes();
		p2.exibirInformacoes();
		pedido.adicionarProduto(p1);
		pedido.adicionarProduto(p2);

		System.out.println("Total da compra: "+pedido.calcularTotal());

	}

}
