public class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private boolean disponivel;


    public Livro(String titulo, boolean disponivel, String autor, int codigo) {
        this.titulo = titulo;
        this.disponivel = true;
        this.autor = autor;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public void imprimirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }
}
