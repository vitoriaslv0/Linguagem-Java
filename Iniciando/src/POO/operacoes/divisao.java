package POO.operacoes;

public class divisao implements principal {
    @Override
    public double calcular(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível divisão por zero!");
        }
        return a / b;
    }
}
