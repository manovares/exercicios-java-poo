package Ex3;

public class Main {
    public static void main(String[] args) {
        Academia academia = new Academia();
        Plano p1 = new Plano("Anual", 109.9f,12);
        Plano p2 = new Plano("Mensal", 129.9f,1);
        Aluno a1 = new Aluno(1,"234","Matheus",p1);
        Aluno a2 = new Aluno(2,"1234","Kaio",p2);
        academia.matricularAluno(a1);
        academia.matricularAluno(a2);
        Pagamento pag1 = new Pagamento(a1,109.f,"18/04/25");
        academia.registrarPagamento(pag1);
        academia.listarAtrasados();
        academia.imprimirAlunos();

    }
}
