package AulaTestes;

public class aula03 {
    public static void main(String[] args) {
    //      Notação Ponto:
        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase(); // Letras maiúscula
        s = s.concat("!!!");

        System.out.println(s);

        String x = "Gato".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X".replace("X", "Gato");
        System.out.println(y);

        //      Tipos primitivos não tem o operador "."
    }
}
