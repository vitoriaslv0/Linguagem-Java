package Projetos_e_Exercicios; /* Atividade do curso :
 1. Peça ao usuário um texto para o "topo" do meme.
 2. Peça um texto para a "base" do meme.
 3. Escolha uma imagem de meme representada por um nome de imagem (simulado) ou uma categoria.
 4. Mostre uma saída no terminal como se fosse o meme final, com moldura e tudo em texto. */
import java.util.Scanner;
public class GeradorMeme {
    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Insira a frase inicial do meme: ");
        String top = s.nextLine();
        System.out.print("Insira a frase final do meme: ");
        String bottom = s.nextLine();

        System.out.println("~~".repeat(10));
        System.out.println("MEME: Gato Bravo 😾");
        System.out.println("~~".repeat(10));
        System.out.println("__".repeat(20));
        System.out.println(" TOP: " + top);
        System.out.println("   [ IMAGEM: GATO_BRAVO.JPG ]");
        System.out.println(" BOTTOM: " + bottom);
        System.out.println("__".repeat(20));
    }
}

