package Ex2;

public class Reserva {
    private PacoteTuristico pacote;
    private Cliente cliente;
    private float valorParcela;

    public Reserva(PacoteTuristico pacote, Cliente cliente) {
        this.pacote = pacote;
        this.valorParcela = 0;
        this.cliente = cliente;
    }

    public float calcularParcela(float parcela){
        valorParcela = pacote.getPreco() / parcela;
        System.out.println("Valor da parcela: R$" + parcela);
        return valorParcela;

    }

    public void comprovante(){
        System.out.println("Comprovante" +
                "Cliente: " + cliente.getNome() + "CPF: " + cliente.getCPF() + "Pacote: " + pacote.getDestino() +
                "Valor: " + pacote.getPreco() + "Valor da parcela: " + valorParcela);

    }

    public PacoteTuristico getPacote() {
        return pacote;
    }

    public void setPacote(PacoteTuristico pacote) {
        this.pacote = pacote;
    }

    public float getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Reserva " +
                "pacote " + pacote.toString() +
                ", cliente=" + cliente.toString() +
                ", valorParcela=" + valorParcela +
                '}';
    }
}
