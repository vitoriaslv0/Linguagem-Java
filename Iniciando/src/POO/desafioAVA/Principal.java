package POO.desafioAVA;

// testar funcionamento
public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(
                "João",
                "Rua tal, 123",
                "(00) 0000-0000",
                "nome.22@gmail.com",
                "38299"
        );
        aluno.dadosAluno();
    }
}
