package POO.polinterface;
// Aqui ocorre o polimorfismo
public class principal {
    public static void main(String[] args) {
        forma circulo = new circulo(5.0);
        forma retangulo = new retangulo(4.0, 6.0);

        System.out.println("Circulo:");
        System.out.println("Área: " + circulo.calculaArea());
        System.out.println("Perimetro: " + circulo.calculaPerimetro());

        System.out.println("_____________________________");

        System.out.println("Retângulo:");
        System.out.println("Área: " + retangulo.calculaArea());
        System.out.println("Perimetro: " + retangulo.calculaPerimetro());
    }
}
