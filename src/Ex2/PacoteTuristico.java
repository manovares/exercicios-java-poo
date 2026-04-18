package Ex2;

public class PacoteTuristico {
    private int codigo;
    private String destino;
    private int duracao;
    private float preco;
    private boolean disponivel;

    public PacoteTuristico(float preco, int codigo, int duracao, String destino) {
        this.disponivel = true;
        this.preco = preco;
        this.codigo = codigo;
        this.duracao = duracao;
        this.destino = destino;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
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

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

  public void imprimirDados(){
      System.out.println("PacoteTuristico{" +
              "codigo=" + codigo +
              ", destino='" + destino + '\'' +
              ", duracao=" + duracao +
              ", preco=" + preco +
              ", disponivel=" + disponivel +
              '}');
  }

    @Override
    public String toString() {
        return "PacoteTuristico{" +
                "codigo=" + codigo +
                ", destino='" + destino + '\'' +
                ", duracao=" + duracao +
                ", preco=" + preco +
                ", disponivel=" + disponivel +
                '}';
    }
}
