public class Associado {
    private int matricula;
    private String nome;

    public Associado(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirDados() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
    }
}
