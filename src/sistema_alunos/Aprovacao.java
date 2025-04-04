package sistema_alunos;

public class Aprovacao extends Aluno {

	public Aprovacao(String nome, String matricula, double nota1, double nota2, double nota3) {
		super(nome, matricula, nota1, nota2, nota3);
	
	}
	
	public double media() {
		return (this.nota1+this.nota2+this.nota3)/3;
	}
	
	public boolean aprovado() {
		return media() >= 7;
	}
	
	@Override
	public String toString() {
		return super.toString()+ ("\nMédia: "+media()+ "\nStatus: "+(aprovado() ? "Aprovado" : "Reprovado"));
	}

}
