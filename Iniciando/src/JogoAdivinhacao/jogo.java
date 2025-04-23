package JogoAdivinhacao;
import java.util.Random;
import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        jogador jogador = new jogador(nome);
        adivinhacao Adivinhacao = new adivinhacao(numeroSecreto);

        System.out.println("Tente adivinhar o número de 1 a 100!");

        while (true) {
            System.out.print("Digite sua tentativa: ");
            int tentativa;

            try {
                tentativa = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido!");
                continue;
            }

            jogador.adicionarTentativa(tentativa);
            String resultado = Adivinhacao.verificar(tentativa);
            System.out.println(resultado);

            if (resultado.equals("Acertou!")) {
                System.out.println("Parabéns, " + jogador.getNome() + "!!\n");
                System.out.println("Tentativas: " + jogador.getTentativas());
                break;
            }
        }
        scanner.close();
    }
}
