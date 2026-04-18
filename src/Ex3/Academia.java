package Ex3;

import java.util.ArrayList;

public class Academia {
    private ArrayList<Aluno> alunos;
    private ArrayList<Pagamento> pagamentos;

    public Academia() {
        alunos = new ArrayList<>();
        pagamentos = new ArrayList<>();
    }

    public void matricularAluno(Aluno aluno){
        alunos.add(aluno);
        System.out.println("Aluno matriculado com sucesso!");
    }

    public void registrarPagamento(Pagamento pagamento){
        pagamentos.add(pagamento);
        System.out.println("Pagamento registrado com sucesso!");
    }

    public void listarAtrasados(){
        for (Pagamento pagamento : pagamentos) {
            if (pagamento.isEmAtraso() == false) {
                System.out.println(pagamento.toString());
            }
            else {
                System.out.println("Nenhum atraso!");
            }
        }
    }

    public void imprimirAlunos(){
        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
        }
    }
}
