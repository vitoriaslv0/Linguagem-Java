package Projetos_e_Exercicios;

public class temperatura {
    public static void main(String[] args) {
        double fator = 5.0 / 9.0;
        int ajuste = 32;
        double fahrenheit = 86;
        double celsius = (fahrenheit - ajuste) * fator;

        System.out.println("O resultado é " + celsius + "C.");
    }
}
