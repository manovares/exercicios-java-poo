public class Emprestimo {
    private Livro livro;
    private Associado associado;
    private String dataRetirada;

    public Emprestimo(Livro livro, String dataRetirada, Associado associado) {
        this.livro = livro;
        this.dataRetirada = dataRetirada;
        this.associado = associado;
    }

    public String getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(String dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Associado getAssociado() {
        return associado;
    }

    public void setAssociado(Associado associado) {
        this.associado = associado;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void calcularPrazo(){
        System.out.println("Tem que devolver o livro em 7 dias apartir de " + dataRetirada);
    }

    public void imprimirDados(){
        System.out.println("Livro: " + this.livro.getTitulo());
        System.out.println("Associado: " + this.associado.getNome());
        System.out.println("Data de Retirada: " + this.dataRetirada);
    }

}
