package Ex3;

public class Aluno {
    private int matricula;
    private String nome;
    private String CPF;
    private Plano plano;

    public Aluno(int matricula, String CPF, String nome, Plano plano) {
        this.matricula = matricula;
        this.CPF = CPF;
        this.nome = nome;
        this.plano = plano;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", plano=" + plano +
                '}';
    }
}
