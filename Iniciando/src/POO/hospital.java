package POO;

public class hospital {
    private String nome;
    private int capacidade;
    private boolean possuiUTI;

    // MÉTODOS CONTRUÇÃO
    public hospital(String nome, int capacidade, boolean possuiUTI) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.possuiUTI = possuiUTI;
    }
    // Realiza o atendimento de um paciente no hospital
    public void atendimento(String paciente) {
        System.out.println("O paciente " + paciente + " está sendo atendido no hospital " + nome);
    }
    // Adiciona um leito ao hospital
    public void leito() {
        capacidade++;
        System.out.println("Foi adicionado mais um leito ao hospital " + nome);
    }
    // Verifica se o hospital possui UTI
    public void disponibilidadeUTI() {
        if (possuiUTI) {
            System.out.println("O hospital " + nome + " possui UTI");
        } else {
            System.out.println("O hospital " + nome + " não possui UTI");
        }
    }
    // GETTERS & SETTERS    - Retorna o nome do Hospital
    public String getNome() {
        return nome;
    }
    // Define o nome do hospital
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Retorna a capacidade de leitos do hospital
    public int getCapacidade(){
        return capacidade;
    }
    // Define a capacidade
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    // Verifica se o hospital possui UTI
    public boolean isPossuiUTI(){
        return possuiUTI;
    }
    // Define se o hospital possui UTI
    public void setPossuiUTI(boolean possuiUTI){
        this.possuiUTI = possuiUTI;
    }
    public static void main(String[] args) {
        // Criando um objeto hospital
        hospital hospital1 = new hospital("Hospital Central", 100, true);

        // Testando os métodos
        hospital1.atendimento("Maria");
        hospital1.leito();
        hospital1.disponibilidadeUTI();

        // Testando os Getters
        System.out.println("Nome do hospital: " + hospital1.getNome());
        System.out.println("Capacidade de leitos: " + hospital1.getCapacidade());
        System.out.println("Possui UTI? " + hospital1.isPossuiUTI());
    }
}
// A CLASSE HOSPITAL POSSUI TRÊS ATRIBUTOS PRIVADOS: nome, capacidade e possuiUTI
