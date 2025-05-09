package POO.desafioAVA;

public class Aluno {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String matricula;

    // Construtor
    public Aluno(String nome, String endereco, String telefone, String email, String matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.matricula = matricula;
    }
    // Exibição dos dados do aluno e criação de variável de instância(dadosAluno)
    public void dadosAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço Residencial: " + endereco);
        System.out.println("Telefone de Contato: " + telefone);
        System.out.println("Endereço de e-mail: " + email);
        System.out.println("Matrícula: " + matricula);
    }
}
