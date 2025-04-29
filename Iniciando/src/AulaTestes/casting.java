package AulaTestes;

public class casting {
    public static void main(String[] args) {

        int num1 = 10;
        double num2 = num1;

        String texto = "10";
        int numero = Integer.parseInt(texto); // string > int
        String frase = String.valueOf(numero); // int > string
    }
}
