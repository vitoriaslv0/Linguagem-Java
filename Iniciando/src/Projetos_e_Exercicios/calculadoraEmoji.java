package Projetos_e_Exercicios;
import java.util.Scanner;

public class calculadoraEmoji {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o emoji que deseja usar (ex: :D :-D :) :p :o :-d  ): ");
        String emoji = s.nextLine();
        System.out.println("Digite um número inteiro: ");
        int num = s.nextInt();

        String resultado = emoji.repeat(num);

        System.out.println("--".repeat(18));
        System.out.println("Resultado: "+ resultado);
    }
}
//// Validação simples - Cod professor:
//        if (numero < 0) {
//        System.out.println("Por favor, digite um número não negativo.");
//            return;
//                    }
//
//                    // Resultado
//                    System.out.print("Resultado: ");
//        for (int i = 0; i < numero; i++) {
//        System.out.print(emoji);
//        }
//
//                System.out.println(); // quebra de linha final