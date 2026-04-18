package Ex3;

public class Plano {
    private String tipo;
    private int duracao;
    private float preco;

    public Plano(String tipo, float preco, int duracao) {
        this.tipo = tipo;
        this.preco = preco;
        this.duracao = duracao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Plano{" +
                "tipo='" + tipo + '\'' +
                ", duracao=" + duracao +
                ", preco=" + preco +
                '}';
    }
}
