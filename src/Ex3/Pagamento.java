package Ex3;

public class Pagamento {
    private Aluno aluno;
    private float valor;
    private String data;
    private boolean emAtraso;

    public Pagamento(Aluno aluno, float valor, String data) {
        this.aluno = aluno;
        this.valor = valor;
        this.data = data;
        this.emAtraso = false;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isEmAtraso() {
        return emAtraso;
    }

    public void setEmAtraso(boolean emAtraso) {
        this.emAtraso = emAtraso;
    }

    public void imprimirRecibo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Pagamento Realizado: " +
                "aluno=" + aluno +
                ", valor=" + valor +
                ", data='" + data + '\'' +
                ", emAtraso=" + emAtraso +
                '}';
    }
}
