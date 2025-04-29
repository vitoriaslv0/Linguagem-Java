package AulaTestes;

public class aula08 {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2); // E
        System.out.println(condicao1 || condicao2); // OU
        System.out.println(condicao1 ^ condicao2); // OU EXCLUSIVO
        System.out.println(!condicao1);
        System.out.println(!condicao2); // NÃO / NOT

        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)
        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        // Operador Unário!
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50\"? " + comprouTV50); // \" ACRESCENTAR ASPAS NO TEXTO
        System.out.println("Comprou TV 32\"? " + comprouTV32);
        System.out.println("Comprou Sorvete? " + comprouSorvete);
        System.out.println("Mais saudável? " + maisSaudavel);
    }
}
