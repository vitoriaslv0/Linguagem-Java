package POO.polinterface;

public class retangulo implements forma{
    private double comprimento;
    private double largura;

    public retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double calculaArea() {
        return comprimento * largura;
    }

    @Override
    public double calculaPerimetro() {
        return 2 * (comprimento + largura);
    }
}
