package Ex2;

public class Teste {
    public static void main(String[] args) {
        Agencia agencia = new Agencia();
        PacoteTuristico p1 = new PacoteTuristico(123.4f,1,15,"Punta Cana");
        PacoteTuristico p2 = new PacoteTuristico(1500f,2,30,"Paris");
        Cliente c1 = new Cliente("23","Matheus", "matheus@gmail.com");
        Cliente c2 = new Cliente("32","Kaio","kaiocouto@gmail.com");

        Reserva r1 = new Reserva(p1,c1);
        Reserva r2 = new Reserva(p2,c2);

        r2.calcularParcela(12);

        agencia.cadastrarPacoteTuristico(p1);
        agencia.cadastrarPacoteTuristico(p2);
        agencia.realizarReserva(r1);
        agencia.realizarReserva(r2);
        agencia.calcularReceita();
        agencia.imprimirReservas();
    }
}
