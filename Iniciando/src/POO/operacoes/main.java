package POO.operacoes;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        principal soma = new soma();
        principal divisao = new divisao();
        principal subtracao = new subtracao();
        principal multiplica = new multiplica();

        Scanner s = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double a = s.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = s.nextDouble();

        System.out.println("Resultados de cálculos de A e B: ");
        System.out.println("Soma = " + String.format("%.2f", soma.calcular(a, b)));
        System.out.println("Subtração = " + String.format("%.2f", subtracao.calcular(a, b)));
        System.out.println("Multiplicação = " + String.format("%.2f", multiplica.calcular(a, b)));
        try {
            System.out.println("Divisão = " + String.format("%.2f", divisao.calcular(a, b)));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        s.close();
    }
}
