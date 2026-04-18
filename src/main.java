
public class main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca(10);


        Livro l1 = new Livro("O Senhor dos Anéis", true, "J.R.R. Tolkien",1);
        Livro l2 = new Livro("Dom quixote", true, "J.R.R. Tolkien",2);
        Livro l3 = new Livro("1984", true, "J.R.R. Tolkien",3);

        biblioteca.cadastrarLivro(l1);
        biblioteca.cadastrarLivro(l2);
        biblioteca.cadastrarLivro(l3);


        Associado a1 = new Associado(101, "Ana Silva");
        Associado a2 = new Associado(102, "Carlos Souza");


        biblioteca.realizarEmprestimo(1, a1, "18/04/2026");
        biblioteca.realizarEmprestimo(3, a2, "18/04/2026");


        biblioteca.realizarEmprestimo(1, a2, "18/04/2026");


        biblioteca.devolverLivro(1);


        biblioteca.imprimirAcervo();
    }
}