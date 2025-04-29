package AulaTestes;

import java.util.Scanner;
public class aula0 {
    // ponto de entrada para começar o programa
    public static void main(String[] args) {

        int valor = 0;
        double valor2 = 0.0;

        // Entrada de dados
        Scanner sc = new Scanner(System.in);
        // Saída de dados
        System.out.println("Hello World!");  //("ln") -- para quebra de linha

        System.out.println("Insira um valor inteiro: "); // "sout" + enter para preencher automaticamente
        valor = sc.nextInt();
        System.out.println("Insira um valor decimal: ");
        valor2 = sc.nextDouble();

        System.out.println("Valor inteiro: " + valor + "\nValor decimal: " + valor2);

        sc.close();  // essencial para economizar memória
    }
}
