package POO;

public class funcionario {
    // Atributos:
    private String nome;
    private int idade;

    // Métod construtor:
    public funcionario (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    // Métodos Getters e Setters - acessar e modificar os valores dos atributos em uma classe
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void fazerAniversario(){
        idade++;
    }
    public static void main(String[] args) {
        // Criando uma instância da classe Funcionario
        funcionario f1 = new funcionario("João", 30);
        // Obtendo e exibindo os valores dos atributos
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Idade: " + f1.getIdade());

        // Criando outro objeto Funcionario
        funcionario f2 = new funcionario("Maria", 25);
        System.out.println("Nome: " + f2.getNome());
        System.out.println("Idade: " + f2.getIdade());

        // Fazendo aniversário do f1
        f1.fazerAniversario();
        System.out.println(f1.getNome() + " agora tem " + f1.getIdade() + " anos.");
    }
}
