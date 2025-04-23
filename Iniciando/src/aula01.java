import java.util.Scanner;
public class aula01 {
    public static void main (String[] args) {
        int numero = 0, numero1 = 0, soma = 0;

        Scanner s = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        numero = s.nextInt();
        System.out.print("Insira o segundo valor: ");
        numero1 = s.nextInt();

        soma = numero + numero1;

        System.out.println("Resultado " +  //quebra linha, essencial para textos grandes
                "final: " + soma);

        s.close();
    }
}
