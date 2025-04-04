package sistema_imoveis;

public class AppImoveis {

	public static void main(String[] args) {
		Imovel[] imovel = new Imovel[3];
		imovel[0] = new Imovel("Barra", 300000);
		imovel[1] = new Novo("Ondina", 500000, 50000);
		imovel[2] = new Velho("Pelourinho", 250000, 100000);
		
		for(int i=0; i<imovel.length; i++) {
			System.out.println(imovel[i]);
			System.out.println("Valor de venda: "+imovel[i].valorVenda());
		}

	}

}
