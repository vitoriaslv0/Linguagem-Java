import java.util.Date;
//      Biblioteca para informações de DATA
public class aula04 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.80;

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome
                + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");
        System.out.printf("O senhor %s %s tem %d e ganha %f.", nome, sobrenome, idade, salario);
        //      "printf" - para string de formatação
    }
}
