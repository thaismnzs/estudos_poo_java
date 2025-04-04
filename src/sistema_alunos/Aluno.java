package sistema_alunos;

public class Aluno {
	protected String nome;
	protected String matricula;
	protected double nota1, nota2, nota3;
	
	public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	@Override
	public String toString() {
		return ("Nome do aluno: "+this.nome+"\nNúmero de matrícula: "+this.matricula+"\nNota 1: "+nota1+"\nNota 2: "+nota2+"\nNota 3: "+nota3);
	}
}
