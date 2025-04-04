package sistema_alunos;

public class SistemaAlunos {
	public static void main(String[] args) {
	Aprovacao[] aluno = new Aprovacao[3];
	aluno[0] = new Aprovacao("Mayara Menezes", "123456", 7.5, 6.0, 9.3);
	aluno[1] = new Aprovacao("Jullyana Ribeiro", "234567", 10.0, 8.4, 2.5);
	aluno[2] = new Aprovacao("Victor Miaú Menezes", "345678", 3.0, 2.5, 4.3);
	
	for(int i=0; i<aluno.length; i++) {
		System.out.println(aluno[i]);
		System.out.println("----------------");
	}
}
}
