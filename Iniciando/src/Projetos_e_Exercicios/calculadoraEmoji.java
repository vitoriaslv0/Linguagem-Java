package Projetos_e_Exercicios;
import java.util.Scanner;

public class calculadoraEmoji {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o emoji que deseja usar (ex: :)  :(  ;| ): ");
        String emoji = s.nextLine();
        System.out.println("Digite um número inteiro: ");
        int num = s.nextInt();

        String resultado = emoji.repeat(num);

        System.out.println("--".repeat(18));
        System.out.println("Resultado: "+ resultado);
    }
}
