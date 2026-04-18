import java.util.ArrayList;

public class Biblioteca {
    private Livro[] livros;
    private Emprestimo[] emprestimos;
    private int totalLivros;
    private int totalEmprestimos;


    public Biblioteca(int capacidade) {
        livros = new Livro[capacidade];
        emprestimos = new Emprestimo[capacidade];
        totalLivros = 0;
        totalEmprestimos = 0;
    }

    /**
     * Cadastra um novo livro no acervo.
     */
    public void cadastrarLivro(Livro livro) {
        if (totalLivros < livros.length) {
            livros[totalLivros] = livro;
            totalLivros++;
            System.out.println("Livro '" + livro.getTitulo() + "' cadastrado com sucesso.");
        } else {
            System.out.println("Acervo cheio. Não foi possível cadastrar.");
        }
    }


    public void realizarEmprestimo(int codigoLivro, Associado associado, String data) {
        for (int i = 0; i < totalLivros; i++) {
            if (livros[i].getCodigo() == codigoLivro) {
                if (livros[i].isDisponivel()) {
                    livros[i].setDisponivel(false);
                    Emprestimo emp = new Emprestimo(livros[i], data, associado);
                    emprestimos[totalEmprestimos] = emp;
                    totalEmprestimos++;
                    System.out.println("Empréstimo realizado com sucesso!");
                    emp.imprimirDados();
                } else {
                    System.out.println("Livro indisponível para empréstimo.");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }


    public void devolverLivro(int codigoLivro) {
        for (int i = 0; i < totalLivros; i++) {
            if (livros[i].getCodigo() == codigoLivro) {
                livros[i].setDisponivel(true);
                System.out.println("Livro '" + livros[i].getTitulo() + "' devolvido com sucesso.");
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }


    public void imprimirAcervo() {
        System.out.println("\n=== Acervo da Biblioteca ===");
        for (int i = 0; i < totalLivros; i++) {
            livros[i].imprimirDados();
            System.out.println("---");
        }
    }
}
