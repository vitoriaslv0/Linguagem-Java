package AulaTestes;

import java.util.Scanner;

public class aula05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  // Scanner "variável" = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = s.nextLine();

        s.close();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = teclado.nextInt();
        teclado.nextLine(); //lê o "\n" que o teclado.nextInt() deixa para trás.
        System.out.println("Qual o seu nome?");
        String nome1 = teclado.nextLine();
        System.out.println("Qual o seu sobrenome?");
        String sobrenome = teclado.nextLine();

        teclado.close();
    }
}
