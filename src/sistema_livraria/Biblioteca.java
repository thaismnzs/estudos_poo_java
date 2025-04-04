package sistema_livraria;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Adicionado: " + livro.getTitulo());
    }

    public void removerLivro(String titulo) {
        for (int i = livros.size() - 1; i >= 0; i--) { // Percorrer de trás para frente evita problemas
            if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                livros.remove(i);
                System.out.println("Removido: " + titulo);
                return; // Para sair do loop após remover o primeiro livro encontrado
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void consultarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Informações: " + livro.toString()); // Exibir apenas o livro encontrado
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) { // Corrigido erro de `livros.getTitulo()`
                if (livro.isDisponivel()) {
                    livro.setDisponivel(false);
                    System.out.println("Livro: " + titulo + " emprestado.");
                } else {
                    System.out.println("Livro: " + titulo + " já está emprestado.");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
}
