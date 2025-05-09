package POO.polinterface;
// classe círculo implementando a classe forma
public class circulo implements forma {
    private double raio;

    public circulo(double raio) {
        this.raio = raio;
    }
    @Override
    public double calculaArea() {
        return Math.PI * raio * raio;
    }
    @Override
    public double calculaPerimetro() {
        return 2 * Math.PI * raio;
    }
}
