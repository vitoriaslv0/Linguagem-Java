package POO.operacoes;

public class calculo {
    private principal operacao;

    public void setOperacao(principal operacao) {
        this.operacao = operacao;
    }

    public double calcular(double a, double b) {
        return operacao.calcular(a, b);
    }
}