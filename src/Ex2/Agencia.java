package Ex2;

import java.util.ArrayList;

public class Agencia {
    private ArrayList<PacoteTuristico> pacotesTuristico;
    private ArrayList<Reserva> reservas;

    public Agencia() {
        reservas = new ArrayList<Reserva>();
        pacotesTuristico = new ArrayList<PacoteTuristico>();
    }

    public void realizarReserva(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("Reserva realizada com sucesso!");
    }

    public void cadastrarPacoteTuristico(PacoteTuristico pacoteTuristico) {
        pacotesTuristico.add(pacoteTuristico);
        System.out.println("Pacote cadastrado com sucesso!");
    }

    public float calcularReceita() {
        float total = 0;
        for (Reserva reserva : reservas) {
            total += reserva.getPacote().getPreco();
        }
        System.out.println("Receita " + total);
        return total;
    }

    public void imprimirReservas() {
        for (Reserva reserva : reservas) {
            System.out.println(reserva.toString());
        }
    }
}
